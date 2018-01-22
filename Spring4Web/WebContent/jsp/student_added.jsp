<%@taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<jsp:include page="nav.jsp" />  
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   <body>
   <p><h1>Spring functions covered</h1>
   		<li>Displays the form fields stored from a model [StudentController]
   		<li>Redirects to student_added.jsp where the model is accessed using $
   	</p>
      <h2>Student Information from the MODEL</h2>
      <table>
         <tr>
            <td>Name</td>
            <td>${name}</td>
         </tr>
         <tr>
            <td>Age</td>
            <td>${age}</td>
         </tr>
         <tr>
            <td>ID</td>
            <td>${id}</td>
         </tr>
      </table>  
   </body>
   
</html>