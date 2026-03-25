package consumindoapiselidandocomerros.desafio4;

import java.io.FileWriter;
import java.io.IOException;

public class CriaArquivoTxt {
    public static void main(String[] args) {
        String texto = "Conteúdo a ser gravado no arquivo.";

        try {
            FileWriter escrita = new FileWriter("aqruivo.txt");
            escrita.write(texto);
            escrita.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
