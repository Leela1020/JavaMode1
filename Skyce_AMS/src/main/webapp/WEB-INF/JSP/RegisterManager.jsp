<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='form' uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>Manager Registration</title>
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


.error,.error1,.error2,.error3,.error4,.error5,.error6,.error7,.error8,.error9,.error10,.error11,.error12  {
            color: red;
            display: none;
        }

</style>
</head>
<body>
	<div class="wrapper">
		<div class="sidebar">
			<ul>
				<li><a href="Home.jsp"><i class="fas fa-home"></i>Home</a></li>
				<li><a href="LoginManager"><i class="fas fa-user"></i>Manager Login</a></li>
				<li><a href="RegisterManager"><i class="fas fa-user"></i>Manager Registration</a></li>
				<li><a href="LoginAdmin"><i class="fas fa-user"></i>Admin Login</a></li>
				<li><a href="RegisterAdmin"><i class="fas fa-user"></i>Admin Registration</a></li>
			</ul>
		</div>
		<form:form id='userform' action="registerManager" modelAttribute="user">
			<div class="main_content">
				<h1 align="center" class="header">Manager Registration</h1>
				<div class="column" style="background-color: white;">
					<div class="form_wrap">
						<div class="input_grp">
							<div class="input_wrap">
								<label for="FirstName"><b>First Name</b></label>
								<form:input type='text' path='firstName' class="name" placeholder='FirstName' required="required" />
							 <span class="error">Please Enter First Name</span><br />
							</div>
							<div class="input_wrap">
								<label for="LastName"><b>Last Name</b></label>
								<form:input type='text' placeholder='Last Name' class="name1" path='lastName' required="required"/>
                                <span class="error1">Please Enter Last Name</span><br />
							</div>
						</div>
						<label for="age"><b>Age</b></label>
						<form:input type="text" placeholder="Age" class="age" path="age" required="required"/>
						<span class="error2">Please Enter Age</span><br />
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
								<form:input type="text" placeholder="Door No" class="doorno"
									path="address.doorNo" required="required"/>
									<span class="error3">Please Enter Door No</span><br />
								<br/>
							</div>
							<div class="input_wrap">
								<label for="Street"><b>Street</b></label>
								<form:input type="text" placeholder="Street" class="street"
									path="address.street" required="required"/>
									<span class="error4">Please Enter Street</span><br />
								<br/>
							</div>
						</div>
						<div class="input_grp">
							<div class="input_wrap">
								<label for="PinCode"><b>Pin Code</b></label>
								<form:input type="text" placeholder="Pin Code" class="pincode"
									path="address.PIN" required="required"/>
									<span class="error5">Please Enter Pin Code</span><br />
								<br/>
							</div>
							<div class="input_wrap">
								<label for="City"><b>City</b></label>
								<form:input type="text" placeholder="City" class="city"
								 path="address.city" required="required"/>
								 <span class="error6">Please Enter City</span><br />
								<br/>
							</div>
						</div>
						<div class="input_grp">
							<div class="input_wrap">
								<label for="State "><b>State Name</b></label>
								<form:input type="text" placeholder="State" class="state"
									path="address.state" required="required"/>
									<span class="error7">Please Enter State</span><br />
								<br/>
							</div>
							<div class="input_wrap">
								<label for="Country"><b>Country</b></label>
								<form:input type="text" placeholder="Country" class="country"
									path="address.country" required="required"/>
									<span class="error8">Please Enter Country</span><br />
								<br/>
							</div>
						</div>
					</div>
				</div>
				<div class="column" style="background-color: white;">
					<label for="email"><b>Email</b></label>
					<form:input type="text" placeholder="Enter Email" class="email"
					path="email" required="required"/>
					<span class="error9">Please Enter Email</span><br />

					<label for="password"><b>Password</b></label>
					<form:input type="password" placeholder="Enter Password" class="password"
						path="password" required="required"/>
						<span class="error10">Please Enter Password</span><br />

					<label for="password-repeat"><b>Repeat Password</b></label> 
					<input type="password" placeholder="Repeat Password" class="reppass"
					name="password-repeat" required>
					<span class="error11">Please Enter Repeat Password</span><br /> 
					
					<label for="mobile-no"><b>Mobile No</b></label> 
					<form:input type="text" placeholder="Mobile No" path="mobile" class="mobile" required="required"/>
					<span class="error12">Please Enter Mobile No</span><br /> 

					<p>
						By creating an account you agree to our <a
							href="javascript:void(0)">Terms & Privacy</a>.
					</p>
					<form:button type="submit" class="RegisterButton" onclick="Validate();">Register</form:button>
				</div>
				
				</div>
		</form:form>
	</div>
 <script type="text/javascript">
        function Validate() {
            var name = document.getElementsByClassName("name");
            var error = document.getElementsByClassName("error");
            error[0].style.display = name[0].value == "" ? "block" : "none";
            name[0].style.border = name[0].value == "" ? "1px solid red" : "";
            name[0].focus();
            
            var name1 = document.getElementsByClassName("name1");
            var error1 = document.getElementsByClassName("error1");
            error1[0].style.display = name1[0].value == "" ? "block" : "none";
            name1[0].style.border = name1[0].value == "" ? "1px solid red" : "";
            name1[0].focus();
            
            var age = document.getElementsByClassName("age");
            var error2 = document.getElementsByClassName("error2");
            error2[0].style.display = age[0].value == "" ? "block" : "none";
            age[0].style.border = age[0].value == "" ? "1px solid red" : "";
            age[0].focus();
            
            
            var doorno = document.getElementsByClassName("doorno");
            var error3 = document.getElementsByClassName("error3");
            error3[0].style.display = doorno[0].value == "" ? "block" : "none";
            doorno[0].style.border = doorno[0].value == "" ? "1px solid red" : "";
            doorno[0].focus();
            
            var street = document.getElementsByClassName("street");
            var error4 = document.getElementsByClassName("error4");
            error4[0].style.display = street[0].value == "" ? "block" : "none";
            street[0].style.border = street[0].value == "" ? "1px solid red" : "";
            street[0].focus();
            
            var pincode = document.getElementsByClassName("pincode");
            var error5 = document.getElementsByClassName("error5");
            error5[0].style.display = pincode[0].value == "" ? "block" : "none";
            pincode[0].style.border = pincode[0].value == "" ? "1px solid red" : "";
            pincode[0].focus();
            
            var city = document.getElementsByClassName("city");
            var error6 = document.getElementsByClassName("error6");
            error6[0].style.display = city[0].value == "" ? "block" : "none";
            city[0].style.border = city[0].value == "" ? "1px solid red" : "";
            city[0].focus();
            
            var street = document.getElementsByClassName("street");
            var error7 = document.getElementsByClassName("error7");
            error7[0].style.display = street[0].value == "" ? "block" : "none";
            street[0].style.border = street[0].value == "" ? "1px solid red" : "";
            street[0].focus();
            
            var country = document.getElementsByClassName("country");
            var error8 = document.getElementsByClassName("error8");
            error8[0].style.display = country[0].value == "" ? "block" : "none";
            country[0].style.border = country[0].value == "" ? "1px solid red" : "";
            country[0].focus();
            
            var email = document.getElementsByClassName("email");
            var error9 = document.getElementsByClassName("error9");
            error9[0].style.display = email[0].value == "" ? "block" : "none";
            email[0].style.border = email[0].value == "" ? "1px solid red" : "";
            email[0].focus();
            
            var password = document.getElementsByClassName("password");
            var error10 = document.getElementsByClassName("error10");
            error10[0].style.display = password[0].value == "" ? "block" : "none";
            password[0].style.border = password[0].value == "" ? "1px solid red" : "";
            password[0].focus();
            
            var reppass = document.getElementsByClassName("reppass");
            var error11 = document.getElementsByClassName("error11");
            error11[0].style.display = reppass[0].value == "" ? "block" : "none";
            reppass[0].style.border = reppass[0].value == "" ? "1px solid red" : "";
            reppass[0].focus();
            
            var mobile = document.getElementsByClassName("mobile");
            var error12 = document.getElementsByClassName("error12");
            error12[0].style.display = mobile[0].value == "" ? "block" : "none";
            mobile[0].style.border = mobile[0].value == "" ? "1px solid red" : "";
            mobile[0].focus();
        }
    </script>
</body>
</html>