package br.com.alura.screenmatch.trabalhandocomlistas;

public class Cachorro extends Animal {

    public void Latir(){
        System.out.println("AUAUAU");
    }

    @Override
    public String toString() {
        return "Sou um cachorro";
    }
}
