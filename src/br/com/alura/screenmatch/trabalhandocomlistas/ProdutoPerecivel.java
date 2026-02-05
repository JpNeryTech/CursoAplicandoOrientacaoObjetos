package br.com.alura.screenmatch.trabalhandocomlistas;
import java.time.LocalDate;

public class ProdutoPerecivel extends Produto{
    private LocalDate dataDeValidade;

    public LocalDate getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(LocalDate dataDeValidade) {
        if (dataDeValidade.isBefore(LocalDate.now())) {
            throw new IllegalArgumentException("Produto Vencido");
        }
        this.dataDeValidade = dataDeValidade;

    }

    public ProdutoPerecivel(String nome, double preco, int quantidade, LocalDate dataDeValidade) {
        super(nome, preco, quantidade);
        this.setDataDeValidade(dataDeValidade);
    }

    @Override
    public String toString() {
        return "( Produto: " + this.getNome() +
                ",Quantidade: " +this.getQuantidade()+
                ", Preço: R$" +this.getPreco()+
                " Data de Validade: " +dataDeValidade+ " )";
    }
}
