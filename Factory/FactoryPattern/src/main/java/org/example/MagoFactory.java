package org.example;

import org.example.model.MagoFogo;
import org.example.model.MagoGelo;
import org.example.model.MagoInterface;

public class MagoFactory {

    public MagoInterface criarMagoFogo(String nome) {
        return new MagoFogo(nome);
    }

    public MagoInterface criarMagoGelo(String nome) {
        return new MagoGelo(nome);
    }

}
