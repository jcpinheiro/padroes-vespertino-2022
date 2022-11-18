package parte_02_padroes.strategy_refatorado;

public class CalculadoraDeImpostos {


    public void realizaCalculo(Orcamento orcamento, Imposto imposto ) {
        double valorDoImposto = imposto.calcula(orcamento);
        System.out.println(valorDoImposto );

    }

}
