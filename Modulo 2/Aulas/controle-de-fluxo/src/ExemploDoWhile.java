import java.util.Random;
public class ExemploDoWhile {
    public static void main(String[] args) {
        System.out.println("Discando...");
        do{
        System.out.println("Telefone tocando");
        }
        while(tocando()); // enquanto a condição for TRUE / VERDADEIRA continuará executando o loop definido em DO
        System.out.println("Alô!!!!");
    }
public static boolean tocando(){
    boolean atendeu = new Random().nextInt(1,4)==3; // gera um numero aleatorio e só retorna TRUE quando o numero for == 3
    System.out.println("Atendeu? " +atendeu);
    return ! atendeu; // retorna o valor oposto da variavel atendeu, pois a instrução while persistirá enquanto a condição for TRUE
    }

    
}
