package roteiro05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class HistoricoPagamentos  {

    private double valorPago;
    private List<Pagamento> historicoPagamentos = new LinkedList<>();

    public Iterable<Pagamento> getHistoricoPagamentos() {
        return historicoPagamentos;
    }

    double getValorPago() {
        return valorPago;
    }

    private void paga(double valor ) {
        if ( valor <= 0 ) {
            throw new IllegalArgumentException("O valor deve ser positivo ");
        }
        if ( valor > 100) {
            valor = valor - 1;
        }
        this.valorPago = this.valorPago + valor;
    }

    void registra(Pagamento pagamento ) {
       this.paga(pagamento.getValor() );
       historicoPagamentos.add(pagamento);
    }


    public ArrayList<Pagamento> pagamentosAntesDe(LocalDate data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();

        for (Pagamento pagamento : this.historicoPagamentos )
            if (pagamento.getData().isBefore(data) ) {
                pagamentosFiltrados.add(pagamento );
            }

        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.historicoPagamentos ) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this.historicoPagamentos ) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

}