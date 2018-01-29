<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %> 

<jsp:include page="../nav.jsp" />  
<html>
<head>
<title></title>
</head>
<body>
	<div class="container">
	<div class="page-header"><h1>Hibernate DAO using springapp-servlet.xml</h1></div>
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
				<li>PersonController loads the Bean named PersonDAO from 
				<li>Uses the PersonDAO to save the data posted
			</div>
		</div>
		<div id="result" class="collapse">			
				<h3><font color="maroon">Result</font></h3>
				<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
	     			url="jdbc:mysql://localhost:3306/test?useSSL=false" user="vpanchat"  password="p1kvijay"/> 
					<sql:query dataSource="${db}" var="rs">SELECT * from person;</sql:query>  
					   
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