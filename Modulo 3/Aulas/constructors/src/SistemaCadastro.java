public class SistemaCadastro {
	public static void main(String[] args) {
		/* Pessoa marcos = new Pessoa();
		marcos.setEndereco("Rua Das Marias");
		
		System.out.println("Olá, "+marcos.getNome()+" seu endereço é "+marcos.getEndereco()+" e seu cpf é "+marcos.getCpf());  os valores retornam null pois na criação do objeto não foi exigido a definição do nome e cpf
		*/
		Pessoa andressa = new Pessoa("Andressa", "123456789"); // agora só é possível criar um objeto Pessoa informando os parametros obrigatorios

		System.out.println("Olá, "+andressa.getNome()+" seu endereço é "+andressa.getEndereco()+" e seu cpf é "+andressa.getCpf());
		//andressa.setEndereco("RUA DA CACHOEIRA");
		
		System.out.println("Olá, "+andressa.getNome()+" seu endereço é "+andressa.getEndereco()+" e seu cpf é "+andressa.getCpf());

	}
}
