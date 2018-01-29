<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="../nav.jsp" />
<html>
<head>
<title></title>
</head>
<body>
	<div class="container">
	<div class="page-header"><h1>Controllers,Forms and Models</h1></div>
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
					<li>Usage of Spring Form
					<li>Store form field to a model using <b>StudentController</b>
						<br/>form:input path="name" is directly added to the Student.name by the Controller
						<br/>This happens in the method->addStudent(@ModelAttribute("student")Student student,ModelMap model)
					<li>Redirect to <b>student_added.jsp</b>
					<li>student_added.jsp accesses the MODEL information using $
		</div>			
		
		<div id="example" class="collapse">
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
		<div id="result" class="collapse">			
				<h3><font color="maroon">Result</font></h3>
				<li>Submit the form and see
	</div>
</body>
</html>