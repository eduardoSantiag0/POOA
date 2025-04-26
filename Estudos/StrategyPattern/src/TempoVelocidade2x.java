public class TempoVelocidade2x implements  TempoStrategy{

    @Override
    public long calcularProximoInstante(long instanteAtual) {
        return instanteAtual*2;
    }
}
