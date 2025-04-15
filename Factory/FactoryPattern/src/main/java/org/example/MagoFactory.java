package org.example;

import org.example.model.*;

public class MagoFactory {

    public MagoFogoInterface criarMagoFogo(String nome) {
        return new MagoFogo(nome);
    }

    public MagoGeloInterface criarMagoGelo(String nome) {
        return new MagoGelo(nome);
    }

}
