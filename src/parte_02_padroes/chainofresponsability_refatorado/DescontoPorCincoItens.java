package parte_02_padroes.chainofresponsability_refatorado;

public class DescontoPorCincoItens implements Desconto {

    private Desconto proximo;

    @Override
    public double desconta (Orcamento orcamento ) {
        if (orcamento.totalDeItens() > 5 ) {
            return orcamento.getValor() * 0.10;
        } else {
            return proximo.desconta(orcamento);
        }
    }

    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }
}
