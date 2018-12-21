<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!--  JSP scriptlet tag that prints the user name -->

<%
	String name = request.getParameter("uname");
	out.print("Welcome to JSP Scriptlet Tag "+name);
%>
<br>
<!--  JSP Expression tag that prints the user name -->
<%= "Welcome to Expression Tag  "+request.getParameter("uname") %>  

<br>
<!--  JSP Declaration tag that prints the user name -->
<%! int data=50; %>  
<%!   
int cube(int n)
{  
return (n*n*n);  
}  
%>  
<%= "Cube of 3 is:"+cube(3) %>  
</body>
</html>