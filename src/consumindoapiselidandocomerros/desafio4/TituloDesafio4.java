package consumindoapiselidandocomerros.desafio4;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TituloDesafio4 {
    public static void main(String[] args) {
        TituloDesafio4 titulo = new TituloDesafio4();

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        List<String> titulos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o primeiro filme: ");
        String filme1 = scanner.nextLine();
        titulos.add(filme1);

        System.out.println("Escolha o segundo filme: ");
        String filme2 = scanner.nextLine();
        titulos.add(filme2);

        String json = gson.toJson(titulos);

        System.out.println("\n Json gerado");
        System.out.println(json);

        try{
            FileWriter escrita = new FileWriter("filmes.txt");
            escrita.write(gson.toJson(titulos));
            escrita.close();
        } catch (Exception e) {
            System.out.println("Não foi possivel salvar o arquivo" + e.getMessage());
        }


    }
}
