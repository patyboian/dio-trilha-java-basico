import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        // Exibir as mensagens para nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o número da sua agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da sua conta: " );
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        double saldo = scanner.nextDouble();        

        // Exibir a mensagem final
    System.out.println("Olá "+nomeCliente + " "+sobrenomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é " +agencia + ", conta "+ numero + " e seu saldo R$"+ saldo +" já está disponível para saque.");
    }
}
