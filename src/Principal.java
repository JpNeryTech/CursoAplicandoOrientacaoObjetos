import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefinho");
        meuFilme.setAnoDeLancamento(2017);
        meuFilme.setDuracaoEmMinutos(90);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaAvaliacoes());

        /*
        Sem os Getters e Setters ficaria assim:
        meuFilme.somaDasAvaliacoes = 10;
        meuFilme.totalDeAvaliacoes = 1;
        */

        // EXERCICIOS DESAFIO!!!

        //1
        Pessoa pessoa = new Pessoa();
        pessoa.falar();

        //2
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.CalcularDobro(10);
        System.out.println(resultado);

        //3
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Pirata de Esquina";
        minhaMusica.artista = "Tribo da Periferia";
        minhaMusica.anoLancamento = 2018;

        minhaMusica.exibirFicha();

        minhaMusica.Avaliar(5.0);
        minhaMusica.Avaliar(4.7);
        minhaMusica.Avaliar(4.3);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("A média das avaliações é: " + mediaAvaliacoes);

        //4
        MeuCarro meuCarro = new MeuCarro();

        meuCarro.modelo = "Bmw M3 Competition";
        meuCarro.cor = "VERDE";
        meuCarro.ano = 2023;

        meuCarro.exibiFicha();

        System.out.println("Idade do carro é: " +meuCarro.idade() + " anos");

        //5

        Aluno aluno = new Aluno();

        aluno.nome = "João Pedro";
        aluno.idade = 19;

        aluno.exibirInformacoes();
    }

}

