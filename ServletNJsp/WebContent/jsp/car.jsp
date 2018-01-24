<%@page import="java.util.*,inheritance.*"%>
<%@page import="java.util.HashMap"%>
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
				<h1>Java Functions</h1>
				<div class="well">
					<li>HashMap and iterating KeySet
				</div>
				<h1>JSP Functions</h1>
				<div class="well">
					<li>Iterate HashMap and usage of out.print
				</div>
			</div>
		</div>
		<%
			out.print("<table border=\"3\"  class=\"table table-striped\">");
			out.print("<tr><th>Car Name</th><th>Brake Type</th></tr>");
			HashMap carMap = new HashMap();
			Car wagonR = new Car();
			wagonR.setBrakeType("ECB");
			Car altoVxi = new Car();
			wagonR.setBrakeType("ABS");
			Car xylo = new Car();
			xylo.setBrakeType("ABS");
			carMap.put("AltoVxi", altoVxi);
			carMap.put("WagonR", wagonR);
			carMap.put("xylo", xylo);

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
	</div>
</body>

</html>