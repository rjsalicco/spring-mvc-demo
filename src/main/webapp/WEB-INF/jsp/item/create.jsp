<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
		
		<form:form modelAttribute="item" action="save" method="POST">
			<p>
				<form:errors path="*" cssClass="errors" />
			</p>
			<p>
				<form:label path="author" for="author">author</form:label>
				<form:input path="author" id="author"/>
			</p>
			<p>
				<form:label path="title" for="title">title</form:label>
				<form:input path="title" id="title"/>
			</p>
			<p>
				<form:label path="content" for="content">content</form:label>
				<form:textarea path="content" id="content"/>
			</p>
			<p>
				<input type="submit" value="save" />
			</p>
		</form:form>
		
	</body>
</html>