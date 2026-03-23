package consumindoapiselidandocomerros.desafio3;

public class SenhaNaoPossuiCaracterEspecialException extends RuntimeException {
    public SenhaNaoPossuiCaracterEspecialException() {
        super("Senha precisa ter um caracter especial!");
    }
}
