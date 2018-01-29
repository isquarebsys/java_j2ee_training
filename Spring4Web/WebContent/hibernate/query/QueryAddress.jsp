<%@page import="to.StudentAddress"%>
<%@page import="org.hibernate.Session"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="org.hibernate.cfg.Configuration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<jsp:include page="../../nav.jsp" />  
<body>
	<div class="container">
		<div class="page-header"><h1>Load a Table</h1></div>
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
					<li>Loading a Table Row directly
		</div>			
		<div id="example" class="collapse">			
				<h3><font color="maroon">Example</font></h3>
				<li>Example loads a student's address where id of the address is 1
		</div>
		
		<div id="result" class="collapse">			
				<h3><font color="maroon">Result</font></h3>
		<%
				Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
				SessionFactory factory = cfg.buildSessionFactory();
			
				Session session1 = factory.openSession();
				// Load the StudentAddress with id as 1
				StudentAddress address = (StudentAddress) session1.load(StudentAddress.class, 1);
				out.println(address.getId() + " " + address.getCity());
				session1.close(); 
			%>				
		</div>					
	</div>		
	
	
</body>
</html>