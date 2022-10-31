<%@page import="com.te.springmvcadmin.Mentor"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<style>
table {
	border-collapse: collapse;
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border="2px" style="width: 100%;">
  <tr>
    <th>srNo</th>
    <th>Mentor Name</th>
    <th>Mentor Id</th>
    <th>Email</th>
    <th>Skills</th>
    <th>Action</th>
  </tr>
  <% List<Mentor> m=(List<Mentor>) request.getAttribute("list"); %>
  <%  if(m!=null){ %>
  <%for(int i=0;i<m.size();i++) {%>
  <tr>
    <th><%=m.get(i).getSr_no()%></th>
    <th><%=m.get(i).getMentorName()%></th>
    <th><%=m.get(i).getEid()%></th>
    <th><%=m.get(i).getMail() %></th>
    <th><%=m.get(i).getSkill() %></th>
    <th><a href="./editMentor">Edit</a> <br> <a href="./deleteMentor"> Delete</a> </th>
  </tr>
  <%}} %>
  </table>
</body>
</html>