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

import java.awt.Color;
import java.awt.Dimension;

import com.day.image.Layer;

/**
 * <code>ImageHelperTest</code>...
 */
public class ImageHelperTest {

    @org.junit.Test public void testResize() {
        //              lW   lH   dW   dH  miW  mxW   miH  mxH   rW   rH
        internalResize(400, 100, 200,  80,   0,   0,    0,   0, 200,  80);
        internalResize(400, 100,   0,   0,   0, 300,    0,   0, 300,  75);
        internalResize(400, 100,   0,   0,   0,   0,  150,   0, 600, 150);
        internalResize(400, 100, 300,   0,   0,   0,    0,   0, 300,  75);
        internalResize(400, 100, 600,   0,   0,   0,    0,   0, 600, 150);
        internalResize(400, 100,   0,  50,   0,   0,    0,   0, 200,  50);
        internalResize(400, 100,   0, 200,   0,   0,    0,   0, 800, 200);
        internalResize(400, 100, 800,   0,   0,   0,    0, 150, 600, 150);
        // try invalid constraints
        internalResize(400, 100, 800,   0, 300,   0,    0,  50, 400, 100);
    }

    private void internalResize(int lw, int lh, int dw, int dh, int minW, int maxW,
                                int minH, int maxH, int rw, int rh) {
        Dimension d = new Dimension(dw, dh);
        Dimension min = new Dimension(minW, minH);
        Dimension max = new Dimension(maxW, maxH);
        Layer l = new Layer(lw, lh, Color.BLACK);
        ImageHelper.resize(l, d, min, max);
        String result = l.getWidth() + "x" + l.getHeight();
        String expect = rw + "x" + rh;
        assertEquals(expect, result);
        l.dispose();
    }
}