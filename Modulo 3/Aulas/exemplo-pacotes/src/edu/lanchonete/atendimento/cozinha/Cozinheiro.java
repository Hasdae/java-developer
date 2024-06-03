package edu.lanchonete.atendimento.cozinha;

import edu.lanchonete.atendimento.Atendente;

public class Cozinheiro {
	private void fritarLanche() { //classe privada que só pode ser utilizada pela propria classe
		System.out.println("Fritando lanche");
	}
	public void adicionarLancheNoBalcao() {
		fritarLanche();
		System.out.println("Colocando suco no balcao");
	}
	void pedirIngredientes(Almoxarife almoxarife) {
		almoxarife.transferirIngredientes(); //consegue solicitar funcao default por estar no mesmo pacote
	}
	private void pedirTrocaDeGas(Almoxarife funcionario) {
		funcionario.trocarGas();
	}

}