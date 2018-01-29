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
				<h3><font color="maroon">Overview</font></h3>
		</div>			
		<div id="example" class="collapse">			
				<h3><font color="maroon">Example</font></h3>
		</div>			
	</div>		
</body>
</html>