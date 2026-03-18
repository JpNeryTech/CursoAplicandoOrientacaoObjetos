package consumindoapiselidandocomerros.desafio2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ConverteJsonParaObjetoFlexivel {

    public static void main(String[] args) {
        String jsonPessoa = "{\"nome\":\"João\",\"idade\":19,\"cidade\":\"Ceilândia\"}";

        Gson gson = new GsonBuilder().setLenient().create();
        Pessoa pessoa = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + pessoa);
    }
}
