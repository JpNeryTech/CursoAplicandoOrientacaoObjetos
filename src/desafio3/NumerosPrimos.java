package desafio3;

import java.util.ArrayList;
import java.util.List;

public class NumerosPrimos {

    public boolean verificarPrimalidade(int numero){

        if(numero <= 1 ){
            return false;
        }

        for(int i = 2; i < numero; i++){
            if(numero % i == 0){
                return false;
            }
        }
        return true;
    }

    public List<Integer> listarPrimos(int limite){

        List<Integer> primos = new ArrayList<>();

        for (int numero = 2; numero <= limite; numero++){

                if(verificarPrimalidade(numero)) {
                    primos.add(numero);
                }
            }

        return primos;
    }
}

