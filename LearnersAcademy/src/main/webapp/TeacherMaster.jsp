<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="AddTeacherServlet" method="post">  
Add Teacher          <input type="text" name="Teacher_name" required/>    
<input type="submit" value="Add Teacher"/>  <br/><br/>
</form>


<form action="DeleteTeacherServlet" method="post" >  
Teacher ID       <input type="text" name="Teacher_ID"  pattern="\d*"required/>  
<input type="submit" value="Delete Teacher" required/>  <br/><br/>
</form>
<form action="ViewTeacher.jsp" method="post">    
Teacher List         <input type="submit" value="View Teacher List" required/>  
</form>

</body>
</html>