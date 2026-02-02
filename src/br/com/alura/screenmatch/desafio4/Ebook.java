package br.com.alura.screenmatch.desafio4;

public class Ebook implements Calculavel{

    @Override
    public double calcularPrecoFinal(double preco) {
        System.out.println("Parabéns você comprou um Ebook, devido a isso você ganhou um desconto de 20%!");
        double desconto = preco * 0.2;
        double precoFinal = preco - desconto;
        return precoFinal;
    }
}
