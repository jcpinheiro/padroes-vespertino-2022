package roteiro06;

import roteiro01.BalancoEmpresa;
import roteiro01.CNPJ;
import roteiro01.Divida;

public class BalancoEmpresaTeste {

    public static void main(String[] args) {

        BalancoEmpresa balancoEmpresa = new BalancoEmpresa();

        balancoEmpresa.registraDivida("PicPay",
                new CNPJ("61.823.765/0001-16"),
                1000);

        Divida divida = balancoEmpresa.busca("61.823.765/0001-16");
        System.out.println(divida );

        balancoEmpresa.pagaDivida("61.823.765/0001-16", "Joao", 300 );
        System.out.println(divida );

        balancoEmpresa.pagaDivida("61.823.765/0001-16", "Joao",  200 );
        System.out.println(divida );


    }
}
