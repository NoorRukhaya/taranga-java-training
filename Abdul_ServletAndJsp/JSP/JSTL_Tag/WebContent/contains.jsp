<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="str" value="am a java developer"/>
Is there : ${fn:contains(str,"java")}
<c:if test="${fn:contains(str,'java')}">
java is there
</c:if>
<c:if test="${fn:endsWith(str,'java')}">
your are right buddy
</c:if>
</body>
</html>