package edu.lanchonete.atendimento.cozinha;

public class Almoxarife {
	private void controlarAcesso() { // nenhuma parte da aplicação precisa saber como controlo entrada e saida
		System.out.println("Controlando acesso");
	}
	void transferirIngredientes() { //default visivel somente ao pacote
		controlarAcesso(); // controlarAcesso é um metodo privado usado somente pela classe, mas o metodo transferirIngredientes pode ser chamado por Cozinheiro por ser um metodo default visivel ao pacote
		System.out.println("Transferindo ingredientes para a cozinha");
	}
	void trocarGas() {
		System.out.println("Trocando gas");
	}
}
