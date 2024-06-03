package edu.escola;

public class Escola {
	public static void main(String[] args) {
		Aluno felipe = new Aluno();
		felipe.setNome("Felipe");
		felipe.setIdade(8);
		felipe.setSexo("Masculino");
		System.out.println("O aluno "+felipe.getNome()+" tem "+felipe.getIdade()+" anos e é do sexo "+felipe.getSexo().toLowerCase());
	Aluno andressa = new Aluno();
	andressa.setNome("Andressa");
	andressa.setIdade(10);
	System.out.println("O aluno "+andressa.getNome()+" tem "+andressa.getIdade()+" anos");
	}
}
