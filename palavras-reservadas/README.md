# Palavras Reservadas

Palavras reservadas, são identificadores de uma linguagem que já possuem uma finalidade específica, são parte integrante da sintaxe da linguagem e são utilizadas pelo compilador ou interpretador para entender a estrutura e a execução do código, portanto, não podem ser utilizados para nomear variáveis, classes, métodos, atributos ou qualquer outro identificador.

## Características e Importância das Palavras Reservadas

- Reservadas pelo Compilador: São reconhecidas e processadas especialmente pelo compilador para realizar tarefas específicas.
- Não podem ser Redefinidas: Você não pode alterar o significado das palavras reservadas ou usá-las para outros propósitos, como nomes de variáveis.
- Estrutura da Linguagem: Fornecem a base para a construção de programas Java, definindo a sintaxe e o funcionamento de elementos como estruturas de controle de fluxo, declarações de tipos de dados, modificadores de acesso e outros aspectos fundamentais da linguagem.
- Clareza e Precisão: Permitem escrever código claro e preciso, com significado inequívoco para o compilador e outros programadores.
- Evitar Ambiguidade: Impedem a utilização dos mesmos termos para diferentes propósitos, evitando ambiguidade e erros de sintaxe.

## Lista de Palavras Reservadas

Palavras Reservadas em Java e suas Explicações:

1. **Tipos de Dados Primitivos**:
- `byte`: Representa um número inteiro de 8 bits(signed).
- `short`: Representa um número inteiro de 16 bits(signed).
- `int`: Representa um número inteiro de 32 bits (tipo padrão para inteiros - signed).
- `long`: Representa um número inteiro de 64 bits(signed).
- `float`: Representa um número de ponto flutuante de 32 bits (precisão simples - signed).
- `double`: Representa um número de ponto flutuante de 64 bits (precisão dupla, tipo padrão para decimais - signed).
- `boolean`: Representa um valor verdadeiro ou falso (true ou false).
- `char`: Representa um único caractere Unicode(16-bit unsigned).
2. **Controle de Fluxo**:
- `if`: Usado para tomada de decisão, executa um bloco de código se uma condição for verdadeira.
- `else`: Usado com if para executar um bloco de código alternativo se a condição for falsa.
- `switch`: Seleciona um bloco de código para executar com base no valor de uma variável.
- `case`: Usado dentro de um switch para definir os possíveis valores da variável.
- `default`: Usado dentro de um switch para definir o bloco de código a ser executado se nenhum case corresponder.
- `for`: Cria um loop que executa um bloco de código um número específico de vezes.
- `while`: Cria um loop que executa um bloco de código enquanto uma condição for verdadeira.
- `do`: Usado com while para criar um loop que executa um bloco de código pelo menos uma vez.
- `break`: Termina a execução de um loop ou bloco switch.
- `continue`: Pula a execução do código que viria após essa linha e vai para a próxima iteração de um loop.
3. **Modificadores de Acesso**:
- `public`: O elemento pode ser acessado de qualquer lugar.
- `private`: O elemento só pode ser acessado dentro da mesma classe.
- `protected`: O elemento pode ser acessado dentro do mesmo pacote e por subclasses.
4. **Palavras-chave de Classe**:
- `class`: Define uma classe, o modelo para criar objetos.
- `interface`: Define uma interface, um contrato que especifica métodos que uma classe deve implementar.
- `extends`: Usado para indicar que uma classe herda de outra classe.
- `implements`: Usado para indicar que uma classe implementa uma interface.
- `abstract`: Define uma classe abstrata, que não pode ser instanciada, mas serve como base para subclasses. Método que precisa ser implementado(não possui corpo), por uma subclasse não abstrata.
5. **Tratamento de Erros**:
- `try`: Define um bloco de código que tentará ser executado mas que pode causar exceções.
- `catch`: Usado após um bloco try para capturar e lidar com exceções específicas.
- `finally`: Define um bloco de código após um try-catch que sempre é executado, independentemente se uma exceção ocorreu ou não.
- `throw`: Lança uma exceção explicitamente para o método que o chamou.
- `throws`: Usado em uma declaração de método para indicar que ele pode lançar exceções.
6. **Outras Palavras Reservadas**:
- `new`: Cria uma nova instância de um objeto, chamando seu construtor.
- `this`: Refere-se à instância atual de um objeto.
- `super`: Refere-se à superclasse de um objeto.
- `void`: Indica que um método não retorna nenhum valor.
- `return`: Usado para retornar um valor de um método. Também encerra a execução de um método sem executar qualquer código, que venha depois desta linha.
- `static`: Define um membro que pertence à classe em si, não a uma instância específica.
- `final`: Define uma variável que não pode ser modificada após sua inicialização, um método que não pode ser sobrescrito, ou uma classe que não pode ser herdada.
- `enum`: Define um tipo enumerado, um conjunto de constantes nomeadas.
- `instanceof`: Verifica se um objeto é uma instância de uma determinada classe ou interface.
- `package`: Define um pacote para organizar classes relacionadas.
- `import`: Importa classes ou interfaces de outros pacotes para dentro do código.
- `native`: Indica que um método é implementado em código nativo (como C/C++).
- `synchronized`: Usado para controlar o acesso a recursos compartilhados por múltiplas threads. indica que um método só pode ser acessado por uma thread de cada vez. 
- `transient`: Indica que um campo de uma classe não deve ser serializado.
- `volatile`: Indica que uma variável pode ser modificada por diferentes threads.
- `assert`: Usado para verificações em tempo de execução e auxiliar na depuração de código. Testa uma expressão condicional, para verificar uma suposição do programador.
- `strictfp`: Garante que os cálculos de ponto flutuante seguirão as regras de ponto flutuante em todas as expressões.
.

## Palavras reservadas não utilizadas
- `const`: Não utilize para declarar constantes; use **public static final**;
- `goto`: não implementada na linguagem Java, por ser considerada prejudicial

> **Literais reservados:**
No contexto de programação, literais são notações que representam valores fixos em seu código. Eles são diretamente inseridos no código fonte para representar valores constantes. De acordo com a Java Language Specification, `null`(Literais Nulos: O literal null é um valor especial em Java que representa uma referência que não aponta para nenhum objeto), `true` e `false`(Literais Booleanos: Representam valores verdadeiro e falso, respectivamente) são tecnicamente chamados de valores literais, e não keywords. Se você tentar criar algum identificador com estes valores, você também terá um erro de compilação.

## Recursos Úteis

[Documentação Oficial Java 8](https://docs.oracle.com/javase/8/docs/api/)

[Documentação Oficial Java SE Latest Release and Previous Releases](https://docs.oracle.com/en/java/javase/)

## Referência

[https://glysns.gitbook.io/java-basico/sintaxe/palavras-reservadas](https://glysns.gitbook.io/java-basico/sintaxe/palavras-reservadas)