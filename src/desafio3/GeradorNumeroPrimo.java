package desafio3;

public class GeradorNumeroPrimo extends NumerosPrimos{
    public int gerarPrimo(int ultimoNumeroPrimo) {
        int proximoNumero = ultimoNumeroPrimo + 1;

        while (!verificarPrimalidade(proximoNumero)){
            proximoNumero ++;
        }
        return proximoNumero;
    }
}
