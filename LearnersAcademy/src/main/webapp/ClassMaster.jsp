<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Class Master</title>
</head>
<body>
<form action="AddClassServlet" method="post">  
Add Class          <input type="text" name="Class_name" required/>    
<input type="submit" value="Add Class"/>  <br/><br/>
</form>


<form action="DeleteClassServlet" method="post">  
Class ID       <input type="text" name="Class_name "pattern="\d*" required/>  
<input type="submit" value="Delete Class"/>  <br/><br/>
</form>
<form action="ViewClass.jsp" method="post">    
Class List         <input type="submit" value="View Class List"/>  
</form>

</body>
</html>