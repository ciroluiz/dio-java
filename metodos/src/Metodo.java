public class Metodo {

    // Definição do método soma
    int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) throws Exception {

        Metodo exemplo = new Metodo(); // Criando uma instância da classe
        int resultado = exemplo.somar(3, 5); // Chamando o método soma e atribuindo o retorno a uma variável
        System.out.println("Resultado da soma: " + resultado); // Imprimindo o resultado
    }

}