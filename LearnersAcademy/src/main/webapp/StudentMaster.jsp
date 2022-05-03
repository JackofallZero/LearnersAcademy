<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Master</title>
</head>
<body>
<form action="AddStudentServlet" method="post">  
Add Student          <input type="text" name="Student_name"/>
Student Class <input type = "text" name ="Class_ID"/>    
<input type="submit" value="Add Student"/>  <br/><br/>
</form>


<form action="DeleteStudentServlet" method="post">  
Delete Student       <input type="text" name="Roll_No"/>  
<input type="submit" value="Delete Student"/>  <br/><br/>
</form>
<form action="ViewStudents.jsp" method="post">    
Student List         <input type="submit" value="View Student List"/>  
</form>

</body>
</html>