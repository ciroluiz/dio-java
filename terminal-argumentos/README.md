# Terminal e Argumentos

Nem sempre executamos nosso programa Java pela IDE. Com a JVM devidamente configurada, nós podemos criar um executável do nosso programa e disponibilizar o instalador para qualquer sistema operacional.

## Terminal

Ao executar um programa Java pelo terminal, você pode passar argumentos após o nome da classe.
Esses argumentos são armazenados no array de String chamado args dentro do método main.
O primeiro argumento (índice 0) é args[0], o segundo é args[1], e assim por diante.

Vamos ilustrar como executar uma classe, depois de compilada, sem precisar usar a IDE.

- Abra o terminal de comando(MS-DOS ou Power Shell)
- Localize o diretório do seu projeto: 
Ex.: cd C:\estudos\dio-trilha-java-basico\java-terminal
- Acesse a pasta **bin**: cd bin
- Agora digite o comando: ``java MinhaClasse`` (nome da sua classe sem a extensão .class).

## Argumentos

Quando executamos uma classe que contenha o método main, o mesmo permite que passemos um array [ ] de argumentos do tipo String. Logo, podemos após a definição da classe a ser executada, informar estes parâmetros:

> java MinhaClasse agumentoUm argumentoDois

Executando o programa agora no terminal:
```
cd C:\estudos\dio-trilha-java-basico\java-terminal
cd bin
java AboutMe Pessoa Desenvolvedora 30 1.60
```

## Scanner

Podemos receber dados digitados pelo usuário do nosso sistema, porém, tudo precisa estar em uma linha e também é necessário informar os valores nas posições correspondentes. Esta abordagem pode deixar margens de execução com erro do nosso programa. Para isso, com a finalidade de deixar as nossas entradas de dados mais seguras, podemos receber estes dados via Scanner.

A classe Scanner permite que o usuário tenha uma interação mais assertiva com o nosso programa, para deixar mais intuitivo para os usuários.

A classe Scanner permite ler a entrada do usuário a partir do terminal. É necessário importar a classe java.util.Scanner no código e criar um objeto Scanner passando System.in como argumento para ler do terminal.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Olá, " + nome + "!");
    }
}
```

> Você pode usar estruturas condicionais e loops para processar os argumentos de acordo com a sua necessidade.
Por exemplo, você pode verificar se um argumento específico foi passado corretamente ou converter argumentos para outros tipos de dados.

## Boas práticas

- Valide a entrada do usuário para evitar erros.
- Forneça mensagens de ajuda ou instruções se o usuário não fornecer os argumentos corretos.
- Use bibliotecas de parsing de argumentos.

# Referências

[https://glysns.gitbook.io/java-basico/sintaxe/terminal-e-argumentos](https://glysns.gitbook.io/java-basico/sintaxe/terminal-e-argumentos)