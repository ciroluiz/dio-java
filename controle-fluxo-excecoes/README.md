# Controle de Fluxo

Controle de fluxo refere-se à ordem em que as instruções são executadas em um programa. Como a maioria das linguagens de programação, Java oferece várias estruturas para controlar o fluxo de execução, permitindo que você crie programas sofisticados que podem tomar decisões, repetir ações e responder a diferentes condições.

## Estruturas condicionais

Estruturas condicionais são blocos de código que permitem que um programa tome decisões e execute diferentes ações quando determinadas condições são ou não satisfeitas. Elas avaliam uma expressão booleana (verdadeiro ou falso) e executam diferentes blocos de código dependendo do resultado. Elas são essenciais para criar programas que podem responder a diferentes situações e tomar decisões inteligentes. Uma Estrutura Condicional pode ser Simples ou Composta.

### Condicionais Simples

Quando ocorre uma validação de execução de fluxo somente quando a condição for positiva, consideramos como uma estrutura Simples.
```java
    if (condicao) {
        // Código a ser executado se a condição for verdadeira
    }
```
> *if: Executa um bloco de código se uma condição for verdadeira.*

### Condicionais Compostas

Algumas vezes, o nosso programa deverá seguir mais de uma jornada de execução condicionado a uma regra de negócio, este cenário é demoninado Estrutura Condicional Composta.
```java
    if (condicao) {
        // Código a ser executado se a condição for verdadeira
    } else {
        // Código a ser executado se a condição for falsa
    }
```
> *if-else: Executa um bloco de código se uma condição for verdadeira e outro bloco se for falsa.*

### Condicionais encadeadas

Em um controle de fluxo condicional, nem sempre nos limitamos ao se (if) e senão (else). Poderemos ter uma terceira, quarta e ou inúmeras condições.
```java
    if (condicao1) {
        // Código a ser executado se a condição1 for verdadeira
    } else if (condicao2) {
        // Código a ser executado se a condição2 for verdadeira
    } else {
        // Código a ser executado se nenhuma das condições anteriores for verdadeira
    }
```
> *Você pode encadear múltiplas condições usando else if. Isso permite testar múltiplas condições em sequência.*

### Condição ternária

É possível abreviar um algoritmo condicional refatorando com o conceito de operador ternário. O operador condicional ternário em Java é uma forma concisa de escrever uma estrutura *if-else* em uma única linha.
```java
    variavel = (condicao) ? retorno_se_verdadeiro : retorno_se_falso;
    String mensagem = (idade >= 18) ? "Você já tem idade para dirigir." : "Você ainda não tem idade para dirigir.";
```
> Vantagens do operador ternário ➡ *Concisão*: Torna o código mais curto e legível em casos simples de if-else.
*Expressividade*: Pode tornar a intenção do código mais clara em alguns casos.
> <p>Limitações do operador ternário ➡ <em>Complexidade</em>: Não é adequado para lógicas condicionais complexas com múltiplos if-else. <em>Legibilidade</em>: Em casos complexos, o operador ternário pode prejudicar a legibilidade do código.</p>

### Switch Case

O switch-case é uma estrutura poderosa e legível para lidar com múltiplas comparações de igualdade em Java.
Seleciona um bloco de código para executar com base no valor de uma expressão.
A estrutura switch é uma alternativa para *if-else if-else* quando você precisa testar um valor contra múltiplas opções constantes.
```java
    switch (expressao) {
        case valor1:
            // Código a ser executado se a expressão for igual a valor1
            break;
        case valor2:
            // Código a ser executado se a expressão for igual a valor2
            break;
        default:
            // Código a ser executado se nenhum dos casos anteriores corresponder
    }
```
> **break**: Instrução que termina a execução do switch após a execução do bloco de um case(Os valores dos cases devem ser constantes e do mesmo tipo da expressao). É essencial para evitar a execução dos cases subsequentes (efeito "fall-through" - Sem o break, o código continuará executando os cases subsequentes até encontrar um break ou o final do switch).
> <p> <b>default</b>: Bloco opcional, mas útil para lidar com casos não previstos, que será executado se nenhum dos cases corresponder ao valor da expressao.</p>

