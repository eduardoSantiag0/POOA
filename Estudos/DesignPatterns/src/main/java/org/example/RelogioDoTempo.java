package org.example;

import java.util.ArrayList;
import java.util.List;

public class RelogioDoTempo {

    private TempoStrategy strategy;
    private List<GuardioesDoTempoObserver> guardioesDoTempoObserver = new ArrayList<>();
    private long tempoAtual;

    public RelogioDoTempo(TempoStrategy strategy, long atual) {
        this.strategy = strategy;
        this.tempoAtual = atual;
    }

    public long proximoSegundo() {
        notificarGuardioes();
        this.tempoAtual = strategy.calcularProximoInstante(tempoAtual);
        return tempoAtual;
    }

    void addGuardiao(GuardioesDoTempoObserver guardiao) {
        guardioesDoTempoObserver.add(guardiao);
    }

    private void notificarGuardioes() {
        for (GuardioesDoTempoObserver g : guardioesDoTempoObserver) {
            g.avisar();
        }
    }

}
