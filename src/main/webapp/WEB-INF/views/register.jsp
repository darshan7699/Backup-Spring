<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
<h1>Fill the Details</h1>
<form action="./registerstore" method="post">
<label>Employee name:</label> <input type="text" name="name"> <br> <br>
<label>Employee Id:</label> <input type="text" name="id"> <br> <br>
<label>Employee designation:</label> <input type="text" name="designation"><br> <br>
<label>Employee sal:</label> <input type="text" name="sal"><br> <br>
<label>Password:</label> <input type="password" name="password"><br> <br>
<label>Confirm Password:</label> <input type="password" name="confirmpass"><br> <br>
<input type="submit" value="submit">
</form>
</body>
</html> 