// Alguns exemplos do uso das palavras reservadas

// Controle de pacotes
import java.util.Scanner;

public class PalavrasReservadas {

    // Modificadores de acesso
    public int valorPublico = 1;
    private int valorPrivado = 2;
    protected int valorProtegido = 3;

    final double PI = 3.14159;
    private static final long serialVersionUID = 1L;

    public static void main(String[] args) {

        // Tipos de dados primitivos
        byte meuByte = 1;
        short meuShort = 2;
        int meuInt = 3;
        long meuLong = 4L;
        float meuFloat = 5.0f;
        double meuDouble = 6.0d;
        boolean meuBoolean = true;
        char meuChar = 'a';

        // Operadores
        int soma = meuInt + meuShort;
        int subtracao = meuInt - meuShort;
        int multiplicacao = meuInt * meuShort;
        int divisao = meuInt / meuShort;
        int modulo = meuInt % meuShort;

        // Controle de fluxo
        if (meuBoolean) {
            System.out.println("meuBoolean é verdadeiro");
        } else {
            System.out.println("meuBoolean é falso");
        }

        switch (meuInt) {
            case 1:
                System.out.println("meuInt é 1");
                break;
            case 2:
                System.out.println("meuInt é 2");
                break;
            default:
                System.out.println("meuInt não é 1 nem 2");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Iteração: " + i);
        }

        int j = 0;
        while (j < 5) {
            System.out.println("Iteração: " + j);
            j++;
        }

        do {
            System.out.println("Iteração: " + j);
            j++;
        } while (j < 10);

        // Tratamento de Erros(Exceções)
        try {
            int resultado = meuInt / 0;
        } catch (ArithmeticException e) {
            System.out.println("Erro: divisão por zero");
        } finally {
            System.out.println("Este bloco sempre executa");
        }
    }

    // Interface
    interface MinhaInterface {
        void meuMetodoInterface();
    }

    // Classe abstrata com método abstrato
    abstract class MinhaClasseAbstrata {
        abstract void metodoAbstrato();
    }

    // Palavras-chave de Classe
    class MinhaClasse extends MinhaClasseAbstrata implements MinhaInterface {
        // ...
    }

    MinhaClasse objeto = new MinhaClasse();

}
