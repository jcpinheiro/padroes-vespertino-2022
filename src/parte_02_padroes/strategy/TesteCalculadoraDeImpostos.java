package parte_02_padroes.strategy;

public class TesteCalculadoraDeImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(500);

        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        calculadora.realizaCalculo(orcamento, "icms");
        calculadora.realizaCalculo(orcamento, "ISS");

    }
}
