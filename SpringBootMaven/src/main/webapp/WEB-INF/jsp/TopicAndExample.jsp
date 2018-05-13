<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body>
	<div class="container">
		<div class="page-header"><h1>Running JSPs</h1></div>
			<p>
			</p>
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#overview">Overview</button>
		
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#example">Steps and Example</button>
			
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#result">Result</button>			
			
		<button type="button" class="btn btn-info" data-toggle="collapse"
			data-target="#references">References</button>			

		
		<div id="overview" class="collapse">			
				<h3><font color="maroon">Overview</font></h3>
				<li>Example shows how to run a JSP
		</div>			
		<div id="example" class="collapse">			
				<h3><font color="maroon">Steps and Example</font></h3>
				<li>Add tomcat-embed-jasper and jstl to pom.xml as these are required for running JSP
				<li>See the WelcomeController forwarding the request to welcome.jsp
		</div>
		
		<div id="result" class="collapse">			
				<h3><font color="maroon">Result</font></h3>	
				<li>Access the URL: <a href="http://localhost:9090/welcome">Welcome Controller</a>		
		</div>	
						
		<div id="references" class="collapse">			
				<h3><font color="maroon">References</font></h3>		
				<li><a href="http://www.javainuse.com/spring/SpringBoot_HelloWorld_gradle">javainuse.com</a>	
		</div>					
	</div>		
	
	
</body>
</html>