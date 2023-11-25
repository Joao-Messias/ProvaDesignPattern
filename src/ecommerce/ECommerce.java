package ecommerce;

import ecommerce.carrinho.GerenciadorDeCarrinho;
import ecommerce.item.Item;
import ecommerce.pagamento.GerenciadorDePagamento;
import ecommerce.pagamento.Pagamento;

import java.util.ArrayList;
import java.util.List;

public class ECommerce {
    private GerenciadorDeCarrinho gerenciadorDeCarrinho;
    private GerenciadorDePagamento gerenciadorDePagamento;
    private List<Observer> observers = new ArrayList<>();
    private String statusCompra;

    private static ECommerce instancia;

    public static ECommerce getInstance(Pagamento metodoDePagamento) {
        if (instancia == null) {
            instancia = new ECommerce(metodoDePagamento);
        }
        return instancia;
    }

    private ECommerce(Pagamento metodoDePagamento) {
        this.gerenciadorDePagamento = new GerenciadorDePagamento(metodoDePagamento);
        this.gerenciadorDeCarrinho = new GerenciadorDeCarrinho();
    }

    public void adicionarAoCarrinho(Item item, int quantidade) {
        gerenciadorDeCarrinho.adicionarAoCarrinho(item, quantidade);
    }

    public void finalizarCompra() {
        double valorTotal = gerenciadorDeCarrinho.calcularTotal();
        gerenciadorDePagamento.processarPagamento(valorTotal);
        setStatusCompra("CONFIRMADA", "Compra de R$ " + valorTotal + " confirmada"); // Notificar os observadores
    }

    public void cancelarCompra() {
        double valorTotal = gerenciadorDeCarrinho.calcularTotal();
        setStatusCompra("CANCELADA", "Compra de R$ " + valorTotal + " cancelada"); // Notificar os observadores
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    private void setStatusCompra(String status, String detalhes) {
        this.statusCompra = status;
        notifyAllObservers(detalhes);
    }

    public String getStatusCompra() {
        return this.statusCompra;
    }

    private void notifyAllObservers(String detalhes) {
        for (Observer observer : observers) {
            observer.update(statusCompra, detalhes);
        }
    }
}
