<%@page import="java.util.Scanner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
int i=2,j=3;
int res=0;
%>
<%
res=i+j;
out.print("result" +res);

%>
<%= res %>
pageContext.setAttribute("name","abdul");
<% pageContext.getAttribute("name");
%>
</body>
</html>