package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercicioDividirParaConquistar();
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

    public static void testarRecursividade(){
        Caixa caixaPrincipal = new Caixa();
        Caixa caixaSecundaria = new Caixa();
        Item chave = new Item(true);
        Item itemQualquer = new Item();

        // Colocar a chave na caixa secundária
        caixaSecundaria.adicionarItem(chave);

        // Colocar a caixa secundária na caixa principal
        caixaPrincipal.adicionarItem(caixaSecundaria);
        caixaPrincipal.adicionarItem(itemQualquer);

        // Começar a busca pela chave na caixa principal
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
}