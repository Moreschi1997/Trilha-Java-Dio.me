import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        terminal(0, null, null, 3);
    }
    public static void terminal(int numero, String agencia, String nomeCliente, double saldo){
        Scanner ler =  new Scanner(System.in);
            System.out.printf("Digite o número: ");
                numero = ler.nextInt();
            System.out.printf("\nDigite a agência com o digito: ");
                agencia = ler.next();
            System.out.printf("\nDigite o seu nome: ");
                nomeCliente = ler.next();
            System.out.printf("\nO seu saldo é: ");
                saldo = ler.nextDouble();
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque\n", nomeCliente, agencia, numero, saldo);

            

    }
}
