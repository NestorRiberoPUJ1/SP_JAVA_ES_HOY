<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <!DOCTYPE html>
        <html lang="en">

        <head>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <title>Document</title>
            <link rel="stylesheet" type="text/css" href="/css/base.css">
            <script type="text/javascript" src="/js/script.js"></script>
        </head>

        <body>
            <h1>HOLA SOY UNA PAGINA DEL SERVIDOR DE JAVA</h1>
            <ul>
                <c:forEach var="j" begin="1" end="10">
                    <li>
                        Item:
                        <c:out value="${j}" />
                    </li>
                </c:forEach>
            </ul>
        </body>

        </html>