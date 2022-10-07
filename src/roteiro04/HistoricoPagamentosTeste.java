package roteiro04;

import java.util.List;

public class HistoricoPagamentosTeste {

    public static void main(String[] args) {
        HistoricoPagamentos pagamentos = new HistoricoPagamentos();

        Pagamento pagamento1 = new Pagamento("PicPay", "23423423423", 100);
        Pagamento pagamento2 = new Pagamento("PicPay", "23423423423", 200);

       pagamentos.registra(pagamento1 );
       pagamentos.registra(pagamento2);

        System.out.println(pagamentos );

        System.out.println("Valor pago " + pagamentos.getValorPago() );


    }
}
