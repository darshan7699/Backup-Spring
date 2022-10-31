<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./mentoradd" method="post">
 <label>Mentor Name</label> <br> <input type="text" name="mentorName"> <br> <br>
    <label>Mentor Id</label> <br> <input type="text" name="eid"> <br> <br>
    <label>Mentor mail</label> <br> <input type="email" name="mail"> <br> <br>
    <label>Skills</label> <br> <input type="text" name="skill"> <br> <br>
    <input type="submit" value="Submit">
</form>
</body>
</html>