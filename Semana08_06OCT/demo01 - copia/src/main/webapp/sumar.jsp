<%-- 
    Document   : factorial
    Created on : 6 oct. 2026, 19:09:03
    Author     : Gustavo Coronel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%-- Biblioteca Principal (Core): Bucles, condicionales, URLs --%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>SUMAR</title>
	</head>
	<body>
		<h1>SUMAR</h1>
        
        <!-- DATOS -->
        <div>
            <form method="post" action="SumarController">
            <table border="0" cellspacing="2" cellpadding="2">
                <thead>
                    <tr>
                        <th colspan="2">DATOS</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Número 1:</td>
                        <td><input type="number" name="n1" placeholder="20"/></td>
                    </tr>
                    <tr>
                        <td>Número 2:</td>
                        <td><input type="number" name="n2" placeholder="30"/></td>
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
                        <td>Número 1:</td>
                        <td>${n1}</td>
                    </tr>
                    <tr>
                        <td>Número 2:</td>
                        <td>${n2}</td>
                    </tr>
                    <tr>
                        <td>Suma:</td>
                        <td>${panchito}</td>
                    </tr>
                </tbody>
            </table>
        </div>
	</body>
</html>
