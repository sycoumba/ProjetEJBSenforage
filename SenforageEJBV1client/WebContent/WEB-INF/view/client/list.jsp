<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>liste village</title>
</head>
<body>
	<div class="col -md-8 ofset -md-2 mt-5">
		<table class="table">
			<tr>
				<th>ID</th>
				<th>Nom</th>
				<th>Prenom</th>
				<th>Adresse</th>
				<th>Telephone</th>
				<th>Village</th>
			</tr>
			<c:forEach items="${ListClient}" var="cl">
				<tr>
					<td><c:out value="${Client.id}" /></td> >
					<td><c:out value="${Client.nom}" /></td> >
					<td><c:out value="${Client.prenom}" /></td> >
					<td><c:out value="${Client.adresse}" /></td> >
					<td><c:out value="${Client.telephone}" /></td> >
					<td><c:out value="${Client.village}" /></td> >
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>