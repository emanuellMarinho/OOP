# Documentação do código

Este é um código Java simples que calcula a média final de um aluno com base em três notas e determina se ele foi aprovado ou reprovado.

## Instruções de uso

1. Certifique-se de ter o JDK (Java Development Kit) instalado em sua máquina.
2. Abra o arquivo `Program.java` localizado no pacote `application`.
3. Execute o programa.

## Descrição do código

### Pacote `application`

- `Program.java`: Este é o arquivo principal que contém o método `main` para executar o programa.

### Pacote `entities`

- `Aluno.java`: Este arquivo contém a definição da classe `Aluno`, que representa um aluno e suas propriedades.

## Funcionamento do programa

1. O programa começa configurando o local padrão para os formatos numéricos.
2. Em seguida, é criado um objeto `Scanner` para receber a entrada do usuário.
3. Um objeto `Aluno` é instanciado.
4. O programa solicita o nome do aluno ao usuário e armazena-o no objeto `aluno`.
5. O programa solicita as três notas do aluno ao usuário e as armazena nas variáveis `grade1`, `grade2` e `grade3` do objeto `aluno`.
6. O programa calcula a média final do aluno chamando o método `finalGrade()` da classe `Aluno`.
7. O programa imprime a média final do aluno com duas casas decimais.
8. Se a média final do aluno for inferior a 60, o programa exibe "FAILED" e a quantidade de pontos que faltam para o aluno atingir a média mínima (60).
9. Caso contrário, o programa exibe "PASS".
10. O programa fecha o objeto `Scanner` e termina a execução.

## Observações

- Certifique-se de fornecer as notas do aluno no formato correto, separadas por espaços.
- O programa assume que todas as entradas fornecidas são válidas e não realiza validações adicionais.
- Este código pode ser modificado e expandido para atender a outros requisitos específicos.