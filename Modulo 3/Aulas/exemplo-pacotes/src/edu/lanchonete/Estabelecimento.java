package edu.lanchonete;

import edu.lanchonete.area.cliente.Cliente;
import edu.lanchonete.atendimento.Atendente;
import edu.lanchonete.atendimento.cozinha.Almoxarife;
import edu.lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
	public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
		//ações que não precisam estar visíveis para toda a aplicação
		// cozinheiro.fritarLanche(); ação PRIVATE, vista somente pela classe
		
		//ações que o estabelecimento precisa ter ciencia
		cozinheiro.adicionarLancheNoBalcao();
		
		Almoxarife almoxarife = new Almoxarife();
		//ações que não precisam estar disponiveis para toda a aplicação
		// almoxarife.controlarAcesso();
		
		//alções que somente seu pacote precisa conhecer
		// almoxarife.transferirIngredientes(); não consegue chamar ação default pois está visivel somente ao pacote, portanto chama funcao publica a seguir
		// cozinheiro.pedirIngredientes(almoxarife); função default visivel somente ao pacote
		
		Atendente atendente = new Atendente();
		// ação publica
		atendente.servindoMesa();
		
		Cliente cliente = new Cliente();
		//ações sigilosas
		cliente.pedirLanche();
		cliente.pagarConta();
	}
}
