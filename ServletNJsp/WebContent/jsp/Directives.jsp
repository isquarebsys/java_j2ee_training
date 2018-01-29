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
	<div class="page-header"><h1>Directives</h1></div>
			<p>Usage of the following objects
				<li>forward, include
			</p>
		<div class="well">
			<h3><font color="maroon">Forward</font></h3>
				<br/><font color="blue">jsp:forward tag forwards to a relative Url</font>
				<br/>
				<textarea rows="5" cols="150"><![CDATA[
					jsp:forward page="car.jsp"
						jsp:param name="parametername" value="Example for forward"  
					jsp:forward
				]]></textarea>
			<h3><font color="maroon">Includes</font></h3>
				<br/><font color="blue">jsp:include include the contents of another page</font>
				<br/><font color="red">The following content is from ImplicitObjects.html</font>
					<jsp:include page="ImplicitObjects.html"/>
				
		</div>
	</div>
</body>
</html>