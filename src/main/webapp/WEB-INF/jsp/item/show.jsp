<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="<c:url value="/static/stylesheets/main.css" />" type="text/css">
		<title>spring-mvc-demo</title>
	</head>
	<body>
		
		<p>show item</p>
	
		<p>
			<a href="<c:url value='/' />">home</a> |
			<a href="<c:url value='/item' />">item list</a>
		</p>
	
		<p>
			<span class="label">Id:</span> 
			<span class="value">${item.id}</span>
		</p>
		<p>
			<span class="label">Author:</span>
			<span class="value">${item.author}</span>
		</p>
		<p>
			<span class="label">Title:</span> 
			<span class="value">${item.title}</span>
		</p>
		<p>
			<span class="label">Content:</span> 
			<span class="value">${item.content}</span>
		</p>
		
	</body>
</html>