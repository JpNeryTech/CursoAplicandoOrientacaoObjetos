package desafio3;

public class ContaCorrente extends ContaBancaria {
    private double tarifaMensal = 20;

    public double cobrarTarifaMensal() {
       if(saldo >= tarifaMensal) {
           saldo -= tarifaMensal;
           System.out.println("Tarifa mensal de: R$ " + tarifaMensal + " cobrada com sucesso!");
       } else {
           System.out.println("Você não tem saldo na conta corrente, devido a isso não será cobrado nenhuma taxa!");
       }
        return saldo;
    }
}
