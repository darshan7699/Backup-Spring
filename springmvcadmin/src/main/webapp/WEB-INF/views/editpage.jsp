<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./editing" method="post">
    <label>SrNO</label> <br> <input type="text" name="srNo"> <br> <br>
    <label>Batch Id</label> <br> <input type="text" name="batchId"> <br> <br>
    <label>Batch Name</label> <br> <input type="text" name="batchName"> <br> <br>
    <label>Mentor Name</label> <br> <input type="text" name="mentorName"> <br> <br>
    <label>Technologies</label> <br> <input type="text" name="technologies"> <br> <br>
    <labe> Start Date</label> <br> <input type="date" name="startDate"> <br> <br>
    <labe> End Date</label> <br> <input type="date" name="endDate"> <br> <br>
    <labe> Status</label> <br> <input type="text" name="status"> <br> <br>
     <input type="submit" value="Submit">
    </form>
</body>
</html>