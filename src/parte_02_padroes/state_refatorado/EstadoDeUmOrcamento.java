package parte_02_padroes.state_refatorado;

interface EstadoDeUmOrcamento {

    public void aprova(Orcamento orcamento);
    public void reprova(Orcamento orcamento);
    public void finaliza(Orcamento orcamento);

    public double aplicaDescontoExtra(Orcamento orcamento);


}
