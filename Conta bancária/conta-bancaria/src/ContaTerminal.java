import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Nos diga agora o seu nome completo: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da sua conta: ");
        int conta = scanner.nextInt();

        System.out.println("Agora, digite o número de sua agência: ");
        String agencia = scanner.next();

        System.out.println("Digite o seu saldo: ");
        double saldo = scanner.nextDouble();

        
        System.out.println("Olá, " + nomeCliente+"  ! É ótimo termos você como cliente. Sua conta é " + conta + " e sua agência é " + agencia + ", e você tem um total de R$ "+ saldo + " em sua conta bancária, e este valor já está disponível para saque.");
        
        
    
    }
}
