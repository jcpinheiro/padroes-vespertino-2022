package parte_02_padroes.builder_refatorado;

import java.time.LocalDate;
import java.util.List;

public class NotaFiscal {

    private String razaoSocial;
    private String cnpj;
    private LocalDate dataDeEmissao;
    private double valorBruto;
    private double impostos;
    public List<Item> itens;
    public String observacoes;

    NotaFiscal() { }
    NotaFiscal(String razaoSocial, String cnpj, LocalDate
            dataDeEmissao, double valorBruto, double impostos, List<Item> itens,
                      String observacoes) {
        this.razaoSocial = razaoSocial;
        this.cnpj = cnpj;
        this.dataDeEmissao = dataDeEmissao;
        this.valorBruto = valorBruto;
        this.impostos = impostos;
        this.itens = itens;
        this.observacoes = observacoes;
    }


    @Override
    public String toString() {
        return "NotaFiscal{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", dataDeEmissao=" + dataDeEmissao +
                ", valorBruto=" + valorBruto +
                ", impostos=" + impostos +
                ", itens=" + itens +
                ", observacoes='" + observacoes + '\'' +
                '}';
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public LocalDate getDataDeEmissao() {
        return dataDeEmissao;
    }

    void setDataDeEmissao(LocalDate dataDeEmissao) {
        this.dataDeEmissao = dataDeEmissao;
    }

    public double getValorBruto() {
        return valorBruto;
    }

    void setValorBruto(double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public double getImpostos() {
        return impostos;
    }

    void setImpostos(double impostos) {
        this.impostos = impostos;
    }

    public List<Item> getItens() {
        return itens;
    }

    void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public String getObservacoes() {
        return observacoes;
    }

    void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}