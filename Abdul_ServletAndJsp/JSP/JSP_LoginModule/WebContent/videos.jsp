<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
if(session.getAttribute("username")==null)
{
	response.sendRedirect("login.jsp");
}

%>

<iframe width="560" height="315" src="https://www.youtube.com/embed/5VeO6um5McA" frameborder="0" allow="accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<br>
<br>

<form action="Logout">
<input type="submit" value="logout">
</form>
</body>
</html>