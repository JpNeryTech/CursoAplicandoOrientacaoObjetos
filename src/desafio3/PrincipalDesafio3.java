package desafio3;

public class PrincipalDesafio3 {
    public static void main(String[] args) {
         carro meuCarro = new carro();

         meuCarro.definirModelo("BMW M3 Competition");
         meuCarro.definirPreco(430000,485000,435000 );
         meuCarro.fichaCarro();
         meuCarro.calculaMaiorPreco();

         Animal animal1 = new Cachorro();

         animal1.emitirSom(Intensidade.ALTO);

         Animal animal2 = new Gato();
         animal2.emitirSom(Intensidade.BAIXO);

         Animal animal3 = new Cachorro();
         animal3.emitirSom(Intensidade.BAIXO);

    }
}
