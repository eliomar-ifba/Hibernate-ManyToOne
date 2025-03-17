package org.ifba.testes;

import org.ifba.model.Fabricante;
import org.ifba.model.ModeloCarro;
import org.ifba.repository.ModeloCarroRepository;

public class TesteManyToOne {
    public static void main(String[] args) {
        Fabricante fabricante = new Fabricante();
        fabricante.setNome("Toyota");

        ModeloCarro modelo = new ModeloCarro();
        modelo.setNome("Corolla");
        modelo.setFabricante(fabricante);

        ModeloCarroRepository repository = new ModeloCarroRepository();
        
        //TESTANDO SALVAR
        //repository.salvar(modelo);

        //TESTANDO LISTAR
        for(ModeloCarro m : repository.buscarTodos()){
            System.out.println("ID: " + m.getId());
            System.out.println("Modelo: " + m.getNome());
            System.out.println("Fabricante: " + m.getFabricante().getNome());
        }

        //TESTANDO DELETAR 
        //repository.deletar(2);

        //TESTANDO BUSCAR 
        // ModeloCarro modeloCarro = repository.buscarPorId(3);
        // System.out.println(modeloCarro);



    }
}
