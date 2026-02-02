package br.com.alura.screenmatch.desafio4;

public class Compra implements Supermercado{
    private String produto;
    private double preco;

    public Compra(String produto, double preco){
        this.produto = produto;
        this.preco = preco;
    }

    @Override
    public void precoProdutoAtacado(int quantidade) {
        double total = preco * quantidade;
        double descontoAtacado = total * 0.15;
        double precoFinal = total - descontoAtacado;
        if(quantidade >= 5){
            System.out.println("COMPRA NO ATACADO!");
            System.out.printf("Valor total: R$%.2f%n", precoFinal);
        }else {
            System.out.println("ERRO, ATACADO SOMENTE ACIMA DE 5 PRODUTOS!");
        }
    }

    @Override
    public void precoProdutoVarejo(int quantidade) {
        double precoFinal = preco * quantidade;
        System.out.println(("COMPRA NO VAREJO!"));
        System.out.printf("Valor total: R$%.2f%n", precoFinal);
    }
}
