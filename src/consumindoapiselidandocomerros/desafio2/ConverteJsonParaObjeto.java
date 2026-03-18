package consumindoapiselidandocomerros.desafio2;

import com.google.gson.Gson;

public class ConverteJsonParaObjeto {

    public static void main(String[] args) {
        String json = "{\"Nome\":\"João\",\"idade\":19,\"cidade\":\"Ceilândia\"}";

        Gson gson = new Gson();
        Pessoa pessoa = gson.fromJson(json, Pessoa.class);

        System.out.println("Objeto Pessoa: " +pessoa);
    }
}
