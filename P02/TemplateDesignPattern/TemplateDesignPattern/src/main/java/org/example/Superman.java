package org.example;

public abstract class Superman {
    void prepararVoo() {
        System.out.println("Colocar capa");
        escolherRota();
        ajudarPessoas();
        voltarParaCasa();
    };

    abstract void escolherRota();

    abstract void ajudarPessoas();

    private void voltarParaCasa() {
        System.out.println("Voltar para casa da Lois Lane");
    }

}
