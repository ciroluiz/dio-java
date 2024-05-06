public class Escopo {
    static int variavelEstatica = 10; // Escopo de classe

    int variavelDeInstancia = 20; // Escopo de instância

    void metodoExemplo() {
        int variavelLocal = 30; // Escopo de método
        System.out.println(variavelLocal);
        System.out.println(variavelDeInstancia);
        System.out.println(variavelEstatica);

        int valorMontante = 0;

        // Escopo de fluxo, x e valorCalculado nunca estarão disponíveis fora do for
        for (int x = 1; x <= 5; x++) { // Escopo de fluxo
            int valorCalculado = 2 * x;
            valorMontante = valorMontante + valorCalculado;
        }

    }

    public static void main(String[] args) {
        Escopo exemplo = new Escopo();
        exemplo.metodoExemplo();
        // System.out.println(variavelLocal); // Erro! variavelLocal não acessível aqui.
        System.out.println(variavelEstatica); // OK, acessível em qualquer lugar.
        // System.out.println(variavelDeInstancia); // Erro! Necessita instância para acesso.
    }
}