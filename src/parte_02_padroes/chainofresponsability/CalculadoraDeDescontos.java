package parte_02_padroes.chainofresponsability;

public class CalculadoraDeDescontos {

  public double calcula(Orcamento orcamento) {
    // verifica primeira regra de possível desconto
    if(orcamento.totalDeItens() > 5) {
      return orcamento.getValor() * 0.10;
    }

    // verifica segunda regra de possível desconto
    else if(orcamento.getValor() > 500.0) {
      return orcamento.getValor() * 0.07;
    }
    else {
      return 0;
    }
     
    // verifica terceira, quarta, quinta regra de 
    // possível desconto  ...
    // um monte de ifs daqui pra baixo
  }
}
