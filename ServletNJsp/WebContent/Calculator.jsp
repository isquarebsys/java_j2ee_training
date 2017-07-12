<%@page import="maths.Calculator"%>
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
		try{
		Calculator cal=new Calculator();
		String s1=request.getParameter("number_1");
		out.print("S1: "+s1);
		String s2=request.getParameter("number_2");
		out.print("S2: "+s2);
		out.print("<br/>");
		out.print("<font color=\"blue\">");
		out.print("Result: "+cal.add(s1,s2));
		out.print("</font>");
		}catch(Exception e){
			out.print("Please provide numbers");
		}
	%>
</body>
</html>