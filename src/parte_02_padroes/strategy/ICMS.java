package parte_02_padroes.strategy;

public class ICMS {

    private static final double TAXA = 0.10;

    public double calcula(Orcamento orcamento ) {
        return orcamento.getValor() * TAXA;

    }
}
