package roteiro05;

import java.text.NumberFormat;

public class RelatorioDeDivida {

/*    private Divida divida;

    public RelatorioDeDivida(Divida divida) {
        this.divida = divida;
  }*/
    public void geraRelatorio(Divida divida, NumberFormat formatadorDeNumero) {
        System.out.println("Credor: " + divida.getCredor());
        System.out.println("Cnpj credor: " + divida.getCnpjDoCredor());

        System.out.println("Valor a pagar: " +
                formatadorDeNumero.format(divida.valorAPagar()));
        System.out.println("Valor total: " +
                formatadorDeNumero.format(divida.getTotal()));
    }
}
