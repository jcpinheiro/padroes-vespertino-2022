package parte_02_padroes.strategy;

public class ISS {

    private static final double TAXA = 0.06;

    public double calcula(Orcamento orcamento ) {
        return orcamento.getValor() * TAXA;

    }
}
