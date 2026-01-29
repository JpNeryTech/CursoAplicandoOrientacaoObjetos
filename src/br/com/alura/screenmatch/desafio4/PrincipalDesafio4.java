package br.com.alura.screenmatch.desafio4;

public class PrincipalDesafio4 {
    public static void main(String[] args) {
        ConversaoFinanceira conversor = new ConverterDolarParaReal(5.21);
        System.out.println("Valor em reais: R$ " +conversor.converter(100));

        ConversaoFinanceira conversorEuro = new ConverterEuroParaReal(6.24);
        System.out.println("Valor em reais: R$ " +conversorEuro.converter(100));

        CalculoGeometrico calculo = new CalculadoraSalaRetangular();
        System.out.println("A área do retangulo é: " +calculo.calcularArea(10, 5));

        CalculoGeometrico calculoPerimetro = new CalculadoraSalaRetangular();
        System.out.println("A perimetro do retangulo é: " +calculoPerimetro.calcularPerimetro(14.2, 6.20));

        TabuadaMultiplicacao tabuadaMultiplicacao = new TabuadaMultiplicacao();
        tabuadaMultiplicacao.mostrarTabuada(3);

        ConverterTemperatura converterTemperatura = new ConverterTemperatura();
        System.out.println(converterTemperatura.FahrenheitParacelsius(77)+ "°C");

        ConverterTemperatura converterTemperatura1 = new ConverterTemperatura();
        System.out.println(converterTemperatura1.celsiusParaFahrenheit(25) + "°F");

    }
}
