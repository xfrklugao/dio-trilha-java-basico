import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nome do Cliente:");
        String nome = scanner.nextLine();
        System.out.println("Digite o numero da Agencia:");
        String agencia = scanner.nextLine();
        System.out.println("Digite o numero da Conta:");
        int numero = scanner.nextInt();
        System.out.println("Digite o saldo:");
        double saldo = scanner.nextDouble();
        scanner.close();

        System.out.println("------------------------------------------");
        System.out.println("Criando conta...");
        System.out.println("------------------------------------------");
        System.out.println("Conta criada:");
        System.out.println("Titular: " + nome);
        System.out.println("Agencia: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: " + saldo);

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", "
                + "conta " + numero + " e seu saldo "+ saldo +" já está disponível para saque.");


    }
}
