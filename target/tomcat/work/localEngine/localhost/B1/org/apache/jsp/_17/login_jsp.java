package org.apache.jsp._17;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\r\n");
      out.write("<title>登录页面</title>\r\n");
      out.write("<link rel = \"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\">\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tcolor:#000;\r\n");
      out.write("\t\tfont-size:14px;\r\n");
      out.write("\t\tmargin:20px auto;\r\n");
      out.write("\t\tbackground-image:url(\"8.jpg\")\r\n");
      out.write("\t}\r\n");
      out.write("\t。form-horizontal{\r\n");
      out.write("\t\r\n");
      out.write("\t\tfloat:center;\r\n");
      out.write("\t}\r\n");
      out.write("\t#xitong{\r\n");
      out.write("\t\ttext-align:center;\r\n");
      out.write("\t\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction check(form){\r\n");
      out.write("\t\tif(document.forms.loginForm.uname.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入用户名！\");\r\n");
      out.write("\t\t\tdocument.forms.loginForm.uname.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tif(document.forms.loginForm.upwd.value==\"\"){\r\n");
      out.write("\t\t\talert(\"请输入密码！\");\r\n");
      out.write("\t\t\tdocument.forms.loginForm.upwd.focus();\r\n");
      out.write("\t\t\treturn false;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!--  \r\n");
      out.write("\t<form action=\"");
      out.print(request.getContextPath());
      out.write("/checkServlet\" method=\"post\" method=\"post\" name=\"loginForm\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t");
if(request.getAttribute("return_uri")!=null){ 
      out.write("\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"return_uri\" value=\"");
      out.print(request.getAttribute("return_uri"));
      out.write("\"/>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<table border=\"1\" cellspacing=\"0\" cellpadding=\"5\" bordercolor=\"silver\" align=\"center\">\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" align=\"center\" bgcolor=\"#E8E8E8\">用户登录</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>用户名：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"uname\"/></td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>密码：</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"password\" name=\"upwd\"/></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\" align=\"center\">\r\n");
      out.write("\t\t\t\t\t <input type=\"submit\" name=\"submit\" onclick=\"return check(this);\"/> \r\n");
      out.write("\t\t\t\t\t<input type=\"reset\" name=\"reset\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\t-->\r\n");
      out.write("\r\n");
      out.write("\t<form class=\"form-horizontal\" role=\"form\" action=\"");
      out.print(request.getContextPath());
      out.write("/checkServlet\" method=\"post\" name=\"loginForm\"  >\r\n");
      out.write("\t\t");
if(request.getAttribute("return_uri")!=null){ 
      out.write("\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"return_uri\" value=\"");
      out.print(request.getAttribute("return_uri"));
      out.write("\"/>\r\n");
      out.write("\t\t");
}
      out.write("\r\n");
      out.write("\t\t<h5>王锐展8801</h5>\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label class=\"col-sm-2 control-label\">电影管理租赁系统</label>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label class=\"col-sm-2 control-label\">用户名</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-2\" style=\"float:center\">\r\n");
      out.write("\t\t\t\t<input type=\"text\" class=\"form-control\" placeholder=\"用户名\" name=\"uname\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<label class=\"col-sm-2 control-label\">密码</label>\r\n");
      out.write("\t\t\t<div class=\"col-sm-2\">\r\n");
      out.write("\t\t\t\t<input type=\"password\" class=\"form-control\" placeholder=\"密码\" name=\"upwd\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-5 col-sm-offset-2\">\r\n");
      out.write("\t\t\t\t<div class=\"checkbox\">\r\n");
      out.write("\t\t\t\t\t<label>\r\n");
      out.write("\t\t\t\t\t\t<input type=\"checkbox\">记住密码\r\n");
      out.write("\t\t\t\t\t</label>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t<div class=\"col-sm-offset-2 col-sm-10\">\r\n");
      out.write("\t\t\t\t<button type=\"submit\" name=\"submit\" class=\"btn btn-default\" onclick=\"return check(this);\"  >登录</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
