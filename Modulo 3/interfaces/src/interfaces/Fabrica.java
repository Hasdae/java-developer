package interfaces;
import interfaces.equipamentos.copiadora.*;
import interfaces.equipamentos.digitalizadora.*;
import interfaces.equipamentos.impressora.*;
import interfaces.equipamentos.multifuncional.*;


public class Fabrica {
	public static void main(String[] args) {
		Impressora impressora1 = new EquipamentoMultifuncional(); // Usando interfaces é possível atribuir a classe que implementou varias interfaces diferentes
		impressora1.imprimir();
		
		Impressora impressora2 = new Deskjet();
		impressora2.imprimir();
		
		System.out.println("________________________________");
		EquipamentoMultifuncional em = new EquipamentoMultifuncional(); // É possivel instanciar o objeto que implementou a interface para chamar seus métodos e após isso é possível instanciar outros objetos da mesma interface utilizando-o
		em.digitalizar();
		
		System.out.println("________________________________");
		
		Impressora impressora = em;
		Copiadora copiadora = em;
		Digitalizadora digitalizadora = em;
		
		impressora.imprimir();
		copiadora.copiar();
		digitalizadora.digitalizar();
	}
}
