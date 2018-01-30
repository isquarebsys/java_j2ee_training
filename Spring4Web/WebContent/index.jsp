<!DOCTYPE html>
<jsp:include page="nav.jsp" />
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<title></title>
</head>
<body>
	<div class="container">
		<div class="page-header" align="center">
			<h1>Spring and Hibernate</h1>
		</div>
		<div class="well">
			<li>Spring is a popular <font color="blue">Dependency Injection</font> framework
		</div>		
		<div class="well">
			<li>Spring can be integrated with Hibernate in 2 ways
				<br/><font color="red">1. In standalone mode, it uses an xml [see spring4_standalone.xml]. Check <a href="https://github.com/isquarebsys/java_j2ee_training/tree/master/Spring4Web/src/dao/SpringStandaloneTest.java" target="_blank">SpringStandaloneTest.java</a></font>
				<br/>2. In WEB Mode, it uses springapp-servlet.xml under WEB-INF. See Spring WEB samples further
			<li><font color="red">Note</font>: spring4_standalone.xml is a copy of springapp-servlet.xml. The only difference is how it is used [Standalone or Web]
		</div>
		<div class="well">Reference Materials: 
			<a href="https://github.com/isquarebsys/java_j2ee_training/tree/master/Spring4Web/src/hibernate" target="_blank">Hibernate</a>
			<a href="https://github.com/isquarebsys/java_j2ee_training/tree/master/Spring4Web/src/controllers" target="_blank">Spring</a>
		</div>
		<div class="w3-row-padding">
			<div class="w3-third">
				<h3>Spring [Standalone]</h3>
				<li><a href="https://github.com/isquarebsys/java_j2ee_training/tree/master/Spring4Web/src/dao/SpringStandaloneTest.java" target="_blank">SpringStandaloneTest.java</a>
			</div>
			<div class="w3-third">
				<h3>Spring Web with Hibernate</h3>
				<li><a href="https://github.com/isquarebsys/java_j2ee_training/tree/master/Spring4Web/src/controllers/IndexHtmlController.java" target="_blank">Load an Index Page</a>
				<li><a href="/Spring4Web/student/add" target="_blank">Controller, Form</a></li>
				<li><a href="/Spring4Web/student/add" target="_blank">Populate Model using Form</a></li>
				<li><a href="/Spring4Web/person/add" target="_blank">Load Bean from Config</a></li>
				<li><a href="/Spring4Web/person/add" target="_blank">DAO with Bean->Create a Person</a></li>
				<li><a href="/Spring4Web/person/add/template" target="_blank">HibernateTemplate->DAO->Create a Person</a></li>
				<li><a href="/Spring4Web/person/list" target="_blank">HibernateTemplate->List table rows</a></li>
				<li><a href="/Spring4Web/person/list" target="_blank">HibernateTemplate->Delete table rows</a></li>
			</div>
			<div class="w3-third">
				<h3>Hiberate [Standalone]</h3>
					<li><a href="/Spring4Web/hibernate/crud/CreatePerson.jsp" target="_blank">Create->1 row in Person Table</a></li>
					<li><a href="/Spring4Web/hibernate/crud/UserSingleAddressInsertTest.jsp" target="_blank">Create->1 Address for an User</a></li>
					<li><a href="/Spring4Web/hibernate/crud/StudentMultipleAddressInsert.jsp" target="_blank">Create->Multiple Address for a Student</a></li>
					<li><a href="/Spring4Web/hibernate/query/hql.jsp" target="_blank">HQL</a></li>					
					<li><a href="/Spring4Web/hibernate/query/QueryAddress.jsp" target="_blank">Query->1 to 1 association</a></li> 									
					<li><a href="/Spring4Web/hibernate/query/StudentMultipleAddressQuery.jsp" target="_blank">Query->1 to Many associations</a></li>				
					<li><a href="https://github.com/isquarebsys/java_j2ee_training/tree/master/Spring4Web/src/hibernate/hql/AddressNamedQueryTest.java" target="_blank">NamedQuery</a>		         
					<li><a href="https://github.com/isquarebsys/java_j2ee_training/blob/master/Spring4Web/src/hibernate/cache/AddressCacheTest.java" target="_blank">Cache</a>		         
			</div>
		</div>	
	</div>	
</body>
</html>