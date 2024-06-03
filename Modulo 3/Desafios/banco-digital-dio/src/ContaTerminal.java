import java.util.Scanner;
import java.util.Locale;
public class ContaTerminal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        double saldo = 237.48;
        System.out.println("Por favor, digite o seu nome.");
        String nome = sc.next();
        System.out.println("Por favor, digite os dados de sua agencia. (Exemplo:000-0)");
        String agencia = sc.next();
        System.out.println("Por favor, digite o número de sua conta. (Exemplo: 0000)");
        int conta = (int)sc.nextInt();
        System.out.println("Olá " +nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo de R$"+saldo+" já está disponível para saque.");
        sc.close();
    }
}
