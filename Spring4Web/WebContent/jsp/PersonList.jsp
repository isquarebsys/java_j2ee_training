<%@page import="to.Person"%>
<%@page import="java.util.List"%>
<%@page import="dao.PersonDAOImplWithTemplate"%>
<%@page import="org.springframework.web.context.support.WebApplicationContextUtils"%>
<%@page import="org.springframework.context.ApplicationContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="../nav.jsp" />  
<body>
	<div class="container">
		<h3><font color="maroon">List of Persons using Hibernate Template</font></h3>
		<%
			ApplicationContext applicationContext = WebApplicationContextUtils.getRequiredWebApplicationContext(session.getServletContext());
			PersonDAOImplWithTemplate personDAOWithTemplate=applicationContext.getBean(PersonDAOImplWithTemplate.class);
	        List<Person> persons = personDAOWithTemplate.getPersons();
		%>	
		<table class="table table-striped"">
		<tr>  
			<th>Name</th><th>Country</th>
		</tr>  
		<% 
			for(Person person:persons){
	        	out.print("<tr>");
	        	out.print("<td>"+person.getName()+"</td>");
	        	out.print("<td>"+person.getCountry()+"</td>");
	        	out.print("</tr>");
		}
		%>
		</table>		
	</div>		
	
	
</body>
</html>