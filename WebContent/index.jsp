<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<link rel="stylesheet" href="css/index.css">
		
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
			
	</head>
	<body>
		<div class="container-fluid">
			<%@ include file="navbar.jsp" %>
			
			
			<div class="container">
				<c:if test="${user == null}">
					<form method="post" action="login">
				        <input name="user" placeholder="user"/><br/>
				        <button type="submit">Valider</button>
				    </form>
				</c:if>   		
			</div>	
		</div>	
	</body>
</html>