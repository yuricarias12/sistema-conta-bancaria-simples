import java.util.Scanner;
public class Program {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Conta conta;

        System.out.print("Informe o Número da conta: ");
        int numeroConta = ler.nextInt();
        
        System.out.print("Informe o Titular da Conta: ");
        ler.nextLine();
        String titularConta = ler.nextLine();
        System.out.print("Deseja Realizar um Deposito Inicial (s/n)? ");
        char resposta = ler.next().charAt(0);

        if (resposta == 's') {
            System.out.print("Insira o valor do Deposito Inicial: ");
            double depositoInicial = ler.nextDouble();
            conta = new Conta(numeroConta, titularConta, depositoInicial);
        }
        else {
            conta = new Conta(numeroConta, titularConta);
        }

        System.out.println();
        System.out.println("Dados da Conta: ");
        System.out.println(conta);
        
        System.out.println();
        
        System.out.print("Informe um valor para Deposito: ");
        double valorDeposito = ler.nextDouble();
        conta.deposito(valorDeposito);
        System.out.println("Dados Atualizados da Conta: ");
        System.out.println(conta);
        
        System.out.println();
        
        System.out.print("Informe um valor para Saque: ");
        double valorSaque = ler.nextDouble();
        conta.saque(valorSaque);
        
        System.out.println();
        System.out.println("Dados Atualizados da Conta: ");
        System.out.println(conta);


        ler.close();
    }
}
