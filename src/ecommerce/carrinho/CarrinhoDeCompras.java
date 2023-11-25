package ecommerce.carrinho;

import ecommerce.item.Item;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private static CarrinhoDeCompras instancia;
    private List<ItemCarrinho> itens = new ArrayList<>();

    public CarrinhoDeCompras() {}

    public static CarrinhoDeCompras getInstance() {
        if (instancia == null) {
            instancia = new CarrinhoDeCompras();
        }
        return instancia;
    }

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
