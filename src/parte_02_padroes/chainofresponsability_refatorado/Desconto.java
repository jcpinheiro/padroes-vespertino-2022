package parte_02_padroes.chainofresponsability_refatorado;


public interface Desconto {
    public double desconta(Orcamento orcamento );
    public void setProximo(Desconto proximo);
}
