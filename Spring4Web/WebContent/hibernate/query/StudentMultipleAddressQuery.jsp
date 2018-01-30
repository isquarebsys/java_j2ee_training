<%@page import="org.hibernate.Query"%>
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
		<div class="page-header"><h1>1 to Many Associations->Query</h1></div>
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
					<li>How to QUERY rows for 1 to many associations
					
		</div>			
		<div id="example" class="collapse">			
				<h3><font color="maroon">Example</font></h3>
				<li>Example LOADS multiple address for a given student
				<li>StudentWithMultipleAddress is mapped to the StudentAddress as <font color="red">@OneToMany(targetEntity=StudentAddress.class) and as a List</font> 
				
		</div>
		
		<div id="result" class="collapse">			
				<h3><font color="maroon">Result</font></h3>
			<%
				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");// populates the data of the configuration file
		
				// creating session factory object
				SessionFactory factory = cfg.buildSessionFactory();
				// creating session object
				Session session1 = factory.openSession();
				String hql = "from StudentWithMultipleAddress";
				Query query = session1.createQuery(hql);
				List<StudentWithMultipleAddress> studentList = query.list();
				
				out.print("<table border=\"3\"  class=\"table table-striped\">");
				out.print("<tr><th>Student Id</th><th>Name</th><th>Country</th><th>Address</th></tr>");				 
				for (StudentWithMultipleAddress student: studentList) {
					out.print("<tr>");
					out.println("<td>"+student.getId()+"</td>");
					out.println("<td>"+student.getName()+"</td>");
				    out.println("<td>"+student.getCountry()+"</td>");
				    out.println("<td>");
				    List<StudentAddress> addressList=student.getAddresses();
				    for (StudentAddress address: addressList) {
				    	out.print(address.getCity());
				    	out.print("<br/>");
				    	out.print(address.getStreetAddress());
				    }
				    out.println("</td>");
				    out.print("</tr>");
				}
				out.print("</table>");
				session1.close();
			%>				
		</div>					
	</div>		
	
	
</body>
</html>