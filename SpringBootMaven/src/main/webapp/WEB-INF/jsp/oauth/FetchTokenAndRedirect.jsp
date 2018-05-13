<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get Employees</title>
</head>
<body>
    <h3 style="color: red;">Get Employee Info</h3>

    <div id="getEmployees">
        <form:form action="/oauth/authorize"
            method="post" modelAttribute="emp">
            <p>
                <label>Enter Employee Id</label>
                 <input type="text" name="response_type" value="code" /> 
                 <input type="text" name="client_id" value="client" />
                 <!-- redirect_uri is where the request will be FORWARDED to -->
                 <input type="text" name="redirect_uri" value="/oauth/apis/employees" />
                 <input type="text" name="scope" value="read" /> 
                 <input type="submit" value="Read JSON from /oauth/api/employees" />
        </form:form>
    </div>
</body>
</html>