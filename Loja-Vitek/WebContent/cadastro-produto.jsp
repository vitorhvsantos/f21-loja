<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Incluir Contato</title>
</head>
<body>

<form action="mvc" method="post">
Nome: <input type="text" name="nome" /><br />
Preco: <input type="text" name="preco" /><br />
<input type="hidden" name="logica" value="IncluirContato" />
<input type="submit" value="Incluir" /> 
</form>

</body>
</html>