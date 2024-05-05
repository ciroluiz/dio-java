## Operadores

Operadores são símbolos especiais, que tem um significado próprio para a linguagem e estão associados a determinadas operações.
São utilizados juntos as variáveis e podem ser utilizadas em operações matemáticas, lógicas, de atribuição e de comparação para manipular e operar dados.

## Operadores de atribuição

O operador de atribuição é utilizado para definir o valor inicial ou sobrescrever o conteúdo de uma variável na memória. Em Java, atribuímos um valor à variável através do operador de atribuição representado pelo símbolo de igualdade `=`.

Operadores usados para atribuir valores a variáveis:

|operador|significado|
|:--:|--|
|= |atribuição|
|+= |adição e atribuição|
|-= |subtração e atribuição|
|*= |multiplicação e atribuição|
|/= |divisão e atribuição|
|%= |módulo e atribuição|

## Operadores aritméticos

Os operadores aritméticos, são utilizados para realizar operações matemáticas básicas entre valores numéricos, podendo se tornar ou não uma expressão mais complexa. Os operadores aritméticos são:

|operador|significado|
|:--:|--|
|+ |adição|
|- |subtração|
|* |multiplicação|
|/ |divisão|
|% |módulo, resto da divisão|

> O operador de adição (+), quando utilizado em variáveis do tipo texto(String, char), realizará a “concatenação de textos”.
Em casos em que se misturam operações matemáticas e concatenações de string há resultados diferentes!

## Operadores unários

Operadores unários atuam em um único operando. Eles realizam alguns trabalhos básicos como incrementar, decrementar, inverter valores numéricos e booleanos.

- `+` ➡ Operador unário de valor positivo – números são positivos sem esse operador explicitamente;
- `-` ➡ Operador unário de valor negativo – nega um número ou expressão aritmética;
- `++` ➡ Operador unário de incremento de valor – incrementa o valor em 1 unidade;
- `--` ➡ Operador unário de decremento de valor – decrementa o valor em 1 unidade;
- `!` ➡ Operador unário lógico de negação – nega o valor de uma expressão booleana.

> ❗ Muito cuidado com ordem de precedência dos operadores unários!
[https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/operators.html)
[https://www.dm.ufscar.br/~waldeck/curso/java/part25.html](https://www.dm.ufscar.br/~waldeck/curso/java/part25.html)

## Operador ternário

O operador de condição ternária é uma forma resumida para definir uma
condição, escolher por um dentre dois valores e atribuir o resultado a uma variável. É representado pelos símbolos "?" e ":". O operador ternário é aplicado para qualquer tipo de valor.

    variável = (expressãoBooleana) ? expressãoTrue : expressãoFalse;

É verificada se a expressão booleana ao lado esquerdo do símbolo "?" é verdadeira(true) ou falsa(false).
Caso verdadeira, o resultado gerado é a instrução à esquerda do símbolo ":" e caso falsa, a instrução da direita.

## Operadores relacionais

Os operadores relacionais, avaliam a relação entre duas variáveis ou expressões comparando valores e retornando resultados booleanos (verdadeiro ou falso).

|operador|significado|
|:--:|-------------------------------------------------------------------|
|==  |Quando desejamos verificar se uma variável é IGUAL A outra|
|!=  |Quando desejamos verificar se uma variável é DIFERENTE da outra|
|>   |Quando desejamos verificar se uma variável é MAIOR QUE a outra|
|>=  |Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra|
|<   |Quando desejamos verificar se uma variável é MENOR QUE outra|
|<=  |Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra|

## OBS.: Comparações avançadas

Quando se refere a comparação de conteúdos na linguagem, devemos ter um certo domínio, de como o Java trata o armazenamento destes valores na memória.

> Quando estiver mais familiarizado com a linguagem, é recomendado se aprofundar no conceito de espaço em memória Stack versus Heap.

Devido a um conceito chamado pool de strings (string pool) em Java
e à forma como as strings literais são tratadas, quando você cria uma string literal em Java, como no exemplo "JAVA", o compilador Java verifica se uma string com o mesmo conteúdo já existe no pool de strings.
O pool de strings é uma área especial na memória onde o Java armazena strings únicas para economizar espaço.
Como ambas as strings "JAVA" são literais idênticos, o compilador as coloca no mesmo local no pool de strings.
Portanto, nome1 e nome2 estão referenciando exatamente a mesma localização de memória no pool de strings.
Como o operador == compara as referências de memória, e ambas as variáveis
apontam para a mesma localização, a expressão nome1 == nome2 retorna true.

No entanto, é importante notar que essa situação só ocorre quando você está usando strings literais.
No outro caso ao criar strings usando o construtor da classe String ou se os conteúdos das strings fossem diferentes, a comparação nome1 == nome2 retornaria false.
A razão pela qual o resultado é false, é devido o Java tratar os valores como objetos a partir de agora.
Qual a solução? Quando queremos comparar objetos, usamos o método equals.
Ele compara o conteúdo real de objetos, em vez das referências de memória.

## Operadores lógicos

Os operadores lógicos são usados para realizar operações de lógica booleana em valores booleanos ou expressões booleanas. Eles são frequentemente usados para tomar decisões com base em condições ou para combinar múltiplas condições.
Utilizamos o operador lógico para fazer a união de duas expressões.
É como se estivesse escrito:
"Se Condicao1 E Condicao2 forem verdadeiras, executar código".

Obs.: A duplicidade nos operadores lógicos é um recurso que significa:
se a condição1 atender aos critérios, não será necessário validar a condição2. 

|operador|significado|
|:-----:|------------|
|&& |E lógico|
|\| \| |OU lógico|
|!  |NÃO lógico|

## Referências

[https://glysns.gitbook.io/java-basico/sintaxe/operadores#comparacoes-avancadas](https://glysns.gitbook.io/java-basico/sintaxe/operadores#comparacoes-avancadas)