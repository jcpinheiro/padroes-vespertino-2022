package roteiro05;

import java.io.Closeable;

public class CnhTeste {

    public static void main(String[] args) {
        CNH cnh = new CNH("243234324");
        //cnh.close();

        // PROCESSAMENTOS
        // ...
        Documento doc = cnh;

        doc.ehValido();
    }
}
