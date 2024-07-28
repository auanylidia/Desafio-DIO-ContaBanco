import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        // Solicita o numero da agencia
        System.out.println("Digite o numero da agencia: ");
        String agencia = scanner.nextLine();

        // solicita o numero da conta
        System.out.println("Digite o numero da conta: ");
        int numeroConta = scanner.nextInt();

        // solicita o nome do cliente
        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        // solicita o saldo
        System.out.println("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        // EXIBIR A MENSAGEN DA CONTA CRIADA
        System.out.println("Olá" + nomeCliente + ", Obrigada por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque.");

        // fecha o scanner
        scanner.close();
    }
}
