package ecommerce;

import ecommerce.carrinho.CarrinhoDeCompras;
import ecommerce.item.Item;
import ecommerce.pagamento.GerenciadorDePagamento;
import ecommerce.pagamento.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class ECommerce {
    private GerenciadorDePagamento gerenciadorDePagamento;
    private CarrinhoDeCompras carrinhoDeCompras;
    private List<Observer> observers = new ArrayList<>();
    private String statusCompra;

    public ECommerce(Pagamento metodoDePagamento) {
        this.gerenciadorDePagamento = new GerenciadorDePagamento(metodoDePagamento);
        this.carrinhoDeCompras = new CarrinhoDeCompras();
    }

    public void adicionarAoCarrinho(Item item, int quantidade) {
        carrinhoDeCompras.adicionarItem(item, quantidade);
    }
    public void finalizarCompra() {
        double valorTotal = carrinhoDeCompras.calcularTotal();
        gerenciadorDePagamento.processarPagamento(valorTotal);
        setStatusCompra("CONFIRMADA", "Compra de R$ " + valorTotal + " confirmada"); // Notificar os observadores
    }

    public void cancelarCompra() {
        setStatusCompra("CANCELADA", "Compra de R$ " + carrinhoDeCompras.calcularTotal() + " cancelada"); // Notificar os observadores
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void setStatusCompra(String status, String detalhes) {
        this.statusCompra = status;
        notifyAllObservers(detalhes);
    }

    private void notifyAllObservers(String detalhes) {
        for (Observer observer : observers) {
            observer.update(statusCompra, detalhes);
        }
    }
}
