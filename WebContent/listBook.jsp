<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>List Book</title>
	</head>
	<body>
		<a href="/BibliothequeCesi/index.jsp"><button>Home</button></a>
		<table>
			<tr>
				<th>Id</th>
				<th>Auteur</th>
				<th>Titre</th>
				<th></th>
			</tr>

			<c:forEach items="${Books}" var="book">
				<tr>
	    			<td><c:out value="${book.id}" /></td>
	    			<td><c:out value="${book.auteur}" /></td>
	    			<td><c:out value="${book.titre}" /></td>   						
		    	</tr>
			</c:forEach>
		</table> 
		
	</body>
</html>