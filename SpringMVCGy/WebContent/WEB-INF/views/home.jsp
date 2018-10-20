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
	
	<form action="addAGymMember.do" method=GET>
		<input type="submit" value="Add a Gym Member" />
	</form>
	<br>
	
	<form action="showAllGymMemberDetails.do" method="GET">
		<h4>Search For a Member By ID</h4>
		<input type="number" name="id" />
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
