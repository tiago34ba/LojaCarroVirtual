package br.unifacs.festa.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Entidade que Simula o banco de dados
 *
 * @author Duilio Andrade
 */
public class CarroRepository {

    private ArrayList<Carro> listaCarro = new ArrayList<Carro>();
    Long id = 1L;

    public CarroRepository() {

        listaCarro.add(new Carro(id, "Volkswagen", "SAVEIRO", 23333, 24231, 142134));
    }

    public List obterTodos() {

        return listaCarro;
    }

    public void salvar(Carro carro) {
        id = id + 1L;
        carro.setId(id);
        listaCarro.add(carro);
    }
    
public void editar(Carro carro) {
        id = id + 1L;
        carro.setId(id);
        listaCarro.add(carro);
    }
    public void remover(Long id) {

        for (Carro c : listaCarro) {
            if (Objects.equals(id, c.getId())) {
                listaCarro.remove(c);
                break;
            }
        }
    }
}
