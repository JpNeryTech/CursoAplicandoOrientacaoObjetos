package br.com.alura.screenmatch.desafio4;

public class ConverterDolarParaReal implements ConversaoFinanceira{

    private double cotacaoDolar;

    public ConverterDolarParaReal(double cotacaoDolar){
        this.cotacaoDolar = cotacaoDolar;
    }

    @Override
    public double converter(double valor) {
        return valor * cotacaoDolar;
    }
}
