package ecommerce.pagamento;

public class PagamentoCartao implements Pagamento{
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Cartão");
    }
}
