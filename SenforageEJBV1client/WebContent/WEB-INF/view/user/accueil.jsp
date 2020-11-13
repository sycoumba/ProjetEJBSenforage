<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
 <div class="col-sm-12">
            <h1 class="m-0 text-dark">AJOUT CLIENT</h1>
            <form action="Client" method="POST">

			<div class="form-group">
				<label class="control-label">Nom</label> <input type="text"
					name="nom" class="form-control">
			</div>
			<div class="form-group">
				<label class="control-label">Prenom</label> <input type="text"
					name="prenom" class="form-control">
			</div>
			
			<div class="form-group">
				<label class="control-label">Adresse</label> <input type="text"
					name="adresse" class="form-control">
			</div>

			<div class="form-group">
				<label class="control-label">Telephone</label> <input type="text"
					name="telephone" class="form-control">
			</div>
			
			<div class="form-group">
			<label class="control-label" for = "village"> Village</label>
			<select class="form-control" id="village" name="village">
				<option>Selectionner Village</option>
				<i:forEach items="${ListVillage}" var="vi">
					<option value="${vi.id}">"${vi.nom}"</option>
					</i:forEach>
			</select> 
			<input type="submit" name="ajouter" value="Ajouter"
				class="btn btn-primary">
	</div>


	</form>
            
</body>
</html>