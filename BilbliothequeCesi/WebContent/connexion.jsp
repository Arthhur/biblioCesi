<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Connexion</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<link rel="stylesheet" href="css/connexion.css" />
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
			
	</head>
	<body>
		<div class="container-fluid">
			<%@ include file="navbar.jsp" %>
			<c:choose>
				<c:when test="${User.username == null}">
				<h1>Connexion</h1>
				<form class="col-md-3" method="post" action="login">
				  <div class="form-group">
				    <label for="user">Username</label>
				    <input type="text" name="user" class="form-control" id="user" aria-describedby="userHelp" placeholder="Username">
				  </div>
				  <div class="form-group">
				    <label for="titre">Password</label>
				    <input type="password" name="password" class="form-control" id="password" placeholder="Password">
				  </div>
				  <button type="submit" class="btn btn-primary">Submit</button>
				</form>	
				</c:when>
				<c:otherwise>
					<div class="container-msg">
						<p class="msg_accueil">Bienvenue <c:out value="${User.username}" /> dans la bibliothèque du Cesi</p>
					</div>
				</c:otherwise>
			</c:choose>
			
		</div>		
	</body>
</html>