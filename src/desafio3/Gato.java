package desafio3;

public class Gato extends Animal{

    @Override
    public void emitirSom(Intensidade intensidade) {
        if(intensidade == Intensidade.ALTO) {
            System.out.println("MIAU MIAU MIAU MIAU MIAU MIAU MIAU MIAU MIAU MIAU MIAU MIAU MIAU MIAU MIAU");
        } else {
            System.out.println("MIAU MIAU");
        }
    }
}
