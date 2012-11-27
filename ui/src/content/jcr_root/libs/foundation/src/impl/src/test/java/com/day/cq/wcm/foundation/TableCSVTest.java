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
 * <code>TableTest</code>...
 */
public class TableCSVTest {

    private static final String t1 =
            "a1\tb1\tc1\r\n" +
            "a2\tb2\tc2\r\n" +
            "a3\tb3\tc3\r\n";

    private static final String t1_comma =
            "a1,b1,c1\r\n" +
            "a2,b2,c2\r\n" +
            "a3,b3,c3\r\n";

    private static final String t2 =
            "\"a1\"\tb1\tc1\r\n" +
            "a2\tb2\t\"c2\"\r\n" +
            "a3\tb3\t\"c3\"\r\n";

    private static final String t3 =
            "a1\tb1\tc1\r\n" +
            "a2\tb2\tc2\r\n" +
            "a3\tb3\tc3";

    private static final String t4 =
            "a1\tb1\tc1\r" +
            "a2\tb2\tc2\n" +
            "a3\tb3\tc3\r\n";

    private static final String t5 =
            "a1\n" +
            "a2\tb2\n" +
            "a3\tb3\tc3\n";

    private static final String[][] t5Matrix = new String[][]{
            {"a1", "", ""},
            {"a2", "b2", ""},
            {"a3", "b3", "c3"}};

    private static final String t6 =
            "a1\t\tc3\n" +
            "\tb2\tc2\n" +
            "a3\tb3\n";

    private static final String[][] t6Matrix = new String[][]{
            {"a1", "", "c3"},
            {"", "b2", "c2"},
            {"a3", "b3", ""}};

    private static final String t7 =
            "a1\t\tc3\n" +
            "\n" +
            "a3\tb3\n";

    private static final String[][] t7Matrix = new String[][]{
            {"a1", "", "c3"},
            {"", "", ""},
            {"a3", "b3", ""}};

    private static final String[] t1Cols = new String[]{"a","b","c"};
    private static final String[] t1Rows = new String[]{"1","2","3"};

    @org.junit.Test public void testPlain() {
        Table t = Table.fromCSV(t1);
        assertEquals("Num rows", 3, t.getNumRows());
        assertEquals("Num cols", 3, t.getNumCols());
        verify(t, t1Cols, t1Rows);
    }

    @org.junit.Test public void testPlainComma() {
        Table t = Table.fromCSV(t1_comma, ',');
        assertEquals("Num rows", 3, t.getNumRows());
        assertEquals("Num cols", 3, t.getNumCols());
        verify(t, t1Cols, t1Rows);
    }

    @org.junit.Test public void testQuoted() {
        Table t = Table.fromCSV(t2);
        assertEquals("Num rows", 3, t.getNumRows());
        assertEquals("Num cols", 3, t.getNumCols());
        verify(t, t1Cols, t1Rows);
    }

    @org.junit.Test public void testNotTerminated() {
        Table t = Table.fromCSV(t3);
        assertEquals("Num rows", 3, t.getNumRows());
        assertEquals("Num cols", 3, t.getNumCols());
        verify(t, t1Cols, t1Rows);
    }

    @org.junit.Test public void testMixedLf() {
        Table t = Table.fromCSV(t4);
        assertEquals("Num rows", 3, t.getNumRows());
        assertEquals("Num cols", 3, t.getNumCols());
        verify(t, t1Cols, t1Rows);
    }

    @org.junit.Test public void testNormalize() {
        Table t = Table.fromCSV(t5);
        //t.normalize();
        assertEquals("Num rows", 3, t.getNumRows());
        assertEquals("Num cols", 3, t.getNumCols());
        verify(t, t5Matrix);
    }

    @org.junit.Test public void testEmptyCells() {
        Table t = Table.fromCSV(t6);
        //t.normalize();
        assertEquals("Num rows", 3, t.getNumRows());
        assertEquals("Num cols", 3, t.getNumCols());
        verify(t, t6Matrix);
    }

    @org.junit.Test public void testEmptyRows() {
        Table t = Table.fromCSV(t7);
        //t.normalize();
        assertEquals("Num rows", 3, t.getNumRows());
        assertEquals("Num cols", 3, t.getNumCols());
        verify(t, t7Matrix);
    }

    @org.junit.Test public void testEmpty() {
        Table t = Table.fromCSV("");
        assertEquals("Num rows", 0, t.getNumRows());
        assertEquals("Num cols", 0, t.getNumCols());
    }

    private void verify(Table t, String[] cols, String[] rows) {
        int i=0;
        for (Table.Row r: t.getRows()) {
            int j=0;
            for (Table.Cell c: r.getCells()) {
                String test = cols[j] + rows[i];
                assertEquals(test, c.getText());
                j++;
            }
            i++;
        }
    }
    private void verify(Table t, String[][] matrix) {
        int i=0;
        for (Table.Row r: t.getRows()) {
            int j=0;
            for (Table.Cell c: r.getCells()) {
                String text = c.getText();
                if (text == null) {
                    text = "";
                }
                assertEquals(matrix[i][j], text);
                j++;
            }
            i++;
        }
    }
}