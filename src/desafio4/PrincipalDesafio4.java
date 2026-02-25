package desafio4;

import br.com.alura.screenmatch.principal.PrincipalComListas;

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

        ArrayList<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(new Titulo("O Pequeno Príncipe"));
        listaTitulos.add(new Titulo("Entendendo Algoritimos"));
        listaTitulos.add(new Titulo("Código Limpo"));
        System.out.println("Lista de titulos não ordenada: ");
        System.out.println(listaTitulos);

        Collections.sort(listaTitulos);
        for(Titulo titulo : listaTitulos){
            System.out.println(titulo.getNome());
        }

        List<String> arrayListCarros = new ArrayList<>();
        arrayListCarros.add("BMW M3 Competiton");
        arrayListCarros.add("Porcshe Gt3 Rs");
        arrayListCarros.add("Corvette");
        System.out.println("Está é uma Array list" +arrayListCarros);

        List<String> linkedListTimes = new LinkedList<>();
        linkedListTimes.add("Palmeiras");
        linkedListTimes.add("Italia");
        linkedListTimes.add("Real Madrid");
        System.out.println("Está é uma Linked List" +linkedListTimes);

        List<String> listaCoresPolimorfolica;
        listaCoresPolimorfolica = new ArrayList<>();
        listaCoresPolimorfolica.add("Verde");
        listaCoresPolimorfolica.add("Branco");
        listaCoresPolimorfolica.add("Vermelho");
        System.out.println("ARRAY LIST: " +listaCoresPolimorfolica);

        listaCoresPolimorfolica = new ArrayList<>();
        listaCoresPolimorfolica.add("Azul");
        listaCoresPolimorfolica.add("Amarelo");
        System.out.println("LINKED LIST: " +listaCoresPolimorfolica);

    }
}
