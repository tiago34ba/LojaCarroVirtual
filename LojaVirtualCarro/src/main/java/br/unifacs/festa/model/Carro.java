package br.unifacs.festa.model;

public class Carro {

    private Long id;

    private String fabricante;

    private String modelo;

    private int Ano;

    private int km;

    private int preco;

    public Carro() {

    }

    public Carro(Long id, String fabricante, String modelo, int ano, int km, int preco) {
        super();
        this.id = id;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.Ano = ano;
        this.km = km;
        this.preco = preco;
    }

    public Long getId() {
        return id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return Ano;
    }

    public void setAno(int Ano) {
        this.Ano = Ano;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
