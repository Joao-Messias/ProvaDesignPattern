package ecommerce.pagamento;

public class PagamentoCripto implements Pagamento{
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado com Cripto");
    }
}
