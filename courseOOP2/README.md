# README - Programa de Gerenciamento de Produtos

Este programa permite gerenciar informações básicas de um produto, como nome, preço e quantidade em estoque. Ele foi desenvolvido em Java e consiste em duas classes: `Program` e `Product`.

## Funcionalidade

Ao executar o programa, será solicitado ao usuário que forneça os dados do produto. São eles:

1. **Nome**: O nome do produto.
2. **Preço**: O preço unitário do produto.
3. **Quantidade em Estoque**: A quantidade disponível em estoque do produto.

Após inserir esses dados, o programa exibirá na tela as informações fornecidas, incluindo o nome, o preço e a quantidade do produto.

## Classe `Product`

A classe `Product` é responsável por representar um produto e possui os seguintes atributos:

- `name` (String): O nome do produto.
- `price` (double): O preço unitário do produto.
- `quantity` (int): A quantidade em estoque do produto.

Além disso, a classe `Product` possui os seguintes métodos:

- `totalValueInStock()`: Retorna o valor total do estoque do produto, calculado multiplicando o preço pela quantidade em estoque.
- `addProducts(int quantity)`: Adiciona a quantidade especificada ao estoque do produto.
- `removeProducts(int quantity)`: Remove a quantidade especificada do estoque do produto.

## Como utilizar

1. Compile e execute o programa em um ambiente Java.
2. Siga as instruções exibidas na tela para inserir os dados do produto.
3. Após fornecer os dados, as informações do produto serão exibidas na tela.

Certifique-se de ter a versão adequada do Java instalada em seu sistema antes de executar o programa.