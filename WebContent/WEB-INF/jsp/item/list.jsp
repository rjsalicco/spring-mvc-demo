<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="/static/stylesheets/main.css" type="text/css">
		<title>spring-mvc-demo</title>
	</head>
	<body>
		
		<p>Item List</p>
	
		<table>
			<tr>
				<th>Id</th><th>Title</th><th>Author</th>
			</tr>
			<c:forEach var="item" items="${items}">
			<tr>
				<td>${item.id}</td><td>${item.title}</td><td>${item.author}</td>
			</tr>
			</c:forEach>
		</table>
		
	</body>
</html>