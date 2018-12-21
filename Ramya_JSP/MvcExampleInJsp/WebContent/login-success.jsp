<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="com.mvc.LoginModel"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  
<p>You are successfully logged in!</p>  
<%  
LoginModel lm=(LoginModel)request.getAttribute("lm");  
out.print("Welcome, "+lm.getName());  
%>  
</body>
</html>