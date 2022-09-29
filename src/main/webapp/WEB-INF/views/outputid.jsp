<%@page import="java.util.List"%>
<%@page import="com.mysql.cj.x.protobuf.MysqlxCrud.Collection"%>
<%@page import="com.te.springmvc.retriving.Employee"%>
<%@page import="org.springframework.ui.Model"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;>">
<% Employee s= (Employee)request.getAttribute("id");%> 

  <%=s %>
  <br>
  <br>
  <button> <a href="./index.jsp ">HomePage</a> </button>
</body>
</html>