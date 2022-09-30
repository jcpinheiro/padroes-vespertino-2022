package roteiro03;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class HistoricoPagamentos extends ArrayList<Pagamento> {

    private double valorPago;
    //private List<Pagamento> historicoPagamentos = new ArrayList<>();

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

    void adiciona(Pagamento pagamento ) {
       this.add(pagamento);
    }

    @Override
    public boolean add(Pagamento pagamento) {
        this.paga(pagamento.getValor() );
        System.out.println("#### " + pagamento.getValor() );
        return super.add(pagamento);
    }

    public ArrayList<Pagamento> pagamentosAntesDe(LocalDate data) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<>();

        for (Pagamento pagamento : this )
            if (pagamento.getData().isBefore(data) ) {
                pagamentosFiltrados.add(pagamento );
            }

        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosComValorMaiorQue(double valorMinimo) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this ) {
            if (pagamento.getValor() > valorMinimo) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }
    public ArrayList<Pagamento> pagamentosDo(String cnpjPagador) {
        ArrayList<Pagamento> pagamentosFiltrados = new ArrayList<Pagamento>();
        for (Pagamento pagamento : this ) {
            if (pagamento.getCnpjPagador().equals(cnpjPagador)) {
                pagamentosFiltrados.add(pagamento);
            }
        }
        return pagamentosFiltrados;
    }

}