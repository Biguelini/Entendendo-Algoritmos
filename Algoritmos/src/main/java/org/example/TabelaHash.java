package org.example;

import java.util.HashMap;

public class TabelaHash {
    public static void criarHash(){
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Um", 1);
        mapa.put("Dois", 2);
        mapa.put("Três", 3);

        System.out.println("Elementos da HashMap: " + mapa);

        int valor = mapa.get("Dois");
        System.out.println("Valor associado à chave 'Dois': " + valor);

        mapa.remove("Um");
        System.out.println("Elementos da HashMap após remoção da chave 'Um': " + mapa);

        if (mapa.containsKey("Três")) {
            System.out.println("A chave 'Três' existe na HashMap.");
        } else {
            System.out.println("A chave 'Três' não existe na HashMap.");
        }

        for (String chave : mapa.keySet()) {
            System.out.println("Chave: " + chave + ", Valor: " + mapa.get(chave));
        }
    }
}
