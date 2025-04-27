package org.example;

public class GuardiaoDePrata implements GuardioesDoTempoObserver {
    @Override
    public void avisar() {
        System.out.println("Sou o Guardiao de Prata e eu fui notificado, não há nada que eu possa fazer");
    }
}
