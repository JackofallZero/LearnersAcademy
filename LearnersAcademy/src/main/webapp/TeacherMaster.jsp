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
Add Teacher          <input type="text" name="Teacher_name"/>    
<input type="submit" value="Add Teacher"/>  <br/><br/>
</form>


<form action="DeleteTeacherServlet" method="post">  
Delete Teacher       <input type="text" name="Teacher_ID"/>  
<input type="submit" value="Delete Teacher"/>  <br/><br/>
</form>
<form action="ViewTeacher.jsp" method="post">    
Teacher List         <input type="submit" value="View Teacher List"/>  
</form>

</body>
</html>