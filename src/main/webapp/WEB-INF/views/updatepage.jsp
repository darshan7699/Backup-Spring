<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="text-align: center;">
<form action="./update" method="post">

<h1>Update the Data</h1>
<h2>Enter your previous Id</h2> <br>
<label>Employee Id:</label> <br> <input type="text" name="id"> <br> <br>
<h2>Enter you want to update the data</h2>
<label>Employee name:</label> <br> <input type="text" name="name"> <br> <br>
<label>Employee sal:</label> <br> <input type="text" name="sal"> <br> <br> 
<label>Employee designation:</label> <br> <input type="text" name="designation"><br> <br>
<input type="submit" value="Submit">
</form>
</body>
</html>