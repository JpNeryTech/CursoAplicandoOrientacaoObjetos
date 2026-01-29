package br.com.alura.screenmatch.desafio4;

public class ConverterTemperatura implements ConversorTemperatura {


    @Override
    public int celsiusParaFahrenheit(int temperatura) {
    return (int) (temperatura * 1.8) + 32;
    }

    @Override
    public int FahrenheitParacelsius(int temperatura) {
        return (int) ((temperatura - 32) / 1.8);
    }
}
