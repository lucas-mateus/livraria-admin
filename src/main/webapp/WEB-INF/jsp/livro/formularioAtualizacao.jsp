<%-- 
    Document   : formularioAtualizacao
    Created on : 8 de dez de 2020, 11:06:14
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Atualizar Livro</title>
    </head>
    <body>
        <div class="container">
            <form class="mt-4" action="${linkTo[LivroController].atualizar}" method="POST">
                <input type="hidden" name="livro.id" value="${livro.id}" />
                <%@include file="../templates/formLivroFields.jsp" %>
                <button class="btn btn-success" type="submit">Atualizar</button>
            </form>
        </div>
    </body>
</html>
