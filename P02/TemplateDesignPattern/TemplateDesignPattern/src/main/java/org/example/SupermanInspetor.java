package org.example;

public class SupermanInspetor extends Superman {
    private String nome;
    private int forca;

    public void voar() {
        System.out.println("Ihuuuul");
    }

    @Override
    void escolherRota() {
        System.out.println("Inspecionando as rotas");
    }

    @Override
    void ajudarPessoas() {
        System.out.println("Inspecionando quem ajudar");
    }

}
