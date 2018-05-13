<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Employees</title>
</head>
<body>
    <h3 style="color: red;">Get Employee Info</h3>

    <div id="getEmployees">
        <form action="/oauth/token_by_server/employees" method="post">
            <p>
            	<input type="text" name="response_type" value="code" /> 
                <input type="submit" value="Read JSON from /oauth/api/employees" />
        </form>
    </div>
</body>
</html>