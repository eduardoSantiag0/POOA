package org.example;

public class AdapterLeitorBinario implements LeitorDeTempo {
    private RegistradorBinario registrador;

    public AdapterLeitorBinario(RegistradorBinario registrador) {
        this.registrador = registrador;
    }

    @Override
    public void lerTempo(long tempo) {
        String tempoEmBinario = Long.toBinaryString(tempo);
        registrador.registrarTempoNosLivros(tempoEmBinario);
    }
}
