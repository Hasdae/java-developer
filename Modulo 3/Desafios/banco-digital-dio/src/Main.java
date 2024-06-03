
public class Main {
public static void main(String[] args) {
	Cliente pompeu = new Cliente("Pompeu");
	Cliente carlos = new Cliente ("Carlos");
	Conta cc = new ContaCorrente(pompeu);
	Conta c2 = new ContaCorrente(carlos);


	
	cc.depositar(1000);
	cc.imprimirExtrato();
	cc.transferir(500, c2);
	cc.imprimirExtrato();
	
	c2.imprimirExtrato();
	
	cc.sacar(501);
	cc.transferir(501, c2);
	cc.imprimirExtrato();
	
}
}
