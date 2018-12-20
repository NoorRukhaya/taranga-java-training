

import java.io.*;  
import javax.servlet.*;  
import javax.servlet.http.*;  
public class Demo2 extends HttpServlet{  
public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
{  
	PrintWriter out=res.getWriter();  

res.setContentType("text/html");  

  
ServletContext context=getServletContext();  
String n=(String)context.getAttribute("company");  
  
out.println("Welcome to "+n);  
out.close();  
  

}}  
