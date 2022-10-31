<%@page import="java.util.List"%>
<%@page import="com.te.springmvcadmin.Batch"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
table {
	border-collapse: collapse;
}
</style>
<body>

  <button><a href="./addBatch">Add Batch</a> </button> <br> <br>
<button><a href="./mentor">Add Mentor</a></button> <br>
<br>
  <table border="2px" style="width: 100%;">
  <tr>
    <th>srNo</th>
    <th>batchId</th>
    <th>batchName</th>
    <th>endDate</th>
    <th>mentorName</th>
    <th>startDate</th>
    <th>status</th>
    <th>Technologies</th>
    <th>action</th>
  </tr>
  <%List<Batch> b=(List<Batch>)request.getAttribute("batch2"); %>
  <%if(b!=null){ %>
  <%for(int i=0;i<b.size();i++){ %>
  <tr>
    <th><%=b.get(i).getSrNo()%></th>
    <th><%=b.get(i).getBatchId()%></th>
    <th><%=b.get(i).getBatchName()%></th>
    <th><%=b.get(i).getEndDate() %></th>
    <th><%=b.get(i).getMentorName() %></th>
    <th><%=b.get(i).getStartDate() %></th>
    <th><%=b.get(i).getStatus()%></th>
    <th><%=b.get(i).getTechnologies()%></th>
    <th> <a href="./edit">Edit</a> <br> <a href="./delete"> Delete</a> </th>
  </tr>
   <%}%>
   <%} %>
</table>

</body>
</html>