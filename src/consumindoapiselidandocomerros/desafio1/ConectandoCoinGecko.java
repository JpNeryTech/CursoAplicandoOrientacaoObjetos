package consumindoapiselidandocomerros.desafio1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConectandoCoinGecko {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome da Cripto Coin que deseja saber o preço (exemplo: bitcoin): ");
        var busca = leitura.nextLine();

        var endereco = "https://api.coingecko.com/api/v3/simple/price?vs_currencies=usd&ids=" + busca + "&x_cg_demo_api_key=CG-rbiqynbRcZiNEPcWix8PwoLq" ;

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());
    }
}
