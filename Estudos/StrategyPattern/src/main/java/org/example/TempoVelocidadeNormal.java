public class TempoVelocidadeNormal implements TempoStrategy{
    @Override
    public long calcularProximoInstante(long instanteAtual) {
        return instanteAtual+1;
    }
}
