package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class edit_005fstudent_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("    <center>\n");
      out.write("        <h1>Edit Student Profile</h1>\n");
      out.write("        <form action=\"Edit_Student_Controller\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Full Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"student_name\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Birth Date</td>\n");
      out.write("                    <td><input type=\"text\" name=\"birth_date\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Gender</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"gender\">\n");
      out.write("                            <option value=\"Male\">Male</option>\n");
      out.write("                            <option value=\"Female\">Female</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Blood Group</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"blood_group\" >\n");
      out.write("                            <option></option>\n");
      out.write("                            <option value=\"A+\">A+</option>\n");
      out.write("                            <option value=\"A-\">A-</option>\n");
      out.write("                            <option value=\"B+\">B+</option>\n");
      out.write("                            <option value=\"B-\">B-</option>\n");
      out.write("                            <option value=\"O+\">O+</option>\n");
      out.write("                            <option value=\"O-\">O-</option>\n");
      out.write("                            <option value=\"AB+\">AB+</option>\n");
      out.write("                            <option value=\"AB-\">AB-</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Religion</td>\n");
      out.write("                    <td><input type=\"text\" name=\"religion\" ></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>E-mail</td>\n");
      out.write("                    <td><input type=\"text\" name=\"email\" ></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Mobile No</td>\n");
      out.write("                    <td><input type=\"text\" name=\"mobile\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Address</td>\n");
      out.write("                    <td><textarea type=\"text\" name=\"address\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Class</td>\n");
      out.write("                    <td>\n");
      out.write("                        <select name=\"student_class\">\n");
      out.write("                            <option></option>\n");
      out.write("                            <option value=\"One\">One</option>\n");
      out.write("                            <option value=\"Two\">Two</option>\n");
      out.write("                            <option value=\"Three\">Three</option>\n");
      out.write("                            <option value=\"Four\">Four</option>\n");
      out.write("                            <option value=\"Five\">Five</option>\n");
      out.write("                        </select></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Roll No</td>\n");
      out.write("                    <td><input type=\"text\" name=\"roll\" ></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Registration No</td>\n");
      out.write("                    <td><input type=\"text\" name=\"reg_no\" ></td>\n");
      out.write("                </tr>\n");
      out.write("            </table>     \n");
      out.write("\n");
      out.write("            <input type=\"submit\" value=\"Submit\" class=\"btn btn-success\">\n");
      out.write("            <input type=\"reset\" value=\"Reset\" class=\"btn btn-primary\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
