public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 18.0;
        double valorSolicitado = 17.0;
        if (valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.println("Saque realizado, novo saldo: "+saldo);
        } else{
            System.out.println("Saldo insuficiente");
        }
        
    }
    
}
