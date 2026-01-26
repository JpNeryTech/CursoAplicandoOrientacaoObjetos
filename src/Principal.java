import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import desafio2.*;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefinho");
        meuFilme.setAnoDeLancamento(2017);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " +meuFilme.getDuracaoEmMinutos());

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

        System.out.println("Idade do carro é: " + meuCarro.idade() + " anos");

        //5

        Aluno aluno = new Aluno();

        aluno.nome = "João Pedro";
        aluno.idade = 19;

        aluno.exibirInformacoes();


        // EXERCICIOS DESAFIO 2!!!

        System.out.println("EXERCICIOS DESAFIO 2");

        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(456);
        conta.setSaldo(1000000);
        conta.titular = "João Nery";

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Titular da conta: " + conta.titular);

        conta.setSaldo(1500000);
        System.out.println("Novo saldo: " + conta.getSaldo());


        IdadePessoa novaPessoa1 = new IdadePessoa();

        novaPessoa1.setNome("João Pedro");
        novaPessoa1.setIdade(19);

        System.out.println(novaPessoa1.getNome() + " tem " + novaPessoa1.getIdade() + " anos.");
        novaPessoa1.verificarIdade();

        IdadePessoa novaPessoa2 = new IdadePessoa();

        novaPessoa2.setNome("Davi Mesquita");
        novaPessoa2.setIdade(1);

        System.out.println(novaPessoa2.getNome() + " tem " + novaPessoa2.getIdade() + " anos.");
        novaPessoa2.verificarIdade();

        Produto produto1 = new Produto();

        produto1.setNome("Leite");
        produto1.setPreco(4.59);

        System.out.println(String.format(
                "Você comprou %s! Com muito choro ganhou um desconto de 5%%",produto1.getNome()));
        produto1.aplicarDesconto();


        AlunoDesafio2 aluno1 = new AlunoDesafio2();

        aluno1.setAluno("João Pedro Pereira Nery");
        aluno1.setNota(10);
        aluno1.setNota2(8);
        aluno1.setNota3(9.5);

        System.out.println(String.format(
                "O aluno %s tirou %.1f na P1, %.1f na P2 e %.1f na P3."
                ,aluno1.getAluno()
                ,aluno1.getNota()
                ,aluno1.getNota2()
                ,aluno1.getNota3()
        ));
        aluno1.calcularMedia();

        Livro novoLivro = new Livro();

        novoLivro.setAutor("Raphael Montes");
        novoLivro.setTitulo("Dias Perfeitos");

        System.out.println("Parabéns pela escolha, abaixo você encontra todos os detalhes do livro!");
        novoLivro.exibirDetalhes();

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Shazam");
        outroFilme.setAnoDeLancamento(2020);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadoraTempo = new CalculadoraDeTempo();
        calculadoraTempo.inclui(meuFilme);
        calculadoraTempo.inclui(outroFilme);
        calculadoraTempo.inclui(lost);
        System.out.println(calculadoraTempo.getTempoTotal());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(450);
        filtroRecomendacao.filtra(episodio);


    }
}


