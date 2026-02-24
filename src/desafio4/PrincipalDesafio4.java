package desafio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class PrincipalDesafio4 {
    public static void main(String[] args) {

        ArrayList<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(10);
        listaInteiros.add(7);
        listaInteiros.add(98);
        listaInteiros.add(4);
        System.out.println("Lista de inteiros desordenada: ");
        System.out.println(listaInteiros);
        Collections.sort(listaInteiros);
        System.out.println("Lista de inteiros ordenada: ");
        System.out.println(listaInteiros);

        Titulo titulo1 = new Titulo("O Pequeno Príncipe");
        Titulo titulo2 = new Titulo("Entendendo Algoritimos");
        Titulo titulo3 = new Titulo("Código Limpo");

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        System.out.println("Lista de titulos não ordenada: ");
        System.out.println(listaTitulos);

        Collections.sort(listaTitulos);
        System.out.println("Lista de titulos ordenada: ");
        System.out.println(listaTitulos);

        List<String> listaCarros = new ArrayList<>();
        listaCarros.add("BMW M3 Competiton");
        listaCarros.add("Porcshe Gt3 Rs");
        listaCarros.add("Corvette");
        System.out.println(listaCarros);

        LinkedList<String> listaTimes = new LinkedList<>();
        listaTimes.add("Palmeiras");
        listaTimes.add("Italia");
        listaTimes.add("Real Madrid");
        System.out.println(listaTimes);


    }
}
