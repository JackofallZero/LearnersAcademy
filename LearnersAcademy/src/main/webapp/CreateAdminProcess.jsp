<%@page import="com.DAO.LoginDAO.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="com.bean.Loginbean" %></body>
<jsp:useBean id="obj" class="com.bean.Loginbean"></jsp:useBean>
<jsp:setProperty property="*" name="obj"/>


<%
	boolean result=LoginDAO.Adduser(obj);
if(result){  
out.println("Successfully Created\n Please Login now!");  
%>
<jsp:include page="Home.jsp"></jsp:include>
<%
}  
else  
{  
out.print("Sorry, error");  
%>  
<jsp:include page="index.jsp"></jsp:include>  
<%  
}  
%> 

</html>