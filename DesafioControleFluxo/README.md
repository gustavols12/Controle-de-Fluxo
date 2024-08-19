# Contador de Parâmetros

Este projeto é uma aplicação simples que realiza operações com dois parâmetros fornecidos pelo usuário. Ele verifica se o primeiro parâmetro é maior que o segundo e, se não for, calcula e exibe um loop com base na diferença entre os parâmetros.

## Funcionalidade

1. **Entrada de Parâmetros**: O usuário insere dois parâmetros inteiros.
2. **Validação**: O programa verifica se o primeiro parâmetro é maior que o segundo.
   - Se o primeiro parâmetro for maior, uma exceção personalizada é lançada.
   - Se o primeiro parâmetro não for maior, o programa calcula a diferença e executa um loop, exibindo mensagens de iteração.

## Requisitos

- Java 8 ou superior
- IDE ou terminal para compilar e executar o código

## Estrutura do Projeto

- `contador.java`: Classe principal que contém o método `main` e a lógica para ler parâmetros e chamar o método `contar`.
- `ParametrosInvalidosException.java`: Classe de exceção personalizada usada para lidar com erros específicos de parâmetros inválidos.

## Uso

1. **Compile o Código**:
   No terminal, navegue até o diretório do projeto e compile os arquivos Java:

   ```sh
   javac contador.java ParametrosInvalidosException.java
   ```

2. **Execute o Programa**:
   Após a compilação, execute a classe principal:

   ```sh
   java contador
   ```

3. **Siga as Instruções**:
   O programa pedirá que você insira dois parâmetros inteiros. Após inserir os valores, ele processará e exibirá o resultado ou uma mensagem de erro se o primeiro parâmetro for maior que o segundo.

## Exemplo de Execução

```
Digite o primeiro parâmetro
2
Digite o segundo parâmetro
5
Realizando o looping pela 1ª vez
Realizando o looping pela 2ª vez
Realizando o looping pela 3ª vez
Realizando o looping pela 4ª vez
```

Se o primeiro parâmetro for maior que o segundo, o programa exibirá:

```
Erro: O primeiro parâmetro não pode ser maior que o segundo.
```

## Contribuições

Se desejar contribuir com melhorias ou correções, fique à vontade para abrir uma pull request ou enviar um problema para revisão.

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).

---

Adapte o README conforme necessário para corresponder exatamente às suas necessidades e ao contexto do projeto.
