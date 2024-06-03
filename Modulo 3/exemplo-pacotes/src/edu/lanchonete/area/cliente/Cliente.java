package edu.lanchonete.area.cliente;

public class Cliente {
	public void pedirLanche() {
		System.out.println("Pedindo lanche");
	}
	private void consultarSaldoApp() {
		System.out.println("Pedindo lanche");
	}
	public void pagarConta() {
		consultarSaldoApp();
		System.out.println("Pagando a conta");
	}

}
