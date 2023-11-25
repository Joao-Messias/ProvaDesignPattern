package ecommerce.carrinho;

import ecommerce.item.Item;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarItem(Item item, int quantidade) {
        itens.add(new ItemCarrinho(item, quantidade));
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemCarrinho itemCarrinho : itens) {
            total += itemCarrinho.getTotalPreco();
        }
        return total;
    }
}