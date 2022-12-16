package parte_02_padroes.chainofresponsability_refatorado;

public class Item {

    private String nome;
    private double valor;
    private int quantidade;

    public Item(String nome, double valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getSubTotal() {
        return this.valor * this.quantidade;
    }
}
