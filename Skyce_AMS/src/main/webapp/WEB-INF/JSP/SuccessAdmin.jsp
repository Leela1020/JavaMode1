<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Welcome Admin</title>
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
  width: 150px;
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
  margin: 10px;
  color: #717171;
  line-height: 25px;
}
.wrapper .main_content .info div{
  margin-bottom: 20px;
}



* {
  margin: 0;
  padding: 0;
}
body {
  display: flex;
   
  align-items: center;

  background: white;
  background-image: url('https://www.technocrazed.com/wp-content/uploads/2015/12/Airplane-wallpaper-142.jpg');
}
a {
  text-decoration: none;
  color: inherit;
  font-size: 14px;
}

p {
  font-weight: 600;
  text-align: center;
  font-size: 40px;
  font-family: Hack, sans-serif;
  text-transform: uppercase;
  background: linear-gradient(90deg, #000, #fff, #000);
  letter-spacing: 5px;
  -webkit-background-clip: text;
  
  -webkit-text-fill-color: transparent;

  background-size: 80%;
  animation: shine 10s linear infinite;
  position: relative;
}

@keyframes shine {
  0% {
    background-position-x: -500%;
  }
  100% {
    background-position-x: 500%;
  }
}

</style>
</head>
<body>
<div class="wrapper">
    <div class="sidebar">
        <ul>
            <li><a href="SuccessAdmin" style="text-decoration: none;"><i class="fas fa-home"></i>Home</a></li>
            <li><a href="AddingOfPilots" style="text-decoration: none;"><i class="fas fa-user"></i>Add a Pilot</a></li>
            <li><a href="DisplayPilots" style="text-decoration: none;"><i class="fas fa-user"></i>View Pilots</a></li>
            <li><a href="displayPlanes" style="text-decoration: none;"><i class="fas fa-user"></i>View Planes</a></li>
            <li><a href="DisplayHangars" style="text-decoration: none;"><i class="fas fa-user"></i>View Hangars</a></li>
            <li><a href="AddingOfPlanes" style="text-decoration: none;"><i class="fas fa-user"></i>Add a Plane</a></li>
            <li><a href="AddingHangars" style="text-decoration: none;"><i class="fas fa-user"></i>Add a Hangar</a></li>
            <li><a href="RequestApprover" style="text-decoration: none;"><i class="fas fa-user"></i>Manager Requests</a></li>
            <li><a href="Home.jsp" style="text-decoration: none;"><i class="fas fa-user"></i>Logout</a></li>
        </ul> 
    </div>
    <div class="main_content">
    Welcome ${firstName}
   <br/> <br/> <br/>
    <p>"To invent an airplane<br> is nothing.<br> To build one is<br> something. But to <br>fly is everything" <br>&#160;&#160;&#160;&#160;-Otto <br>&#160;&#160;&#160;&#160;Lilienthal</p>
    </div>
</div>
</body>
</html>