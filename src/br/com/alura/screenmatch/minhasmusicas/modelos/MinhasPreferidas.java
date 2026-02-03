package br.com.alura.screenmatch.minhasmusicas.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {
        if(audio.getClassificacao() >= 9) {
            System.out.println(audio.getTitulo()+ " é considerado sucesso absoluto e preferido por todos!");
        } else {
            System.out.println( audio.getTitulo() + " é uma execelente escolha todo mundo está curtindo");
        }
    }

}
