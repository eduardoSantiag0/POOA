package org.example;

public class OraculoDoTempoSingleton {

    private long tempoAtual;
    private static OraculoDoTempoSingleton instance;

    private OraculoDoTempoSingleton() {
        System.out.println("O Oraculo acordou do seu sono profundo!!");
    }

    public static OraculoDoTempoSingleton getInstance() {
        if (instance == null) {
            instance = new OraculoDoTempoSingleton();
        }
        return instance;
    }

    public void registrarTempo (long tempoAtual) {
        this.tempoAtual = tempoAtual;
    }

    public long getTempoAtual() {
        System.out.println("Segundo o ORACULO, o momento atual é: " + tempoAtual);
        return tempoAtual;
    }
}
