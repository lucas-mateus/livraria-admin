<%-- 
    Document   : formLivroFields
    Created on : 8 de dez de 2020, 11:03:03
    Author     : Lucas
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="form-group">
    <label for="isbn">ISBN:</label>
    <input type="text" class="form-control" id="isbn" 
           placeholder="ISBN do livro" name="livro.isbn" 
           value="${livro.isbn}" required>
</div>
<div class="form-group">
    <label for="titulo">Título</label>
    <input type="text" class="form-control" id="titulo" 
           placeholder="Título do livro" name="livro.titulo" 
           value="${livro.titulo}" required>
</div>
<div class="form-group">
    <label for="preco">Preço:</label>
    <input type="text" class="form-control" id="isbn" 
           placeholder="Preço do livro" name="livro.preco" 
           value="${livro.preco}" required>
</div>
<div class="form-group">
    <label for="data">Data de publicação do livro:</label>
    <input type="date" class="form-control" id="data" 
           name="livro.dataPublicacao" 
           value="${livro.dataPublicacao}" >
</div>
<div class="form-group">
    <label for="descricao">Descrição:</label>
    <textarea name="livro.descricao"class="form-control"
              placeholder="Breve descrição do livro"
              id="descricao" value="${livro.descricao}"></textarea>
</div>
