package parte_02_padroes.state;

public class ICMS implements Imposto {

    private static final double TAXA = 0.10;

    @Override
    public double calcula(Orcamento orcamento ) {
        return orcamento.getValor() * TAXA;

    }
}
