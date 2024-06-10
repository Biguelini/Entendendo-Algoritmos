package org.example;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoPorSelecao {
    public static int buscarIndiceMenorNumeroDaLista(List<Integer> lista) {
        int menorNumero = lista.get(0);
        int menorIndice = 0;

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < menorNumero) {
                menorNumero = lista.get(i);
                menorIndice = i;
            }
        }

        return menorIndice;
    }

    public static void ordenarPorSelecao(List<Integer> lista) {
        List<Integer> listaOrdenada = new ArrayList<>();
        int menorIndice;
        int tamanhoOriginalLista = lista.size();

        for (int i = 0; i < tamanhoOriginalLista; i++) {
            menorIndice = buscarIndiceMenorNumeroDaLista(lista);
            listaOrdenada.add(lista.remove(menorIndice));
        }

        System.out.println("Lista ordenada: ");
        for (int itemListaOrdenada : listaOrdenada) {
            System.out.print(itemListaOrdenada + " ");
        }
    }
}