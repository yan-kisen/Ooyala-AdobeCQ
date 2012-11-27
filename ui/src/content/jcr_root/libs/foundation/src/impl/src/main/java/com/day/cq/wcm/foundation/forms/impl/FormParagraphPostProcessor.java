/*
 * Copyright 1997-2011 Day Management AG
 * Barfuesserplatz 6, 4001 Basel, Switzerland
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Day Management AG, ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Day.
 */
package com.day.cq.wcm.foundation.forms.impl;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.jcr.RepositoryException;

import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Service;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceUtil;
import org.apache.sling.servlets.post.Modification;
import org.apache.sling.servlets.post.SlingPostProcessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.day.cq.wcm.api.NameConstants;
import com.day.cq.wcm.foundation.forms.FormsConstants;
import com.day.cq.wcm.foundation.forms.FormsHelper;

/**
 * This post processor listens for creating and deletion of form paragraps:
 * the form start and form end paragraph and creates/removes the
 * other paragraphs accordingly:
 * - if a form start is added, a form end is added
 * - if a form start or form end is removed, the corresponding form end/start is
 *   removed.
 *
 */
@Component
@Service(value=SlingPostProcessor.class)
public class FormParagraphPostProcessor implements SlingPostProcessor {

    /** Logger. */
    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    private final String PAGE_MARKER = '/' + NameConstants.NN_CONTENT + '/';

    /**
     * @see SlingPostProcessor#process(SlingHttpServletRequest, List)
     */
    public void process(final SlingHttpServletRequest request, final List<Modification> changes)
    throws Exception {
        final Set<String> fixPaths = new HashSet<String>();
        for(final Modification mod : changes) {
            switch (mod.getType()) {
                case ORDER:
                case MOVE:
                case COPY:
                    break;
                case MODIFY:
                case CREATE:
                case DELETE:
                    // search the page
                    final int pageEndPos = mod.getSource().indexOf(PAGE_MARKER);
                    if ( pageEndPos != -1 ) {
                        final String pagePath = mod.getSource().substring(0, pageEndPos);
                        fixPaths.add(pagePath);
                    }
                    break;
            }
        }
        final ResourceResolver resolver = request.getResourceResolver();
        for(final String pagePath: fixPaths) {
            final String contentPath = pagePath + '/' + NameConstants.NN_CONTENT;
            logger.debug("Checking page for form paragraphs {}", pagePath);
            final Resource contentResource = resolver.getResource(contentPath);
            if ( contentResource != null ) {
                fixStructure(contentResource);
            }
        }
        // changes will be saved by Sling post servlet
    }

    private void fixStructure(final Resource contentResource)
    throws RepositoryException {
        final Iterator<Resource> rI = ResourceUtil.listChildren(contentResource);
        while ( rI.hasNext() ) {
            final Resource res = rI.next();
            if ( ResourceUtil.isA(res, FormsConstants.RT_FORM_BEGIN)
                 || ResourceUtil.isA(res, FormsConstants.RT_FORM_END)) {
                if ( FormsHelper.checkFormStructure(res) != null ) {
                    logger.debug("Fixed forms structure at {}", contentResource.getPath());
                }
            } else {
                fixStructure(res);
            }
        }
    }
}
