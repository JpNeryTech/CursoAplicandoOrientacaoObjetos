package consumindoapiselidandocomerros.desafio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisaoNumeros {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Bem vindo a Calculadora de Divisões!");

        System.out.println("------------------------------------");

        try {
            System.out.println("Digite o númerador: ");
            int numerador = leitura.nextInt();

            System.out.println("Digite o denominador: ");
            int denominador = leitura.nextInt();

            double divisao = numerador / denominador;

            System.out.println("Resultado da divisão é: " +divisao);

        } catch (ArithmeticException | InputMismatchException e){
            if (e instanceof ArithmeticException){
                System.out.println("Erro: divisor não pode ser igual a 0");
            } else if (e instanceof InputMismatchException) {
                System.out.println("Erro: Valor inválido, insira apenas números");
            }
        }
    }
}
