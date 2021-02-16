<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
	body{
		font-family: arial;
		text-align: center;
		color: yellow;
		background-color: hotpink;
	}
	.mainContent{
		background-color: skyblue;
		width: 40%;
		border-radius: 5px;
		padding: 5px;
		margin: 0 auto;
	}
	input{
		margin: 5px;
	}
</style>
<meta charset="ISO-8859-1">
<title>Drizzled Chocolate Truffles</title>
</head>
<body>
	<h1>Drizzled Chocolate Truffles</h1>
	<div class="mainContent">
		<form action="trufflesServlet" method="post">
		Enter the ingredients:
		<br>
		<input type="text" name="choc1" size="10">
		<br>
		<input type="text" name="choc2" size="10">
		<br>
		<input type="text" name="choc3" size="10">
		<br>
		<input type="submit" value="Make this candy!" />
	</form>
	</div>
	<br>
	<p><a href="index.jsp">Back to homepage</a></p>
</body>
</html>