package org.apache.jsp.libs.foundation.components.primary.cq.Page;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.apache.sling.api.resource.Resource;
import javax.jcr.util.TraversingItemVisitor;
import com.day.cq.commons.Externalizer;
import org.apache.sling.jcr.api.SlingRepository;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.SortedMap;
import java.util.Date;
import com.day.cq.commons.jcr.JcrUtil;
import javax.jcr.NodeIterator;
import javax.jcr.*;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ValueMap;
import com.day.cq.commons.inherit.InheritanceValueMap;
import com.day.cq.wcm.commons.WCMUtils;
import com.day.cq.wcm.api.Page;
import com.day.cq.wcm.api.NameConstants;
import com.day.cq.wcm.api.PageManager;
import com.day.cq.wcm.api.designer.Designer;
import com.day.cq.wcm.api.designer.Design;
import com.day.cq.wcm.api.designer.Style;
import com.day.cq.wcm.api.components.ComponentContext;
import com.day.cq.wcm.api.components.EditContext;

public final class sitemap_txt_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {

 
    HashMap<String, Date> tmpPagesList = new HashMap<String, Date>();
    
    void populatePagesList(Node node) {
        try{
            NodeIterator iter = node.getNodes();
            while(iter.hasNext()) {
                Node child = iter.nextNode();
                if(child.isNodeType("cq:Page")) {
                    Date lastMod = child.getNode("jcr:content").getProperty("cq:lastModified").getDate().getTime();
                    tmpPagesList.put(child.getPath(), lastMod);
                    if(child.hasNodes())
                        populatePagesList(child);
                }
            }
        }catch(Exception e) {
        }
    }
    
    String printPagesList(HashMap<String, Date> pagesList) {
        String list = "";
        for(String key: pagesList.keySet()) {
            list += pagesList.get(key).getTime() + " " + key + "\n";
        }
        return list;
    }
    
    HashMap<String, Date> parsePagesList(Node parent) throws Exception{
        HashMap<String, Date> pagesList = new HashMap<String, Date>();

        try{
            Node sitemapNode = parent.getSession().getRootNode().getNode("var/cache/sitemap" + parent.getPath() + "/cache");
            String pages = sitemapNode.getNode("jcr:content").getProperty("jcr:data").getString();
            if(pages.length() == 0)
                return pagesList;
            String[] lines = pages.split("\n");
            for(int i=0; i < lines.length; i++) {
                String[] entry = lines[i].split(" ");
                pagesList.put(entry[1], new Date(Long.parseLong(entry[0])));
            }
        }catch(PathNotFoundException e) {
        }
        
        return pagesList;
    }
    
    String compareLists(HashMap<String, Date> oldList, HashMap<String, Date> newList, Externalizer externalizer) {
        String resultList = "";
        HashMap<Date, String> newEntries = new HashMap<Date, String>();
        
        /* search for deleted, modified, or added pages
          - iterate over old list and look in new list for old entry
            - if not available, add entry as deleted
            - if available, compare timestamps
              - if they differ, add entry as modified
          - iterate over new list and look in old list for new entry
            - if not available, add entry as added
        */

        for(String oldKey: oldList.keySet()) {
            String entry;
            if(! newList.containsKey(oldKey)) {// deleted
                entry = newEntries.get(oldList.get(oldKey));
                if(entry == null) {
                    entry = "seconds " + (oldList.get(oldKey).getTime() / 1000) + "\n";
                }
                entry += "delete " + externalizer.absoluteLink("http", oldKey + ".html") + "\n";
                newEntries.put(oldList.get(oldKey), entry);
            }else {
                if(oldList.get(oldKey).compareTo(newList.get(oldKey)) != 0) { // modified
                    entry = newEntries.get(newList.get(oldKey));
                    if(entry == null) {
                        entry = "seconds " + (newList.get(oldKey).getTime() / 1000) + "\n";
                    }
                    entry += "update " + externalizer.absoluteLink("http", oldKey + ".html") + "\n";
                    newEntries.put(newList.get(oldKey), entry);
                }
            }
        }
        
        for(String newKey: newList.keySet()) {
            String entry;
            if(! oldList.containsKey(newKey)) {// added
                entry = newEntries.get(newList.get(newKey));
                if(entry == null) {
                    entry = "seconds " + (newList.get(newKey).getTime() / 1000) + "\n";
                }
                entry += "add " + externalizer.absoluteLink("http", newKey + ".html") + "\n";
                newEntries.put(newList.get(newKey), entry);
            }
        }
        
        // sort the list
        List<Date> sortedList = new ArrayList(newEntries.keySet());
        Collections.sort(sortedList);
        for(Date key: sortedList) {
            resultList += newEntries.get(key) + "\n";
        }

        return resultList;
    }
    
