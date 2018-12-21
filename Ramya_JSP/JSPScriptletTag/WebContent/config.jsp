<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> /* Directive Tag */
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%   
/*
out.print("Welcome "+request.getParameter("uname"));  
  
String driver=config.getInitParameter("dname");  
out.print("driver name is="+driver);  */

String name=request.getParameter("uname");  
out.print("Welcome "+name);  

session.setAttribute("user",name);  

%>  
<a href="session.jsp">second jsp page</a>
</body>
</html>