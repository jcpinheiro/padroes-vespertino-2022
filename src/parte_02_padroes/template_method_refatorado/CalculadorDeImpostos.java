package parte_02_padroes.template_method_refatorado;

public class CalculadorDeImpostos {

    private static final double TAXA_ICMS = 0.10;
    private static final double TAXA_ISS  = 0.06;

    public void calcula(Orcamento orcamento, Imposto imposto ) {

        double valorImposto = imposto.calcula(orcamento);
        System.out.println(valorImposto );

    }
}
