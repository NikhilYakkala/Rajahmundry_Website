<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
	 <!DOCTYPE html>
<html>
<head>
    <title>Rajahmundry City Guide - Your Personal Online Guide to Rajahmundry , India.</title>
    <link rel="stylesheet" href="Style.css">
</head>
<body>
<ul>
<li><img class="rmclogo" src="https://rajahmundry.cdma.ap.gov.in/sites/default/files/system/Rajahmundry_Municipal_Corporation_logo.png"></img></li>
  <li><a href="index.html">Home</a></li>
  <li><a href="aboutRjy.jsp">About Rajahmundry City</a> 
  <li><a href="attractions.jsp">Attractions</a> 
  <li><a href="accomdations.jsp">Accommodations</a>
  <li><a href="travels.jsp">Travels</a>
  <li><a href="foodfun.jsp">Food & Fun</a>
  <li><a href="healthbeauty.jsp">Health & Beauty</a>
  <li><a href="localservices.jsp">Local Services</a>
</ul>
<br>
<br><br>
	 
	 <%
	
	 response.setHeader("cache-control", "no-cache,no-store,must-revalidate"); //Http Version 1.1
	 
	 response.setHeader("Pragma", "no-cache");  // Http Version 1.0
	 
	 response.setHeader("Expires", "0");

	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("Login.jsp");
	}
	
	%> 
	
	<h1 align="center">Welcome ${username}</h1> 
	
	<br> <br>
	
	<form action="Logout">
	
	<input type="submit" value="Logout"> 
	
	</form> 
	
</body>
</html>