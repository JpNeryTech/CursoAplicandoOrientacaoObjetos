package consumindoapiselidandocomerros.desafio4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Veiculo {
    private String modelo;
    private String cor;
    private int ano;
    private double preco;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo();

        veiculo.setAno(2023);
        veiculo.setCor("Roxo");
        veiculo.setModelo("BMW M4 Competition");
        veiculo.setPreco(450000);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String jsonVeiculo = gson.toJson(veiculo);

        System.out.println("Objeto Veiculo serializado para JSON:");
        System.out.println(jsonVeiculo);
    }
}
