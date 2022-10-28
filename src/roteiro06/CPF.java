package roteiro06;

import java.util.Objects;

public class CPF implements Documento {

    private String valor;

    public CPF(String valor) {
        if (ehValido(valor ) )
            this.valor = valor;
        else {
            throw new IllegalArgumentException("O valor do CNPJ é inválido!" );
        }
    }
    @Override
    public String getValor() {
        return valor;
    }

    @Override
    public boolean ehValido(String valor) {
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

    @Override
    public String toString() {
        return "CNPJ{" +
                "valor='" + valor + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPF cnpj = (CPF) o;
        return Objects.equals(valor, cnpj.valor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(valor);
    }

    public static void main(String[] args) {
        CPF cnpj1 = new CPF("00.000.000/0001-01");
        CPF cnpj2 = new CPF("00.000.000/0001-01");

        // cnpj2 = cnpj1;

        System.out.println(cnpj1 == cnpj2);
        System.out.println(cnpj1.hashCode() == cnpj2.hashCode());

        System.out.println(cnpj1.equals(cnpj2) );


    }
}
