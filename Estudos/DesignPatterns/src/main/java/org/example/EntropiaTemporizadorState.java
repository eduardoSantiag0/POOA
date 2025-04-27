package org.example;

public class EntropiaTemporizadorState {

    //Classe Abstrata
    private EntropiaState estado;
    int nivelDeEntropia;

    public EntropiaTemporizadorState(EntropiaState estado) {
        this.estado = estado;
    }

    public void medirEntropia() {
        estado.medirEntropia(this);
    }

    public void setEstado(EntropiaState estado) {
        this.estado = estado;
    }

    public void setNivelEntropia(int novoNivel) {
        this.nivelDeEntropia = novoNivel;

    }

    public EntropiaState getEstado() {
        return estado;
    }


}
