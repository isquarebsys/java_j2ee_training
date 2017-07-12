<%@page import="java.util.*,inheritance.*"%>
<%@page import="java.util.HashMap"%>
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
	out.print("<table border=\"3\">");
	out.print("<tr><th>Car Name</th><th>brake type</th></tr>");
	    HashMap carMap = new HashMap();
		Car wagonR = new Car();
		wagonR.setBrakeType("ECB");
		Car altoVxi = new Car();
		wagonR.setBrakeType("ABS");
		carMap.put("AltoVxi", altoVxi);
		carMap.put("WagonR", wagonR);

		Car mapInstance = (Car) carMap.get("WagonR");
		
		Iterator carsIterator = carMap.keySet().iterator();
		while (carsIterator.hasNext()) {
		out.print("<tr>");
			String key = (String) carsIterator.next();
		out.print("<td>");
			out.print(key);
			out.print("</td>");
			Car value = (Car) carMap.get(key);
			out.print("<td>");
			out.print(value.getBrakeType());
			out.print("</td>");
			out.print("</tr>");
		}
		out.print("</table>");
	%>
</body>
</html>