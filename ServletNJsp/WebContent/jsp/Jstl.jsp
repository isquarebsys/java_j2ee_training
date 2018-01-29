<!DOCTYPE html>
<jsp:include page="../nav.jsp" />
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<div class="page-header"><h1>JSTL Tags</h1></div>
			<p>Uses
				<li>Faster development: JSTL provides many tags that simplifies the JSP
				<li>Code Reusability: We can use the JSTL tags in various pages
				<li>No need to use scriptlet tag It avoids the use of scriptlet tag
			</p>
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#overview">Overview</button>
		
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#example">Steps and Example</button>
			
		<div id="overview" class="collapse">			
				<h3><font color="maroon">Tags available</font></h3>
					<table class="table table-striped">
						<tr><th>Tag Name</th><th>Usage</th><th>Url</th><th>Prefix</th></tr>
						<tr>
							<td>Core tags</td>
							<td>Variable support, URL management, flow control etc</td> 
							<td>http://java.sun.com/jsp/jstl/core</td> 
							<td>c</td></tr>
						<tr>
							<td>Function tags</td>
							<td> The functions tags provide support for string manipulation and string length</td> 
							<td>http://java.sun.com/jsp/jstl/functions</td> 
							<td>fn</td></tr>
						<tr>
							<td>Formatting tags</td>
							<td> The Formatting tags provide support for message formatting, number and date formatting etc</td> 
							<td>http://java.sun.com/jsp/jstl/fmt</td>
							<td>fmt</td></tr>
						<tr>
							<td>XML tags</td>
							<td> The xml sql tags provide flow control, transformation etc</td>
							<td>http://java.sun.com/jsp/jstl/xml</td> 
							<td>x</td></tr>
						<tr>
							<td>SQL tags</td>
							<td> The JSTL sql tags provide SQL support
							<td>http://java.sun.com/jsp/jstl/sql  
							<td>sql</td></tr>
					</table>
		</div>			
		<div id="example" class="collapse">			
				<li>Download the <a href="https://www.javatpoint.com/jsppages/src/jstl-1.2.jar">jstl-1.2.jar</a>
				<li>Copy to the WEB-INF folder
				<li>Start using the TAG  
				<li>c:out->example-><c:out value="${'This is output from c:out tage. Its equivalent to to out.println'}"/>
				
				<h3><font color="maroon">Sql TAG Example</font></h3>
				  <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
	     			url="jdbc:mysql://localhost:3306/test?useSSL=false" user="vpanchat"  password="p1kvijay"/> 
					<sql:query dataSource="${db}" var="rs">SELECT * from user;</sql:query>  
					   
					<table class="table table-striped" width="100%">  
						<tr>  
							<th>Id</th>  
							<th>Name</th>  
							<th>Email</th>  
						</tr>  
						<c:forEach var="table" items="${rs.rows}">  
							<tr>  
							<td><c:out value="${table.id}"/></td>  
							<td><c:out value="${table.name}"/></td>  
							<td><c:out value="${table.email}"/></td>   
							</tr>  
					</c:forEach>  
					</table>       			 
		</div>
	</div>		
</body>
</html>