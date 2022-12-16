package parte_02_padroes.state;

public class CalculadoraDeImpostos {


    public void realizaCalculo(Orcamento orcamento, Imposto imposto ) {
        double valorDoImposto = imposto.calcula(orcamento);
        System.out.println(valorDoImposto );

    }

}
