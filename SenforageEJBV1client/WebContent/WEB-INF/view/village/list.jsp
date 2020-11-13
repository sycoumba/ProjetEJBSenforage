<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="col -md-8 ofset -md-2 mt-5">
		<table class="table">
			<tr>
				<th>ID</th>
				<th>Nom</th>
				</tr>
			<c:forEach items="${ListVillage}" var="cl">
				<tr>
					<td><c:out value="${Village.id}" /></td> >
					<td><c:out value="${Village.nom}" /></td> >
						</tr>
			</c:forEach>
			</table>
	</div>
</body>
</html>