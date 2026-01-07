package desafio2;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Livro {
    private String titulo;
    private String autor;

    public String getAutor() {
        return autor;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void exibirDetalhes() {

        System.out.println(String.format(
                "Titulo do livro: %s \nAutor: %s"
                ,titulo
                ,autor
        ));

    }

}
