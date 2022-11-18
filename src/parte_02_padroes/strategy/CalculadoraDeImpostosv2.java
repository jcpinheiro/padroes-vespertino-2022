package parte_02_padroes.strategy;

public class CalculadoraDeImpostosv2 {

   public void realizaCalculo(Orcamento orcamento, String imposto ) {

        if (imposto.equalsIgnoreCase("ICMS")) {
            double icms = new ICMS().calcula(orcamento);
            System.out.println(icms);
            // mais funcionalidades


        } else if (imposto.equalsIgnoreCase("ISS")) {
            double iss = new ISS().calcula(orcamento);
            System.out.println(iss);
            // ...
        }
        else {
            System.out.println("O tipo imposto " + imposto + " é inválido");
        }

     }

}
