// O código cliente passa a estratégia e
// Usar comportamentos parecidos para diferentes contextos
// Isola a lógica do comportamento

interface TempoStrategy {
    long calcularProximoInstante(long instanteAtual);
}
