# Projeto Java com Padrões de Projeto

Este é um projeto de exemplo em Java que demonstra o uso dos padrões de projeto Singleton, Strategy e Facade. O projeto é uma implementação simplificada de um sistema de vendas que permite calcular descontos com base em diferentes estratégias.

## Estrutura do Projeto

O projeto está organizado em três pacotes principais:

1. `singleton`: Contém a implementação do padrão Singleton para gerenciamento de configurações do banco de dados.

2. `strategy`: Contém as classes relacionadas ao padrão Strategy, incluindo a interface `DiscountStrategy` e as classes de estratégia como `PercentageDiscount` e `FixedAmountDiscount`.

3. `facade`: Contém a classe `SalesSystem`, que atua como uma fachada para o sistema de vendas, encapsulando a lógica de aplicação.

## Como Executar o Projeto

Para executar o projeto, siga estas etapas:

1. Clone este repositório para sua máquina local:

   ```
   git clone https://github.com/seu-usuario/nome-do-repositorio.git
   ```

2. Abra o projeto em sua IDE Java de escolha (por exemplo, Eclipse, IntelliJ, Visual Studio Code, etc.).

3. Execute o arquivo principal (por exemplo, `Main.java`) ou execute os testes unitários, se houver.

## Exemplos de Uso

Dentro do projeto, você encontrará exemplos de como usar os padrões de projeto implementados. Por exemplo, você pode criar instâncias das classes de estratégia `PercentageDiscount` e `FixedAmountDiscount` e usá-las para calcular descontos em produtos.

```
DiscountStrategy discountStrategy = new PercentageDiscount(10); // 10% de desconto
double discountedPrice = discountStrategy.applyDiscount(originalPrice);
```

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) ou enviar solicitações de pull (pull requests) para melhorias no projeto.

## Licença

Este projeto está sob a licença [MIT](LICENSE.md).

