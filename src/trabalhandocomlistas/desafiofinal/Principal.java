package trabalhandocomlistas.desafiofinal;

import java.text.CollationElementIterator;
import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o limite do cartão: ");
        double limite = scanner.nextDouble();

        CartaoCredito cartao = new CartaoCredito(limite);

        int opcao;

        do {

            scanner.nextLine(); // limpar buffer

            System.out.print("Descrição da compra: ");
            String descricao = scanner.nextLine();

            System.out.print("Valor da compra: ");
            double valor = scanner.nextDouble();

            Compra compra = new Compra(descricao, valor);

            if (cartao.novaCompra(compra)) {
                System.out.println("Limite disponível: " + cartao.getSaldo());
            } else {
                System.out.println("Limite insuficiente!");
                break; // aqui vai sair do loop se não tiver saldo
            }

            System.out.println("Deseja fazer outra compra? (1 - Sim / 0 - Não)");
            opcao = scanner.nextInt();

        } while (opcao == 1);

        System.out.println("Programa finalizado.");

        System.out.println("\n*****************************");
        System.out.println("COMPRAS REALIZADAS COM SUCESSO: \n");

        Collections.sort(cartao.getCompras());

        for(Compra compra: cartao.getCompras()){
            System.out.println(compra);
        }

        System.out.println("\n Saldo restante: R$" +cartao.getSaldo());

    }
}