package org.example;

import java.util.List;

public class DividirParaConquistar {
    public static int somaItemsArray(List<Integer> lista){
        if (lista.isEmpty()) {
            return 0;
        }

        if (lista.size() == 1) {
            return lista.get(0);
        }

        int meio = lista.size() / 2;
        List<Integer> sublistaEsquerda = lista.subList(0, meio);
        List<Integer> sublistaDireita = lista.subList(meio, lista.size());

        int somaEsquerda = somaItemsArray(sublistaEsquerda);
        int somaDireita = somaItemsArray(sublistaDireita);

        return somaEsquerda + somaDireita;
    }

    public static int encontrarMaximo(List<Integer> lista, int inicio, int fim) {
        if (inicio == fim) {
            return lista.get(inicio);
        }

        int meio = (inicio + fim) / 2;

        int maxEsquerda = encontrarMaximo(lista, inicio, meio);
        int maxDireita = encontrarMaximo(lista, meio + 1, fim);

        return Math.max(maxEsquerda, maxDireita);
    }

    public static int contarItens(List<Integer> lista, int inicio, int fim) {
        if (inicio == fim) {
            return 1;
        }

        int meio = (inicio + fim) / 2;

        int contagemEsquerda = contarItens(lista, inicio, meio);
        int contagemDireita = contarItens(lista, meio + 1, fim);

        return contagemEsquerda + contagemDireita;
    }
}
