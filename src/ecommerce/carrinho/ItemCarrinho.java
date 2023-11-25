package ecommerce.carrinho;

import ecommerce.item.Item;

public class ItemCarrinho {
    private Item item;
    private int quantidade;

    public ItemCarrinho(Item item, int quantidade) {
        this.item = item;
        this.quantidade = quantidade;
    }

    public double getTotalPreco() {
        return item.getPreco() * quantidade;
    }
}