
public class Conta {
 private int agencia = 1;
 private int numero;
 private double saldo;
 private Cliente cliente;
 private static int sequencial = 1;
 
 
 
 
public int getAgencia() {
	return agencia;
}
public int getNumero() {
	return numero;
}
public double getSaldo() {
	return saldo;
}
public Conta (Cliente cliente) {
	this.cliente = cliente;
	this.numero = sequencial;
	sequencial++;
}
public void imprimirExtrato() {
	System.out.println("_____Extrato Mensal_____");
	System.out.println("Titular: "+ cliente.getName());
	System.out.println("Agencia: " + this.agencia);
	System.out.println("Conta :" + this.numero);
	System.out.println("Saldo Atual: "+this.saldo);
}

public void sacar(double valor) {
	if(this.saldo - valor >= 0) {
	this.saldo -= valor;
	} else {System.out.println("Saldo insuficiente");
	}
}
public void depositar (double valor) {
	this.saldo += valor;
}
public void transferir (double valor, Conta destinatario) {
	sacar(valor);
	destinatario.depositar(valor);
	
}

}
