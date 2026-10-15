<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>TABLA DE MULTIPLICAR</title>
    </head>
    <body>
        <h1>TABLA DE MULTIPLICAR</h1>
        
        <!-- DATOS -->
        <div>
            <form method="post" action="FactorialController">
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
                        <td><%= request.getAttribute("num") %></td>
                    </tr>
                    <tr>
                        <td>Factorial:</td>
                        <td><%= request.getAttribute("fact") %></td>
                    </tr>
                </tbody>
            </table>
        </div>
    </body>
</html>
