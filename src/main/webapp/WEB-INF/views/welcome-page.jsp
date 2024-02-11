<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome to Mom's Cafe</title>
</head>
<body style="background-color: #eabbb1;">
	<h1 style="text-align: center; font-style: italic">Welcome to ${cafeName}'s Cafe</h1>
	<form action="processOrder" method="post">
		<div align="center">
		<br>
		<hr>
		<label>Food Item: 
			<input type="text" id="foodItem" placeholder="Enter food name" name="foodType"/>
			<br>
			<input type="submit" value="Order Now" id="submit" style="margin-top:5px"> 
		</label>
	</div>
	</form>
	<h2>My Name is : ${Myvalueis}</h2>
</body>
</html>