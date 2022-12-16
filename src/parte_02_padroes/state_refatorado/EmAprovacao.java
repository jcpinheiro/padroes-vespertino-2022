package parte_02_padroes.state_refatorado;

class EmAprovacao implements EstadoDeUmOrcamento {

    @Override
    public void aprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Aprovado();

    }

    @Override
    public void reprova(Orcamento orcamento) {
        orcamento.estadoAtual = new Reprovado();
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new IllegalStateException("Orçamento em_aprovação não pode ser finalizado");

    }

    @Override
    public double aplicaDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor() * 0.02;
    }
}
