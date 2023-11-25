package ecommerce.carrinho;

import ecommerce.carrinho.CarrinhoDeCompras;
import ecommerce.item.Item;

public class GerenciadorDeCarrinho {
    private CarrinhoDeCompras carrinhoDeCompras;

    public GerenciadorDeCarrinho() {
        this.carrinhoDeCompras = new CarrinhoDeCompras();
    }

    public void adicionarAoCarrinho(Item item, int quantidade) {
        carrinhoDeCompras.adicionarItem(item, quantidade);
    }

    public double calcularTotal() {
        return carrinhoDeCompras.calcularTotal();
    }
}
