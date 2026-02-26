<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head><title>Demo Servlet</title></head>
<body>

<h2>Formulario GET</h2>
<form action="hola" method="GET">
    Nombre: <input type="text" name="nombre"/>
    <button type="submit">Enviar GET</button>
</form>

</hr>


<h2>Formulario POST</h2>
<form action="hola" method="POST">
    Nombre: <input type="text" name="msg"/>
    <button type="submit">Enviar POST</button>
</form>

</body>
</html>
