import java.util.Date;

public class Operadores {

    public static void main(String[] args) throws Exception {

        int a = 10;
        int b = 2;
        Date data = new Date();

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int modulo = a % b;
        double expressao = (10 * 7) + (20 / 4);

        System.out.println("Soma = " + soma);
        System.out.println("Subtração = " + subtracao);
        System.out.println("Multiplicação = " + multiplicacao);
        System.out.println("Divisão = " + divisao);
        System.out.println("Módulo = " + modulo);
        System.out.println("Data = " + data);
        System.out.println("Resultado da expressão = " + expressao);

        String nomeCompleto = "LINGUAGEM" + " JAVA";
        System.out.println("Concatenação de strings = " + nomeCompleto);

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1"; // 31
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + 1; // 1111
        System.out.println(concatenacao);
        concatenacao = 1 + "1" + 1 + "1"; // 1111
        System.out.println(concatenacao);
        concatenacao = "1" + 1 + 1 + 1; // 1111
        System.out.println(concatenacao);
        concatenacao = "1" + (1 + 1 + 1); // 13
        System.out.println(concatenacao);

        int numero = 5;
        System.out.println(-numero);

        numero++;
        System.out.println(numero);
        System.out.println(numero++); // O operador de incremento pós-fixado só incrementa após o uso da variável
        System.out.println(numero); // Agora sim o numero virou 7
        System.out.println(++numero);// O operador de incremento pré-fixado realiza a alteração da variável antes
                                     // dela ser usada

        boolean verdadeiro = true;
        System.out.println("Inverteu true para " + !verdadeiro);

        int x = 0;
        int y = 100;
        String resultado = (x == y) ? "verdadeiro" : "false";
        System.out.println(resultado);

        int numero1 = 1;
        int numero2 = 2;
        if (numero1 == numero2)
            System.out.println("Numero 1 é igual numero 2");

        if (numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");

        if (numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        if (numero1 >= numero2)
            System.out.println("Numero 1 maior ou igual que numero 2");

        if (numero1 <= numero2)
            System.out.println("Numero 1 menor ou igual que numero 2");

        if (numero1 != numero2)
            System.out.println("Numero 1 é diferente de numero 2");

        String nome1 = "JAVA";
        String nome2 = "JAVA";

        System.out.println(nome1 == nome2); // true

        String nome3 = new String("JAVA");

        System.out.println(nome1 == nome3); // false

        String nome4 = nome3;

        System.out.println(nome3 == nome4); // true

        System.out.println(nome1.equals(nome2)); // true
        System.out.println(nome2.equals(nome3)); // true
        System.out.println(nome3.equals(nome4)); // true

        int number1 = 130;
        int number2 = 130;
        System.out.println(number1 == number2); // true

        Integer num1 = 130;
        Integer num2 = 130;
        System.out.println(num1 == num2); // false
        System.out.println(num1.equals(num2)); // true

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2)
            System.out.print("Os dois valores precisam ser verdadeiros");

        if (condicao1 || condicao2)
            System.out.print("Um dos valores precisa ser verdadeiro");

        if ((7 < 4) & true) {
            System.out.println("!!!!");
        }

    }
}