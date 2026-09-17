<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <%
 
 	boolean hayRespuesta = ( request.getParameter("btnProcesar") != null );
 	int num1 = 0, num2 = 0, suma = 0;
 	if( hayRespuesta ){
 		num1 = Integer.parseInt(request.getParameter("num1"));
 		num2 = Integer.parseInt(request.getParameter("num2"));
 		suma = num1 + num2;
 	}
 
 %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>SUMAR 2 NUMEROS</title>
</head>
<body>
	<h1>SUMAR 2 NUMEROS</h1>
	<% if( !hayRespuesta ){ %>
	<h2>Datos</h2>
	<form method="post">

		<div>
			<label>Numero 1:</label>
			<input type="number" name="num1" />
		</div>
		<div>
			<label>Numero 2:</label>
			<input type="number" name="num2" />
		</div>
		<div>
			<button name="btnProcesar" type="submit">Procesar</button>
		</div>

	</form>
	<% } %>
	
	<% if( hayRespuesta ) { %>
	
		<h2>Reporte</h2>
	
		<div>Numero 1: <%= num1 %></div>
		<div>Numero 2: <%= num2 %></div>
		<div>Suma: <%= suma %></div>
		<div>
			<a href="demo01.jsp">Nuevo calculo</a>
		</div>
	<% } %>
</body>
</html>