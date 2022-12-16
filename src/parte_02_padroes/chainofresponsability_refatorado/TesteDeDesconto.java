package parte_02_padroes.chainofresponsability_refatorado;

public class TesteDeDesconto {

    public static void main(String[] args) {

        // criação do orçamento
        Orcamento orcamento = new Orcamento();

        orcamento.adiciona(new Item("Tablet", 1000, 2 ));
        orcamento.adiciona(new Item("Notebook", 200, 2 ));
        orcamento.adiciona(new Item("SmartPhone", 800, 2 ));
        orcamento.adiciona(new Item("Pen-driver", 80, 2 ));


        //definir as regras de desconto
        Desconto d1 = new DescontoPorMaisDe1000Reais();
        Desconto d2 = new DescontoPorCincoItens();
        Desconto d3 = new DescontoPorMaisDeQuinhentosReais();
        Desconto d4 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);
        d3.setProximo(d4);

        // executa a calculadora de Desconto
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        double desconto = calculadora.calcula(orcamento, d1);
        System.out.println("Total do Orçamento: " + orcamento.getValor() );
        System.out.println("Desconto aplicado: " + desconto );


    }
}
