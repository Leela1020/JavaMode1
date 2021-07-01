<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix='form' uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>Hangar Allocation</title>
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
			 <li><a href="SuccessManager" style="text-decoration: none;"><i class="fas fa-home"></i>Home</a></li>
            <li><a href="DisplayManagerHangars" style="text-decoration: none;"><i class="fas fa-home"></i>View Hangars</a></li>
            <li><a href="AllotHangar" style="text-decoration: none;"><i class="fas fa-home"></i>Allot Hangars</a></li>
            <li><a href="PlanesHangars" style="text-decoration: none;"><i class="fas fa-home"></i>Allocation Details</a></li>
            <li><a href="Home.jsp" style="text-decoration: none;"><i class="fas fa-user"></i>Logout</a></li>
			</ul>
		</div>
		<form:form modelAttribute='planenew' action='allotHangar'>
			<div class="main_content">
				<h1 align="center" class="header">Allocation Details</h1>
				<div class="column" style="background-color: white;">
					<div class="form_wrap">
						<label for="hangarID"><b>Hangar ID </b></label><br/>
						<form:select placeholder="Hangar Type" class="hangarID"
							path="hangarID" required="required" ><span class="error">Please Enter Hangar ID</span><br /> <label
							for="Hangar ID"><b>Hangar IDs</b></label>
							<c:forEach var="x" items="${hangarList}">
                            <form:option value="${x.hangarID}">${x.hangarID}</form:option>
                            </c:forEach>
                            </form:select><br/>
                            <label for="planeID"><b>Plane ID </b></label><br/>
                        <form:select placeholder="Plane ID" class="planeID" path="planeID" required="required">
                        <span class="error1">Please Enter Plane ID</span><br /> <label
							for="Plane ID"><b>Plane ID</b></label>
						<c:forEach var='y' items="${planeList}">
						<form:option value="${y.planeID}">${y.planeID}</form:option>
						</c:forEach>
                        </form:select>
					</div>
                <form:button type="submit" class="RegisterButton" value="Add Hangar"
						onclick="Validate();">Allot</form:button>

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
			var hangarID = document.getElementsByClassName("hangarID");
			var error = document.getElementsByClassName("error");
			error[0].style.display = hangarID[0].value == "" ? "block"
					: "none";
			hangarID[0].style.border = hangarID[0].value == "" ? "1px solid red"
					: "";
			hangarID[0].focus();

			var hangarType = document.getElementsByClassName("planeID");
			var error1 = document.getElementsByClassName("error");
			error1[0].style.display = planeID[0].value == "" ? "block"
					: "none";
			planeID[0].style.border = planeID[0].value == "" ? "1px solid red"
					: "";
			planeID[0].focus();

		}
	</script>
</body>
</html>