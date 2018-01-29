<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="../nav.jsp" />
<html>
<head>
<title></title>
</head>
<body>
	<div class="container">
	<div class="page-header"><h1>Hibernate DAO within Spring Configuration</h1></div>
			<p>
			</p>
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#overview">Overview</button>
		
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#example">Steps and Example</button>
			
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#result">Result</button>			
			
		<div id="overview" class="collapse">			
				<h3><font color="maroon">Overview</font></h3>
					<li>Use hibernate by configuring within springapp-servlet.xml
		</div>			
		
		<div id="example" class="collapse">
			<div class="jumbotron">
				<li>PersonController loads the Bean named PersonDAO from WEB-INF/springapp-servlet.xml
				<li>Uses the PersonDAO to save the data posted
	
				<form:form method="POST" action="/Spring4Web/person/added">
					<table>
						<tr>
							<td><form:label path="name">Name</form:label></td>
							<td><form:input path="name" /></td>
						</tr>
						<tr>
							<td><form:label path="country">Country</form:label></td>
							<td><form:input path="country" /></td>
						</tr>
						<tr>
							<td><form:label path="id">id</form:label></td>
							<td><form:input path="id" /></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="Add" /></td>
						</tr>
					</table>
				</form:form>
			</div>
		</div>
		<div id="result" class="collapse">			
				<h3><font color="maroon">Result</font></h3>
				<li>Submit the form and see
	</div>
</body>
</html>