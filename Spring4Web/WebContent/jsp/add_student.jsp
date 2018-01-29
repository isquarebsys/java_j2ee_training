<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="../nav.jsp" />
<html>
<head>
<title></title>
</head>
<body>
	<div class="container">

		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#functions_covered">Functions Covered</button>
		<div id="functions_covered" class="collapse">
			<div class="page-header">
				<h1>Bootstrap Functions</h1>
				<div class="well">
					<li>Jumbotron to draw <font style="color: blue">EXTRA ATTENTION to some special content or information</font>
					<li>Collapsible Information
					<li>Well [Adds a rounded border around an element with a gray background color and some padding]
				</div>
				<h1>Spring Functions</h1>
				<div class="well">
					<li>Usage of Spring Form
					<li>Store form field to a model using <b>StudentController</b>
					<li>Redirect to <b>student_added.jsp</b>
					<li>student_added.jsp accesses the MODEL information using $
				</div>
			</div>
		</div>
		<div class="jumbotron">
			<h1>Student Information</h1>

			<form:form method="POST" action="/Spring4Web/student/added">
				<table>
					<tr>
						<td><form:label path="name">Name</form:label></td>
						<td><form:input path="name" /></td>
					</tr>
					<tr>
						<td><form:label path="age">Age</form:label></td>
						<td><form:input path="age" /></td>
					</tr>
					<tr>
						<td><form:label path="id">id</form:label></td>
						<td><form:input path="id" /></td>
					</tr>
					<tr>
						<td colspan="2"><input type="submit" value="Submit" /></td>
					</tr>
				</table>
			</form:form>
		</div>
	</div>
</body>
</html>