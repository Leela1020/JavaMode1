 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<title>Welcome to Skyce AMS</title>

	<style>
body {
	background: white;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	font-family: 'Montserrat', sans-serif;
	height: 100vh;
	margin: -20px 0 50px;
}
span {
	font-size: 12px;
}
a {
	color: white;
	font-size: 14px;
	text-decoration: none;
	margin: 15px 0;
}
button {
	border-radius: 20px;
	border: 1px solid #FF4B2B;
	background-color: #FF4B2B;
	color: #FFFFFF;
	font-size: 12px;
	margin: 0px 8px 9px 9px;
	font-weight: bold;
	padding: 12px 55px;
	letter-spacing: 1px;
	text-transform: uppercase;	
}
form {
	background-color: #FFFFFF;
	display: flex;
	align-items: center;
	justify-content: center;
	flex-direction: column;
	padding: 0 50px;
	height: 100%;
	text-align: center;
}
input {
	background-color: #eee;
	border: none;
	padding: 12px 15px;
	margin: 8px 0;
	width: 100%;
}
.container {
	background-color:#73c2fb;
	border-radius: 10px;
  	box-shadow: 0 14px 28px rgba(0,0,0,0.25), 0 10px 10px rgba(0,0,0,0.22);
	position: fixed;
	overflow: hidden;
	width: 768px;
	max-width: 100%;
	min-height: 470px;
}
.form-container {
	position: absolute;
	top: 0;
	height: 100%;
}
.reg-in-container {
	left: 0;
	width: 50%;
	z-index: 2;
}
.overlay-container {
	position: absolute;
	top: 0;
	left: 50%;
	width: 50%;
	height: 100%;
}
.overlay {
	background: white;
	color: #FFFFFF;
	position: relative;
	left: -100%;
	height: 100%;
	width: 200%;
}
.overlay-panel {
	position: absolute;
	display: flex;
	align-items: center;
	justify-content: center;
	flex-direction: column;
	padding: 20px 40px 10px 60px;
	text-align: center;
	height: 90%;
	top:0px;
	bottom:50px;
	width: 40%;
}
.overlay-right {
	right: 0;
}

a {
  color:white;
}

img.avatare {
  width: 40%;
  border-radius: 50%;
}
img.avatarea {
  width: 40%;
  border-radius: 50%;
}
.c
   {
   color:#fff600;
   }
   
 
</style>
</head>
<body>
 <div class="container" id="container">
 <div class="form-container reg-in-container">

  <h1 align="center" class="c" >Welcome Manager</h1>
<h1 align="center"><img src="https://i.pinimg.com/originals/27/3a/c6/273ac6af63860fcd01736836fdf53cc3.gif" alt="Avatar" class="avatare"></h1> 
  <h1 align="center" ><button><a href="ManagerLogin">Log-in</a></button> </h1>
<h4  align="center" class="c" >or</h4>
 <h1 align="center" ><button><a href="ManagerRegistration">Sign-up</a></button> </h1> 
</div>

<div class="overlay-container">

  <div class="form-container overlay-right">
	<h1 align="center" class="c" >Welcome Admin</h1>
<h1 align="center"><img src="https://uploads-ssl.webflow.com/5af50905b75ef6385bace249/5b1d827f00c01da5c79db06a_Day15.gif" alt="Avatar" class="avatare"></h1>
 <h1 align="center" > <button><a href="AdminLogin">Log-in</a></button> </h1> 
<h4  align="center" class="c">or</h4>
 <h1 align="center" ><button><a href="AdminRegistration">Sign-up</a></button> </h1> 
	</div>
   </div>
</div>

</body>
</html>