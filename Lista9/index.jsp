<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@taglib	tagdir="/WEB-INF/tags"	prefix="ufc"	%>	
    <%@	taglib	prefix="c"	uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Home</title>
</head>
<body>

<c:import url="cabecalho.html" />


<h1>IMC</h1>
<br>

<form action="imc" method="post">
	
			<label>peso:</label> <input name="massa" type="text" value="1">
	
			<label>altura:</label> <input name="altura" type="text" value="1">
	
			<input type="submit" value="enviar">
	
</form>

<br>

<h1>Questao 2-Soma e Subitraçâo</h1>
<br>

<form action = "calculo" method ="post">

	<ufc:number label="numero1" name="numero1" id="numero1"></ufc:number> <br>
	
	<ufc:number label="numero2" name="numero2" id="numero2"></ufc:number><br>
	
			<input type="submit" value="enviar">

</form>

<br>

<h1>Questao 3-MegaSena</h1>
<br>
<a href="megasena">Megasena</a>
<br>

<c:import url="rodape.html"/>




</body>
</html>