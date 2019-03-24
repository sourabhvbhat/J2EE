<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.lang.*"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="f"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial Calculation</title>
</head>
<body>
<c:set var="fact" value="1"> </c:set>
<f:parseNumber var ="num" type="number" value="${param.a}" > </f:parseNumber>

<c:if test="${num>0}"> 	

		<c:forEach var="counter" begin="1" end="${num}"> 
		<c:set var="fact" value="${ fact=fact*counter}"></c:set> 
		</c:forEach>
</c:if>	

Factorial of the number is 
<c:out value="${fact}"></c:out>
</body>
</html>