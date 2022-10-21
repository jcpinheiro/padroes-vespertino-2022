package roteiro05;

import roteiro01.CNPJ;
import roteiro01.Divida;
import roteiro01.Pagamento;

public class DividaTeste {

    public static void main(String[] args) {
        Divida dividaDoJoao = new Divida();

        dividaDoJoao.setTotal(1000);
        dividaDoJoao.setCredor("PicPay");
        dividaDoJoao.setCnpjDoCredor(new CNPJ("61.823.765/0001-16") );

        Pagamento pagamento = new Pagamento();
        pagamento.setPagador("Joao");
        pagamento.setValor(300 );

        dividaDoJoao.adiciona(pagamento );

        System.out.println(dividaDoJoao );

    }
}