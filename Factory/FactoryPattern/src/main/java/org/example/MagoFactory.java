package org.example;

import org.example.cliente.MagoFogoInterface;
import org.example.cliente.MagoGeloInterface;
import org.example.model.*;

public class MagoFactory {

    public MagoFogoInterface criarMagoFogo(String nome) {
        return new MagoFogo(nome);
    }

    public MagoGeloInterface criarMagoGelo(String nome) {
        return new MagoGelo(nome);
    }

    public MagoGeloDaFloresta criarMagoFloresta(String nome) {
        return new MagoGeloDaFloresta(nome);
    }

}
