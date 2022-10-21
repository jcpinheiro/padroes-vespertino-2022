package roteiro05;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class BalancoEmpresa {
  private Map<Documento, Divida> dividas = new HashMap<>();

  public void registraDivida(Divida divida) {
    dividas.put(divida.getDocumento(), divida );
  }

  public Divida busca(Documento documento ) {
    Divida divida = dividas.get(documento );

    if (divida != null  )
        return divida;
    else
      throw new IllegalArgumentException("Documento " + documento.getValor()
                                         + " é inválido!");
  }

  public void pagaDivida(Documento documentoCredor,  Pagamento pagamento ) {
    Divida divida = this.busca(documentoCredor );
    divida.registra(pagamento);
  }
}
