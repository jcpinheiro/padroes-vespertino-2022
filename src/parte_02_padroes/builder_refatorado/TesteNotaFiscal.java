package parte_02_padroes.builder_refatorado;

import java.time.LocalDate;
import java.util.List;

public class TesteNotaFiscal {

    public static void main(String[] args) {

        List<Item> itens = List.of(
                new Item("Caneta", 5, 2),
                new Item("Lápis", 4, 5),
                new Item("Borracha", 6, 3)
        ) ;

        NotaFiscal notaFiscal =
                new NotaFiscal("Empresa XYZ",
                         "75.597.831/0001-91",
                        LocalDate.now(), 48, 4.8,
                        itens, "Compra de Material Escolar");

        System.out.println(notaFiscal );

        NotaFiscal notaFiscal2 = new NotaFiscalBuilder()
                .paraEmpresa("Empresa XYZ")
                .quePosuiCnpj("75.597.831/0001-91")
                .comOsItens(itens)
                .naDataAtual()
                .comObservacoes("Compra de Material Escolar")
                .constroi();

        System.out.println(notaFiscal2 );



    }
}
