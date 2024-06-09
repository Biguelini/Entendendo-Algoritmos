package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testarPesquisaBinaria();
    }

    public static void testarPesquisaBinaria(){
        List<Integer> listaPesquisaBinaria = new ArrayList<Integer>();

        for (int i = 0; i <= 100; i++) {
            listaPesquisaBinaria.add(i);
        }

        PesquisaBinaria.encontrarNumeroNaLista(listaPesquisaBinaria, 0);
    }
}