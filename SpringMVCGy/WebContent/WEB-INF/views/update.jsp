<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update a Gym Member</title>
</head>
<body>

<h3>Update a Gym Member</h3>

<form action="update.do" method="GET">

		<!-- Why is this not working? Do this in all text boxes. -->
		<p>${gym.id}<p>

		
		First Name: <input type="text" name="firstName" value="${gym.firstName}"/> 
		<br>	
		
		Last Name: <input type="text" name="lastName" value="${gym.lastName}"/> 
		<br>	
		
		<!-- add a drop down menu or a jsp to show all classes available -->
		Classes Attended: <input type="text" name="classesAttended" value="${gym.classesAttended}"/> 
		<br>
		
		<!-- add a drop down menu or a jsp to show all equipment -->
		Favorite Equipment: <input type="text" name="favoriteEquipment" value="${gym.favoriteEquipment}"/> 
		<br>		
		
		<!-- Error at over 100 and under 16 -->
		Age: <input type="text" name="age" value="${gym.age}"/> 
		<br>
		
		<!-- Error if not M or F	 -->
		Gender: <input type="text" name="gender" value="${gym.gender}"/> 
		<br>
		
		<!-- Take in a double? -->	
		Weight: <input type="number" name="weight" value="${gym.weight}"/> 
		<br>
			
		<!-- Figure out a way to store feet and inches better -->
		Height: <input type="text" name="height" value="${gym.height}"/> 
		<br>
		
		<input type="submit" value="Submit" /> 
		
	</form>
	
	<form action="home.do" method="GET">
		<input type="hidden" name="id" /> <br> <input type="submit"
			value="Main Menu" />
	</form>

</body>
</html>