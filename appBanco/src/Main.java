import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nomeCliente;
        double saldo;
        String tipoConta;
        boolean verdadeiro = true;
        double saque = 0;

        System.out.println("Digite seu nome!");
        nomeCliente = scan.nextLine();

        System.out.println("Digite o seu saldo atual.");
        saldo = scan.nextDouble();

        scan.nextLine();
        System.out.println("Digite C para conta Corrente e P para conta Poupança!");
        tipoConta = scan.nextLine();
        int escolha = 0;

        if (tipoConta.equals("c") || tipoConta.equals("C")) {
            tipoConta = "Corrente";
        } else {
            tipoConta = "Poupança";
        }
        System.out.printf("""
                *************************************
                    Nome: %s                          
                    Tipo da Conta: %s                 
                    Saldo: %.2f                                                                                                                       
                *************************************
                """, nomeCliente, tipoConta, saldo);

        while (verdadeiro) {
            System.out.println("""
                    \n
                       1 - Consulta de Saldo
                       2 - Fazer um Deposito
                       3 - Fazer um saque
                       4 - Sair
                       """);
            escolha = scan.nextInt();
            if (escolha == 1) {
                System.out.println(nomeCliente + ", seu saldo é de " + saldo);
                escolha = 0;
            } else if (escolha == 2) {
                System.out.println("Digite de quanto será o Deposito.");
                saldo += scan.nextDouble();
                System.out.println("Saldo atual: " + saldo);
                escolha = 0;
            } else if (escolha == 3) {
                System.out.println("Digite de quanto será o saque.");
                saque = scan.nextDouble();
                if (saque > saldo) {
                    System.out.println("A operação não pode ser concluida, valor invalido.");
                } else {
                    saldo = saldo - saque;
                    System.out.println("Saldo atual: " + saldo);
                    escolha = 0;
                }
            } else if (escolha == 4) {
                verdadeiro = false;
            }
        }
    }
}