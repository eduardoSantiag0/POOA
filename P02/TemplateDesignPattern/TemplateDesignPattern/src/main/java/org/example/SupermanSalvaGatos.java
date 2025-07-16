package org.example;

public class SupermanSalvaGatos extends Superman {

    @Override
    void escolherRota() {
        System.out.println("Procurar em árvores");
    }

    @Override
    void ajudarPessoas() {
        System.out.println("Ajudar pessoas e gatinhos no centro da cidade");
    }
}
