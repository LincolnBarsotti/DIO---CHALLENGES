import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int num;
        String agencia;
        String nomeDoCliente;
        Double saldo;

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o Número da Agência !");
        num = sc.nextInt();

        System.out.println("Por favor, digite a Agência !");
        agencia = sc.next();

        System.out.println("Por favor, digite o Nome do Usuario !");
        nomeDoCliente = sc.next();

        System.out.println("Por favor, digite o Saldo do Usuario !");
        saldo = sc.nextDouble();

        System.out.println("\"Olá [Nome Cliente]" +
                ", obrigado por criar uma conta em nosso banco" +
                ", sua agência é [Agencia]" +
                ", conta [Numero] e seu saldo [Saldo] já está disponível para saque\".");

    }
}
