# Sistema de Comércio Eletrônico - Padrões de Projeto

Este projeto implementa um sistema de comércio eletrônico com foco em padrões de projeto. Abaixo estão os padrões utilizados em cada questão e as justificativas para sua adoção.

## Questão 1: Sistema de Pagamento

### Padrões Utilizados
- **Strategy**: Utilizado para implementar diferentes métodos de pagamento. Permite a fácil troca entre diferentes provedores de pagamento, aumentando a flexibilidade do sistema.
- **Singleton**: Pode ser aplicado ao `GerenciadorDePagamento` para garantir uma única instância, centralizando o gerenciamento dos pagamentos.
- **Polimorfismo(interfaces)**: Utilizado para permitir que diferentes métodos de pagamento sejam tratados de forma uniforme, facilitando a implementação de novos métodos de pagamento.
## Questão 2: Carrinho de Compras

### Padrões Utilizados
- **Composite**: Utilizado na relação entre `CarrinhoDeCompras` e `ItemCarrinho`. Permite tratar coleções de itens de forma uniforme, facilitando operações como cálculo do total.
- **Singleton**: Aplicável ao `CarrinhoDeCompras` para garantir um único carrinho por sessão de usuário.
## Questão 3: Agente Logístico

### Padrões Utilizados
- **Observer**: Utilizado para notificar o `AgenteLogistico` sobre mudanças no estado da compra. Garante que o agente logístico seja informado sobre confirmações ou cancelamentos de compras.

## Melhorias Sugeridas
- Implementar o padrão **Singleton** nas classes `GerenciadorDePagamento` e `CarrinhoDeCompras`.
- Verificar a aplicação dos princípios do **SOLID**, especialmente o Princípio da Responsabilidade Única, para garantir que cada classe tenha uma única responsabilidade.
- Considerar o uso de **Factory Method** ou **Abstract Factory** para a criação de objetos, como itens ou métodos de pagamento, para aumentar a flexibilidade e facilitar a manutenção.

## Visualização do Status da Compra
Para visualizar o status da compra após a finalização ou cancelamento, sugere-se adicionar um método `getStatus` na classe `ECommerce` que retorna o status atual da compra.
