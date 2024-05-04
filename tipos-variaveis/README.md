# Tipos e Variáveis em Java

Variável, é uma identificação de um espaço em memória e possuem tipos. Um tipo de dado, define um conjunto de valores e um conjunto de operações que as variáveis podem armazenar e realizar respectivamente. Uma variável é usada na construção de programas e permite que você manipule e acesse dados durante a execução dos mesmos.
Em Java, os tipos de dados são categorizados em dois grupos principais: tipos primitivos e tipos de referência.

## Tipos Primitivos

São os tipos mais básicos da linguagem, representando valores simples:

- byte: Este é um tipo de dado de 8 bits (-128 a 127).
- short: Este é um tipo de dado de 16 bits (-32 768 a 32 767).
- int: Este é um tipo de dado de 32 bits (-2 147 483 648 a 2 147 483 647).
- long: Este é um tipo de dado de 64 bits (-9 223 372 036 854 775 808 a 9 223 372 036 854 775 807).
- float: Este é um tipo de dado de ponto flutuante de precisão simples de 32 bits (aproximadamente 6 dígitos decimais).
- double: Este é um tipo de dado de ponto flutuante de precisão dupla de 64 bits (aproximadamente 15 dígitos decimais).
- boolean: Valores lógicos (true ou false). 1 bit. Representa verdadeiro ou falso. Usado principalmente para expressar condições lógicas e tomar decisões em programas.
- char: Caracteres Unicode de 16 bits (representados por letras, números e símbolos). Varia de 0 a 65 535.

> Esses tipos não são considerados objetos e portanto representam valores brutos. Eles são armazenados diretamente na pilha de memória. (Memory stack)

## Tipos por Referência

Os tipos por referência incluem classes, interfaces, arrays e enums. Ao contrário dos tipos primitivos, os tipos de referência contêm uma referência a uma instância de objeto, não o próprio objeto.

- String: Representa uma sequência de caracteres e é provavelmente o tipo de referência mais usado em Java.
- Arrays: Uma coleção ordenada de elementos do mesmo tipo, seja primitivo ou de referência.
- Classes: Define um novo tipo de dados por agrupar variáveis e métodos.
- Interfaces: Define um contrato que as classes podem implementar.
- Enums: Tipo especial que define um conjunto de constantes nomeadas.

## Constantes

Constantes(estáticas e finais) são valores armazenados em memória que não podem ser modificados depois de declarados. Em Java, esses valores são representados pela palavra reservada final, seguida do tipo. Por convenção, Constantes são sempre escritas em CAIXA ALTA com sublinhados entre as palavras quando possuirem nomes compostos.

```java
public static final int MAX_WIDTH = 800;
```

## Declaração de variáveis

Toda variável é composta por: tipo de dados + identificação + valor atribuído.
Para atribuir um valor a uma variável utilize o operador de atribuição ```=``` :

```java
String texto = "Novo texto";
int numero;
numero = 20;
```

>  Você pode inicializar uma variável no momento da declaração ou pode inicializá-la depois.

## Padrão de nomenclatura

Quando se trata de escrever códigos na linguagem Java, é recomendado seguir algumas convenções de escrita.

`Nome de variável`: toda variável(atributo, propriedade) deve ser escrita com letra minúscula, porém se a palavra for composta, a primeira letra da segunda palavra deverá ser maiúscula, exemplo: ano e anoFabricacao. O nome dessa prática para nomear variáveis dessa forma se chama "camelCase".

Para declarar uma variável nós podemos utilizar caracteres, números e símbolos, porém, devemos seguir algumas regras da linguagem.

- Deve conter apenas letras, _ (underscore), $ ou os números de 0 a 9;
- Deve obrigatoriamente se iniciar por uma letra (preferencialmente), _ ou $, jamais com número;
- Deve iniciar com uma letra minúscula (boa prática);
- Não pode conter espaços;
- Não podemos usar palavras-chave da linguagem;
- O nome deve ser único dentro de um escopo;
- Deve ser clara, sem abreviações ou definição sem sentido;
- É sempre no singular, exceto quando se referir a um array ou coleção.
- Defina um idioma único para suas variáveis. Se você for declarar variáveis em inglês, defina todas em inglês.

## Referência

- [https://glysns.gitbook.io/java-basico](https://glysns.gitbook.io/java-basico)
