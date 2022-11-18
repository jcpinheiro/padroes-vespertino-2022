package parte_02_padroes.strategy_refatorado;

public class ISS implements Imposto {

    private static final double TAXA = 0.06;

    @Override
    public double calcula(Orcamento orcamento ) {
        return orcamento.getValor() * TAXA;

    }
}
