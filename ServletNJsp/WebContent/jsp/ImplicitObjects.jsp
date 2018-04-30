<!DOCTYPE html>
<jsp:include page="../nav.jsp" />
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
	<div class="page-header"><h1>Implicit Objects</h1></div>
			<p>Usage of the following objects
				<li>request,response,config,page,session,application
			</p>
		<div class="well">
			<h3>
				First Name from the Request: <font color="blue"><% out.print(request.getParameter("first_name"));%></font></h3>
				<br/>First Name 
					<font color="blue">[<% out.print(request.getParameter("first_name"));%>]</font> from the Request is stored  in Session
				<br/>
			<h3>PageContext</h3>
				<%   
					String name=request.getParameter("first_name");  
					pageContext.setAttribute("first_name",name,PageContext.SESSION_SCOPE);
				%>  			
				<br/>First Name 
					<font color="blue">[<% out.print(request.getParameter("first_name"));%>]</font> from the Request is stored  in Session Scope in the name
					<font color="blue">first_name</font>
					<br/>You can access the attribute using <font color="blue">pageContext.getAttribute("first_name")</font>
				<br/><font color="red">pageContext can set in scopes as page,request,session and application</font>
			<h3>
				<% session.setAttribute("user_name",request.getParameter("first_name")); %>
				Name in the session: <font color="blue"><% out.print(session.getAttribute("user_name"));%></font>
			</h3>
			<br/>
			<h3>	
				Config Parameter [databaseName] from web.xml: <% out.print(config.getInitParameter("databaseName"));%>
			</h3>
			<br/>Config is equivalent of Servlet.getInitParam=><font color="red">init-param</font>
			<h3>
				Application Parameter [databaseName) from web.xml: <font color="blue"><% out.print(application.getInitParameter("databaseName"));%></font>
			</h3>
			<br/>Application is equivalent of ServletContext=><font color="red">context-param</font>
			
		</div>
	</div>
</body>
</html>