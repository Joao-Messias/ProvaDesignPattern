package ecommerce.pagamento;

public class PagamentoPicPay implements Pagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com PicPay");
    }
}