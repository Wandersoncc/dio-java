package contaBanco.src;

import java.util.Scanner;

public class ContaTerminal {

    int numero;
    String nome;
    String agencia;
    double saldo;

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        conta.numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a nova linha

        System.out.println("Digite o nome do titular da conta: ");
        conta.nome = scanner.nextLine();

        System.out.println("Digite a agência da conta: ");
        conta.agencia = scanner.next();

        System.out.println("Digite o saldo da conta: ");
        conta.saldo = scanner.nextDouble();

        System.out.println("Conta criada com sucesso! Olá, " + conta.nome + ". Obrigado por criar uma conta em nosso banco. Sua agência é " + conta.agencia + ", conta " + conta.numero + " e seu saldo " + conta.saldo + " já está disponível para saque.");

        scanner.close(); // Fechar o Scanner
    }
}