    String appendSitemap(Node parent, HashMap<String, Date> oldList, HashMap<String, Date> newList, SlingRepository repo, Externalizer externalizer) throws Exception{
        Node sitemapFolder = JcrUtil.createPath("/var/cache/sitemap" + parent.getPath(), "nt:folder", "nt:folder", repo.loginAdministrative(null), true);
        Node sitemapRes, sitemap;
        try{
            sitemap = sitemapFolder.getNode("sitemap");
            sitemapRes = sitemap.getNode("jcr:content");
        
        }catch(PathNotFoundException e) {
            sitemap = sitemapFolder.addNode("sitemap", "nt:file");
            sitemapRes = sitemap.addNode("jcr:content", "nt:resource");
        }
        String sitemapContent = "";
        if(sitemapRes.hasProperty("jcr:data"))
            sitemapContent = sitemapRes.getProperty("jcr:data").getString();
        sitemapContent += compareLists(oldList, newList, externalizer) + "\n";
        sitemapRes.setProperty ("jcr:data", sitemapContent);
        sitemap.getSession().getRootNode().getNode("var").save();
        return sitemapContent;
    }
    
    void saveList(Node parent, HashMap<String, Date> list, SlingRepository repo) throws Exception{
        Node sitemapFolder = JcrUtil.createPath("/var/cache/sitemap" + parent.getPath(), "nt:folder", "nt:folder", repo.loginAdministrative(null), true);
        Node sitemapRes, sitemap;
        try{
            sitemap = sitemapFolder.getNode("cache");
            sitemapRes = sitemap.getNode("jcr:content");
        
        }catch(PathNotFoundException e) {
            sitemap = sitemapFolder.addNode("cache", "nt:file");
            sitemapRes = sitemap.addNode("jcr:content", "nt:resource");
        }
        sitemapRes.setProperty ("jcr:data", printPagesList(list));
        sitemap.getSession().getRootNode().getNode("var").save();
    }
    

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(1);
    _jspx_dependants.add("/libs/foundation/global.jsp");
  }

  private org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody = org.apache.sling.scripting.jsp.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.sling.scripting.jsp.jasper.runtime.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, false, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();
      _jspx_out = out;











      //  cq:defineObjects
      com.day.cq.wcm.tags.DefineObjectsTag _jspx_th_cq_005fdefineObjects_005f0 = (com.day.cq.wcm.tags.DefineObjectsTag) _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.get(com.day.cq.wcm.tags.DefineObjectsTag.class);
      _jspx_th_cq_005fdefineObjects_005f0.setPageContext(_jspx_page_context);
      _jspx_th_cq_005fdefineObjects_005f0.setParent(null);
      int _jspx_eval_cq_005fdefineObjects_005f0 = _jspx_th_cq_005fdefineObjects_005f0.doStartTag();
      if (_jspx_th_cq_005fdefineObjects_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.reuse(_jspx_th_cq_005fdefineObjects_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fcq_005fdefineObjects_005fnobody.reuse(_jspx_th_cq_005fdefineObjects_005f0);
      org.apache.sling.api.SlingHttpServletRequest slingRequest = null;
      org.apache.sling.api.SlingHttpServletResponse slingResponse = null;
      org.apache.sling.api.resource.Resource resource = null;
      javax.jcr.Node currentNode = null;
      org.apache.sling.api.resource.ResourceResolver resourceResolver = null;
      org.apache.sling.api.scripting.SlingScriptHelper sling = null;
      org.slf4j.Logger log = null;
      org.apache.sling.api.scripting.SlingBindings bindings = null;
      com.day.cq.wcm.api.components.ComponentContext componentContext = null;
      com.day.cq.wcm.api.components.EditContext editContext = null;
      org.apache.sling.api.resource.ValueMap properties = null;
      com.day.cq.wcm.api.PageManager pageManager = null;
      com.day.cq.wcm.api.Page currentPage = null;
      com.day.cq.wcm.api.Page resourcePage = null;
      com.day.cq.commons.inherit.InheritanceValueMap pageProperties = null;
      com.day.cq.wcm.api.components.Component component = null;
      com.day.cq.wcm.api.designer.Designer designer = null;
      com.day.cq.wcm.api.designer.Design currentDesign = null;
      com.day.cq.wcm.api.designer.Design resourceDesign = null;
      com.day.cq.wcm.api.designer.Style currentStyle = null;
      com.adobe.granite.xss.XSSAPI xssAPI = null;
      slingRequest = (org.apache.sling.api.SlingHttpServletRequest) _jspx_page_context.findAttribute("slingRequest");
      slingResponse = (org.apache.sling.api.SlingHttpServletResponse) _jspx_page_context.findAttribute("slingResponse");
      resource = (org.apache.sling.api.resource.Resource) _jspx_page_context.findAttribute("resource");
      currentNode = (javax.jcr.Node) _jspx_page_context.findAttribute("currentNode");
      resourceResolver = (org.apache.sling.api.resource.ResourceResolver) _jspx_page_context.findAttribute("resourceResolver");
      sling = (org.apache.sling.api.scripting.SlingScriptHelper) _jspx_page_context.findAttribute("sling");
      log = (org.slf4j.Logger) _jspx_page_context.findAttribute("log");
      bindings = (org.apache.sling.api.scripting.SlingBindings) _jspx_page_context.findAttribute("bindings");
      componentContext = (com.day.cq.wcm.api.components.ComponentContext) _jspx_page_context.findAttribute("componentContext");
      editContext = (com.day.cq.wcm.api.components.EditContext) _jspx_page_context.findAttribute("editContext");
      properties = (org.apache.sling.api.resource.ValueMap) _jspx_page_context.findAttribute("properties");
      pageManager = (com.day.cq.wcm.api.PageManager) _jspx_page_context.findAttribute("pageManager");
      currentPage = (com.day.cq.wcm.api.Page) _jspx_page_context.findAttribute("currentPage");
      resourcePage = (com.day.cq.wcm.api.Page) _jspx_page_context.findAttribute("resourcePage");
      pageProperties = (com.day.cq.commons.inherit.InheritanceValueMap) _jspx_page_context.findAttribute("pageProperties");
      component = (com.day.cq.wcm.api.components.Component) _jspx_page_context.findAttribute("component");
      designer = (com.day.cq.wcm.api.designer.Designer) _jspx_page_context.findAttribute("designer");
      currentDesign = (com.day.cq.wcm.api.designer.Design) _jspx_page_context.findAttribute("currentDesign");
      resourceDesign = (com.day.cq.wcm.api.designer.Design) _jspx_page_context.findAttribute("resourceDesign");
      currentStyle = (com.day.cq.wcm.api.designer.Style) _jspx_page_context.findAttribute("currentStyle");
      xssAPI = (com.adobe.granite.xss.XSSAPI) _jspx_page_context.findAttribute("xssAPI");


    // add more initialization code here



    long startTime = System.currentTimeMillis();
    populatePagesList(currentNode);
    HashMap<String, Date> oldList = parsePagesList(currentNode);
    HashMap<String, Date> newList = tmpPagesList;

    Externalizer externalizer = resourceResolver.adaptTo(Externalizer.class);
    response.setContentType("text/plain");
    
    SlingRepository repo = sling.getService(SlingRepository.class);
    saveList(currentNode, newList, repo);
    
      out.print( appendSitemap(currentNode, oldList, newList, repo, externalizer));

    
    long endTime = System.currentTimeMillis();
    
      out.write("# creating this document took ");
      out.print( endTime - startTime );
      out.write('m');
      out.write('s');



    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
