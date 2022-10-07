package roteiro04;

public class Divida {

    private String credor;
    private CNPJ cnpjDoCredor;
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

    public CNPJ getCnpjDoCredor() {
        return cnpjDoCredor;
    }

    public void setCnpjDoCredor(CNPJ cnpjDoCredor) {
        this.cnpjDoCredor = cnpjDoCredor;
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
                ", cnpjCredor='" + cnpjDoCredor.getValor() + '\'' +
                ", total=" + total +
                ", valorPago=" + historicoPagamentos.getValorPago() +
                '}';
    }
}