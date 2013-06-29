<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="<c:url value="/static/stylesheets/main.css" />" type="text/css">
		<title>spring-mvc-demo</title>
	</head>
	<body>
		
		<p>create item</p>
		
		<p>
			<a href="<c:url value='/' />">home</a> |
			<a href="<c:url value='/item' />">item list</a>
		</p>
		
		<%@ include file="_form.jsp" %>
		
	</body>
</html>