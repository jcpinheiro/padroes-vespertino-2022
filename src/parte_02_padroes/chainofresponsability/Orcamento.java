package parte_02_padroes.chainofresponsability;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private double valor;
    List<Item> itens = new ArrayList<>();

    public Orcamento(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public List<Item> getItens() {
        return itens;
    }

    public int totalDeItens() {
        return this.itens.size();
    }
}
