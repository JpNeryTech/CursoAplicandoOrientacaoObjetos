package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefinho",2017);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Shazam",2020);
        outroFilme.avalia(8);
        var filmeDoJoao = new Filme("DogVille",2003);
        meuFilme.avalia(7.5);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = filmeDoJoao;

        List<Titulo> lista = new LinkedList<>();

        lista.add(filmeDoJoao);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao()> 2 ){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaArtista = new ArrayList<>();
        buscaArtista.add("Neymar");
        buscaArtista.add("Travis Scott");
        buscaArtista.add("Matue");
        System.out.println(buscaArtista);

        Collections.sort(buscaArtista);
        System.out.println("Depois da Ordenação");
        System.out.println(buscaArtista);

        System.out.println("Lista de titulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);

        System.out.println("Lista ordenado por ano de lançamento:");
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);
    }
}
