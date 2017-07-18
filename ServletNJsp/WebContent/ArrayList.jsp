<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		out.print("<h1>Welcome to JSP</h1>");
		out.print("<table border=\"3\">");
		out.print("<tr><th>Name</th></tr>");
		List<String> studentList = new ArrayList<String>();
		studentList.add("Pooja");
		studentList.add("Kokila");
		studentList.add("Surya");
		studentList.add("Sanjana");
		studentList.add("Ayyappan");
		Iterator<String> studentIterator = studentList.iterator();
		while (studentIterator.hasNext()) {
			out.print("<tr><td>");
			String studentName = (String) studentIterator.next();
			out.print(studentName);
			out.print("</td></tr>");
		}
		out.print("</table>");
	%>
</body>
</html>