package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        testarQuickSort();
    }

    public static void testarPesquisaBinaria(){
        List<Integer> listaPesquisaBinaria = new ArrayList<Integer>();

        for (int i = 0; i <= 100; i++) {
            listaPesquisaBinaria.add(i);
        }

        PesquisaBinaria.encontrarNumeroNaLista(listaPesquisaBinaria, 0);
    }

    public static void testarOrdenacaoPorSelecao(){
        List<Integer> listaOrdenacao = Arrays.asList(1, 5, 3, 9, 2, 8, 4, 7, 6, 15, 25, 19, 16);

        OrdenacaoPorSelecao.ordenarPorSelecao(listaOrdenacao);
    }

    public static void testarRecursividade(){
        Caixa caixaPrincipal = new Caixa();
        Caixa caixaSecundaria = new Caixa();
        Item chave = new Item(true);
        Item itemQualquer = new Item();

        caixaSecundaria.adicionarItem(chave);

        caixaPrincipal.adicionarItem(caixaSecundaria);
        caixaPrincipal.adicionarItem(itemQualquer);

        Recursividade.procurePelaChave(caixaPrincipal);
    }

    public static void contagemRegressiva(){
        Regressiva.contagemRegressiva(10);
    }

    public static void testarDividirParaConquistar(){

    }

    public static void exercicioDividirParaConquistar(){
        List<Integer> listaExemplo = Arrays.asList(1, 5, 3, 9, 2, 8, 4, 7, 6, 15, 25, 19, 16);

        System.out.println(DividirParaConquistar.somaItemsArray(listaExemplo));

        int maximo = DividirParaConquistar.encontrarMaximo(listaExemplo, 0, listaExemplo.size() - 1);
        System.out.println("O valor mais alto na lista é: " + maximo);

        int totalItens = DividirParaConquistar.contarItens(listaExemplo, 0, listaExemplo.size() - 1);
        System.out.println("O número total de itens na lista é: " + totalItens);
    }

    public static void testarQuickSort(){
        List<Integer> listaExemplo = Arrays.asList(10, 1, 3, 50, 23, 365, 12, 5, 4, 9, 8, 11);

        List<Integer> sortedArray = Quicksort.quicksort(listaExemplo);
        System.out.println(sortedArray);
    }
}