package org.ifba.repository;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class FabricaConexao {
    private static EntityManagerFactory factory = Persistence.createEntityManagerFactory("mysql");

    public static EntityManagerFactory getFabrica(){
        return factory;
    }
}
