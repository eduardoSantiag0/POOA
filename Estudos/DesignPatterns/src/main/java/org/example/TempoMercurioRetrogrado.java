package org.example;

public class TempoMercurioRetrogrado implements TempoStrategy {
    @Override
    public long calcularProximoInstante(long instanteAtual) {
        return instanteAtual-1;
    }
}
