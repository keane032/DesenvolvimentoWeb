<%@	taglib	uri="http://java.sun.com/jsp/jstl/fmt"	prefix="fmt"	%>	
<%@	page errorPage="ErroPage.jsp"%>	
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>imc</title>
</head>
<body>
<%@	include	file="cabecalho.html"%>	


<div class="container">
		
		
		Resultado:<fmt:formatNumber pattern="0.00" value="${imc}"/>
		
		<br>
		
		<p>Situacao: ${resp}</p>
		
		
</div>

<%@	include	file="rodape.html"%>

</body>
</html>