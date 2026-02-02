package br.com.alura.screenmatch.desafio4;

public class LivroFisico implements Calculavel{
    @Override
    public double calcularPrecoFinal(double preco) {
        System.out.println("Parabéns você optou por comprar o Livro Fisico, devido a isso cobramos a taxa de fabricação.");
        double precoFabricacao = preco * 0.22;
        double precoFinal = preco + precoFabricacao;
        return precoFinal;
    }
}
