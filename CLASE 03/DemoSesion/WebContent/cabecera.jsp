<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
<td><img alt=" " src="img/img01.jpg">
</td>
<td>
Nombre: ${sessionScope.usuario.nombre} <br/>
Apellido: ${sessionScope.usuario.apellido} <br/>
</td>
</tr>

</table>

<div Style="width: 100%;">
<a href="addProducto.jsp">Agregar Producto</a>&nbsp;&nbsp;
</div>
</body>
</html>