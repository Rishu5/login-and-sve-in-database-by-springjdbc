<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>hello every one how are ypu how can i help you </h1>


<%
String Name=(String)request.getAttribute("Name");
 String age = (String)request.getAttribute("age");
%>


<h2>this is name <%=Name %></h2>
<h2>this is age of <%=Name  +  age%></h2>



</body>
</html>