## Estruturas de repetição(Looping)

Estruturas de repetição, também conhecidas como laços de iteração ou loops, são blocos de código que permitem executar um conjunto de instruções repetidamente até que uma condição seja satisfeita. Em Java, existem três tipos principais de estruturas de repetição:

1. #### FOR
    O comando *for*(na tradução literal para a língua portuguesa “para”) permite que uma variável contadora seja testada e incrementada a cada iteração, sendo essas informações definidas na chamada do comando. O comando for recebe como entrada uma variável contadora, a condição para continuar a execução e o valor de incrementação.
    ```java
        for (bloco de inicialização; expressão booleana de validação; bloco de atualização)
        {
            // comando que será executado até que a expressão de validação torne-se falsa 
        }
    ```
    - Inicialização: Define uma variável de controle e a inicializa com um valor. Executa apenas uma vez, no início do loop.
    - Condição/validação: Uma expressão booleana que é verificada antes de cada iteração. Se a condição for verdadeira, o loop continua, se for falsa, o loop termina.
    - Atualização: Modifica a variável de controle após cada iteração, geralmente incrementando ou decrementando seu valor.

    #### 1.1 FOR-EACH
    O uso do *for-each*(enhanced for loop) está fortemente relacionado com um cenário onde há um array ou coleção. Em Java, o foreach é uma estrutura de controle que permite iterar sobre os elementos de uma coleção ou array.
    ```java
        for (Tipo item : colecao) {
            // Código a executar para cada elemento
        }
    ```
    Onde:

    - Tipo é o tipo de dados dos elementos na coleção.
    - item é a variável que representa o elemento atual da coleção ou array durante cada iteração do loop.
    - colecao é a coleção ou o array que está sendo iterado.

2. #### WHILE
    O laço *while*(na tradução literal para a língua portuguesa “enquanto”) determina que enquanto uma condição for válida, o bloco de código será executado.
    O laço while testa a condição antes de executar o código, logo, caso a condição seja inválida no primeiro teste, o bloco nem será executado.
    Ele é ideal para quando você quer repetir o loop enquanto uma condição específica for verdadeira, sem saber necessariamente quantas iterações serão necessárias.
    ```java
        while (condição) {
            // Código a ser repetido até que a expressão de validação(condição) torne-se falsa
        }
    ```
    - Condição: Uma expressão booleana que é verificada antes de cada iteração. O loop continua enquanto a condição for verdadeira.

3. #### DO-WHILE
    O laço *do-while*(na tradução literal para a língua portuguesa “faça…enquanto”), assim como o laço while, considera que enquanto uma determinada condição for válida o bloco de código será executado mas com a diferença crucial de que o bloco de código é executado pelo menos uma vez, mesmo que a condição seja inicialmente falsa.
    ```java
        do {
            // Código a ser repetido até que a expressão de validação(condição) torne-se falsa
        } while (condição);
    ```
    - Condição: Similar ao while, é uma expressão booleana que é verificada após cada iteração. O loop continua enquanto a condição for verdadeira.

## Estruturas excepcionais - Exceções

Em programação, exceções são eventos que interrompem o fluxo normal de execução de um programa. Elas são frequentemente usadas para lidar com erros, condições inesperadas ou situações excepcionais, ou seja, erros de codificação feitos pelo programador, erros devido a entrada inválida ou outros imprevistos.

Quando ocorre um erro, o Java normalmente para e gera uma mensagem de erro. O termo técnico para isso é: Java lançará uma exceção.

De forma interpretativa, em Java, um erro é algo irreparável e a aplicação trava ou é encerrada drásticamente. Já exceções são um fluxo inesperado da nossa aplicação: querer dividir um valor por zero, querer abrir um arquivo que não existe, abrir uma conexão de banco com usuário ou senha inválidos. Todos estes cenários e os demais, não são erros mas sim fluxos não previstos pela aplicação.

