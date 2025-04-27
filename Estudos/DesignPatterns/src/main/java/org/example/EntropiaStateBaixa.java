package org.example;

public class EntropiaStateBaixa extends EntropiaState{
    @Override
    void medirEntropia(EntropiaTemporizadorState temporizador) {
        System.out.println("Entropia baixa, universo se encontra em equilíbrio.");
        if (temporizador.nivelDeEntropia <= 30) {
            temporizador.setEstado(new EntropiaStateEstavel());
            System.out.println("A entropia está aumentando...");
        }
    }
}
