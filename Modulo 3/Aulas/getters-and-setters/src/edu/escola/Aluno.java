package edu.escola;

public class Aluno {
	private String nome;
	private int idade;
	// é possível usar o Source > Generate Getters and Setters da IDE eclipse para gerar o codigo abaixo, sem condições inclusas, automaticamente
	public String getNome() {
		return nome;
	}
	public void setNome(String newNome) {
		// dessa forma é possível colocar condições para validar os valores recebidos, exemplo IF (newNome < 50)
		this.nome = newNome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int newIdade) {
		this.idade = newIdade;
	}
	
	private String sexo;
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getSexo() {
		return sexo;
	}
}