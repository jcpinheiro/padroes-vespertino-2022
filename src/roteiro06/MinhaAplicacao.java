package roteiro06;

public class MinhaAplicacao {

  public static void main(String[] args) {

    BancoDeDados bd = new BancoDeDados("servidor", "usr", "senha");
    ArmazenadorDeDividas arquivoDeDividas = new ArquivoDeDividas("dividias.txt");

    BalancoEmpresa balanco = new BalancoEmpresa(bd );

    registraDividas(balanco);
    realizaPagamentos(balanco);
    // realizar outras operações

    bd.desconecta();
  }
  private static void registraDividas(BalancoEmpresa balanco) {
    Divida d1 = new Divida();
    d1.setTotal(500 );
    d1.setDocumento(new CNPJ("00.000.000/0001-01") );

    Divida d2 = new Divida();
    d2.setDocumento(new CNPJ("00.000.000/0001-01") );
    d2.setTotal(1000);
    // preenche dados das dividas
    balanco.registraDivida(d1);
    balanco.registraDivida(d2);
  }
  private static void realizaPagamentos(BalancoEmpresa balanco) {
    Pagamento p1 = new Pagamento();
    p1.setValor(200 );
    Pagamento p2 = new Pagamento();
    p2.setValor(300 );

    CNPJ credor = new CNPJ("00.000.000/0001-01");

    // preenche dados dos pagamentos
    balanco.pagaDivida(credor, p1);
    balanco.pagaDivida(credor, p2);
  }
}
