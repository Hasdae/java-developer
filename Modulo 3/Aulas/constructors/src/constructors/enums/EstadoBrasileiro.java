package constructors.enums;
// Criando enum para ser usado por toda a aplicação. É obrigatorio possuir um construtor com os parametros definidos
public enum EstadoBrasileiro {
	SAO_PAULO ("SP", "São Paulo", 11),
	RIO_JANEIRO ("RJ", "Rio de Janeiro", 12),
	PIAUI("PI", "Piauí", 13),
	CEARA("CE", "Ceará", 14);
	
	
	private String sigla;
	private String nome;
	private int ibge;
	private EstadoBrasileiro(String sigla, String nome, int ibge) {
		this.sigla = sigla;
		this.nome = nome;
		this.ibge = ibge;
	}
	public String getSigla() {
		return sigla;
	}
	public String getNome() {
		return nome;
	}
	public String getNomeMaiusculo() {
		return nome.toUpperCase();
	}
	public int getIbge() {
		return ibge;
	}
	
}
