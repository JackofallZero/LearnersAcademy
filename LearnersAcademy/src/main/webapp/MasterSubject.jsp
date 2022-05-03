<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Subject Options</title>

</head>
<body>
<form action="AddSubjectServlet" method="post">  
Add Subject          <input type="text" name="Subject_name" required/>    
<input type="submit" value="Add Subject"/>  <br/><br/>
</form>


<form action="DeleteSubjectServlet" method="post">  
Subject ID       <input type="text" name="Subject_ID" pattern="\d*" required/>  
<input type="submit" value="Delete Subject"/>  <br/><br/>
</form>
<form action="ViewSubject.jsp" method="post">    
Subject List         <input type="submit" value="View Subject List"/>  
</form>

</body>
</html>