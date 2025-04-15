package org.example;

import org.example.model.MagoFogo;
import org.example.model.MagoFogoInterface;
import org.example.model.MagoGeloInterface;
import org.example.model.MagoInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    
//    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final MagoFactory factory = new MagoFactory();
    
    public static void main(String[] args) {

        MagoGeloInterface gelinho = factory.criarMagoGelo("Gelinho");
        MagoFogoInterface foguinho = factory.criarMagoFogo("Foguinho");

        System.out.println(gelinho.atacar());
        System.out.println(foguinho.atacar());
        System.out.println(foguinho.getClass());
        System.out.println(gelinho.getClass());

        gelinho.congelarInimigo();

        foguinho.paredeDeChamas();

    }
}