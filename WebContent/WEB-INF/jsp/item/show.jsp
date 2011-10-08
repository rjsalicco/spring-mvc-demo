<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="/static/stylesheets/main.css" type="text/css">
		<title>spring-mvc-demo</title>
	</head>
	<body>
		
		<p>Item</p>
	
		<p><a href="<c:url value='/item' />">item list</a></p>
	
		Id: ${item.id}
		<br/>
		Title: ${item.title}
		<br/>
		Content: ${item.content}
		<br/>
		Author: ${item.author}
		
	</body>
</html>