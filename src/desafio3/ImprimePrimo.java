package desafio3;

public class ImprimePrimo extends NumerosPrimos {
    public void imprimirPrimo(int numero){
        if(verificarPrimalidade(numero)){
            System.out.println(numero + " É primo!");
        } else {
            System.out.println(numero + " Não é primo!");
        }
    }

}
