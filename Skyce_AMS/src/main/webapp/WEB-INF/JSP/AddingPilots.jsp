<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='form' uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>AddingPilots</title>
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
	margin: 5px 100px;
	border: none;
	cursor: pointer;
	width: 30%;
	opacity: 0.9;
}

.RegisterButton:hover {
	opacity: 1;
}

a {
	color: dodgerblue;
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

.error, .error1, .error2, .error3, .error4 {
	color: red;
	display: none;
}

.res {
	color: green;
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
		<form:form modelAttribute='pilot' action='addPilot'>
			<div class="main_content">
				<h1 align="center" class="header">Pilot Details</h1>
				<div class="column" style="background-color: white;">
					<div class="form_wrap">

						<label for="firstName "><b>First Name </b></label>
						<form:input type="hidden" id="pilotNo" path="pilotNo"/>
						<form:input type="text" placeholder="First Name" class="firstName"
							path="firstName" required="required" />
						<span class="error">Please Enter First Name</span><br /> <label
							for="Last Name"><b>Last Name</b></label>
						<form:input type="text" placeholder="Last Name" class="lastName"
							path="lastName" required="required" />
						<span class="error1">Please Enter Last Name </span><br /> <label
							for="Email "><b>Email</b></label>
						<form:input type="text" placeholder="Email Address" class="email"
							path="email" required="required" />
						<span class="error2">Please Enter Email Address </span><br /> <label
							for="Age "><b>Age</b></label>
						<form:input type="text" placeholder="Age" class="age" path="age"
							required="required" />
						<span class="error3">Please Enter Age</span><br /> <label
							for="DGCA Pilot ID"><b>DGCA Pilot ID</b></label>
						<form:input type="text" placeholder="DGCA Pilot ID"
							class="dgcaPilotID" path="dgcaPilotID" required="required" />
						<span class="error4">Please Enter DGCA Pilot ID</span><br />
					</div>
					<c:set var="id" scope="session" value="${pilot.pilotNo}" />
                <c:if test="${id!=0}">
                <form:button type="submit" class="RegisterButton" value="Add Pilot"
						onclick="Validate();">Update</form:button>
                </c:if>
                <c:if test="${id==0}">
                <form:button type="submit" class="RegisterButton" value="Add Pilot"
						onclick="Validate();">Submit</form:button>
                </c:if>

					<div class="alert alert-success">
						<h4 class="res" align="center">
							<c:out value="${Result}" />
						</h4>
					</div>
					<script type="text/javascript">
						$(document).ready(
								function() {
									window.setTimeout(function() {
										$(".alert").fadeTo(1000, 0).slideUp(
												1000, function() {
													$(this).remove();
												});
									}, 2000);

								});
					</script>
				</div>
			</div>

		</form:form>
	</div>
	<script type="text/javascript">
		function Validate() {
			var firstName = document.getElementsByClassName("firstName");
			var error = document.getElementsByClassName("error");
			error[0].style.display = firstName[0].value == "" ? "block"
					: "none";
			firstName[0].style.border = firstName[0].value == "" ? "1px solid red"
					: "";
			firstName[0].focus();

			var lastName = document.getElementsByClassName("lastName");
			var error1 = document.getElementsByClassName("error1");
			error1[0].style.display = lastName[0].value == "" ? "block"
					: "none";
			lastName[0].style.border = lastName[0].value == "" ? "1px solid red"
					: "";
			lastName[0].focus();

			var email = document.getElementsByClassName("email");
			var error2 = document.getElementsByClassName("error2");
			error2[0].style.display = email[0].value == "" ? "block" : "none";
			email[0].style.border = email[0].value == "" ? "1px solid red" : "";
			email[0].focus();

			var age = document.getElementsByClassName("age");
			var error3 = document.getElementsByClassName("error3");
			error3[0].style.display = age[0].value == "" ? "block" : "none";
			age[0].style.border = age[0].value == "" ? "1px solid red" : "";
			age[0].focus();

			var dgcaPilotID = document.getElementsByClassName("dgcaPilotID");
			var error4 = document.getElementsByClassName("error4");
			error4[0].style.display = dgcaPilotID[0].value == "" ? "block"
					: "none";
			dgcaPilotID[0].style.border = dgcaPilotID[0].value == "" ? "1px solid red"
					: "";
			dgcaPilotID[0].focus();

		}
	</script>
</body>
</html>