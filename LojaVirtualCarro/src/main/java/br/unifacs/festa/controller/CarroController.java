/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unifacs.festa.controller;

import br.unifacs.festa.model.Carro;
import br.unifacs.festa.model.CarroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Duilio Andrade
 */
@Controller
public class CarroController {

    @Autowired
    private CarroService service;

    @GetMapping("/carros")
    @ResponseBody
    public String listar() {
        return "Listar Carros";
    }

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("listacarros")
    public String listaCarros(Model model) {

        Iterable<Carro> carros = service.obterTodos();
        model.addAttribute("carros", carros);

        return "listacarros";
    }

    @RequestMapping(value = "salvar", method = RequestMethod.POST)
    public String salvar(@RequestParam("fabricante") String fabricante,
            @RequestParam("modelo") String modelo,
            @RequestParam("ano") int ano,
            @RequestParam("km") int km,
            @RequestParam("preco") int preco, Model model) {

        Carro novoCarro = new Carro(1L, fabricante, modelo, ano, km, preco);
        service.salvar(novoCarro);
        Iterable<Carro> carros = service.obterTodos();
        model.addAttribute("carros", carros);

        return "listacarros";

    }

  @RequestMapping(value = "editar", method = RequestMethod.GET)
    public String editar(@RequestParam("fabricante") String fabricante,
            @RequestParam("modelo") String modelo,
            @RequestParam("ano") String ano, 
            @RequestParam("km") String km,
             @RequestParam("preco") String preco,
            @RequestParam("id") Long id, Model model) {
        Carro editarCarro = new Carro(1L, fabricante, modelo, ano, km, preco);
        model.addAttribute("Carro", editarCarro);
        return "editarCarro";
    }

    @RequestMapping(value = "remover", method = RequestMethod.GET)
    public String remover(@RequestParam("id") Long id,
            Model model) {        
        service.remover(id);
        Iterable<Carro> carros = service.obterTodos();
        model.addAttribute("carros", carros);
        return "listacarros";
    }

}
