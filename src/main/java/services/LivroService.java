/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import infrastructure.LivroDAO;
import interfaces.Estante;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import models.Livro;

/**
 *
 * @author Lucas
 */
@ApplicationScoped
public class LivroService implements Estante {
    
    @Inject
    private LivroDAO livroDAO;

    @Override
    public void salvar(Livro livro) {
        System.out.println("service livro::::::"+livro.getIsbn());
        System.out.println("service livro::::::"+livro.getTitulo());
        System.out.println("service livro::::::"+livro.getDescricao());
        System.out.println("service livro::::::"+livro.getDataPublicacao());
        System.out.println("service livro::::::"+livro.getPreco());

        this.livroDAO.salvar(livro);
    }

    @Override
    public void atualizar(Livro livro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void remover(Livro livro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Livro> todosOsLivros() {
       return livroDAO.listarTodos();
    }

    @Override
    public Livro encontrarPeloISBN() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
