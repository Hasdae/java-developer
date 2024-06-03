package iphone;

import iphone.apps.AppMusica;
import iphone.apps.NavegadorInternet;
import iphone.sistemas.SistemaLigacao;

public class Celular implements SistemaLigacao, AppMusica, NavegadorInternet {

	public void tocar() {
		selecionarMusica();
		System.out.println("A musica está tocando");
	}

	public void pausar() {
		System.out.println("A musica foi pausada");
	}

	private void selecionarMusica() {
		System.out.println("Uma nova musica foi selecionada");
	}

	public void ligar() {
		System.out.println("Dicando para contato");
	}

	public void atender() {
		System.out.println("Atendendo ligação");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Enviando correio de voz");
	}

	public void exibirPagina() {
		System.out.println("Página web exibida");
	}

	public void adicionarNovaAba() {
		System.out.println("Uma nova aba foi aberta");
	}
	public void atualizarPagina() {
		System.out.println("A página foi atualizada com sucesso");
	}

}
