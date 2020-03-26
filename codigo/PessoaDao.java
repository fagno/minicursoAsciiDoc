package com.mycompany.projetoexemplo.model.dao;

import com.mycompany.projetoexemplo.model.Pessoa;
import javax.persistence.EntityManager;

/**
 *
 * @author fagno
 */
public class PessoaDao{

    EntityManager em = JpaUtil.criarEntityManager();
    
    public void salvar(Pessoa pessoa){
        //inicia a transação
        em.getTransaction().begin();
        em.persist(pessoa);
        em.getTransaction().commit();
    }
    
    //outros métodos para buscar, excluir e atualizar.
    
}
