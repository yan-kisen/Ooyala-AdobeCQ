package org.apache.jsp.libs.foundation.components.timing;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
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
import org.apache.sling.api.request.RequestProgressTracker;
import java.util.Iterator;
import java.util.Comparator;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class timing_jsp extends org.apache.sling.scripting.jsp.jasper.runtime.HttpJspBase
    implements org.apache.sling.scripting.jsp.jasper.runtime.JspSourceDependent {


private static final String TIMER_END = "TIMER_END";

static class ChartBar {
    String input;
	String name;
	String fullname;
	int start;
	int end;
	int elapsed;
	private static final String ELLIPSIS = "...";
	private static final int MAX_LABEL_LENGTH = 25;
	
	/** Line is like
	 *  127 (2009-10-07 14:15:17) TIMER_END{97,/libs/cq/core/components/welcome/welcome.jsp#0}  
	 */
	ChartBar(String line) {
	    try {
	        input = line.trim();
	        end = Integer.valueOf(scan(' '));
	        scan('{');
	        elapsed = Integer.valueOf(scan(','));
            start = end - elapsed;
	        fullname = cutBeforeLast(scan('}'), '#');
		    name = shortForm(fullname);
	    } catch(NumberFormatException ignored) {
	        name = fullname = ignored.toString();
	    }
	}
	 
    /** Remove chars up to separator in this.input, and return result */
    private String scan(char separator) {
        final StringBuilder sb = new StringBuilder();
        for(int i=0; i < input.length(); i++) {
            char c = input.charAt(i);
            if(c == separator) {
                break;
            }
            sb.append(c);
        }
        input = input.substring(sb.length() + 1);
        return sb.toString().trim();
    }
    
    private static String cutBeforeLast(String str, char separator) {
        int pos = str.lastIndexOf(separator);
        if(pos > 0) {
            str = str.substring(0, pos);
        }
        return str;
    }
    
    private static String shortForm(String str) {
        String result = basename(str);
        if(result.length() > MAX_LABEL_LENGTH) {
            result = result.substring(0, MAX_LABEL_LENGTH - ELLIPSIS.length()) + ELLIPSIS;
        }
        return result;
    }
}

static abstract class Getter {
    abstract String get(ChartBar t); 
}

private static String basename(String path) {
    String result = path;
    int pos = path.lastIndexOf('/');
    if(pos > 0) {
        result = result.substring(pos + 1);
    }
    return result;
}

private static String stringList(List<ChartBar> data, String separator, Getter g) {
	StringBuilder result = new StringBuilder();
	for(ChartBar t : data) {
		if(result.length() > 0) {
			result.append(separator);
		}
		result.append(URLEncoder.encode(g.get(t)));
	}
	return result.toString();
}

private static boolean accept(String line) {
    boolean result = line.contains(TIMER_END);
    result &= !line.contains(",resolveServlet(");
    result &= !line.contains("ResourceResolution");
    result &= !line.contains("ServletResolution");
    return result;
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

      out.write('\n');










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


      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write('\n');

// Convert RequestProgressTracker TIMER_END messages to timings and operation names
RequestProgressTracker t = slingRequest.getRequestProgressTracker();
ArrayList<ChartBar> chartData = new ArrayList<ChartBar>();
int maxTime = 0;
for(Iterator<String> it = t.getMessages() ; it.hasNext(); ) {
	String line = it.next();
	if(accept(line)) {
	    ChartBar b = new ChartBar(line);
	    chartData.add(b);
	    maxTime = b.end;
	}
}

String title = basename(request.getPathInfo()) + " (" + maxTime + "ms)";

// Sort data according to numeric start time
Collections.sort(chartData, new Comparator<ChartBar>() {
    public int compare(ChartBar a, ChartBar b) {
        if(a.start > b.start) {
            return 1;
        } else if(a.start < b.start) {
            return -1;
        }
        return 0;
    }
});

// Chart API limitations - max 30k pixels!
int chartWidth = 600;
int maxPixels = 300000;
int chartHeight = maxPixels / chartWidth;

// See http://code.google.com/apis/chart/types.html#bar_charts for docs
StringBuilder b = new StringBuilder();
b.append("http://chart.apis.google.com/chart");
b.append("?chtt=" + URLEncoder.encode(title));
b.append("&cht=bhs");
b.append("&chxt=x");
b.append("&chco=c6d9fd,4d89f9");
b.append("&chbh=a");
b.append("&chds=0," + maxTime + ",0," + maxTime);
b.append("&chxr=0,0," + maxTime);
b.append("&chd=t:");
b.append(stringList(chartData, ",", new Getter() { public String get(ChartBar t) { return String.valueOf(t.start); }}));
b.append("|");
b.append(stringList(chartData, ",", new Getter() { public String get(ChartBar t) { return String.valueOf(t.elapsed); }}));
b.append("&chly=");
b.append(stringList(chartData, "|", new Getter() { public String get(ChartBar t) { return t.name; }}));
b.append("&chs=" + chartWidth + "x" + chartHeight);

      out.write('\n');
      out.write('\n');

// Dump data, in comments
out.println("<!--");

/* uncomment the following to get more timing details in the page
out.println("\nRaw RequestProgressTracker data:"); 
StringBuilder mb = new StringBuilder();
Iterator<String> it = t.getMessages();
while(it.hasNext()) {
    mb.append(it.next());
}
out.print(mb.toString());
out.println("\nChartData dump:");
for(ChartBar d : chartData) {
    out.print(d.start);
    out.print(' ');
    out.print(d.fullname);
    out.print(" (");
    out.print(d.elapsed);
    out.println("ms)");
}
*/

out.println("More detailed timing info is available by uncommenting some code in the timing.jsp component");
out.println("Timing chart URL:");
out.println(b.toString());
out.println("-->");

      out.write('\n');
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
