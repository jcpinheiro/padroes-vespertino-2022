package parte_02_padroes.chainofresponsability;

public class DescontoPorCincoItens {

    public double desconta (Orcamento orcamento ) {

        if (orcamento.totalDeItens() > 5 ) {
            return orcamento.getValor() * 0.10;
        } else {
            return 0;
        }
    }
}
