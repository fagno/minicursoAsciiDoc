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
    
    public Pessoa pessoa(int id){
        return manager.find(Pessoa.class, id);
    }
    
    public List<Pessoa> Pessoas(){
        Query query = manager.createQuery("from Pessoa");
        return query.getResultList();
    } 

    public void remove(Pessoa pessoa){
        manager.getTransaction().begin();
        Pessoa p = manager.find(Pessoa.class, this);
        manager.remove(Pessoa);
        manager.getTransaction().commit();
    }

    public void update(Pessoa pessoa){
        manager.getTransaction().begin();
        Pessoa p = manager.find(Pessoa.class, this);
        manager.merge(Pessoa);
        manager.getTransaction().commit();
    }


}
