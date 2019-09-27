<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<link rel="stylesheet" href="../css/addOneBook.css" />
		
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
			
		<title>Insert title here</title>
	</head>
	<body>
		<div class="container-fluid">
			<%@ include file="../navbar.jsp" %>
			<h1>Add a book</h1>
	    	<form  method="post" action="addBook">
			  <div class="form-group">
			    <label for="auteur">Auteur</label>
			    <input type="text" name="auteur" class="form-control" id="auteur" aria-describedby="auteurHelp" placeholder="Auteur">
			  </div>
			  <div class="form-group">
			    <label for="titre">Titre</label>
			    <input type="text" name="titre" class="form-control" id="titre" placeholder="Titre">
			  </div>
			  <button type="submit" class="btn btn-primary">Submit</button>
			</form>
		</div>
	</body>
</html>