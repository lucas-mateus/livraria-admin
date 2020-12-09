/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infrastructure;

import infrastructure.util.ConnectionFactory;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import models.Livro;

/**
 *
 * @author Lucas
 */
@ApplicationScoped
public class LivroDAO {
    
    @PersistenceContext(name = "default")
    EntityManager em;
    
    public void salvar(Livro livro) {
        
        try {
            em.getTransaction().begin();
            em.persist(livro);
            em.getTransaction().commit();
        } catch (Exception error) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    public void atualizar(Livro livro) {
        EntityManager em = ConnectionFactory.getEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(livro);
            em.getTransaction().commit();
        } catch (Exception error) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    public void excluir(String livroId) {
        EntityManager em = ConnectionFactory.getEntityManager();
        try {
            em.getTransaction().begin();
            Livro livro = em.find(Livro.class, livroId);
            em.remove(livro);
            em.getTransaction().commit();
        } catch (Exception error) {
            if (em.getTransaction().isActive()) {
                em.getTransaction().rollback();
            }
        } finally {
            if (em.isOpen()) {
                em.close();
            }
        }
    }

    public Livro encontrarPeloISBN(String isbn) {
        EntityManager em = ConnectionFactory.getEntityManager();

        Livro livro = em.createQuery("select l from livro l where l.isbn like :isbn", Livro.class)
                .setParameter("isbn", isbn).getSingleResult();

        if (em.isOpen()) {
            em.close();
        }

        return livro;
    }

    public List<Livro> listarTodos() {
        EntityManager em = ConnectionFactory.getEntityManager();

        List<Livro> livros = em.createQuery("from livro", Livro.class).getResultList();
        if (em.isOpen()) {
            em.close();
        }
        return livros;
    }

}
