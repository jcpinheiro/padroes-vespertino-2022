package roteiro05;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BalancoEmpresaAntigo {
  private final Map<CNPJ, Divida> dividasPJ = new HashMap<>();
  private final Map<CPF, Divida>  dividasPF = new HashMap<>();

  public void registraDivida(Divida divida) {
 /*   if (Objects.nonNull(divida.getDocumento()) )
       dividasPJ.put(divida.getCnpjDoCredor(), divida );

    else if ( Objects.nonNull(divida.getCpfCredor()) )
      dividasPF.put(divida.getCpfCredor(), divida );

    else
      throw new IllegalArgumentException("Divida precisa de um documento válido!");
*/  }

  public Divida busca(CNPJ cnpjCredor ) {
    Divida divida = dividasPJ.get(cnpjCredor);

    if (divida != null  )
        return divida;
    else
      throw new IllegalArgumentException("Cnpj " + cnpjCredor + " é inválido!");
  }

  public Divida busca(CPF cpfCredor ) {
    Divida divida = dividasPJ.get(cpfCredor);

    if (divida != null  )
      return divida;
    else
      throw new IllegalArgumentException("Cnpj " + cpfCredor + " é inválido!");
  }

  public void pagaDivida(CNPJ cnpjCredor,  Pagamento pagamento ) {
    Divida divida = this.busca(cnpjCredor );
    divida.registra(pagamento);
  }

  public void pagaDivida(CPF cpfCredor, Pagamento pagamento ) {
    Divida divida = this.busca(cpfCredor );
    divida.registra(pagamento);
  }
}
