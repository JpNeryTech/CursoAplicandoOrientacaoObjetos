public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;

    void exibirFicha(){
        System.out.println("O Título da música é: " +titulo);
        System.out.println("O nome do artista é: " +artista);
        System.out.println("Foi lançada em: " +anoLancamento);

    }

    void Avaliar(double avaliacao) {
        somaDasAvaliacoes += avaliacao;
        numAvaliacoes ++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / numAvaliacoes;
    }


}
