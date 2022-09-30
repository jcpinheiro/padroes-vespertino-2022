package roteiro03;

import java.time.LocalDate;

public class Pagamento {
    private String pagador;
    private String cnpjPagador;
    private double valor;
    private LocalDate data;


    public Pagamento() {     }

    public Pagamento(String pagador, String cnpjPagador, double valor) {
        this.pagador = pagador;
        this.cnpjPagador = cnpjPagador;
        this.valor = valor;

        this.data = LocalDate.now();

    }


    public LocalDate getData() {
        return data;
    }

    public String getPagador() {
        return this.pagador;
    }

    public void setPagador(String pagador) {
        this.pagador = pagador;
    }

    public String getCnpjPagador() {
        return this.cnpjPagador;
    }

    public void setCnpjPagador(String cnpjPagador) {
        this.cnpjPagador = cnpjPagador;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pagamento{" +
                "pagador='" + pagador + '\'' +
                ", valor=" + valor +
                ", data=" + data +
                '}';
    }
}
