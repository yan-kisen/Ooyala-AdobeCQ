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
package com.day.cq.wcm.foundation.forms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceMetadata;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ValueMap;

import com.day.cq.wcm.foundation.forms.FormResourceEdit.CommonAndPartial;

public class FormResourceEditTest extends TestCase {
    
    private static final String PN_TEST = "test";

    public void testCommonAndPartial() {
        // basic test with 2 resources
        List<Resource> resources = new ArrayList<Resource>();
        resources.add(getResourceWithMultiValue(PN_TEST, "a", "b", "c"));
        resources.add(getResourceWithMultiValue(PN_TEST,      "b", "c", "d"));
        
        CommonAndPartial result = FormResourceEdit.getCommonAndPartialMultiValues(resources, PN_TEST);
        
        assertEquals("common", set("b", "c"), result.common);
        assertEquals("partial", set("a", "d"), result.partial);

        // 3 resources
        resources.clear();
        resources.add(getResourceWithMultiValue(PN_TEST, "a", "b", "c"));
        resources.add(getResourceWithMultiValue(PN_TEST,      "b", "c", "d"));
        resources.add(getResourceWithMultiValue(PN_TEST,      "b",      "d", "e"));
        
        result = FormResourceEdit.getCommonAndPartialMultiValues(resources, PN_TEST);
        
        assertEquals("common", set("b"), result.common);
        assertEquals("partial", set("a", "c", "d", "e"), result.partial);
        
        // 3 resources - nothing in common
        resources.clear();
        resources.add(getResourceWithMultiValue(PN_TEST, "a", "b", "c"));
        resources.add(getResourceWithMultiValue(PN_TEST,      "b", "c", "d"));
        resources.add(getResourceWithMultiValue(PN_TEST,                "d", "e"));
        
        result = FormResourceEdit.getCommonAndPartialMultiValues(resources, PN_TEST);
        
        assertEquals("common", set(), result.common);
        assertEquals("partial", set("a", "b", "c", "d", "e"), result.partial);
        
        // 1 resource
        resources.clear();
        resources.add(getResourceWithMultiValue(PN_TEST, "a", "b", "c"));
        
        result = FormResourceEdit.getCommonAndPartialMultiValues(resources, PN_TEST);
        
        assertEquals("common", set("a", "b", "c"), result.common);
        assertEquals("partial", set(), result.partial);
        
        // 0 resources
        resources.clear();
        
        result = FormResourceEdit.getCommonAndPartialMultiValues(resources, PN_TEST);
        
        assertEquals("common", set(), result.common);
        assertEquals("partial", set(), result.partial);
    }
    
    // --------------------------------------------------------< helper >---------
    
    private Resource getResourceWithMultiValue(String name, String... values) {
        SimpleValueMap map = new SimpleValueMap();
        map.put(name, values);
        return new SimpleResource(map);
    }
    
    private Set<String> set(String... values) {
        return new HashSet<String>(Arrays.asList(values));
    }
    
    @SuppressWarnings("serial")
    private static class SimpleValueMap extends HashMap<String, Object> implements ValueMap {

        @SuppressWarnings("unchecked")
        public <T> T get(String name, Class<T> type) {
            return (T) get(name);
        }

        @SuppressWarnings("unchecked")
        public <T> T get(String name, T defaultValue) {
            if (containsKey(name)) {
                return (T) get(name);
            }
            return defaultValue;
        }
    }
    
    private static class SimpleResource implements Resource {
        
        private ValueMap map;

        public SimpleResource(ValueMap map) {
            this.map = map;
        }

        @SuppressWarnings("unchecked")
        public <AdapterType> AdapterType adaptTo(Class<AdapterType> type) {
            if (type == ValueMap.class) {
                return (AdapterType) map;
            }
            return null;
        }

        public String getPath() {
            return null;
        }

        public String getResourceType() {
            return null;
        }

        public String getResourceSuperType() {
            return null;
        }

        public ResourceMetadata getResourceMetadata() {
            return null;
        }

        public ResourceResolver getResourceResolver() {
            return null;
        }
        
    }
}
