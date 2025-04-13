package org.example.model;

public class MagoFogo extends Mago{

    public MagoFogo(String nome) {
        super(nome);
    }

    @Override
    public int atacar() {
        return 10;
    }

    @Override
    public int defender() {
        return 20;
    }

}
