

import java.io.IOException;
import java.io.PrintWriter;

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
public class Demo1 extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException,ServletException
{  
  
  
res.setContentType("text/html");  
PrintWriter out=res.getWriter();  
  
ServletContext context=getServletContext();  
context.setAttribute("company","TharangaTechnologies");  
  
out.println("Welcome to first servlet");  
out.println("<a href='servlet2'>visit</a>");  
out.close();  
}
}




