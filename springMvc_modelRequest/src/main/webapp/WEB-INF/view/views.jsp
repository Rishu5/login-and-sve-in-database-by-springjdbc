<%@page import="org.apache.jasper.tagplugins.jstl.core.Import"%>
<%@page import="org.apache.catalina.connector.Response"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@page import="com.rishu.modelrequest.Stu"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	Stu student = (Stu) request.getAttribute("student");
	%>

	helloevery one how are you
	<br> Email id =
	<%=student.getEmail()%><br> user is =
	<%=student.getUserid()%><br> password =<%=student.getPassword()%>
</body>
</html>