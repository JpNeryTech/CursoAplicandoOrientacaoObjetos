package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefinho",2017);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Shazam",2020);
        outroFilme.avalia(8);
        var filmeDoJoao = new Filme("DogVille",2003);
        meuFilme.avalia(7.5);
        Serie lost = new Serie("lost", 2000);

        Filme f1 = filmeDoJoao;

        ArrayList<Titulo> lista = new ArrayList<>();
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


    }
}
