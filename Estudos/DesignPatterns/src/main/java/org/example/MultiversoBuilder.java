package org.example;

import java.util.ArrayList;
import java.util.List;

public class MultiversoBuilder {

    private TempoStrategy strategy;
    private List<GuardioesDoTempoObserver> guardioesDoTempoObserver = new ArrayList<>();
    private long tempoAtual;

    public MultiversoBuilder criarEstrategia(TempoStrategy strategy) {
        this.strategy = strategy;
        return this;
    }

    public MultiversoBuilder criartempoAtual(long tempo) {
        this.tempoAtual = tempo;
        return this;
    }

    public MultiversoBuilder adicionarGuardioes (GuardioesDoTempoObserver g) {
        guardioesDoTempoObserver.add(g);
        return this;
    }

    public RelogioDoTempo build() {
        RelogioDoTempo relogioDoTempo = new RelogioDoTempo(strategy, tempoAtual);
        for (GuardioesDoTempoObserver g : guardioesDoTempoObserver) {
            relogioDoTempo.addGuardiao(g);
        }
        return relogioDoTempo;
    }



}
