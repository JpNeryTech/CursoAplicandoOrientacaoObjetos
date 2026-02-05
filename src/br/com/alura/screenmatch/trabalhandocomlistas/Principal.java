package br.com.alura.screenmatch.trabalhandocomlistas;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João Pedro");
        pessoa1.setIdade(19);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Anna Beatriz");
        pessoa2.setIdade(19);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Amilson nery");
        pessoa3.setIdade(64);

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        System.out.println("Tamanho lista: " +listaPessoas.size());
        System.out.println("Primeira pessoa da lista: " +listaPessoas.get(0).getNome());
        System.out.println(listaPessoas);

        System.out.println("DESAFIO 2 --------------------------------------------");


        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Macarrão", 10.89, 2);
        Produto produto2 = new Produto("Toddy", 12, 1 );
        Produto produto3 = new Produto("Biscoito Globo", 5.99, 5);
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        System.out.println("Tamanho lista: " +listaProdutos.size());
        System.out.println("Segundo Produto da lista: " +listaProdutos.get(1).getNome());
        System.out.println("Segundo Produto da lista completo: " +listaProdutos.get(2));
        System.out.println(listaProdutos);






    }
}
