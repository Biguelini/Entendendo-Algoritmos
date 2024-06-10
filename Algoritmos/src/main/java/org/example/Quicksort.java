package org.example;

import java.util.ArrayList;
import java.util.List;

public class Quicksort {
    public static List<Integer> quicksort(List<Integer> array) {
        if (array.size() < 2) {
            return array;
        } else {
            int pivo = array.get(0);
            List<Integer> menores = new ArrayList<>();
            List<Integer> maiores = new ArrayList<>();

            for (int i = 1; i < array.size(); i++) {
                if (array.get(i) <= pivo) {
                    menores.add(array.get(i));
                } else {
                    maiores.add(array.get(i));
                }
            }

            List<Integer> resultado = new ArrayList<>(quicksort(menores));
            resultado.add(pivo);
            resultado.addAll(quicksort(maiores));
            return resultado;
        }
    }
}
