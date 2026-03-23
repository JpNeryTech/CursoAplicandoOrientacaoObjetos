package consumindoapiselidandocomerros.desafio3;

import java.util.Scanner;

public class ValidarSenha {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Bem vindo(a) ao criador de senha");
        System.out.println("Para criar a sua senha ela precisa ser maior que 8 digitos e ter um caracter especial!");
        System.out.println("--------------------------------------------------------------------------------------");

        try{
            System.out.println("Crie sua senha:");
            String senha = leitura.nextLine();

            if (senha.length() < 8) {
                throw new SenhaCurtaException();
            }
            if (!senha.matches(".*[^a-zA-Z0-9].*")) {
                throw new SenhaNaoPossuiCaracterEspecialException();
            }

                System.out.println("Senha criada com sucesso!");

        } catch (SenhaCurtaException | SenhaNaoPossuiCaracterEspecialException e){
            System.out.println(e.getMessage());
        }

    }
}
