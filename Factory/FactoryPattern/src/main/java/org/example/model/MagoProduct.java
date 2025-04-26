package org.example.model;

import org.example.cliente.MagoInterface;

public class MagoProduct extends Mago implements MagoInterface {

    private String nome;

    protected MagoProduct(String nome) {
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
