package parte_02_padroes.chainofresponsability;

public class CalculadoraDeDescontosV2 {

  public double calcula(Orcamento orcamento) {


    // verifica primeira regra de possível desconto
    if(orcamento.totalDeItens() > 5) {
      // codigo
      return new DescontoPorCincoItens().desconta(orcamento);
    }

    // verifica segunda regra de possível desconto
    else if(orcamento.getValor() > 500.0) {
      return new DescontoPorMaisDeQuinhentosReais().desconta(orcamento);
    }
    else {
      return 0;
    }
     
    // verifica terceira, quarta, quinta regra de 
    // possível desconto  ...
    // um monte de ifs daqui pra baixo
  }
}
