package roteiro06;

public interface ArmazenadorDeDividas {
    void salva(Divida divida);

    Divida carrega(Documento documentoCredor);
}
