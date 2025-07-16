package org.example;


// Quando usar?
// Quando o comportamento padrão existe e só muda alguns detalhes.
// A classe abstrata encapsula a estruturas fixa
// Os  passos que mudam o detalhes, são métodos abstratos implementados pelas subclasses


public class Main {
    public static void main(String[] args) throws Exception {
        SupermanSalvaGatos supermanSalvaGatos = new SupermanSalvaGatos();
        supermanSalvaGatos.prepararVoo();
        System.out.println("\n");
        SupermanGordo supermanGordo = new SupermanGordo();
        supermanGordo.prepararVoo();

    }
}