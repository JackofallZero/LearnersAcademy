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
<%@page import="com.bean.Loginbean"%>  
<jsp:useBean id="obj" class="com.bean.Loginbean"/>  
  
<jsp:setProperty property="*" name="obj"/>  
  
<%  
boolean status=LoginDAO.validate(obj);
if(status){  
out.println("Welcome "+obj.getUsername());  
%>
<jsp:include page="Profile.jsp"></jsp:include>
<%
}  
else  
{  
out.print("Sorry, email or password error");  
%>  
<jsp:include page="index.jsp"></jsp:include>  
<%  
}  
%>  
</body>
</html>