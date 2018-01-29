<%@page import="to.Person"%>
<%@page import="org.hibernate.Transaction"%>
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
					<li>In order to create rows, Transaction should be used 
					<li>Then, persist needs be called on Session
		</div>			
		<div id="example" class="collapse">			
				<h3><font color="maroon">Example</font></h3>
				<li>Create a row in Person table
		</div>
		
		<div id="result" class="collapse">			
				<h3><font color="maroon">Result</font></h3>
		<%
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");//populates the data of the configuration file
			
			//creating session factory object
			SessionFactory factory=cfg.buildSessionFactory();
			
			//creating session object
			Session session1=factory.openSession();
			
			//creating transaction object
			Transaction t=session1.beginTransaction();
				
			Person person = new Person();
			person.setName("Ayyappan"); 
			person.setCountry("Chennai");
			
			session1.persist(person);//persisting the object
			
			t.commit();//transaction is commited
			session1.close();
			%>				
		</div>					
	</div>		
	
	
</body>
</html>