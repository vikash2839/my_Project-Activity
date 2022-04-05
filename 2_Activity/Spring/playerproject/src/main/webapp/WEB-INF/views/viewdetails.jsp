<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %><!-- taken from maven repository from browser-->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>The Players are</h1>
<table>
<tr>
<th>Player number</th>
<th>Player name</th>
</tr>
<c:forEach items="${players }" var="p">
<tr>
<td>
<c:out value="${p.playerNumber }">
</c:out></td>
<td>
<c:out value="${p.playerName }">
</c:out></td>
<td><a href="updateplayer?id=${p.playerNumber }">Update</a></td>
<td><a href="deleteplayer?id=${p.playerNumber }">Delete</a></td>
</tr>
</c:forEach>
</table>
${players}
</body>
</html>