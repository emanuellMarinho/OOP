## Documentação Lógica - Cálculo do Salário Líquido do Funcionário

Este programa em Java permite calcular o salário líquido de um funcionário com base nos dados de salário bruto e imposto fornecidos pelo usuário. Além disso, o programa oferece a opção de aumentar o salário bruto do funcionário por uma porcentagem especificada.

O programa é composto por duas classes: `Program` e `Employee`.

### Classe `Program`

A classe `Program` contém o método `main`, que é o ponto de entrada do programa. Ela é responsável por interagir com o usuário, ler os dados do funcionário e chamar os métodos apropriados da classe `Employee` para calcular o salário líquido e atualizar o salário com o aumento.

#### Métodos

- `main(String[] args)`: Este método é o ponto de entrada do programa. Ele inicia a interação com o usuário, lê os dados do funcionário e chama os métodos apropriados para calcular o salário líquido e atualizar o salário com o aumento.

### Classe `Employee`

A classe `Employee` representa um funcionário e contém os atributos `name`, `grossSalary` e `tax`, que armazenam o nome, salário bruto e imposto do funcionário, respectivamente.

#### Métodos

- `getName(): String`: Retorna o nome do funcionário.
- `setName(name: String): void`: Define o nome do funcionário.
- `getGrossSalary(): double`: Retorna o salário bruto do funcionário.
- `setGrossSalary(grossSalary: double): void`: Define o salário bruto do funcionário.
- `getTax(): double`: Retorna o valor do imposto do funcionário.
- `setTax(tax: double): void`: Define o valor do imposto do funcionário.
- `netSalary(): double`: Calcula e retorna o salário líquido do funcionário com base no salário bruto e imposto.
- `increaseSalary(percentage: double): void`: Aumenta o salário bruto do funcionário em uma porcentagem especificada.
- `toString(): String`: Retorna uma representação em string dos dados do funcionário, incluindo o nome e o salário líquido formatado.

## Observações

Certifique-se de fornecer os valores corretos e seguir as instruções apresentadas no console para obter os resultados esperados. O programa calculará o salário líquido e exibirá os dados atualizados do funcionário após o aumento do salário bruto.  