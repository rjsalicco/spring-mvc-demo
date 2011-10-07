<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="/static/stylesheets/main.css" type="text/css">
		<title>spring-mvc-demo</title>
	</head>
	<body>
		
		<p>Create Item</p>
		<form:form modelAttribute="item" action="save" method="POST">
			<form:errors path="*" cssStyle="color: red;"/>
			<br />
			<form:label path="author" for="author">author</form:label>
			<br />
			<form:input path="author" id="author"/>
			<br/>
			<form:label path="title" for="title">title</form:label>
			<br />
			<form:input path="title" id="title"/>
			<br/>
			<form:label path="content" for="content">content</form:label>
			<br />
			<form:textarea path="content" id="content"/>
			<br/>
			<input type="submit" value="save" />
		</form:form>
		
	</body>
</html>