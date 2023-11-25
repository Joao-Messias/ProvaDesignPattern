import ecommerce.AgenteLogistico;
import ecommerce.ECommerce;
import ecommerce.item.Produto;
import ecommerce.item.Servico;
import ecommerce.pagamento.Pagamento;
import ecommerce.pagamento.PagamentoCripto;
import ecommerce.pagamento.PagamentoPix;

public class Main {
    public static void main(String[] args) {
        // criação do método de pagamento (Padrão Strategy e Injeção de Dependência)
        Pagamento pagamentoPix = new PagamentoPix();
        Pagamento pagamentoCripto = new PagamentoCripto();
        // instanciação do Ecommerce com o método de pagamento criado (Padrão Singleton) podendo usar tanto o pagamentoPix quanto o pagamentoCripto
        ECommerce loja = ECommerce.getInstance(pagamentoCripto);

        // Adicionando o Agente Logístico como um observador (Padrão Observer)
        AgenteLogistico agenteLogistico = new AgenteLogistico("João");
        loja.addObserver(agenteLogistico);

        // adição de itens ao carrinho
        Produto camiseta = new Produto("Camiseta", 50.0);  // Preço por item
        Servico entrega = new Servico("Entrega", 10.0);    // Preço do serviço

        loja.adicionarAoCarrinho(camiseta, 2); // Adicionando 2 camisetas
        loja.adicionarAoCarrinho(entrega, 1);  // Adicionando o serviço de entrega
        // finalização da compra
        loja.finalizarCompra();

        // Para testar o cancelamento, você pode descomentar a linha abaixo
//        loja.cancelarCompra();

        // status da compra
        System.out.println("Status da compra: " + loja.getStatusCompra());
    }
}