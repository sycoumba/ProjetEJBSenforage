<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>AJOUT CLIENT</title>
<link rel="styleSheet" href="./././bootstrap.min.css"/>

</head>
<body>
 <div class="col-sm-12">
            <h1 class="m-0 text-dark">AJOUT VILLAGE</h1>
            <form action="Village" method="POST">

			<div class="form-group">
				<label class="control-label">Nom</label> 
				<input type="text" name="nom" class="form-control">
			</div>
				<input type="submit" name="ajouter" value="Ajouter"
				class="btn btn-primary">
				</form>
     </div> 
</body>
</html>