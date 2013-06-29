<spring:url var="action" value="/item/save" />
<form:form modelAttribute="item" action="${action}" method="POST">
	<form:hidden path="id" id="id" />
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