<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <link rel="stylesheet" href="/css/base.css">
            <script src="/js/script.js"></script>
        </head>

        <body>
            <h1>Lista de Estudiantes</h1>
            <ul>
                <c:forEach var="estudiante" items="${listaEstudiantes}">
                    <li>${estudiante}: ${estudiante.length()}</li>
                </c:forEach>
            </ul>
        </body>

        </html>