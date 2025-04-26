package org.example.model;

import org.example.cliente.MagoGeloInterface;

public class MagoGeloDaFloresta extends MagoGelo implements MagoGeloInterface {


    public MagoGeloDaFloresta(String nome) {
        super(nome);
    }

    @Override
    public void congelarInimigo() {
        System.out.println("Congelar floresta");
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
