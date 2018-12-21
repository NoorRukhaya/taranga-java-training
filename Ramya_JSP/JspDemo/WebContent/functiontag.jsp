<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:set var="str" value="Ramya is Java Developer"/>
 Length :${fn:length(str)}
 
 <c:forEach items="${fn:split(str,' ' )}" var="s">
 <br>
  ${s}
 </c:forEach>
 <br>
 index : ${fn:indexOf(str,"is")}
 <br>
 is there : ${fn:contains(str,"Java")}
 <br>
 <c:if test="${fn:endsWith(str,'Embedded')}">
 Yes are Right
 </c:if>
 ${fn:toLowerCase(str)}
 
</body>
</html>