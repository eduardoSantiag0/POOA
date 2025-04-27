package org.example;

public class EntropiaStateEstavel extends EntropiaState {

    @Override
    void medirEntropia(EntropiaTemporizadorState temporizador) {
        System.out.println("Entropia Estável, porém algo está errado...");
        if (temporizador.nivelDeEntropia <= 60) {
            temporizador.setEstado(new EntropiaStateAltissima());
            System.out.println("A entropia chegou a niveis criticos");
        }
    }
}
