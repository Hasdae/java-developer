public class Pessoa {
	private String nome;
	private String cpf;
	private String endereco;
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public Pessoa (String nome, String cpf) { // o construtor com parametros obrigatorios deve ter o mesmo nome da classe, dessa forma toda vez que for inicializado/instanciado será necessário informar os parametros obrigatorios.
		this.nome = nome; // a palavra reservada THIS serve para apontar que a primeira variavel nome pertence a classe e não ao parametro passado, poderia ser utilizado o newNome como parametro de forma que não fosse necessario utilizar o THIS.
		this.cpf = cpf;
	}
}
