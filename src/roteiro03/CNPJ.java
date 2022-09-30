package roteiro03;

public class CNPJ {

    private String valor;

    public CNPJ(String valor) {
        if (cnpjValido(valor ) )
            this.valor = valor;
        else {
            throw new IllegalArgumentException("O valor do CNPJ é inválido!" );
        }
    }

    public String getValor() {
        return valor;
    }

    public boolean cnpjValido(String valor) {
        boolean resultado = primeiroDigitoVerificador() == primeiroDigitoCorreto()
                && segundoDigitoVerificador() == segundoDigitoCorreto();

        return true;
    }

    private int segundoDigitoCorreto() {
        return 0;
    }

    private int segundoDigitoVerificador() {
        return 0;
    }

    private int primeiroDigitoCorreto() {
        return 0;
    }

    private int primeiroDigitoVerificador() {
        return 0;
    }
}
