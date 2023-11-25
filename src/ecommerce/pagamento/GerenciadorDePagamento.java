package ecommerce.pagamento;

public class GerenciadorDePagamento {
    private Pagamento metodoDePagamento;

    public GerenciadorDePagamento(Pagamento metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public void processarPagamento(double valor) {
        metodoDePagamento.processarPagamento(valor);
    }
}