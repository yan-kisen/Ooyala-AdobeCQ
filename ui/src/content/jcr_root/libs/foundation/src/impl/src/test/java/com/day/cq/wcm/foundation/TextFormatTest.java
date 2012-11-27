/*
 * Copyright 1997-2008 Day Management AG
 * Barfuesserplatz 6, 4001 Basel, Switzerland
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of
 * Day Management AG, ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Day.
 */

package com.day.cq.wcm.foundation;

import static org.junit.Assert.assertEquals;

/**
 * <code>TextFormatTest</code>...
 */
public class TextFormatTest {

    @org.junit.Test public void testAutoBr() {
        TextFormat fmt = new TextFormat();
        assertEquals("Hello<br>World<br>", fmt.format("Hello\nWorld"));
    }

    @org.junit.Test public void testAutoUL() {
        TextFormat fmt = new TextFormat();
        assertEquals("<ul><li>Hello</li><li>World</li></ul>", fmt.format("- Hello\n- World"));
    }

    @org.junit.Test public void testAutoULBr() {
        TextFormat fmt = new TextFormat();
        assertEquals("<ul><li>Hello</li><li>World</li></ul>bla<br>", fmt.format("- Hello\n- World\nbla"));
    }

    @org.junit.Test public void testAutoULNoBr() {
        TextFormat fmt = new TextFormat();
        fmt.setAutoBr(false);
        assertEquals("<ul><li>Hello</li><li>World</li></ul>bla\n", fmt.format("- Hello\n- World\nbla"));
    }

    @org.junit.Test public void testAutoOL() {
        TextFormat fmt = new TextFormat();
        assertEquals("<ol start=\"2\"><li>Hello</li><li>World</li></ol>", fmt.format("2. Hello\n3. World"));
    }

    @org.junit.Test public void testIso() {
        TextFormat fmt = new TextFormat();
        assertEquals("some&quot;test&lt;for&gt;iso&amp;chars.<br>", fmt.format("some\"test<for>iso&chars."));
    }

}