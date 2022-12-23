package parte_02_padroes.builder_refatorado;


import java.time.LocalDate;
import java.util.List;

public class NotaFiscalBuilder {

    private NotaFiscal notaFiscal = new NotaFiscal();

    public NotaFiscalBuilder  paraEmpresa(String razaosocial ) {
        notaFiscal.setRazaoSocial(razaosocial );
        return this;

    }

    public NotaFiscalBuilder quePosuiCnpj(String cnpj) {
        notaFiscal.setCnpj(cnpj );
        return this;
    }

    public NotaFiscalBuilder comOsItens(List<Item> itens) {
        notaFiscal.setItens(itens );
        return this;
    }

    public NotaFiscalBuilder naDataAtual() {
        notaFiscal.setDataDeEmissao(LocalDate.now() );
        return this;
    }

    public NotaFiscalBuilder comObservacoes(String observacoes ) {
        notaFiscal.setObservacoes(observacoes );
        return this;
    }

    public NotaFiscal constroi() {
        double valorTotal = calculaValorBruto();
        this.notaFiscal.setValorBruto( valorTotal );
        this.notaFiscal.setImpostos(calculaImposto(valorTotal ) );

        return notaFiscal;
    }

    private double calculaImposto(double valorTotal) {
        return valorTotal * 0.05;
    }

    private double calculaValorBruto() {

        double total = 0;
        for(Item item : notaFiscal.getItens() ) {
            total = total + item.obterSubTotal();
        }
        return total;
    }
}
