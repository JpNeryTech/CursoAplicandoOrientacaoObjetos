package desafio3;

public class ContaBancaria {
    protected double saldo;

    public double consultarSaldo(){
        System.out.println("O saldo é de: R$ " +saldo);
        return saldo;
    }

    public double depositar(double valorDepositado){

        if(valorDepositado > 0) {
            saldo += valorDepositado;
        } else {
            System.out.println("Você não pode depositar um número negativo");
        }
    return saldo;
    }

    public double sacar(double valorSaque){
        if(valorSaque > saldo) {
            System.out.println("Saldo insuficiente!");
        } else {
            saldo -= valorSaque;
        }
        return saldo;

    }
}
