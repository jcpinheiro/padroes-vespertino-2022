package parte_02_padroes.chainofresponsability_refatorado;

public class CalculadoraDeDescontos {

  public double calcula(Orcamento orcamento, Desconto primeiraRegra ) {
    return primeiraRegra.desconta(orcamento );
  }

}
