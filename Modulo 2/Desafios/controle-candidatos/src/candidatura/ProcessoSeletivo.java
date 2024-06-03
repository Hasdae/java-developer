package candidatura;

import java.util.concurrent.ThreadLocalRandom;
import java.util.Random;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String [] candidatos =  {"FELIPE", "JULIA", "GABRIEL", "VINICIUS", "LEONARDO"};
		for (String candidato: candidatos) {
			entrandoEmContato(candidato);
			
		}
	
	}
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			System.out.println("Discando para candidato "+candidato);
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("Contato realizado com sucesso");
			}
		} while (tentativasRealizadas < 3 && continuarTentando);
		if(atendeu) {
			System.out.println("Conseguimos contato com "+candidato+" na "+tentativasRealizadas+"ª tentativa");
		} else {
			System.out.println("Não conseguimos contato com "+candidato+", realizamos "+tentativasRealizadas+" tentativas");
		}
		
	}
	static boolean atender() {
		return new Random().nextInt(1,3)==1;
	}
	
	static void imprimirSelecionados() {
		String [] candidatos =  {"FELIPE", "JULIA", "GABRIEL", "VINICIUS", "LEONARDO"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
		for (int indice =0; indice < candidatos.length ; indice++) {
			System.out.println("O candidato de nº "+(indice+1)+" é "+candidatos[indice]);
		}
		System.out.println("Forma abreviada de interação via for each");
		for (String candidato: candidatos) {
			System.out.println("O candidato seleciodo foi "+candidato);		
		}
	}

	static void selecionarCandidatos() {
		String [] candidatos = {"FELIPE", "JULIA", "GABRIEL", "VINICIUS", "LEONARDO", "MARIA", "ROBERTO", "MONICA", "FABRICIO", "JOSE", "CRISTIANO", "JOSIAS", "ZULEICA"};
		int candidatosSelecionados = 0;
		int candidatoAtual= 0;
		double salarioBase = 2000.0;
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.println("O candidato "+candidato+" solicitou este valor de salário: R$"+salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
				candidatosSelecionados++;
				candidatoAtual++;
			}else {
				System.out.println("O candidato "+candidato+" não foi selecionado");
				candidatoAtual++;
			}
		}
		
		
	}
	static double valorPretendido() {
	return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if (salarioBase > salarioPretendido) {
			System.out.println("Ligar para o candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o candidato com contraproposta");
		}else {
			System.out.println("Aguardando resultado dos demais candidatos");
		}
		
	}
}
