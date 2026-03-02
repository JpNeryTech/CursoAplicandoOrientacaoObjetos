package trabalhandocomlistas.desafio2;

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
