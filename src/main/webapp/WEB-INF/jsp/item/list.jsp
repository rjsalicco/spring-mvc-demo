<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="<c:url value="/static/stylesheets/main.css" />" type="text/css">
		<title>spring-mvc-demo</title>
	</head>
	<body>
		
		<p>item list</p>
	
		<p>
			<a href="<c:url value='/' />">home</a> |
			<a href="<c:url value='/item/new' />">new item</a>
		</p>
	
		<table>
			<tr>
				<th>Id</th><th>Title</th><th>Author</th>
			</tr>
			<c:forEach var="item" items="${items}">
			<tr>
				<td><a href="<c:url value='/item/${item.id}' />">${item.id}</a></td><td>${item.title}</td><td>${item.author}</td>
			</tr>
			</c:forEach>
		</table>
		
	</body>
</html>