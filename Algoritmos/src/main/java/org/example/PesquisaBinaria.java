package org.example;

import java.util.List;

public class PesquisaBinaria {
    public static void encontrarNumeroNaLista(List<Integer> lista, int itemASerEncontrado){
        int numeroMaisBaixoPossivel = 0;
        int numeroMaisAltoPossivel = lista.size() - 1;
        int numeroDoMeio;
        int chute;

        while (numeroMaisBaixoPossivel <= numeroMaisAltoPossivel){
            numeroDoMeio = (numeroMaisAltoPossivel + numeroMaisBaixoPossivel) / 2;
            chute = lista.get(numeroDoMeio);

            if(chute == itemASerEncontrado){
                System.out.println("O número a ser encontrado é: " + chute);
                return;
            } else if (chute > itemASerEncontrado) {
                numeroMaisAltoPossivel = numeroDoMeio - 1;
            } else {
                numeroMaisBaixoPossivel = numeroDoMeio + 1;
            }
        }

        System.out.println("Não foi possível encontrar o número, pois ele não pertence a lista!");
    }
}
