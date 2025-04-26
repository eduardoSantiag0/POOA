package org.example.cliente;

import org.example.MagoFactory;

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

        MagoGeloInterface florestinho = factory.criarMagoFloresta("florestinho");
        System.out.println(florestinho.getClass());
        florestinho.congelarInimigo();

    }
}