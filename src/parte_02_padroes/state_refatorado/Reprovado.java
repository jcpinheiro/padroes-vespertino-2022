package parte_02_padroes.state_refatorado;

class Reprovado implements EstadoDeUmOrcamento {

    @Override
    public void aprova(Orcamento orcamento) {

    }

    @Override
    public void reprova(Orcamento orcamento) {

    }

    @Override
    public void finaliza(Orcamento orcamento) {

    }

    @Override
    public double aplicaDescontoExtra(Orcamento orcamento) {
        throw new IllegalStateException("Não se aplica desconto em orcamento reprovado");
    }
}
