package org.example.model;

import org.example.cliente.MagoFogoInterface;

public class MagoFogo extends MagoProduct implements MagoFogoInterface {

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


    @Override
    public void paredeDeChamas() {
        System.out.println("Criar parede de fogo!");
    }
}
