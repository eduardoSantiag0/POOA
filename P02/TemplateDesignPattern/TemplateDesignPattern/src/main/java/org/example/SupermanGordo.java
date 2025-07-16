package org.example;

public class SupermanGordo extends Superman {
    @Override
    void escolherRota() {
        System.out.println("Procurando rotas em que tem mais lanchonetes");
    }

    @Override
    void ajudarPessoas() {
        System.out.println("Ajudar pessoas em restaurantes");
    }
}
