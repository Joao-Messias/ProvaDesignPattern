# Sistema de Comércio Eletrônico - Padrões de Projeto

Este projeto implementa um sistema de comércio eletrônico com foco em padrões de projeto. Abaixo estão os padrões utilizados em cada questão e as justificativas para sua adoção.

## Questão 1: Sistema de Pagamento

### Padrões Utilizados
- **Strategy**: Utilizado para implementar diferentes métodos de pagamento. Permite a fácil troca entre diferentes provedores de pagamento, aumentando a flexibilidade do sistema.
- **Singleton**: Pode ser aplicado ao `GerenciadorDePagamento` para garantir uma única instância, centralizando o gerenciamento dos pagamentos.
- **Polimorfismo(interfaces)**: Utilizado para permitir que diferentes métodos de pagamento sejam tratados de forma uniforme, facilitando a implementação de novos métodos de pagamento.
- **Single Responsibility Principle**: Utilizado para garantir que cada classe tenha uma única responsabilidade. Por exemplo, a classe `Pagamento` é responsável por armazenar os dados de um pagamento, enquanto a classe `GerenciadorDePagamento` é responsável por gerenciar os pagamentos.
## Questão 2: Carrinho de Compras

### Padrões Utilizados
- **Composite**: Utilizado na relação entre `CarrinhoDeCompras` e `ItemCarrinho`. Permite tratar coleções de itens de forma uniforme, facilitando operações como cálculo do total.
- **Singleton**: Aplicável ao `CarrinhoDeCompras` para garantir um único carrinho por sessão de usuário.
- **Single Responsibility Principle**: Utilizado para garantir que cada classe tenha uma única responsabilidade. Por exemplo, a classe `CarrinhoDeCompras` é responsável por armazenar os itens do carrinho, enquanto a classe `ItemCarrinho` é responsável por armazenar os dados de um item. Assim como tem o `GerenciadorDeCarrinho`, que é responsável por gerenciar os carrinhos de compras.
## Questão 3: Agente Logístico

### Padrões Utilizados
- **Observer**: Utilizado para notificar o `AgenteLogistico` sobre mudanças no estado da compra. Garante que o agente logístico seja informado sobre confirmações ou cancelamentos de compras.
- **Single Responsibility Principle**: Utilizado para garantir que cada classe tenha uma única responsabilidade. Por exemplo, a classe `AgenteLogistico` é responsável por gerenciar a logística da compra, enquanto a classe `Compra` é responsável por armazenar os dados da compra.

## Diagrama de Classes do Sistema
