package br.com.alura.screenmatch.trabalhandocomlistas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("João Pedro");
        pessoa1.setIdade(19);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Anna Beatriz");
        pessoa2.setIdade(19);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.setNome("Amilson nery");
        pessoa3.setIdade(64);

        ArrayList<Pessoa> listaPessoas = new ArrayList<>();
        listaPessoas.add(pessoa1);
        listaPessoas.add(pessoa2);
        listaPessoas.add(pessoa3);

        System.out.println("Tamanho lista: " +listaPessoas.size());
        System.out.println("Primeira pessoa da lista: " +listaPessoas.get(0).getNome());
        System.out.println(listaPessoas);

        System.out.println("DESAFIO 2 --------------------------------------------");


        ArrayList<Produto> listaProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Macarrão", 10.89, 2);
        Produto produto2 = new Produto("Toddy", 12, 1 );
        Produto produto3 = new Produto("Biscoito Globo", 5.99, 5);
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        System.out.println("Tamanho lista: " +listaProdutos.size());
        System.out.println("Segundo Produto da lista: " +listaProdutos.get(1).getNome());
        System.out.println("Segundo Produto da lista completo: " +listaProdutos.get(2));
        System.out.println(listaProdutos);

        ArrayList<ProdutoPerecivel> listaProdudoPerecivel = new ArrayList<>();
        ProdutoPerecivel produtoPerecivel1 = new ProdutoPerecivel("Arroz", 12.99, 3, LocalDate.of(2026, 2, 26));
        listaProdudoPerecivel.add(produtoPerecivel1);
        System.out.println("Lista produto perecivel: " +listaProdudoPerecivel.get(0));


        ArrayList<String> listaStrings = new ArrayList<>();
        listaStrings.add("BMW M3 Competiton");
        listaStrings.add("Porsche GT3 Rs");
        listaStrings.add("Nissan Gtr");

        for(String elemento : listaStrings){
            System.out.println(elemento);
        }

        Animal animal = new Cachorro();

        if(animal instanceof Cachorro){
            Cachorro cachorro = (Cachorro) animal;
        } else {
            System.out.println("O objeto não é um cachorro!");
        }

        ArrayList<Produto> listaProduto = new ArrayList<>();
        listaProduto.add(produto1);
        listaProduto.add(produto2);
        listaProduto.add(produto3);
        System.out.println(listaProduto);

        double somaPreco = 0;
        for(Produto produto : listaProduto){
            somaPreco += produto.getPreco();

        }
        double precoMedio = somaPreco / listaProduto.size();
        System.out.printf("Preço medio dos produtos: R$ %.2f%n" ,precoMedio);

        Circulo circulo = new Circulo(5);
        System.out.println("Area do Circulo: " +circulo.calcularArea());

        Quadrado quadrado = new Quadrado(6);
        System.out.println("Area do Quadrado: " +quadrado.calcularArea());

        ArrayList<Forma> listaFormas = new ArrayList<>();
        listaFormas.add(circulo);
        listaFormas.add(quadrado);
        for (Forma formas : listaFormas){
            System.out.println("Área " +formas.calcularArea());
        }


        ContaBancaria conta1 = new ContaBancaria(123, 560000);
        ContaBancaria conta2 = new ContaBancaria(456, 1000000);
        ContaBancaria conta3 = new ContaBancaria(789, 895000);

        ArrayList<ContaBancaria> listaContas = new ArrayList<>();

        listaContas.add(conta1);
        listaContas.add(conta2);
        listaContas.add(conta3);

        ContaBancaria  contaMaiorSaldo = listaContas.get(0);
        for (ContaBancaria contaBancaria : listaContas){
             if(contaBancaria.getSaldo() > contaMaiorSaldo.getSaldo()){
                 contaMaiorSaldo = contaBancaria;
             }
        }

        System.out.printf("Conta com o maior saldo: " +contaMaiorSaldo.getNumeroDaConta()+ "%n Saldo: " +contaMaiorSaldo.getSaldo());

    }
}
