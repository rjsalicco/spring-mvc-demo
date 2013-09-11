<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			<h2>Item List</h2>
			<div class="row-fluid">
				<%@ include file="_nav.jsp" %>
			</div>
			<div class="row-fluid">
				<div class="span8">
					<table class="table table-striped">
						<tr>
							<th>Title</th><th>Author</th>
						</tr>
						<c:forEach var="item" items="${items}">
						<tr>
							<td><a href="<c:url value='/item/edit/${item.id}' />">${item.title}</a></td><td>${item.author}</td>
						</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>