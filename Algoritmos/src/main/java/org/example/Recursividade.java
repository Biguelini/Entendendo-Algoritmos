package org.example;// Arquivo recursividade.java

import java.util.ArrayList;
import java.util.List;

class Item {
    public boolean eAChave;

    public Item() {
        this.eAChave = false;
    }

    public Item(boolean eAChave) {
        this.eAChave = eAChave;
    }
}

class Caixa extends Item {
    private List<Item> itens;

    public Caixa() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        this.itens.add(item);
    }

    public List<Item> getItens() {
        return this.itens;
    }
}


public class Recursividade {
    public static void procurePelaChave(Caixa caixa) {
        for (Item item : caixa.getItens()) {
            if (item instanceof Caixa) {
                procurePelaChave((Caixa) item);
            } else if (item.eAChave) {
                System.out.println("Achei a chave!");
            }
        }
    }
}
