package org.example;

public class EntropiaStateAltissima extends EntropiaState {
    @Override
    void medirEntropia(EntropiaTemporizadorState temporizador) {
        System.out.println("O universo está entrando em colapso, estou revertendo para o estado original");
        temporizador.setEstado(new EntropiaStateBaixa());
    }
}
