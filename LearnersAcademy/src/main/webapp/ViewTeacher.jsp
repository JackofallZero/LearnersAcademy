<%@page import="java.util.Set"%>
<%@page import="com.classes.Teachers"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Teacher</title>
</head>
<body>
<%@page import="com.DAO.teacherDAO.*" %>
<%
	TeacherDAO teacherdao = new TeacherDAOImpl();
    for (Teachers p : teacherdao.ListofTeachers()){
        out.println(p+"</br>");
    }
%>

</table> 
</body>
</html>