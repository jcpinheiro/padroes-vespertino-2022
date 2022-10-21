package roteiro05;

import static java.util.Objects.isNull;

public class DividaAntiga {

    private String credor;
    private CNPJ cnpjDoCredor;
    private CPF cpfCredor;
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
        if(isNull(cpfCredor) )
          this.cnpjDoCredor = cnpjDoCredor;
        else
          throw new IllegalArgumentException("A dívida já possui um CPF");
    }

    public CPF getCpfCredor() {
        return cpfCredor;
    }

    public void setCpfCredor(CPF cpfCredor) {
        if(isNull(cnpjDoCredor))
            this.cpfCredor = cpfCredor;
        else
           throw new IllegalArgumentException("A dívida já possui um CNPJ");
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