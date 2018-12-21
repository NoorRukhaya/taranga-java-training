<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
<sql:setDataSource var="db" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/jspdemo?useSSL=false" user="root" password="root"/>
<sql:query var="rs" dataSource="${db}">select * from register</sql:query>

 <c:forEach items="${rs.rows}" var="register">
<c:out value="${register.id}"></c:out> : <c:out value="${register.name}"></c:out> : <c:out value="${register.password}"></c:out> : <c:out value="${register.email}"></c:out> :<c:out value="${register.country}"></c:out>

</c:forEach>
</body>
</html>