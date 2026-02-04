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







    }
}