É ai que entra mais uma responsabilidade do desenvolvedor, prever situações iguais a estas e realizar o que denominamos de Tratamento de Exceções.

**Exemplos comuns de exceções:**

- Divisão por zero: Um erro aritmético que ocorre quando você tenta dividir um número por zero.
- Acesso a um índice inválido em um array: Tentar acessar um elemento em um índice que não existe no array.
- Tentativa de abrir um arquivo inexistente: Tentar acessar um arquivo que não existe no sistema de arquivos.

|NOME|CAUSA|
|------------------------------|-------------------------------------------------------------|
|java.lang.NullPointerException|Quando tentamos obter alguma informação de uma variável nula.|
|java.lang.ArithmeticException |Quando tentamos dividir um valor por zero.|
|java.sql.SQLException         |Quando existe algum erro, relacionado a interação com banco de dados.|
|java.io.FileNotFoundException |Quando tentamos ler ou escrever, em um arquivo que não existe.|

**Tratamento de exceções:**

Java usa as palavras-chave try, catch e finally para lidar com exceções.
- `try`: O bloco try contém o código que pode potencialmente lançar uma exceção.
- `catch`: O bloco catch "captura" a exceção lançada no bloco try. Você pode ter vários blocos catch para capturar diferentes tipos de exceções.
- `finally`: O bloco finally contém código que é sempre executado, independentemente de uma exceção ter sido lançada ou capturada. Geralmente usado para liberar recursos, como fechar arquivos ou conexões de rede.

```java
    try {
        // Código que pode lançar uma exceção
    } catch (TipoDaExcecao e) {
        // Tratamento da exceção
        e.printStackTrace(); // Imprime o stack trace de uma exceção(mostra a sequência de chamadas de métodos que levaram à exceção)
    } finally {
        // Código que sempre será executado
    }
```
**Hierarquia das exceções:**

A hierarquia de exceções em Java é uma estrutura de classes que representa diferentes tipos de erros e condições excepcionais que podem ocorrer durante a execução de um programa. 

```
java.lang.Throwable
    ├── java.lang.Error
    │   ├── AssertionError
    │   ├── OutOfMemoryError
    │   └── StackOverflowError
    └── java.lang.Exception
        ├── java.lang.RuntimeException
        │   ├── ArithmeticException
        │   ├── NullPointerException
        │   ├── IndexOutOfBoundsException
        │   └── IllegalArgumentException
        ├── java.io.IOException
        │   ├── FileNotFoundException
        │   └── EOFException
        ├── java.sql.SQLException
        └── java.lang.ClassNotFoundException
```

**Throwable**:
A classe base para todas as exceções e erros em Java.
Representa um evento que interrompe o fluxo normal do programa.
Possui métodos como getMessage(), printStackTrace(), getStackTrace() e getCause().

**Error**:
Representa erros sérios que geralmente não podem ser recuperados pelo programa.
Exemplos: OutOfMemoryError, StackOverflowError, NoClassDefFoundError.
Esses erros geralmente indicam um problema fundamental com o ambiente de execução ou a máquina virtual.

**Exception**:
Representa eventos que podem ser tratados pelo programa e podem resultar em um comportamento alternativo.
É dividida em duas categorias principais:

*Checked Exception*: Exceções Verificadas - são verificadas em tempo de compilação e devem ser tratadas usando try-catch ou lançadas para o método de nível superior, declarando-as na assinatura do método usando *throws*.
Exemplos: IOException, SQLException, ClassNotFoundException.

*Unchecked Exception*: Exceções Não Verificadas - não são verificadas pelo compilador e podem ser ignoradas(são subtipos de RuntimeException e geralmente indicam erros lógicos no programa), ou seja, você não é obrigado a lidar com essas exceções explicitamente, mas pode fazê-lo se desejar.
Exemplos: ArithmeticException, NullPointerException, ArrayIndexOutOfBoundsException.

Você também pode lançar exceções manualmente usando a palavra-chave *throw*. 
Isso é útil para indicar erros específicos em seu código.
A instrução throw permite que você crie um erro personalizado.
Ela é usada junto com um tipo de exceção como: ArithmeticException, FileNotFoundException, ArrayIndexOutOfBoundsException, SecurityException, etc:

