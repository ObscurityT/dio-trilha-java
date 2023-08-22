import java.util.Scanner;

public class ContaTerminal {

    int numero;
    String agencia;
    String nomeCliente;
    float saldo; 

    public static void main(String[] args) {
        ContaTerminal conta = new ContaTerminal();
        conta.receberDados();
        conta.printInfo();
    }

    public void receberDados() {
        Scanner scanner = new Scanner(System.in);
    
        System.out.println("Por favor, digite o numero da conta: ");
        numero = scanner.nextInt();
    
        System.out.println("Por favor, digite o numero da agencia: ");
        agencia = scanner.next();
        
        scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        saldo = scanner.nextFloat();

        scanner.close();
    } 

    public void printInfo() {
        String print = "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + 
        ", conta " + numero +  " e seu saldo " + saldo + " já está disponivel para saque.";

        System.out.println(print);
    }
}