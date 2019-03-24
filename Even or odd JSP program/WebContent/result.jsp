<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Checking even or odd number</title>
</head>
<body>
<% String a = request.getParameter("num");
int b= Integer.parseInt(a);
if(b%2==0){
%>
<%= a %>
is even
<% }else{ %>
<%=a %>
is odd  
<%	}
	%>
</body>
</html>