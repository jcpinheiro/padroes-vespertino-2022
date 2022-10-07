package roteiro04;

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

  public Divida busca(String cnpjCredor ) {
    Divida divida = dividas.get(cnpjCredor);

    if (divida != null  )
        return divida;
    else
      throw new IllegalArgumentException("Cnpj " + cnpjCredor + " é inválido!");
  }

  public void pagaDivida(String cnpjCredor, Pagamento pagamento) {
    Divida divida = this.busca(cnpjCredor );
    divida.registra(pagamento);
 }

}
