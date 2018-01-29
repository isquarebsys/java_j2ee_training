<%@page import="java.util.List"%>
<%@page import="org.hibernate.Query"%>
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
		<div class="page-header"><h1>HQL</h1></div>
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
				<li>HQL refers to Hibernate Query Language
		</div>			
		<div id="example" class="collapse">			
				<h3><font color="maroon">Example</font></h3>
				<li>Load all rows from Student Address table
		</div>
		
		<div id="result" class="collapse">			
				<h3><font color="maroon">Result</font></h3>
		<%
				Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
				SessionFactory factory = cfg.buildSessionFactory();
			
				Session session1 = factory.openSession();
				String hql = "from StudentAddress";
				Query query = session1.createQuery(hql);
				List<StudentAddress> objectList = query.list();
				 
				for (StudentAddress object : objectList) {
				    out.println("Street Address: "+ object.getStreetAddress());
				    out.println("City: "+ object.getCity());
				}
				session1.close(); 
			%>				
		</div>					
	</div>		
	
	
</body>
</html>