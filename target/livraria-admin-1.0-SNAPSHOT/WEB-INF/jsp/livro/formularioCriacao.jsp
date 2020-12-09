<%-- 
    Document   : formulario
    Created on : 8 de dez de 2020, 09:17:15
    Author     : Lucas
--%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<c:set var="path" value="${pageContext.request.contextPath}" ></c:set>
    <!DOCTYPE html>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
            <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
            <title>Cadastrar Livro</title>
        </head>
        <body>
            <div class="container">
                <form class="mt-4" action="${path}/livro-admin/cadastrar" method="POST">
                <%@include file="../templates/formLivroFields.jsp" %>
                <button class="btn btn-primary" type="submit">Cadastrar Livro</button>
            </form>
            <p class="text-danger">${mensagemErro}</p>
        </div>
    </body>
</html>
