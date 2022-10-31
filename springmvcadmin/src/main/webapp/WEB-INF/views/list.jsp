<%@page import="com.te.springmvcadmin.Batch"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<Batch> b = (List<Batch>) request.getAttribute("listall"); %>
<% for(int i=0;i<b.size();i++){ %>
<%= b.get(i) %>
<%} %>
</body>
</html>