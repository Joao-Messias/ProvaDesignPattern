package ecommerce.pagamento;

public class PagamentoPix implements Pagamento{
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Pix");
    }
}
