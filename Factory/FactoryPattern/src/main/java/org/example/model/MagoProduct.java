package org.example.model;

public class MagoProduct extends Mago implements MagoInterface{

    private String nome;

    public MagoProduct(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public int atacar() {
        return 0;
    }

    @Override
    public int defender() {
        return 0;
    }
}
