<div>
	<spring:url var="action" value="/item/save" />
	<form:form modelAttribute="item" action="${action}" method="POST">
		<fieldset>
			<form:hidden path="id" id="id" />
			<p>
				<form:errors path="*" cssClass="text-error" />
			</p>
			<form:label path="author" for="author">Author</form:label>
			<form:input path="author" id="author" placeholder="Author"/>
		
			<form:label path="title" for="title">Title</form:label>
			<form:input path="title" id="title" placeholder="Title"/>
		
			<form:label path="content" for="content">Content</form:label>
			<form:textarea path="content" id="content" placeholder="Content"/>
			<p>
				<input type="submit" value="Save" class="btn"/>
			</p>
		</fieldset>
	</form:form>
</div>