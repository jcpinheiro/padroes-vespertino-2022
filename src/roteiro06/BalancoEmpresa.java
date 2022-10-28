package roteiro06;

import java.util.HashMap;
import java.util.Map;

public class BalancoEmpresa {
  private ArmazenadorDeDividas armazenadorDeDividas;

  public BalancoEmpresa(ArmazenadorDeDividas armazenadorDeDividas ) {
    this.armazenadorDeDividas = armazenadorDeDividas;
  }

  public void registraDivida(Divida divida) {
    armazenadorDeDividas.salva(divida );
  }

  public Divida busca(Documento documento ) {
    Divida divida = armazenadorDeDividas.carrega(documento );

    if (divida != null  )
        return divida;
    else
      throw new IllegalArgumentException("Documento " + documento.getValor()
                                         + " é inválido!");
  }

  public void pagaDivida(Documento documentoCredor, Pagamento pagamento ) {
    Divida divida = this.busca(documentoCredor );
    divida.registra(pagamento);
  }

}
