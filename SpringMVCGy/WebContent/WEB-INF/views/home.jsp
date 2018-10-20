<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Gym Member Database</title>
</head>
<body>

	<h1>Gym Member Database</h1>
	<br>

	<form action="showAllGymMembers.do" method="GET">
		<input type="submit" value="Show All Gym Members" />
	</form><br>
	
	<form action="addAGymMember.do" method=POST> 
	First Name: <input type="text" name="firstName" /> <br> 
	Last Name: <input type="text" name="lastName" /> <br>
	Age: <input type="number" name="age" /> <br>
	Gender(M/F): <input type="text" name="gender" /> <br>
	Weight: <input type="number" name="weight" /> <br>
	<input type="submit" value="Add a Gym Member" />
		
	</form>
	<br>
	
		<h4>Search For a Member</h4>
	<form action="searchByID.do" method="GET">
		<input type="text" name="id" value="Search By ID"/>
		<input type="submit" value="Submit" />
	</form>
	
	<form action="searchByKeyword.do" method="GET">
		<input type="text" name="keyword" value="Search By Keyword"/>
		<input type="submit" value="Submit" />
	</form>
	<br>
	
	<form action="updateGymMember.do" method="GET">
	<h4>Update a Gym Member By ID</h4>
		<input type="number" name="id" />
		<input type="submit" value="Submit" />
	</form>
	<br>

	<form action="deleteGymMember.do" method="GET">
	<h4>Delete a Gym Member By ID</h4>
		<input type="number" name="id" />
		<input type="submit" value="Submit" />
	</form>

</body>
</html>
