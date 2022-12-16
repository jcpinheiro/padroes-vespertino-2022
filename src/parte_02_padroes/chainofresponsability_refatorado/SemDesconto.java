package parte_02_padroes.chainofresponsability_refatorado;

public class SemDesconto implements Desconto {
    @Override
    public double desconta(Orcamento orcamento) {
        return 0;
    }

    @Override
    public void setProximo(Desconto proximo) {
        throw new RuntimeException("Essa é a última de desconto");
    }
}
