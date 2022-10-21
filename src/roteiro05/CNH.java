package roteiro05;

import java.io.Closeable;
import java.io.IOException;

public class CNH implements Documento, Closeable {
   private String valor;

   public CNH(String valor) {
       this.valor = valor;
   }

    @Override
    public String getValor() {
        return valor;
    }

    @Override
    public boolean ehValido() {
        return true;
    }

    @Override
    public void close() throws IOException {

    }
}
