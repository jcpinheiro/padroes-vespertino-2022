package roteiro05;

import java.util.Objects;

import static java.util.Objects.isNull;

public class Divida {

    private String credor;

    private Documento documento;
    private double total;

    private HistoricoPagamentos historicoPagamentos = new HistoricoPagamentos();

    public HistoricoPagamentos getHistoricoPagamentos() {
        return historicoPagamentos;
    }

    public void registra(Pagamento pagamento) {
        historicoPagamentos.registra(pagamento);
    }

    public double valorAPagar() {
        return total - historicoPagamentos.getValorPago();
    }

    public String getCredor() {
        return credor;
    }
    public void setCredor(String credor) {
        this.credor = credor;
    }

    public Documento getDocumento() {
        return documento;
    }

    public void setDocumento(Documento documento) {
        this.documento = documento;
    }

    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Divida{" +
                "credor='" + credor + '\'' +
                ", cnpjCredor='" + documento.getValor() + '\'' +
                ", total=" + total +
                ", valorPago=" + historicoPagamentos.getValorPago() +
                '}';
    }
}