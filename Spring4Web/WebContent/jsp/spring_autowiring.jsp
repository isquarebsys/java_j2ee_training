<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<jsp:include page="../nav.jsp" />
<html>
<head>
<title></title>
</head>
<body>
	<div class="container">
	<div class="page-header"><h1>Spring Autowired sample</h1></div>
			<p>
			</p>
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#overview">Overview</button>
		
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#example">Steps and Example</button>
			
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#result">Result</button>	
			
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#references">References</button>							
			
		<div id="overview" class="collapse">			
				<h3><font color="maroon">Overview</font></h3>
				<h2>Spring has 4 major components->Controllers, Component, Repository, Service</h2>
				<li>Service is used for encapsulating the database operations [uses @Service Annotation]
					<br/>For example, UserDAO and relevant operations can be hidden using UserService
				<li>Repository is a representation of CRUD operations [uses @Repository Annotation]
					<br/>Spring JPA Repository is to be extended
				<li>Components except Controller can be called using the annotation @Autowired
					<br/>This is an equivalent of calling a bean from the spring xml file

		</div>			
		
		<div id="example" class="collapse">
			<div class="jumbotron">
				<li>PersonControllerWired loads the PeopleService using Annotation and PeopleDAO using the bean from xml file
				<li><font color="blue">Autowired is same as calling a bean from config file</font>->applicationContext.getBean
				<li>Check <b>PersonControllerWired.java</b>
	
				<form method="POST" action="/Spring4Web/person/autowire/service">
					<table>
						<tr>
							<td>Name: <input type="text" name="name"/></td>
						</tr>
						<tr>
							<td>Country: <input type="text" name="country"/></td>
						</tr>
						<tr>
							<td>Id: <input type="text" name="id"/></td>
						</tr>
						<tr>
							<td colspan="2"><input type="submit" value="Add" /></td>
						</tr>
					</table>
				</form>
			</div>
		</div>
		<div id="result" class="collapse">			
				<h3><font color="maroon">Result</font></h3>
				<li>Submit the form and see
		</div>
		<div id="references" class="collapse">			
				<h3><font color="maroon">References</font></h3>	
					<li><a href="https://www.javatpoint.com/hibernate-and-spring-integration">Hibernate Template</a>		
		</div>
	</div>		
</body>
</html>