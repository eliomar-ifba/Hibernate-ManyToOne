package org.ifba.repository;

import java.util.List;

import org.ifba.model.ModeloCarro;

import jakarta.persistence.EntityManager;

public class ModeloCarroRepository implements ModeloCarroInterface {

    EntityManager em = FabricaConexao.getFabrica().createEntityManager();

    @Override
    public void salvar(ModeloCarro modeloCarro) {
        em.getTransaction().begin();
        em.persist(modeloCarro);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void deletar(int id) {
        em.getTransaction().begin();
        ModeloCarro modeloCarro = em.find(ModeloCarro.class, id);
        em.remove(modeloCarro);
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<ModeloCarro> buscarTodos() {
        em.getTransaction().begin();
        List<ModeloCarro> lista = em.createQuery("Select m from ModeloCarro m", ModeloCarro.class).getResultList();
        em.close();
        return lista;
    }

    @Override
    public ModeloCarro buscarPorId(int id) {
        em.getTransaction().begin();
        ModeloCarro modeloCarro = em.find(ModeloCarro.class, id);
        em.close();
        return modeloCarro;
    }

}
