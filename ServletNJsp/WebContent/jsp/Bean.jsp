<!DOCTYPE html>
<jsp:include page="../nav.jsp" />
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
	<div class="page-header"><h1>Beans and useBean</h1></div>
			<p>Usage of the Bean
			</p>
		<div class="well">
			<h3><font color="maroon">Syntax</font></h3>
				<br/>
				<textarea rows="5" cols="150"><![CDATA[
					jsp:useBean id= "instanceName" scope= "page | request | session | application"   
					class= "packageName.className" type= "packageName.className"  
					beanName="packageName.className  
					jsp:useBean
				]]></textarea>
			<h3><font color="maroon">Example using Greeting Bean</font></h3>
			<jsp:useBean id="greetingBean" class="beans.Greeting"/>  
			<%  
				String greeting=greetingBean.greet();  
				out.print(greeting);  
			%>  
			<h3><font color="maroon">Setting properties</font></h3>
				<li><font color="red">name should be the Beans name</font>
				<jsp:setProperty property="greetingText" name="greetingBean" value="Greeting is reset now"/>
				<li><jsp:getProperty name="greetingBean" property="greetingText" />  
		</div>
	</div>
</body>
</html>