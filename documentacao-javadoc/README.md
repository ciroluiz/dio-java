# Documentação e Javadoc

Conforme [site oficial](https://docs.oracle.com/en/java/javase/22/), podemos compreender e explorar uma documentação rica e detalhada dos recursos da linguagem, com todos os recursos organizados por pacotes e classes bem específicas, sem nem mesmo escrever uma linha de código.
Documentar seu código é crucial para a legibilidade, manutenção e colaboração.
Em Java, temos duas ferramentas principais para isso: a documentação geral e o Javadoc.

## Documentação Geral

- Objetivo: Descrever o projeto como um todo, incluindo sua finalidade, arquitetura, requisitos e instruções de uso.
- Formato: Pode ser um arquivo README em texto simples, Markdown ou um documento mais elaborado em HTML ou PDF.
- Conteúdo típico:

    1. Descrição do projeto
    2. Instruções de instalação e configuração
    3. Tutorial ou guia de início rápido
    4. Referência da API (geralmente gerada pelo Javadoc)
    5. Informações de contato e suporte

## Javadoc

- Objetivo: Documentar a API do código Java, incluindo classes, interfaces, métodos e campos.
- Formato: Usa tags especiais em comentários para gerar documentação HTML.
- Tags comuns:

|**TAG**|**DESCRIÇÃO**|
|-------|-------------|
|@author|Autor da classe/método|
|@version|Versão do recurso disponibilizado|
|@since|Versão / Data de início da disponibilização do recurso|
|@param|Descrição de um parâmetro de método|
|@return|Descrição do valor de retorno do método|
|@throws|Exceções que o método pode lançar|
|@see|Referência a outra classe ou método|

- Geração: A ferramenta javadoc incluída no JDK gera a documentação HTML a partir dos comentários Javadoc.

## Benefícios da documentação

- Compreensão: Torna o código mais fácil de entender para outros desenvolvedores (e para você mesmo no futuro).
- Manutenção: Facilita a manutenção e atualização do código.
- Colaboração: Ajuda as equipes a trabalharem juntas de forma mais eficiente.
- Reutilização: Permite que outros desenvolvedores usem seu código de forma mais fácil.

## Dicas para uma boa documentação

- Seja claro e conciso.
- Foque no que o código faz e como usá-lo.
- Use exemplos de código.
- Mantenha a documentação atualizada.
- Use ferramentas como Javadoc e geradores de documentação.

## Ferramentas de documentação

- Javadoc: Ferramenta padrão do JDK para gerar documentação a partir de comentários Javadoc.
- Doxygen: Ferramenta mais poderosa que suporta várias linguagens de programação, incluindo Java.

> Lembre-se: a documentação é um investimento que economiza tempo e esforço a longo prazo, melhorando a qualidade e a sustentabilidade do seu código.

## Referências

[https://glysns.gitbook.io/java-basico/sintaxe/documentacao](https://glysns.gitbook.io/java-basico/sintaxe/documentacao)

[https://docs.oracle.com/en/java/javase/index.html](https://docs.oracle.com/en/java/javase/index.html)

