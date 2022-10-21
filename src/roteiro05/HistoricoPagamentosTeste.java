package roteiro05;

import java.util.List;

public class HistoricoPagamentosTeste {

    public static void main(String[] args) {
        HistoricoPagamentos historicoPagamentos = new HistoricoPagamentos();

        Pagamento pagamento1 = new Pagamento("PicPay", "23423423423", 100);
        Pagamento pagamento2 = new Pagamento("PicPay", "23423423423", 200);

       historicoPagamentos.registra(pagamento1 );
       historicoPagamentos.registra(pagamento2);

        Iterable<Pagamento> pagamentos = historicoPagamentos.getHistoricoPagamentos();
        // pagamentos.remove(pagamento2 );

        pagamentos.forEach(System.out::println );

        System.out.println("Valor pago " + historicoPagamentos.getValorPago() );


    }
}
