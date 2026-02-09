package br.com.alura.screenmatch.trabalhandocomlistas;

import java.util.ArrayList;

public class Desafio3 {
    public static void main(String[] args) {
        Carro carro1 = new Carro("BMW M3 Competition");
        Carro carro2 = new Carro("Porshe Panamera");
        Carro carro3 = new Carro( "Golf");
        Carro carro4 = new Carro("Nissan GTR");
        String palavra = "a";

        ArrayList<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(carro1);
        listaCarros.add(carro2);
        listaCarros.add(carro3);
        System.out.println(listaCarros);


    }


}
