package roteiro05;

import java.text.NumberFormat;
import java.util.Locale;

public class RelatoDeDividasTeste {

    public static void main(String[] args) {
        Divida divida = new Divida();

        divida.setTotal(3000);
        divida.setCredor("Banco do Brasil");
        divida.setCnpjDoCredor(new CNPJ("00.000.000/0001-01") );

        RelatorioDeDivida relatorio = new RelatorioDeDivida();

        NumberFormat formatador = NumberFormat.getCurrencyInstance(
                new Locale("pt", "BR"));

        relatorio.geraRelatorio(divida, formatador );


    }
}
