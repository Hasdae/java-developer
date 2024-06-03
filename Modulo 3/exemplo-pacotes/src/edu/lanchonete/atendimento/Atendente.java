package edu.lanchonete.atendimento;

public class Atendente {
	private void pegarPedidoNoBalcao() {
		System.out.println("Pegando pedido no balcao");
	}
	public void servindoMesa() {
		pegarPedidoNoBalcao(); //ação privada sendo executada dentro de uma ação publica
		System.out.println("Servindo mesa");
	}
	void trocarGas() {
		System.out.println("Trocando gas");
	}
}
