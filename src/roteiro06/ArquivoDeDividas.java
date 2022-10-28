package roteiro06;

public class ArquivoDeDividas implements ArmazenadorDeDividas {

    private String nomeArquivo;


    public ArquivoDeDividas(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
    }

    @Override
    public void salva(Divida divida) {
        System.out.println("Salvando no arquivo de dividas");
    }

    @Override
    public Divida carrega(Documento documentoCredor) {
        return null;
    }
}
