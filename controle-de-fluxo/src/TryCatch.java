import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
public class TryCatch {
    public static void main(String[] args){ 
        try { // da inicio ao tratamento de exceções try/catch onde TRY é o codigo a ser executado e CATCH é o que fazer caso a exceção definida seja encontrada
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
                System.out.println("Digite seu nome");
        String nome = sc.next();
        System.out.println("Digite seu sobrenome");
        String sobrenome = sc.next();
        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        System.out.println("Digite sua altura");
        double altura = sc.nextDouble();
        sc.close();
        System.out.println("Olá "+nome.concat(" ").concat(sobrenome)+" sua idade é "+idade+" e sua altura é de "+altura+"m");
        } catch (InputMismatchException e) {
            System.out.println("Tipo de dado informado está incorreto. O campo de altura deve ter separação por . ao invés de ,");
        }    
    }
    
}
