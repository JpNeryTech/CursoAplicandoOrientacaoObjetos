package consumindoapiselidandocomerros.desafio2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConverteJsonParaObjetoLivro {

    public static void main(String[] args) {
        String jsonLivro = "{\"titulo\":\"Codigo Limpo\",\"autor\":\"Robert C. Martin\",\"editora\":\"Alta Books\",\"corCapa\":\"vermelha\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Livro livro = gson.fromJson(jsonLivro, Livro.class);

        System.out.println("Objeto Livro: " +livro);
    }
}
