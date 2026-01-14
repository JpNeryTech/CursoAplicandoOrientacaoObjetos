package desafio3;

public class PrincipalDesafio3 {
    public static void main(String[] args) {
         carro meuCarro = new carro();

         meuCarro.definirModelo("BMW M3 Competition");
         meuCarro.definirPreco(430000,485000,435000 );
         meuCarro.fichaCarro();
         meuCarro.calculaMaiorPreco();

    }
}
