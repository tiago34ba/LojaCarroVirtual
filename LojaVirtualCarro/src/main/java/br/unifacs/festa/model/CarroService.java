package br.unifacs.festa.model;

import br.unifacs.festa.model.Carro;
import br.unifacs.festa.model.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {

    @Autowired
    private CarroRepository repository;

    public Iterable<Carro> obterTodos() {

        Iterable<Carro> convidados = repository.obterTodos();

        return convidados;

    }

    public void salvar(Carro carro) {
        repository.salvar(carro);
    }

    public void editar(Carro carro) {
        repository.editar(carro);
    }

    public void remover(Long id) {
        repository.remover(id);
    }

}
