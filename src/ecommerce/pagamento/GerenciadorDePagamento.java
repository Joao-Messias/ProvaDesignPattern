package ecommerce.pagamento;

public class GerenciadorDePagamento {
    private static GerenciadorDePagamento instancia;
    private Pagamento metodoDePagamento;

    public GerenciadorDePagamento(Pagamento metodoDePagamento) {
        this.metodoDePagamento = metodoDePagamento;
    }

    public static GerenciadorDePagamento getInstance(Pagamento metodoDePagamento) {
        if (instancia == null) {
            instancia = new GerenciadorDePagamento(metodoDePagamento);
        }
        return instancia;
    }

    public void processarPagamento(double valor) {
        metodoDePagamento.processarPagamento(valor);
    }
}
