package parte_02_padroes.state_refatorado;

public class Orcamento {

    EstadoDeUmOrcamento estadoAtual = new EmAprovacao();

    private double valor;

    public Orcamento(double valor) {
        this.valor = valor;
    }


    public double getValor() {
        return valor;
    }

    public void aplicaDescontoExtra() {
        this.valor = this.valor - estadoAtual.aplicaDescontoExtra(this);
    }


    public void aprova() {
        estadoAtual.aprova(this);
    }

    public void reprova() {
        estadoAtual.reprova(this );
    }

    public void finaliza() {
        estadoAtual.finaliza(this );
    }
}
