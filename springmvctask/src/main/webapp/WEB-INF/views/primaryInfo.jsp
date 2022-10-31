<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./second" method="post">
<table style="padding:10px;">
<tr>
            <td> <label>Employee Id</label> <br> <input type="text" name="id"> </td> <br><br>
            <td><label>Employee Name</label> <br> <input type="text" name="name"></td>
         </tr>
         <tr>
            <td><label>Date Of Joining</label> <br> <input type="date" name="joiningDate"></td>
            <td><label>Date Of Birth</label> <br> <input type="date" name="birthDate"></td>
         </tr>
         <tr>
            <td><label>Email-Id</label> <br> <input type="email" name="mail"></td>
            <td><label>Blood Group</label> <br> <input type="text" name="bloodGroup"></td>
         </tr>
         <tr>
            <td><label>Designation</label> <br> <input type="text" name="designation"></td>
            <td><label>Gender</label> <br> <input type="radio" name="gender" id="q"> <label>Female</label>
            <input type="radio" name="gender" id="a">
        <label for="">Male</label>
            </td>
         </tr>
         <tr>
            <td><label>Nationality</label> <br> <input type="text" name="nationality"></td>
            <td><label>Employee Status</label> <br> <input type="text" name="status"></td>
         </tr> 
</table>
<input type="submit" value="Next">
</form>
</body>
</html>