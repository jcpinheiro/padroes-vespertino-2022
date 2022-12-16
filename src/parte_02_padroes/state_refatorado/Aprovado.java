package parte_02_padroes.state_refatorado;

class Aprovado implements EstadoDeUmOrcamento {

    @Override
    public void aprova(Orcamento orcamento) {
        throw new IllegalStateException("Orçamento já foi aprovado anteriormente");

    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new IllegalStateException("Orçamento aprovado não pode ser mais reprovado");


    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();

    }

    @Override
    public double aplicaDescontoExtra(Orcamento orcamento) {
        return orcamento.getValor() * 0.05;
    }
}
