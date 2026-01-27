package br.com.alura.screenmatch.desafio4;

public class ConverterEuroParaReal implements ConversaoFinanceira{
    private double cotacaoEuro;

    public ConverterEuroParaReal(double cotacaoEuro){
        this.cotacaoEuro = cotacaoEuro;
    }

    @Override
    public double converter(double valor) {
        return valor * cotacaoEuro;
    }
}
