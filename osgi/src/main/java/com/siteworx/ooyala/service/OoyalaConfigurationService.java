package com.siteworx.ooyala.service;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import javax.jcr.RepositoryException;

import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Modified;
import org.apache.felix.scr.annotations.Properties;
import org.apache.felix.scr.annotations.Property;
import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingConstants;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.apache.sling.api.resource.ValueMap;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.siteworx.ooyala.client.OoyalaApiCredential;

/**
 * The sling service for handling Ooyala Configuration in CQ.
 *
 * @author leonardo@siteworx.com
 * @author rboll@siteworx.com
 *
 */
@Component(immediate=true, metatype=false)
@Service(value={OoyalaConfigurationService.class, EventHandler.class})
@Properties({
	@Property(name="event.topics", value={SlingConstants.TOPIC_RESOURCE_CHANGED, SlingConstants.TOPIC_RESOURCE_ADDED, SlingConstants.TOPIC_RESOURCE_REMOVED})
})
public class OoyalaConfigurationService implements EventHandler {

	private static final Logger log = LoggerFactory.getLogger(OoyalaConfigurationService.class);
	
	public static final String OOYALA_CONFIG_PATH = "/etc/cloudservices/ooyala/jcr:content";
	private static final String API_KEY = "apiKey";
	private static final String API_SECRET = "apiSecret";
	private static final String ROOT_PATH = "path";
	private static final String META_PATH = "metakey";
	
	//private Map<String, OoyalaApiCredential> credentialsCache = new ConcurrentHashMap<String, OoyalaApiCredential>();
	private OoyalaApiCredential credentials;
	private List<String> metadataKeyCache = new CopyOnWriteArrayList<String>();
	
	@Reference
	private ResourceResolverFactory resourceResolverFactory;
	/**
	 * Thread safe method for updating the API key cache.
	 *
	 * @throws OoyalaConfigurationException Throws an exception if the Ooyala configuration node cannot be found.
	 */
	public synchronized void updateApiKeyCache() throws OoyalaConfigurationException {
		if(log.isDebugEnabled()) log.debug("Updating Ooyala Api Key Cache.");
		ResourceResolver resourceResolver = null;
		try {
			resourceResolver = resourceResolverFactory.getAdministrativeResourceResolver(null);
			
			final ValueMap configResource = resourceResolver.resolve(OOYALA_CONFIG_PATH).adaptTo(ValueMap.class);//.adaptTo(Node.class);
			if(configResource == null){
				throw new OoyalaConfigurationException("The Ooyala configuration node "+OOYALA_CONFIG_PATH+" is missing.");
			}

			final String apiKey = configResource.get(API_KEY, null);
			final String apiSecret = configResource.get(API_SECRET, null);
			
			if(apiKey == null || apiSecret == null){
				throw new OoyalaConfigurationException("The Ooyala configuration node "+OOYALA_CONFIG_PATH+" is missing one or more properties. The required properties are: "+ROOT_PATH+", "+API_KEY+", "+API_SECRET);
			}

			credentials = new OoyalaApiCredential(apiKey, apiSecret);
			
			if(log.isDebugEnabled())
				log.debug("Ooyala Config Updated.\n");
		} catch (LoginException e) {
			e.printStackTrace();
			log.error("Unable to log into JCR.");
		} finally {
			if (resourceResolver != null) resourceResolver.close();
		}
	}
	
	/**
	 * Thread safe method for updating the metadata key cache.
	 *
	 * @throws OoyalaConfigurationException Throws an exception if the Ooyala configuration node cannot be found.
	 */
	public synchronized void updateMetadataKeyCache() throws OoyalaConfigurationException {
		if(log.isDebugEnabled()) log.debug("Updating Ooyala Metadata Key Cache.");
		ResourceResolver resourceResolver = null;
		try {
			resourceResolver = resourceResolverFactory.getAdministrativeResourceResolver(null);
			
			final Resource configResource = resourceResolver.resolve(OOYALA_CONFIG_PATH);
			if(configResource.isResourceType(Resource.RESOURCE_TYPE_NON_EXISTING)){
				throw new OoyalaConfigurationException("The Ooyala configuration node "+OOYALA_CONFIG_PATH+" is missing.");
			}
			
			final ValueMap configMap = configResource.adaptTo(ValueMap.class);

			final String[] rawMetaKeys = configMap.get(META_PATH, new String[0]);
			if(rawMetaKeys != null) {
				metadataKeyCache.clear();
				for (String str : rawMetaKeys) {
					metadataKeyCache.add(str);
				}
			}
			
			if(log.isDebugEnabled())
				log.debug("Ooyala Config Updated.\n");
		} catch (LoginException e) {
			e.printStackTrace();
			log.error("Unable to log into JCR.");
		} finally {
			if (resourceResolver != null) resourceResolver.close();
		}
	}
	
	/**
	 * A getter for the current metadata keys.
	 *
	 * @return The List of metadata keys.
	 */
	public List<String> getMetadataKeys() {
		return this.metadataKeyCache;
	}
	
	/**
	 * The activate method for OSGi. Updates all caches.
	 */
	@Activate
	protected void activate(ComponentContext context) throws RepositoryException {
		if(log.isDebugEnabled())log.debug("Activating "+this.getClass());
		try {
			updateApiKeyCache();
			updateMetadataKeyCache();
		} catch (OoyalaConfigurationException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * The modified method for OSGi. Updates all caches.
	 */
	@Modified
	protected void modified(ComponentContext context) throws RepositoryException {
		if(log.isDebugEnabled())log.debug("Modified "+this.getClass());
		activate(context);
	}
	
    public OoyalaApiCredential getCredentialsForPath(String path) {
    	if (isValidCredential(credentials))
    		return credentials;
    	else return null;
    }
    
    private boolean isValidCredential(OoyalaApiCredential credentials) {
    	if (credentials.getApiKey() == null || credentials.getApiSecret() == null)
    		return false;
    	else return true;
    }
    
    /**
     * The handleEvent method for OSGi. Updates the API key and metadata caches when the Ooyala Configuration Node is updated.
     */
    @Override
	public void handleEvent(Event event) {
		final String path = (String) event.getProperty("path");
		if (path.startsWith(OoyalaConfigurationService.OOYALA_CONFIG_PATH)) {
			if(log.isDebugEnabled())log.debug("Handling event in path "+OOYALA_CONFIG_PATH);
			try {
				updateApiKeyCache();
				updateMetadataKeyCache();
				
				/*ResourceResolver resourceResolver;
				try {
					resourceResolver = resourceResolverFactory.getAdministrativeResourceResolver(null);
					Session session = resourceResolver.adaptTo(Session.class);
					ReplicationOptions opts = new ReplicationOptions();
					opts.setSynchronous(true);
	                try {
	                	replicator.replicate(session, ReplicationActionType.ACTIVATE, OOYALA_CONFIG_PATH, opts);
	                } catch (ReplicationException re) {
	                	re.printStackTrace();
	                	log.error("Unable to replicate Ooyala configuration due to ReplicationException.");
	                }
				} catch (LoginException e) {
					e.printStackTrace();
                	log.error("Unable to replicate Ooyala configuration due to LoginException.");
				}*/
			} catch (OoyalaConfigurationException e) {
				e.printStackTrace();
			}
		}
	}
	
}
