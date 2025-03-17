package org.ifba.repository;

import java.util.List;

import org.ifba.model.ModeloCarro;

public interface ModeloCarroInterface {
    void salvar(ModeloCarro modeloCarro);
    void deletar(int id);
    List<ModeloCarro> buscarTodos();
    ModeloCarro buscarPorId(int id);

}
