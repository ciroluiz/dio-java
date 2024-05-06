# Escopo

O conceito de "escopo" refere-se ao contexto em que as variáveis e os métodos são definidos e acessíveis dentro de um código. O escopo determina o alcance da visibilidade e a duração das variáveis e outras entidades em diferentes partes do seu código. Em Java, o escopo de variáveis vai de acordo com o bloco onde ela foi declarada.

- Escopo de Classe/Instância: Em uma Classe, podemos visualizar a diferença de escopos. Os atributos (variáveis) são declarados no corpo principal da Classe, mas fora de qualquer método, e estão acessíveis para todos os métodos.

- Escopo de Método: Caso você declare uma variável DENTRO DE UM MÉTODO, o escopo dessa variável está limitado apenas ao corpo desse método, ou seja, dentro das chaves que limitam o método.

- Escopo de Bloco/Fluxo: Uma variável declarada dentro de um bloco de código (como um if, for ou while) só é visível dentro daquele bloco.

## Modificadores de Acesso

Os modificadores de acesso controlam o nível de visibilidade do escopo de uma variável ou método.

`public`: Acessível em qualquer lugar do programa.

`private`: Acessível apenas dentro da classe onde foi declarado.

`protected`: Acessível dentro da classe, suas subclasses e no mesmo pacote.

## Importância do Escopo

**Organização**: O escopo ajuda a organizar o código, agrupando variáveis e métodos relacionados.

**Evita Conflitos**: Evita conflitos de nomes entre variáveis de diferentes escopos.

**Segurança**: Limita o acesso a dados confidenciais, protegendo a integridade do programa.

## Melhores Práticas:

- Utilize o menor escopo possível.

- Evite declarar variáveis globais desnecessárias.

- Utilize modificadores de acesso com cuidado.

- Documente o escopo das variáveis e métodos.

## Referências

[https://glysns.gitbook.io/java-basico/sintaxe/escopo](https://glysns.gitbook.io/java-basico/sintaxe/escopo)
