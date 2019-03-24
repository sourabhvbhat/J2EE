<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Factorial Calculation</title>
</head>
<body>
<%! int a,fact;
 %>
 
 <% fact=1;
 a= Integer.parseInt(request.getParameter("num")); 
 if(a>0)
 {	
 	
 	for(int i=1;i<=a;i++)
 		fact*=i;
 }
 %>
 Factorial of a number is : 
<%= fact %>
 
 
</body>
</html>