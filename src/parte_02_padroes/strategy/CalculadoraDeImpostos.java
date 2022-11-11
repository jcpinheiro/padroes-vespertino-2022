package parte_02_padroes.strategy;

public class CalculadoraDeImpostos {

    private static final double TAXA_ICMS = 0.10;
    private static final double TAXA_ISS  = 0.06;

    public void realizaCalculo(Orcamento orcamento, String imposto ) {
        if (imposto.equalsIgnoreCase("ICMS")) {
            double icms = orcamento.getValor() * TAXA_ICMS;
            System.out.println(icms);
            // mais funcionalidades


        } else if (imposto.equalsIgnoreCase("ISS")) {
            double iss = orcamento.getValor() * TAXA_ISS;
            System.out.println(iss);
            // ...
        }
        else {
            System.out.println("O tipo imposto " + imposto + " é inválido");
        }

     }

}
