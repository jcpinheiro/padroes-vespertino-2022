package parte_02_padroes.template_method;

public class ICMS implements Imposto {
    private static final double TAXA = 0.10;

    @Override
    public double calcula(Orcamento orcamento ) {
        // mais complexo no mundo real
        return orcamento.getValor() * TAXA;
    }
}
