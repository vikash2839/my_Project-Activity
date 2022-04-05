<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="update-playerdetail" method="post">
Player Id:<input type="number" value="${player.playerNumber }" name="pnum"><br>
Player name:<input type="text" value="${player.playerName }" name="pname"><br>
</form>
</body>
</html>