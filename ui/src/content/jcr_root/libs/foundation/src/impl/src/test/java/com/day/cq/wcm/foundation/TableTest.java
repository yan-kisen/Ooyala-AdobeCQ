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

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang.StringUtils;

/**
 * <code>TableTest</code>...
 */
public class TableTest {

    @org.junit.Test public void testSimpleTable() throws IOException {
        Table table = new Table();
        fillTable(table, 3, 5);
        checkTable(table, "table-simple.html");
    }

    @org.junit.Test public void testHeaderRow() throws IOException {
        Table table = new Table();
        fillTable(table, 3, 5);
        table.getRows().get(0).setHeader(true);
        checkTable(table, "table-header.html");
    }

    @org.junit.Test public void testCaptionTable() throws IOException {
        Table table = new Table();
        fillTable(table, 3, 5);
        table.setCaption("<b>Hello, World.</b>").setAttribute("align", "left");
        checkTable(table, "table-caption.html");
    }

    @org.junit.Test public void testColGroupsTable() throws IOException {
        Table table = new Table();
        fillTable(table, 3, 5);
        table.setAttribute("border", "1");
        table.getColTags().add((Table.ColTag) new Table.ColTag().setAttribute("style", "background-color: blue"));
        table.getColTags().add((Table.ColTag) new Table.ColTag().setAttribute("style", "background-color: red"));
        table.getColTags().add((Table.ColTag) new Table.ColTag().setAttribute("style", "background-color: green"));
        table.getColTags().add((Table.ColTag) new Table.ColTag().setAttribute("style", "background-color: yellow"));
        table.getColTags().add((Table.ColTag) new Table.ColTag().setAttribute("style", "background-color: pink"));
        checkTable(table, "table-colgroup.html");
    }

    @org.junit.Test public void testIntDataTable() throws IOException {
        Table table = new Table();
        // fill table
        for (int r=0; r<25; r++) {
            for (int c=0; c<25; c++) {
                table.getCell(r, c, true).setText(String.valueOf(r*(c + 25)));
            }
        }
        // check entire table
        int[][] data = table.getIntData();
        for (int y=0; y<data.length; y++) {
            for (int x=0; x<data[y].length; x++) {
                int d = data[y][x];
                assertEquals(d, y * (x + 25));
            }
        }
        // check sub table
        data = table.getIntData(7, 5, 10, 3);
        assertEquals(5, data.length);
        assertEquals(3, data[0].length);
        for (int y=0; y<data.length; y++) {
            for (int x=0; x<data[y].length; x++) {
                int d = data[y][x];
                assertEquals(d, (y + 7) * (x + 35));
            }
        }
    }

    @org.junit.Test public void testDoubleDataTable() throws IOException {
        Table table = new Table();
        // fill table
        for (int r=0; r<25; r++) {
            for (int c=0; c<25; c++) {
                double v =
                    Math.sin(r * 2.0 * Math.PI / 25.0) +
                    Math.cos(c * 2.0 * Math.PI / 25.0);
                table.getCell(r, c, true).setText(String.valueOf(v));
            }
        }
        // check entire table
        double[][] data = table.getDoubleData();
        for (int y=0; y<data.length; y++) {
            for (int x=0; x<data[y].length; x++) {
                double d = data[y][x];
                double v =
                    Math.sin(y * 2.0 * Math.PI / 25.0) +
                    Math.cos(x * 2.0 * Math.PI / 25.0);
                assertEquals(d, v, 0.0);
            }
        }
    }

    @org.junit.Test public void testRowIteration() throws IOException {
        Table table = new Table();
        fillTable(table, 3, 5);
        int r = 0;
        for (Table.Row row: table.getRows()) {
            int c = 0;
            for (Table.Cell cell: row.getCells()) {
                String expected = "(" + r + "," + c + ")";
                assertEquals(expected, cell.getText());
                c++;
            }
            r++;
        }
     }

    @org.junit.Test public void testColIteration() throws IOException {
        Table table = new Table();
        fillTable(table, 3, 5);
        int c = 0;
        for (Table.Column col: table.getColumns()) {
            int r = 0;
            for (Table.Cell cell: col.getCells()) {
                String expected = "(" + r + "," + c + ")";
                assertEquals(expected, cell.getText());
                r++;
            }
            c++;
        }
     }

    @org.junit.Test public void testColSpan() throws IOException {
        Table table = new Table();
        fillTable(table, 3, 5);
        table.getCell(1,1, false).setColSpan(2);
        checkTable(table, "table-colspan.html");
        table.getCell(1,1, false).setColSpan(1);
        checkTable(table, "table-simple.html");
    }

    @org.junit.Test public void testRowSpan() throws IOException {
        Table table = new Table();
        fillTable(table, 3, 5);
        table.getCell(1,1, false).setRowSpan(2);
        checkTable(table, "table-rowspan.html");
        table.getCell(1,1, false).setRowSpan(1);
        checkTable(table, "table-simple.html");
    }

    @org.junit.Test public void testColRowSpan() throws IOException {
        Table table = new Table();
        fillTable(table, 3, 5);
        table.getCell(1,1, false).setColSpan(2);
        table.getCell(1,1, false).setRowSpan(2);
        checkTable(table, "table-colrowspan.html");
        table.getCell(1,1, false).setColSpan(1);
        checkTable(table, "table-rowspan.html");
        table.getCell(1,1, false).setRowSpan(1);
        checkTable(table, "table-simple.html");
    }

    @org.junit.Test public void testHtmlParser() throws IOException {
        for (int i=1; i<=3; i++) {
            Table table = Table.fromXML(getSource("table-test-" + i + ".html"));
            checkTable(table, "table-test-" + i + "-expected.html");
        }
    }

    private void fillTable(Table table, int rows, int cols) {
        for (int r=0; r<rows; r++) {
            for (int c=0; c<cols; c++) {
                table.getCell(r, c, true).setText("(" + r + "," + c + ")");
            }
        }
    }

    private void checkTable(Table table, String expectedFile)
            throws IOException {
        StringWriter w = new StringWriter();
        table.toHtml(w);
        w.close();
        String expected = IOUtils.toString(getClass().getResourceAsStream(expectedFile), "utf-8");
        expected = expected.trim();
        String result = w.toString().trim();

        // unify line breaks
        expected = StringUtils.join(StringUtils.split(expected, "\r\n"), '\n');
        result = StringUtils.join(StringUtils.split(result, "\r\n"), '\n');
        assertEquals(expectedFile, expected, result);
    }

    private Reader getSource(String name) throws UnsupportedEncodingException {
        InputStream in = getClass().getResourceAsStream(name);
        return new InputStreamReader(in, "utf-8");
    }

}