package desafio3;

public class Cachorro extends Animal{

    @Override
    public void emitirSom(Intensidade intensidade) {
        if(intensidade == Intensidade.ALTO){
            System.out.println("AU AU AU AU AU AU AU AU AU AU AU AU AU AU AU AU AU AU AU AU AU AU AU AU");
        } else{
            System.out.println("au au");
        }
    }
}
