<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<link rel="stylesheet" href="<c:url value="/static/css/bootstrap.min.css" />" type="text/css">
		
		<script language="javascript" src="<c:url value="/static/js/bootstrap.min.js" />"></script>
		
		<title>spring-mvc-demo</title>
	</head>
	<body>
		<div class="container-fluid">
			<h2>Edit Item</h2>
			<div class="row-fluid">
				<%@ include file="_nav.jsp" %>
			</div>
			<div class="row-fluid">
				<div class="span8">
					<%@ include file="_form.jsp" %>
				</div>
			</div>
		</div>
	</body>
</html>