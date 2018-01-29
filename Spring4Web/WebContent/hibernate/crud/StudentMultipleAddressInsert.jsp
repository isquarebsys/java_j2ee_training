<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="to.StudentWithMultipleAddress"%>
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
		<div class="page-header"><h1>1 to Many Associations->Create</h1></div>
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
					<li>How to insert rows for 1 to many associations
		</div>			
		<div id="example" class="collapse">			
				<h3><font color="maroon">Example</font></h3>
				<li>Example creates multiple address for a given student
		</div>
		
		<div id="result" class="collapse">			
				<h3><font color="maroon">Result</font></h3>
				<li>Check the database table
		<%
				Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
				SessionFactory factory=cfg.buildSessionFactory();
				
				//creating session object
				Session session1=factory.openSession();
				
				//creating transaction object
				Transaction t=session1.beginTransaction();
				StudentAddress address=new StudentAddress();
				address.setCity("Chennai");
				session1.persist(address);
				
				List<StudentAddress> addressList=new ArrayList<>();
				addressList.add(address);
					
				StudentWithMultipleAddress person = new StudentWithMultipleAddress("Vijay",addressList);
				person.setCountry("India");
				session1.persist(person);//persisting the object

				t.commit();//transaction is commited
				session1.close();
			%>				
		</div>					
	</div>		
	
	
</body>
</html>