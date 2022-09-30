package roteiro03;

import java.util.HashMap;

public class BalancoEmpresa {
  private HashMap<CNPJ, Divida> dividas = new HashMap<>();
 
  public void registraDivida(String credor, CNPJ cnpjCredor, double valor) {

    Divida divida = new Divida();
    divida.setTotal(valor);
    divida.setCredor(credor);
    divida.setCnpjDoCredor(cnpjCredor );

    dividas.put(cnpjCredor, divida);
  }

  public void pagaDivida(String cnpjCredor, String pagador, double valor) {
    Divida divida = this.busca(cnpjCredor );

    Pagamento pagamento = new Pagamento();
    pagamento.setPagador(pagador );
    pagamento.setValor(valor );

    //divida.paga(valor );
    divida.adiciona(pagamento );

  }
  public Divida busca(String cnpjCredor ) {
    Divida divida = dividas.get(cnpjCredor);

    if (divida != null  )
        return divida;
    else
      throw new IllegalArgumentException("Cnpj " + cnpjCredor + " é inválido!");
  }
  /*
  *  public void pagaDivida(String cnpjCredor, double valor) {
    Divida divida = dividas.get(cnpjCredor);
    if (divida != null) {
      //divida.setValorPago( divida.getValorPago() + valor );
      divida.paga(valor );
    } else {
      throw new IllegalArgumentException("Cnpj " + cnpjCredor + " é inválido!");
    }*/

}
