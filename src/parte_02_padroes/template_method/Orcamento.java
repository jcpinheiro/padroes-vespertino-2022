package parte_02_padroes.template_method;

import java.util.ArrayList;
import java.util.List;

public class Orcamento {
    private double valor;
    private List<Item> itens = new ArrayList<>();


    public void adiciona(Item item ) {
        this.itens.add(item );
    }

    public double getValor() {
        double total = 0;
        for(Item item: this.itens ) {
            total = total + item.getValor();
        }
        return total;
    }



    public List<Item> getItens() {
        return itens;
    }

    public int getTotalDeItens() {
        return itens.size();
    }
}
