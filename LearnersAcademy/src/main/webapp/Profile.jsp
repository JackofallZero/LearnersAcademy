<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu</title>
<h3>ADMIN MENU</h3>

<a href="MasterSubject.jsp">View Subject Master List</a></br>
<a href="TeacherMaster.jsp">View Teacher Master List</a></br>
<a href="ClassMaster.jsp">View Class Master List</a></br>
<form action="AssignTeacher" method="post">
Teacher ID : <input type ="text" name="Teacher_ID" pattern="\d*" required>
Class ID : <input type ="text" name="Class_ID" pattern="\d*" required>
<input type="submit" value="Assign Teacher">
</form>
<form action="AssignSubject" method="post">
Subject ID : <input type ="text" name="Subject_ID" pattern="\d*" required>
Class ID : <input type ="text" name="Class_ID" pattern="\d*" required>
<input type="submit" value="Assign Subject">
</form>
<a href="StudentMaster.jsp">Student Master</a>
</head>
<body>

</body>
</html>