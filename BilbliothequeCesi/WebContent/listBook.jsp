<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
			
		<title>List Book</title>
	</head>
	<body>
		<div class="container-fluid">
			<%@ include file="navbar.jsp" %>
			<table class="table">
				<tr>
					<th>Id</th>
					<th>Auteur</th>
					<th>Titre</th>
					<th></th>
				</tr>
	
				<c:forEach items="${Books}" var="book">
					<c:set var="pathEmprunt" value="auth/empruntBook?id=${book.id}" scope="page" />
					<c:set var="pathRemove" value="auth/removeBook?id=${book.id}" scope="page" />
					<tr>
		    			<td><c:out value="${book.id}" /></td>
		    			<td><c:out value="${book.auteur}" /></td>
		    			<td><c:out value="${book.titre}" /></td>
		    			<c:choose>
							<c:when test="${book.emprunt == false}">  
		    					<td><a href=${pathEmprunt}><button type="button" class="btn btn-success">Emprunter</button></a></td>						
		    				</c:when>
		    				<c:otherwise>
		    					<td>Déjà emprunté</td>								
		    				</c:otherwise>
		    			</c:choose>
		    			<td><a href=${pathRemove}><button type="button" class="btn btn-danger">Supprimer</button></a></td>						
			    	</tr>
				</c:forEach>
			</table> 
		</div>
		
	</body>
</html>