<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.boxed {
background: black;
border: 1px;
color: white;
padding: 5px;
padding-left: 8px;
width: 100%;
}
.center {
margin: 50px 300px;
}
i {
position: absolute;
right: 325px;
color: white;
}
form {
padding: 0px 100px;
padding-left: 8px;
}
input[type=text], [type=password] {
border-radius: 4px;
border: 2px solid #DCDCDC;
width: 120%;
}
table {
border-spacing: 0 10px;
}
.button {
width: fit-content;
text-decoration: none;
color: #fff;
border: #6c757d;
background: blue;
border-radius: .25rem;
font-size: 1rem;
padding: .375rem .75rem;
margin-top: 10px;
}
</style>
<title>Login</title>
<script>
function myFunction(){
var password=document.getElementById("password").value;
var confirmpassword = document.getElementById("confirmpassword").value;
if (password != confirmpassword) {
alert("Passwords Do not match");
return false;
}
return true;
}
</script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Pet peers</title>
</head>
<body>
<body style="background-color:brown;">
Register 
<form action="RegisterServlet" onsubmit="return myFunction()" method="post">
<!-- <button value="click" onclick="myFunction()"></button> -->
<table style="with: 50%">
<tr>
<td>Name :</td>
<td><input type="text" name="name" required></td>
</tr>
<tr>
<td>Password :</td>
<td><input type="password" id="password" name="password" required></td>
</tr>
<tr>
<td>ConfirmPassword :</td>
<td><input type="password" id="confirmpassword" name="confirmpassword" required></td>
</tr>
<tr>
<td><input type="submit" value="Register"></td>
</tr>
</table>

</form>
</body>
</html>