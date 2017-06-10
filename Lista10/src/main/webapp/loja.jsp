<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    
 <%@	taglib	prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Loja</title>
</head>
<body>

<h1>Adicionar</h1>	

	<form method ="post" id ="ajax_form">
		Descricao:<input type ="text" name="descricao"><br>
		valor:<input type ="text" name="valor"><br>
		<input type ="submit" name = "submit">
	</form>
	
	<br>
	

<table>	

<tr>
   <td>id</td>
   <td>descricao</td>
   <td>preco</td>
</tr>
		
<c:forEach var="p" items="${produtos}">
<tr>
   <td><c:out value="${p.id}" /></td>
   <td><c:out value="${p.descri}" /></td>
   <td><c:out value="${p.preco}" /></td>
</tr>
</c:forEach>
</table>

<script type="text/javascript" src="js/jquery-3.2.0.min.js"></script>	
<script type="text/javascript" src="js/form.js"></script>
</body>
</html>