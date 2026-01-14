package desafio3;

public class carro {
    private String modelo;
    private Double precoAnoUm;
    private Double precoAnoDois;
    private Double precoAnoTres;

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPreco(double precoAnoUm, double precoAnoDois, double precoAnoTres){
        this.precoAnoUm = precoAnoUm;
        this.precoAnoDois = precoAnoDois;
        this.precoAnoTres = precoAnoTres;
    }

    public void fichaCarro() {
        System.out.println("Modelo: " +modelo);
        System.out.println("Preco ano 1: " +precoAnoUm);
        System.out.println("Preco ano 2: " +precoAnoDois);
        System.out.println("Preco ano 3: " +precoAnoTres);
    }
    public double calculaMaiorPreco() {
        double maiorPreco = precoAnoUm;
        int ano = 1;

        if(precoAnoDois > maiorPreco) {
            maiorPreco = precoAnoDois;
            ano = 2;
        }
        if(precoAnoTres > maiorPreco) {
            maiorPreco = precoAnoTres;
            ano = 3;
        }
        System.out.println(String.format("O maior preço é: %s equivalente ao ano %d"
        ,maiorPreco
        ,ano

        ));
        return maiorPreco;
    }

    public double CalculamenorPreco(){
        double menorPreco = precoAnoUm;

        if(precoAnoDois < menorPreco){
            menorPreco = precoAnoDois;
        }
        if(precoAnoTres < menorPreco){
            menorPreco = precoAnoTres;
        }
        return menorPreco;
    }

}
