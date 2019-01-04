<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<sql:setDataSource var="db" driver="org.h2.Driver"
		url="jdbc:h2:tcp://localhost/~/db" user="sa" password="" />
	<sql:update dataSource="${db}">insert into employee values(1,'abc')</sql:update>
	<sql:query var="rs" dataSource="${db}">select * from employee</sql:query>
	<c:forEach items="${rs.rows}" var="ga">
		<table border="1">
		<tr>
		<td><c:out value="${ga.emp_id}"></c:out></td>
		<td><c:out value="${ga.emp_name}"></c:out></td>
		</tr>
		</table>
	</c:forEach>
</body>
</html>