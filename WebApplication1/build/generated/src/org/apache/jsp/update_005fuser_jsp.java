package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class update_005fuser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jspf/koneksi.jspf");
  }

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
      out.write('\n');

String xDRIVER = "com.mysql.jdbc.Driver";
String xUSERNAME = "root";
String xPASSWORD = "";
String xSTRING = "jdbc:mysql://localhost:3306/simpleblogii";
Class.forName(xDRIVER);


      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update User</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

		try{
			Connection connection = null;
			Statement statement = null;
			ResultSet rs = null;
			Class.forName(xDRIVER);
			connection = DriverManager.getConnection(xSTRING,xUSERNAME,xPASSWORD);
			statement = connection.createStatement();
			String Data = "select * from users where username = 'aryya'";
			rs = statement.executeQuery(Data);
			
			while(rs.next()){
		
      out.write("\t\n");
      out.write("\t\t\t<form method=\"post\" action=\"jspf/update.jspf\">\n");
      out.write("\t\t\t\t<label>Nama: </label><input type=\"text\" id=\"user_name\" name=\"user_name\" value=\"");
      out.print(rs.getString("nama"));
      out.write("\">\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t<label>Username: </label><input type=\"text\" id=\"user_username\" name=\"user_username\" value=\"");
      out.print(rs.getString("username"));
      out.write("\">\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t<label>Password: </label><input type=\"text\" id=\"user_password\" name=\"user_password\" value=\"");
      out.print(rs.getString("password"));
      out.write("\">\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t<label>Email: </label><input type=\"text\" id=\"user_email\" name=\"user_email\" value=\"");
      out.print(rs.getString("email"));
      out.write("\">\n");
      out.write("\t\t\t\t<br/>\n");
      out.write("\t\t\t\t<input type=\"submit\" value=\"Update\">\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t");

			}
			rs.close();
			statement.close();
			connection.close();
		}catch(Exception ex){
			out.println("Gagal tersambung. Terdaapat kesalahan.");
		}	
		
      out.write("\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("    </body>\n");
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
