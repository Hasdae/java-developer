import java.util.concurrent.ThreadLocalRandom;
public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0){
            double valorDoce = valorAleatorio();
            if (valorDoce < mesada){
            System.out.println("O valor do doce é de R$"+valorDoce+" e foi adicionado ao carrinho.");
            }else{
                 valorDoce = mesada;
                }
        mesada -= valorDoce;
        }
        
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(1, 8);
    }
}