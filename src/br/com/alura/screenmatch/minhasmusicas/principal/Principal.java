package br.com.alura.screenmatch.minhasmusicas.principal;

import br.com.alura.screenmatch.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.screenmatch.minhasmusicas.modelos.Musica;
import br.com.alura.screenmatch.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Carta para Deus");
        minhaMusica.setCantor("Kayblack");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();

        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Ricardo ACF");
        meuPodcast.setHost("Mitico");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 4500; i++) {
            meuPodcast.curte();
        }

        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(meuPodcast);
        minhasPreferidas.inclui(minhaMusica);

    }

}
