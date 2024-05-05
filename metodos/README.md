# Métodos

Os métodos correspondem a funções ou sub-rotinas definidas e disponíveis dentro de classes. Eles encapsulam uma ação específica dentro do seu programa, reúnem instruções, variáveis e lógica em um bloco único, que pode ser chamado e executado sempre que necessário em diferentes partes do programa. Um método pode receber alguns dados, realizar uma operação e retornar o resultado.

## Critério de nomeação de Métodos

Esses critérios não são obrigatórios, mas é recomendável que sejam seguidos, pois essas convenções facilitam a vida dos programadores ao trabalharem em códigos de forma colaborativa. Ao seguir estas convenções, tornamos o código mais legível para nós e também para outras pessoas. Para métodos, os critérios são:

- Deve ser nomeado como verbo;

- Seguir o padrão camelCase (Todas as letras minúsculas com a exceção da primeira letra da segunda palavra).

## Critério de definição de métodos

Mas, como sabemos a melhor forma de definir os métodos das nossas classes? Para chegar à essa conclusão, somos auxiliados por uma convenção estrutural para todos os métodos. Essa convenção é determinada pelos aspectos abaixo:

- Qual a proposta principal do método? 

Você deve se perguntar constantemente até compreender a real finalidade do mesmo.

- Qual o tipo de retorno esperado após executar o método? 

Você deve analisar se o método será responsável por retornar algum valor ou não. Caso o método não retorne nenhum valor, ele será representado pela palavra-chave void.

- Quais os parâmetros serão necessários para execução do método? 

Os métodos às vezes precisarão de argumentos como critérios para a execução.

- O método possui o risco de apresentar alguma exceção? 

Exceções são comuns na execução de métodos, as vezes é necessário prever e tratar a possível existência de uma exceção.

- Qual a visibilidade do método? 

Avaliar se será necessário que o método seja visível a toda aplicação, somente em pacotes, através de herança ou somente a nível a própria classe.

## Estrutura de um Método

Um método em Java possui a seguinte estrutura:

```java
modificadorDeAcesso tipoRetorno nomeDoMetodo(parametro1, parametro2, ...) {
  // Corpo do método (instruções)
  return valorDeRetorno;
}
```
O nomeDoMetodo (um identificador válido e único) e o tipo dos parâmetros(os inputs que fornecem dados para a execução do método - um método pode conter zero ou mais parâmetros) constituem a assinatura do método;

O tipoRetorno é um indicador do tipo de retorno do método, que pode ser um dos tipos primitivos da linguagem, um tipo de objeto (nome de classe ou interface), ou void se não houver nenhum valor de retorno;

O modificadorDeAcesso (opcional) é uma combinação de um especificador de visbilidade (public, protected ou private), de um especificador de redefinição (abstract ou final) e de um especificador de escopo (static);

O corpo de um método é formado por declarações de variáveis locais e comandos da linguagem de programação;

Alguns métodos em Java retornam um valor após sua execução. O comando `return valorDeRetorno;` é o responsável por isso.

## Tipos de Métodos

- Sem retorno (void): Não retornam nenhum valor.
- Com retorno: Retornam um valor do tipo especificado.
- Estáticos: Associados à classe, não a um objeto específico.
- De instância: Associados a um objeto da classe, acessíveis através da instância.

## Chamando Métodos

Para executar um método, utilize a seguinte sintaxe:

```Java
objeto.nomeDoMetodo(argumento1, argumento2, ...);
```

## Características dos Métodos Java

- Reutilização de Código: Métodos podem ser reutilizados em diferentes partes do programa, evitando duplicação de código e otimizando o desenvolvimento.

- Encapsulamento: Métodos permitem encapsular a lógica relacionada em um único lugar. Isso ajuda na organização e manutenção do código, tornando-o mais legível e fácil de entender.

- Modularidade: Ao dividir um programa em métodos menores, bem definidos e mais gerenciáveis, a complexidade do código é reduzida, tornando o programa mais organizado e fácil de entender e facilitando a manutenção e o desenvolvimento.

- Abstração: Métodos podem ser vistos como caixas-pretas que realizam uma tarefa específica. Os detalhes internos de como a tarefa é realizada são ocultos, fornecendo uma interface simples e expondo apenas a funcionalidade necessária para quem está usando o método.

## Melhores Práticas

- Nomeie métodos de forma clara e descritiva.
- Organize métodos em classes de forma lógica.
- Utilize comentários para explicar a funcionalidade dos métodos.
- Evite criar métodos muito grandes ou complexos.
- Teste seus métodos cuidadosamente.

## Referências

[https://glysns.gitbook.io/java-basico/sintaxe/metodos](https://glysns.gitbook.io/java-basico/sintaxe/metodos)
[https://www.dca.fee.unicamp.br/cursos/PooJava/classes/metodos.html](https://www.dca.fee.unicamp.br/cursos/PooJava/classes/metodos.html)