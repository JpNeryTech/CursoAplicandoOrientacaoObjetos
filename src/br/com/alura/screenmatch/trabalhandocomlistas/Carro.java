package br.com.alura.screenmatch.trabalhandocomlistas;

public class Carro {
    private String modeloCarro;

    public String getModeloCarro() {
        return modeloCarro;
    }

    Carro(String modeloCarro){
        this.modeloCarro = modeloCarro;
    }

    @Override
    public String toString() {
        return " Carros: ( " +this.getModeloCarro()+ " ) " ;
    }
}
