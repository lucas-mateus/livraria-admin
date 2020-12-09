/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import exceptions.BusinessException;
import javax.inject.Inject;
import models.Livro;
import services.LivroService;

/**
 *
 * @author Lucas
 */
@Controller
@Path("livro-admin")
public class LivroController {
    
    @Inject
    private Result result;
    @Inject
    private LivroService livroService;

    @Get("cadastro")
    public void formularioCriacao(){
    }
    
    @Post("cadastrar")
    public void cadastrar(Livro livro) {
        try{
            livroService.salvar(livro);
            result.redirectTo(this).listar();
        }catch(BusinessException error){
            result.include(livro);
            result.include("mensagemErro", error.getMessage());
            result.redirectTo(this).formularioCriacao();
        }
        result.include(livro);
        result.include("message", "Livro cadastrado com sucesso!");
        result.redirectTo(this).listar();
    }
    
    @Get("lista-livros")
    public void listar(){
        result.include(this.livroService.todosOsLivros());
    }
    
    @Get("editar/{isbn}")
    public void editar(String isbn){
    }
    
    @Post("atualizar")
    public void atualizar(Livro livro){
        
    }

}
