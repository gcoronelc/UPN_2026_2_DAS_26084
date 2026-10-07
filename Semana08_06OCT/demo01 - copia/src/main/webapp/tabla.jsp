<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- Biblioteca Principal (Core): Bucles, condicionales, URLs --%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>FACTORIAL</title>
	</head>
	<body>
		<h1>FACTORIAL</h1>

		<!-- DATOS -->
		<div>
			<form method="post" action="TablaMultiplicarControl">
            <table border="0" cellspacing="2" cellpadding="2">
					<thead>
						<tr>
							<th colspan="2">DATO</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>Número:</td>
							<td><input type="number" name="numero" placeholder="20"/></td>
						</tr>
						<tr>
							<td colspan="2">
								<input type="submit" value="Enviar" name="btnProcesar" />                            
							</td>
						</tr>
					</tbody>
            </table>
			</form>
		</div>

		<!-- RESULTADOS -->
		<div>
			<table border="0" cellspacing="2" cellpadding="2">
				<thead>
					<tr>
						<th colspan="2">RESULTADOS</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>Número:</td>
						<td>${num}</td>
					</tr>
					<tr>
						<table>
							<c:forEach items="${tabla}" var="item">
								<tr>
									<td>${item.num1}</td>
									<td>${item.oper}</td>
									<td>${item.num2}</td>
									<td> = </td>
									<td>${item.rpta}</td>
								</tr>
							</c:forEach>
						</table>
					</tr>
			</tbody>
		</table>
	</div>
</body>
</html>
