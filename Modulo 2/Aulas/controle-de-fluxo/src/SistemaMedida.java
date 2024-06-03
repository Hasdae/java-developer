import java.util.Scanner;
public class SistemaMedida {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a letra");
        String letra = sc.next();
        switch (letra) { // Inicia a função com parametro
            case "A":
                System.out.println("Letra A");
                break; // define que ao atingir essa condição, deverá interromper toda a função. Caso não possua break irá retornar os cases seguintes
            case "B": // se a letra escolhida for B, o fluxo passará por B, C e default visto que só há break no final
                 System.out.println("Letra B");
                

            case "C":
                System.out.println("Letra C");
                        
            default:
            System.out.println("Indefinido");
            break;
        }
        sc.close();
            
    }
}