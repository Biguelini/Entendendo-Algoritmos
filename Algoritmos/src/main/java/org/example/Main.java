package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testarOrdenacaoPorSelecao();
    }

    public static void testarPesquisaBinaria(){
        List<Integer> listaPesquisaBinaria = new ArrayList<Integer>();

        for (int i = 0; i <= 100; i++) {
            listaPesquisaBinaria.add(i);
        }

        PesquisaBinaria.encontrarNumeroNaLista(listaPesquisaBinaria, 0);
    }

    public static void testarOrdenacaoPorSelecao(){
        List<Integer> listaOrdenacao = new ArrayList<Integer>();

        listaOrdenacao.add(16);
        listaOrdenacao.add(12);
        listaOrdenacao.add(5);
        listaOrdenacao.add(3);
        listaOrdenacao.add(15);
        listaOrdenacao.add(6);
        listaOrdenacao.add(2);
        listaOrdenacao.add(10);

        OrdenacaoPorSelecao.ordenarPorSelecao(listaOrdenacao);
    }
}