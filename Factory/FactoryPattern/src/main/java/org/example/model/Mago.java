package org.example.model;

public class Mago implements MagoInterface{

    public String nome;

    public Mago(String nome) {
        this.nome = nome;
    }

    @Override
    public int atacar() {
        return 0;
    }

    @Override
    public int defender() {
        return 0;
    }

    public String getNome() {
        return nome;
    }
}
