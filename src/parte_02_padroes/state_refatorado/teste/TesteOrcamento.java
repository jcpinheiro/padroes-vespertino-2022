package parte_02_padroes.state_refatorado.teste;

import parte_02_padroes.state_refatorado.Orcamento;

public class TesteOrcamento {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(1000);

        System.out.println(orcamento.getValor() );

        orcamento.aplicaDescontoExtra();

        System.out.println(orcamento.getValor() );

        orcamento.aprova();
        orcamento.aplicaDescontoExtra();

        System.out.println(orcamento.getValor() );
    }
}
