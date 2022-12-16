package parte_02_padroes.state_refatorado;

class Finalizado implements EstadoDeUmOrcamento {

    @Override
    public void aprova(Orcamento orcamento) {
        throw new IllegalStateException("Orçamento já foi finalizado");

    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new IllegalStateException("Orçamento já foi finalizado");

    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new IllegalStateException("Orçamento já foi finalizado");

    }

    @Override
    public double aplicaDescontoExtra(Orcamento orcamento) {
        throw new IllegalStateException("Não se aplica desconto em orcamento finalizado");

    }
}
