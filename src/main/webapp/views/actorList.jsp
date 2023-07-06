<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link
        href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/css/bootstrap.min.css"
        rel="stylesheet"
        integrity="sha384-0evHe/X+R7YkIZDRvuzKMRqM+OrBnVFBL6DOitfPri4tjfHxaWutUpFmBp4vmVor"
        crossorigin="anonymous">
    <title>Listado de Actores</title>
</head>
<body>
    <div class="container">
    <%
        int uno = 1;

     %>
        <h1>Listado de Actores y Actrices</h1>
        <table class="table">
            <thead class="table-dark">
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="actor" items="${actors}">
                    <tr>
                        <td><c:out value="${actor.getId()}"></c:out></td>
                        <td><c:out value="${actor.getFirstName()}"></c:out></td>
                        <td><c:out value="${actor.getLastName()}"></c:out></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>