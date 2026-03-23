package consumindoapiselidandocomerros.desafio3;

public class SenhaCurtaException extends RuntimeException {
    public SenhaCurtaException() {
        super("Sua senha precisa ser maior ou igual a 8 digitos!");
    }
}
