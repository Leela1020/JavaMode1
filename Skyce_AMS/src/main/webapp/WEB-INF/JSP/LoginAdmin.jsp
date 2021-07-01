<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix='form' uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<title>Admin Login</title>
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
	<style>
	*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  list-style: none;
  text-decoration: none;
  font-family: 'Josefin Sans', sans-serif;
}
body{
   background-color: white;
}
.wrapper{
  display: flex;
  position: relative;
}
.wrapper .sidebar{
  width: 200px;
  height: 100%;
  background: #4b4276;
  padding: 30px 0px;
  position: fixed;
}
.wrapper .sidebar h2{
  color: #fff;
  text-transform: uppercase;
  text-align: center;
  margin-bottom: 30px;
}
.wrapper .sidebar ul li{
  padding: 15px;
  border-bottom: 1px solid #bdb8d7;
  border-bottom: 1px solid rgba(0,0,0,0.05);
  border-top: 1px solid rgba(255,255,255,0.05);
}    
.wrapper .sidebar ul li a{
  color: #bdb8d7;
  display: block;
}
.wrapper .sidebar ul li a .fas{
  width: 25px;
}
.wrapper .sidebar ul li:hover{
  background-color: #594f8d;
}   
.wrapper .sidebar ul li:hover a{
  color: #fff;
}
.wrapper .sidebar .social_media{
  position: absolute;
  bottom: 0;
  left: 50%;
  transform: translateX(-50%);
  display: flex;
}
.wrapper .main_content{
  width: 100%;
  margin-left: 200px;
}
.wrapper .main_content .header{
  padding: 20px;
  background: #fff;
  color: #717171;
  border-bottom: 1px solid #e0e4e8;
  margin: 10px 200px;
}
.wrapper .main_content .info{
  margin: 20px;
  color: #717171;
  line-height: 25px;
}
.wrapper .main_content .info div{
  margin-bottom: 20px;
}
form {
  border:solid;
  width: 50%;
  padding: 0px 10px 25px 7px;
  margin: -10px 200px ;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
input[type=text], input[type=password] {
  width: 45%;
  padding: 10px 7px ;
  margin: 8px 140px 9px;
  display: inline-block;
  border: 2px solid #ccc;
  box-sizing: border-box;
}
button {  
  background-color: #04AA6D;
  color: white;
  border: none;   
}
button:hover {
  opacity: 0.8;
}
.register {
padding:7px 10px;
  width: 10%;
  background-color: green;
}
.login{
   padding:7px 10px;

  width: 13%;
  background-color: grey;
}
.imgcontainer {
  text-align: center;
  margin: 34px 0 80px 20;
}
img.avatar {
  width: 40%;
  border-radius: 50%;
}
.signup{
  border:solid;
  width: 50%;
  padding: 12px 20px;
  margin: 10px 210px;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}
span
{
color:#062a78;}

.error,.error1{
            color: red;
            display: none;
        }
</style>
</head>
<body>
<div class="wrapper">
    <div class="sidebar">
        <ul>
           <li><a href="Home.jsp"><i class="fas fa-user"></i>Home</a></li>
           <li><a href="ManagerLogin"><i class="fas fa-user"></i>Manager Login</a></li>
			<li><a href="ManagerRegistration"><i class="fas fa-user"></i>Manager Registration</a></li>
			<li><a href="AdminLogin"><i class="fas fa-user"></i>Admin Login</a></li>
			<li><a href="AdminRegistration"><i class="fas fa-user"></i>Admin Registration</a></li></ul> 
    </div>
    <div class="main_content">
     <h1 align="left" class="header"><span>There </span>is no <span>flying</span> without <span>wing's</span></h1>  
        <div class="info">
<form:form id='userform' action="LoginAdmin" modelAttribute="user">
  <div class="imgcontainer">
<img src="https://i.pinimg.com/originals/5a/65/ee/5a65ee278cd557143f05a4ba91abbfa8.gif" alt="Avatar" class="avatar"> 
  </div>   
   <form:input type='text' path='adminID' placeholder='Admin ID' required="required" class="adminid"/>
   		<span align="center"  class="error">Please Enter Admin Id</span><br/>
   <form:input type='password' path='password' placeholder='Password' required="required" class="password"/>
   		<span align="center"  class="error1">Please Enter Password</span><br/>
    <h2 align="center" ><input type="submit" name="Login" class="btn btn-info" onclick="Validate();"/></h2> 
   </form:form> 
  </div>
<div class="signup">
  <h4 align="center" >Don't have an account?<a href="#"><font color = "#0000FF"> Sign up</font></a></h4> 
</div>  
      </div>
    </div>
<script type="text/javascript">
        function Validate() {
            var adminid = document.getElementsByClassName("adminid");
            var error = document.getElementsByClassName("error");
            error[0].style.display = adminid[0].value == "" ? "block" : "none";
            adminid[0].style.border = adminid[0].value == "" ? "1px solid red" : "";
            adminid[0].focus();
            
            var password = document.getElementsByClassName("password");
            var error1 = document.getElementsByClassName("error1");
            error1[0].style.display = password[0].value == "" ? "block" : "none";
            password[0].style.border = password[0].value == "" ? "1px solid red" : "";
            password[0].focus();
        }
    </script>
</body>
</html>