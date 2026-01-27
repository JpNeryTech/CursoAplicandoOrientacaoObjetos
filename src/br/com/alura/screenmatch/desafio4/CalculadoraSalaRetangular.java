package br.com.alura.screenmatch.desafio4;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    @Override
    public double calcularArea(double base, double altura) {
        return base * altura;
    }

    @Override
    public double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }
}
