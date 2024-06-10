package org.example;

public class Regressiva {
    public static void contagemRegressiva(int numeroComeco){
        System.out.println(numeroComeco);
        if(numeroComeco <= 0){
            return;
        }
        contagemRegressiva(numeroComeco-1);
    }
}
