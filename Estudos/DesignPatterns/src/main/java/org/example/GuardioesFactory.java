package org.example;

public class GuardioesFactory {

    public GuardioesDoTempoObserver create(String tipo) {
        if ("PRATA".equals(tipo)) {
            return new GuardiaoDePrata();
        } else if ("OURO".equals(tipo)) {
            return new GuardiaoDeOuro();
        } else {
            throw new IllegalArgumentException("Tipo de guardião desconhecido: " + tipo);
        }
    }

}
