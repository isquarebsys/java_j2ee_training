<%@page import="java.util.*,inheritance.*"%>
<%@page import="java.util.HashMap,to.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="../nav.jsp" />  
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#functions_covered">Functions Covered</button>
		<div id="functions_covered" class="collapse">
			<div class="page-header">
				<h1>Simple Servlet posting data to a JSP</h1>
				<div class="well">
					<li>
				</div>
				<h1>JSP Functions</h1>
				<div class="well">
					<li>
				</div>
			</div>
		</div>
		<%
			String firstName=(String)session.getAttribute("user_name");
			out.print("First Name: "+firstName);
		%>
	</div>
</body>

</html>