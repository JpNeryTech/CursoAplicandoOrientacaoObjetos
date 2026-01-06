package desafio2;

public class Produto {
    private String produto;
    private double preco;

    public String getNome() {
        return produto;
    }

    public void setNome(String nome) {
        this.produto = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void aplicarDesconto() {

        double desconto = preco * 0.95;

        System.out.println(String.format(
                "%s custa R$%.2f com o desconto ficou: R$%.2f"
                ,produto
                ,preco
                ,desconto));

    }

}
