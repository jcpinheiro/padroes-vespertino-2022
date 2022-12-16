package parte_02_padroes.chainofresponsability_refatorado;

public class DescontoPorMaisDe1000Reais implements  Desconto {

    private Desconto proximo;

    public double desconta(Orcamento orcamento  ) {

        if (orcamento.getValor() > 1000 ) {
            return orcamento.getValor() * 0.20;
        } else {
            return proximo.desconta(orcamento);
        }

    }
    @Override
    public void setProximo(Desconto proximo) {
        this.proximo = proximo;
    }

}
