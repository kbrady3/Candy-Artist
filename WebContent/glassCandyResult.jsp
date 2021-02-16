<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	img{
		width: 50%;
		margin: 0 auto;
		border-radius: 50%;
	}
</style>
<meta charset="ISO-8859-1">
<title>Glass Candy Result</title>
</head>
<body>
	<div class="mainContent">
	${glass.getIngredient1()} First Ingredient <br />
	${glass.getIngredient2()} Second Ingredient <br />
	${glass.getIngredient3()} Third Ingredient <br />
	</div>
	<br>
	<img src="glassCandy.jpg">
		<br>
	<p><a href="index.jsp">Back to homepage</a></p>
</body>
</html>