```java
    if (idade < 0) {
        throw new IllegalArgumentException("A idade não pode ser negativa.");
    }
```

**Exceções Personalizadas**:
Você pode criar suas próprias exceções personalizadas estendendo Exception ou RuntimeException, dependendo se a exceção deve ser verificada ou não. Elas são utilizadas para casos de erro específicos em sua aplicação, melhorando a clareza e a semântica dos erros.

Exceção Verificada Personalizada
```java
    public class MinhaExcecaoVerificada extends Exception {
        public MinhaExcecaoVerificada(String mensagem) {
            super(mensagem);
        }
    }

    public void metodoComExcecaoVerificada() throws MinhaExcecaoVerificada {
        // Código que pode lançar MinhaExcecaoVerificada
        throw new MinhaExcecaoVerificada("Erro específico verificado");
    }
```

Exceção Não Verificada Personalizada
```java
    public class MinhaExcecaoNaoVerificada extends RuntimeException {
        public MinhaExcecaoNaoVerificada(String mensagem) {
            super(mensagem);
        }
    }

    public void metodoComExcecaoNaoVerificada() {
        // Código que pode lançar MinhaExcecaoNaoVerificada
        throw new MinhaExcecaoNaoVerificada("Erro específico não verificado");
    }
```

> [11 Erros que desenvolvedores Java cometem quando usam Exceptions](https://www.oracle.com/br/technical-resources/article/java/erros-java-exceptions.html)

## Benefícios do tratamento de exceções:

As estruturas excepcionais são uma parte fundamental da programação em Java. Elas ajudam a criar programas mais robustos, confiáveis e fáceis de manter. Dominar o uso de exceções é essencial para qualquer desenvolvedor Java.

- Separação de preocupações: Permite separar a lógica normal do programa do código de tratamento de erros, o que permite que o código seja mais fácil de ler e entender.
- Tratamento de erros robusto: Permite lidar com erros de forma estruturada, facilitando a identificação e correção de erros, além de evitar que o programa termine abruptamente.
- Propagação de erros: Permite que erros sejam propagados pela pilha de chamadas, permitindo que sejam tratados no nível apropriado.

## Estruturas de Controle de Fluxo Adicionais

- `break`: Termina a execução de um laço for, while ou do-while.
- `continue`: Pula para a próxima iteração de um laço for, while ou do-while.
- `return`: Termina a execução de um método e retorna um valor (opcional).

## As estruturas de controle de fluxo permitem que você:

- Tome decisões: Execute diferentes blocos de código com base em condições.
- Repita ações: Execute um bloco de código várias vezes, com ou sem um contador.
- Crie programas elaborados: Combine diferentes estruturas de controle de fluxo e aninhamento(loops podem ser aninhados uns dentro dos outros para criar lógicas mais abrangentes) para criar programas sofisticados.

## Dicas para usar Estruturas de Controle de Fluxo

- Use indentação: Indente seu código para torná-lo mais legível e fácil de entender.
- Escolha a estrutura correta: Use a estrutura de controle de fluxo mais adequada para o seu problema.
- Evite loops infinitos: Certifique-se de que seus loops tenham uma condição de saída válida.
- Teste seu código: Teste seu código exaustivamente para garantir que ele se comporte como esperado.

## Referências

[https://glysns.gitbook.io/java-basico/controle-de-fluxo/conceito](https://glysns.gitbook.io/java-basico/controle-de-fluxo/conceito)

[https://glysns.gitbook.io/java-basico/controle-de-fluxo/estruturas-condicionais](https://glysns.gitbook.io/java-basico/controle-de-fluxo/estruturas-condicionais)

[https://glysns.gitbook.io/java-basico/controle-de-fluxo/estruturas-excepcionais](https://glysns.gitbook.io/java-basico/controle-de-fluxo/estruturas-excepcionais)

[https://www.w3schools.com/java/java_try_catch.asp](https://www.w3schools.com/java/java_try_catch.asp)