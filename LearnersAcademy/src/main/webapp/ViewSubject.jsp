<%@page import="com.classes.Subjects"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>View Subjects</title>
</head>
<body>
<%@page import="com.DAO.SubjectDAO.*" %>
<%
	SubjectDAO subjectdao = new SubjectDAOImpl();
for (Subjects p : subjectdao.DisplaySubjectDetails()){
    out.println(p+"</br>");
}


%>
</body>
</html>