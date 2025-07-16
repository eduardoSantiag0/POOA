package org.example;

public class Main {
    public static void main(String[] args) {

        GuardioesFactory guardioesFactory = new GuardioesFactory();

        //* Strategy
        RelogioDoTempo relogioDoTempo1 = new RelogioDoTempo(new TempoVelocidadeNormal(), 10);

        //* Observer
        GuardiaoDePrata guardiaoDePrata1 = new GuardiaoDePrata();
        GuardiaoDePrata guardiaoDePrata2 = new GuardiaoDePrata();
        GuardiaoDeOuro guardiaoDeOuro0 = new GuardiaoDeOuro();
        relogioDoTempo1.addGuardiao(new GuardiaoDeOuro());
        relogioDoTempo1.addGuardiao(new GuardiaoDePrata());
        relogioDoTempo1.addGuardiao(new GuardiaoDePrata());

        System.out.println(relogioDoTempo1.proximoSegundo());
        System.out.println(relogioDoTempo1.proximoSegundo());

        //* Factory
        GuardioesDoTempoObserver g1 = guardioesFactory.create("PRATA");
        GuardioesDoTempoObserver g2 = guardioesFactory.create("OURO");

        //* Builder
        RelogioDoTempo relogioBuilder = new MultiversoBuilder()
                .criarEstrategia(new TempoVelocidade2x())
                .criartempoAtual(10)
                .adicionarGuardioes(g2)
                .adicionarGuardioes(g1)
                .adicionarGuardioes(guardiaoDePrata2)
                .build();

        System.out.println("\n--- BUILDER ---- \n");
        System.out.println(relogioBuilder.proximoSegundo());

        //* Adapter
        AdapterLeitorBinario leitorTexto = new AdapterLeitorBinario(new RegistradorBinario());
        var tempo = relogioBuilder.proximoSegundo();
        System.out.println("\nTempo em numeros: " + tempo);
        leitorTexto.lerTempo(tempo);


        //* Singleton
        OraculoDoTempoSingleton oraculo = OraculoDoTempoSingleton.getInstance();
        oraculo.registrarTempo(tempo);
        oraculo.getTempoAtual();

        //* State
        System.out.println("\n");
        EntropiaTemporizadorState temporizador = new EntropiaTemporizadorState(new EntropiaStateBaixa());
        temporizador.setNivelEntropia(20);
        temporizador.medirEntropia();
        temporizador.setNivelEntropia(50);
        temporizador.medirEntropia();
        temporizador.setNivelEntropia(90);
        temporizador.medirEntropia();

        System.out.println(temporizador.getEstado().getClass());

    }
}