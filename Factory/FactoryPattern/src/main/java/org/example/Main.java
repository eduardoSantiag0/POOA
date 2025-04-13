package org.example;

import org.example.model.MagoInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    
//    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    private static final MagoFactory factory = new MagoFactory();
    
    public static void main(String[] args) {

        MagoInterface gelinho = factory.criarMagoGelo("Gelinho");
        MagoInterface foguinho = factory.criarMagoFogo("Foguinho");

        System.out.println(gelinho.atacar());
        System.out.println(foguinho.atacar());

    }
}