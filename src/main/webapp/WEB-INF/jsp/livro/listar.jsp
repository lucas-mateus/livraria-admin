<%-- 
    Document   : listar
    Created on : 8 de dez de 2020, 10:21:15
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
        <title>Lista de livros</title>
    </head>
    <body>
        <div class="container">
            <table class="table mt-4">
                <h4 class="text-success">${mensagemSucesso} : ${livro.titulo}</h4>
                <thead class="thead-light">
                    <tr>
                        <th scope="col">ISBN</th>
                        <th scope="col">Titulo</th>
                        <th scope="col">Data de Publicação</th>
                        <th scope="col">Preço</th>
                        <th scope="col">Descrição</th>
                        <th scope="col">Editar</th>
                        <th scope="col">Excluir</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="livro" items="${livroList}">
                        <tr>
                            <th scope="row">${livro.isbn}</th>
                            <td>${livro.titulo}</td>
                            <td>${livro.dataPublicacao}</td>
                            <td>${livro.preco}</td>
                            <td>${livro.descricao}</td>
                            <td>
                                <a href="${path}/livraria-admin/editar/${livro.isbn}">
                                    Editar
                                </a>
                            </td>
                            <td>
                                <a href="${path}/livraria-admin/excluir/${livro.isbn}">
                                    Excluir
                                </a>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </body>
</html>
