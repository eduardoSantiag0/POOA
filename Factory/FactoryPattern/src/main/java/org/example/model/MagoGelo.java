package org.example.model;

public class MagoGelo extends Mago{

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

}
