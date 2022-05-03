<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

<%@ include file="index.jsp" %>  
<hr/>  
  
<h3>Admin Login</h3>  
  
 <br/>  
<form action="LoginProcess.jsp" method="post">  
Username:<input type="text" name="username"/><br/><br/>  
Password:<input type="password" name="password"/><br/><br/>  
<input type="submit" value="Login"/>  
</form>  
</body>
</html>


