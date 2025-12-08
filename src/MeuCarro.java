public class MeuCarro {
    String modelo;
    int ano;
    String cor;

    void exibiFicha () {

        System.out.println("O modelo do carro é: " +modelo);
        System.out.println("O ano do carro é: " +ano);
        System.out.println("A cor do carro é: " +cor);

    }

    int idade (){
        return 2025 - ano;
    }

}
