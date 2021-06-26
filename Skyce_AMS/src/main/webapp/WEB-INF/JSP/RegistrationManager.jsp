<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='form' uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<title>Admin Registration</title>
<style>
* {
	margin: 0;
	padding: 0;
	box-sizing: border-box;
	list-style: none;
	text-decoration: none;
	font-family: 'Josefin Sans', sans-serif;
}

body {
	background-color: white;
}

.wrapper {
	display: flex;
	position: relative;
}

.wrapper .sidebar {
	width: 200px;
	height: 100%;
	background: #4b4276;
	padding: 30px 0px;
	position: fixed;
}

.wrapper .sidebar h2 {
	color: #fff;
	text-transform: uppercase;
	text-align: center;
	margin-bottom: 30px;
}

.wrapper .sidebar ul li {
	padding: 15px;
	border-bottom: 1px solid #bdb8d7;
	border-bottom: 1px solid rgba(0, 0, 0, 0.05);
	border-top: 1px solid rgba(255, 255, 255, 0.05);
}

.wrapper .sidebar ul li a {
	color: #bdb8d7;
	display: block;
}

.wrapper .sidebar ul li a .fas {
	width: 25px;
}

.wrapper .sidebar ul li:hover {
	background-color: #594f8d;
}

.wrapper .sidebar ul li:hover a {
	color: #fff;
}

.wrapper .main_content {
	width: 90%;
	margin-left: 200px;
}

.wrapper .main_content .header {
	padding: 20px;
	background: #fff;
	color: #717171;
	border-bottom: 1px solid #e0e4e8;
	margin: 10px 200px;
}

.wrapper .main_content .info {
	margin: 20px;
	color: #717171;
	line-height: 25px;
}

.wrapper .main_content .info div {
	margin-bottom: 20px;
}

* {
	box-sizing: border-box;
}

.column {
	float: left;
	width: 50%;
	padding: 10px;
	height: 500px;
}

.container {
	padding: 6px;
}

input[type=text], input[type=password] {
	width: 100%;
	padding: 15px;
	margin: 2px 0 22px 0;
	display: inline-block;
	border: none;
	background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
	background-color: #ddd;
	outline: none;
}

.RegisterButton {
	background-color: #4CAF50;
	color: white;
	padding: 16px 20px;
	margin: 8px 0;
	border: none;
	cursor: pointer;
	width: 100%;
	opacity: 0.9;
}

.RegisterButton:hover {
	opacity: 1;
}

a {
	color: dodgerblue;
}

.signin {
	background-color: #f1f1f1;
	text-align: center;
	bottom: 30px;
}

.form_wrap .input_grp {
	display: flex;
	justify-content: space-between;
}

.form_wrap .input_grp  input[type="text"] {
	width: 270px;
}

.form_wrap ul {
	background: #fff;
	display: flex;
	justify-content: center;
}

.form_wrap ul .radio_wrap {
	position: relative;
	margin-bottom: 0;
}

.form_wrap ul .radio_wrap .input_radio {
	position: absolute;
	opacity: 0;
}

.form_wrap ul .radio_wrap span {
	display: inline-block;
	font-size: 14px;
	padding: 3px 10px;
	border-radius: 3px;
	color: #545871;
}

.form_wrap .input_radio:checked ~ span {
	background: #ebd0ce;
}
</style>
</head>
<body>
	<div class="wrapper">
		<div class="sidebar">
			<ul>
				<li><a href="#"><i class="fas fa-home"></i>Home</a></li>
				<li><a href="#"><i class="fas fa-user"></i>User-Login</a></li>
				<li><a href="#"><i class="fas fa-user"></i>User-Registration</a></li>
				<li><a href="#"><i class="fas fa-user"></i>Admin-Login</a></li>
				<li><a href="#"><i class="fas fa-user"></i>Admin-Registration</a></li>
			</ul>
		</div>
		<form:form id='userform' action="#" modelAttribute="user">
			<div class="main_content">
				<h1 align="center" class="header">Manager Registration</h1>
				<div class="column" style="background-color: white;">
					<div class="form_wrap">
						<div class="input_grp">
							<div class="input_wrap">
								<label for="FirstName"><b>First Name</b></label>
								<form:input type='text' path='firstName' placeholder='FirstName' />
							</div>
							<div class="input_wrap">
								<label for="LastName"><b>Last Name</b></label>
								<form:input type='text' placeholder='Last Name' path='lastName' />
							</div>
						</div>
						<label for="age"><b>Age</b></label>
						<form:input type="text" placeholder="Age" path="age" />
						<div class="input_wrap">
							<label for="LastName"><b>Gender</b></label>
							<ul>
								<li><label class="radio_wrap"> <form:radiobutton
											path="gender" value="male" class="input_radio" /> <span>Male</span>
								</label></li>
								<li><label class="radio_wrap"> <form:radiobutton
											path="gender" value="female" class="input_radio" /> <span>Female</span>
								</label></li>
								<li><label class="radio_wrap"> <form:radiobutton
											path="gender" value="others" class="input_radio" /> <span>Others</span>
								</label></li>
							</ul>
						</div>
						<br>
						<div class="input_grp">
							<div class="input_wrap">
								<label for="Doorno"><b>Door No</b></label>
								<form:input type="text" placeholder="Door No"
									path="address.doorNo" />
								</br>
							</div>
							<div class="input_wrap">
								<label for="Street"><b>Street</b></label>
								<form:input type="text" placeholder="Street"
									path="address.street" />
								</br>
							</div>
						</div>
						<div class="input_grp">
							<div class="input_wrap">
								<label for="PinCode"><b>Pin Code</b></label>
								<form:input type="text" placeholder="Pin Code"
									path="address.PIN" />
								</br>
							</div>
							<div class="input_wrap">
								<label for="City"><b>City</b></label>
								<form:input type="text" placeholder="City" path="address.city" />
								</br>
							</div>
						</div>
						<div class="input_grp">
							<div class="input_wrap">
								<label for="State "><b>State Name</b></label>
								<form:input type="text" placeholder="State "
									path="address.state" />
								</br>
							</div>
							<div class="input_wrap">
								<label for="Country"><b>Country</b></label>
								<form:input type="text" placeholder="Country"
									path="address.country" />
								</br>
							</div>
						</div>
					</div>
				</div>
				<div class="column" style="background-color: white;">
					<label for="email"><b>Email</b></label>
					<form:input type="text" placeholder="Enter Email" path="email" />

					<label for="password"><b>Password</b></label>
					<form:input type="password" placeholder="Enter Password"
						path="password" />

					<label for="password-repeat"><b>Repeat Password</b></label> <input
						type="password" placeholder="Repeat Password"
						name="password-repeat" required> <label
						for="password-repeat"><b>Mobile No</b></label> <input type="text"
						placeholder="Mobile No" required>

					<p>
						By creating an account you agree to our <a
							href="javascript:void(0)">Terms & Privacy</a>.
					</p>
					<form:button type="submit" class="RegisterButton">Register</form:button>
				</div>
				<div class="container signin">
					<p>
						Already have an account? <a href="#">Sign in</a>.
					</p>
				</div>
		</form:form>
	</div>
</body>
</html>