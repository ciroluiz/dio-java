import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        String nomeCliente;
        int numeroConta;
        String agencia;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, digite o valor do saldo: ");
        saldo = scanner.nextDouble();

        System.out.println(exibirMensagem(nomeCliente, numeroConta, agencia, saldo));

        scanner.close();
    }

    public static String exibirMensagem(String nomeCliente, int numeroConta, String agencia, double saldo) {
        return "Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                .concat(agencia).concat(", conta ") + numeroConta + " e seu saldo " + saldo
                + " já está disponível para saque.";
    }

}