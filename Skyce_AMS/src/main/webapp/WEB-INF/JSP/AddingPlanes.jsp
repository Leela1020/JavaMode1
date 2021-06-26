<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
         <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <title>Manager Login</title>
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

 

.column {
    float: left;
    width: 50%;
    padding: 10px;
    height: 500px;
}
</style>
</head>
<body>
<div class="wrapper">
    <div class="sidebar">
        <ul>
            <li><a href="#" style="text-decoration: none;"><i class="fas fa-home"></i>Home</a></li>
               <li><a href="#" style="text-decoration: none;"><i class="fas fa-user"></i>Manager-Registration</a></li>
            <li><a href="#" style="text-decoration: none;"><i class="fas fa-user"></i>Add Plane</a></li>
            <li><a href="#" style="text-decoration: none;"><i class="fas fa-user"></i>Add Pilot</a></li>
            <li><a href="#" style="text-decoration: none;"><i class="fas fa-user"></i>Log-Out</a></li>
           
        </ul> 
    </div>
    <div class="main_content">
     <h1 align="left" class="header"><span>There </span>is no <span>flying</span> without <span>wing's</span></h1>  
        <div class="info">
<div class="column" style="background-color: white;">

 

Plane ID <input path='planeID'/><br/>
Model Name <input path='modelName'/><br/>
Plane Company <input path='planeCompany'/><br/>
Plane Capacity <input path='planeCapacity'/><br/>
Plane Type <input path='planeType'/><br/>

 

                    <button type="submit" class="RegisterButton">Register</button>
                </div>

 


</body>
</html>