<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix='form' uri="http://www.springframework.org/tags/form"%> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
<title>Pilots List</title>
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

.res {
	color: green;
}


.collapsetable{
border-collapse: collapse;
border: 2px solid black;
}

td, th {
   width: 30px;
     height: 50px;
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
			<h1 align="center" class="header">Hangars List</h1>
<center>
			<table width="900" class="collapsetable" border="1" style="background-color: white;">
				<tr>
					<th>Hangar No</th>
					<th>Hangar ID</th>
					<th>Hangar Type</th>
					<th>Options</th>
				</tr>
				<tr />
				<tr />
				<tr />
				<tr />
				<c:forEach var="hangar" items="${hangarList}">
					<tr>
						<td align="center"><c:out value="${hangar.hangarNo}"></c:out></td>
						<td align="center"><c:out value="${hangar.hangarID}"></c:out></td>
						<td align="center"><c:out value="${hangar.hangarType}"></c:out></td>
						<td align="center"><a href="updateHangar?hangarNo=${hangar.hangarNo}">Edit </a><a href="deleteHangar?hangarNo=${hangar.hangarNo}"> Delete</a></td>
					</tr>
					<br>
					<tr />
					<tr />
					<tr />
					<tr />
				</c:forEach>
			</table>
			</center>
			<br> <br>
			<div class="alert alert-success">
				<h4 class="res" align="center">
					<c:out value="${status}"></c:out>
				</h4>
			</div>
			<script type="text/javascript">
				$(document).ready(function() {
					window.setTimeout(function() {
						$(".alert").fadeTo(1000, 0).slideUp(1000, function() {
							$(this).remove();
						});
					}, 2000);

				});
			</script>

		</div>
	</div>
</body>
</html>