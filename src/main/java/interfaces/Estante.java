/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import models.Livro;

/**
 *
 * @author Lucas
 */
public interface Estante {
    
    void salvar(Livro livro);
    
    void atualizar(Livro livro);
    
    void remover(Livro livro);
    
    List<Livro> todosOsLivros();
    
    Livro encontrarPeloISBN();
}
