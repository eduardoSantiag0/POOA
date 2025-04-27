package main.java.org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        RelogioDoTempo relogioDoTempo1 = new RelogioDoTempo(new TempoVelocidadeNormal(), 10);
        GuardiaoDePrata guardiaoDePrata1 = new GuardiaoDePrata();
        GuardiaoDePrata guardiaoDePrata2 = new GuardiaoDePrata();
        GuardiaoDeOuro guardiaoDeOuro0 = new GuardiaoDeOuro();
        relogioDoTempo1.addGuardiao(new GuardiaoDeOuro());
        relogioDoTempo1.addGuardiao(new GuardiaoDePrata());
        relogioDoTempo1.addGuardiao(new GuardiaoDePrata());

        System.out.println(relogioDoTempo1.proximoSegundo());
        System.out.println(relogioDoTempo1.proximoSegundo());

        RelogioDoTempo relogioBuilder = new MultiversoBuilder()
                .criarEstrategia(new TempoVelocidade2x())
                .criartempoAtual(10)
                .adicionarGuardioes(guardiaoDeOuro0)
                .adicionarGuardioes(guardiaoDePrata1)
                .adicionarGuardioes(guardiaoDePrata2)
                .build();

        System.out.println("\n--- BUILDER ---- \n");
        System.out.println(relogioBuilder.proximoSegundo());


    }
}