package org.example.model;

public class MagoGelo extends MagoProduct implements MagoGeloInterface{

    public MagoGelo(String nome) {
        super(nome);
    }

    @Override
    public int atacar() {
        return 20;
    }

    @Override
    public int defender() {
        return 10;
    }

    @Override
    public void congelarInimigo() {
        System.out.println("Congelar!");
    }
}
