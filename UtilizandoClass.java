public class UtilizandoClass {
	public static void main(String args[]) {
		String nome = "Stephan";
		int idade = 19;
		String cpf = "123.456.789-00";

		Pessoa nova = new Pessoa();
		//Instanciando o objeto pessoa para poder utilizar os métodos da classe Pessoa.

		//Exemplos de como utilizar o método set.
		nova.setNome(nome);
		nova.setIdade(idade);
		nova.setCpf(cpf);

		String nome2 = "Ytan";
		int idade2 = 20;
		String cpf2 = "987.654.321-00";

		Pessoa outra = new Pessoa(nome2, idade2, cpf2);
		//Criando outra Pessoa utilizando o construtor que já preenche os atributos.

		//Utilizando get.

		System.out.println("A pessoa nova de nome: " + nova.getNome() + " tem " + nova.getIdade() + " anos e seu CPF é: " + nova.getCpf());
		System.out.println("A pessoa outra de nome: " + outra.getNome() + " tem " + outra.getIdade() + " anos e seu CPF é: " + outra.getCpf());
	}
}

class Pessoa {

	// Atributos privados pelo encapsulamento.
	private String nome;
	private int idade;
	private String cpf;

	public Pessoa() {
		// Construtor padrão, a primeira coisa que é executada ao instanciar um objeto.
		this.nome = "";
		this.idade = 0;
		this.cpf = "";
	}

	public Pessoa(String nome, int idade, String cpf) {
		//Construtor que permite instanciar um objeto com os atributos já preenchidos.
		//Construtor para inserir os valores dos atributos.
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

	// Métodos de acesso aos atributos privados, os métodos get e set.

	public void setNome(String nome) {
		//Método para inserir um valor no atributo nome.
		this.nome = nome; //O this indica o atributo da classe (private String nome).
	}

	public String getNome() {
		//Método para retornar o valor do atributo nome.
		return this.nome;
	}

	public void setIdade(int idade) {
		//Método para inserir um valor no atributo idade.
		this.idade = idade; //O this indica o atributo da classe (private int idade).
	}

	public int getIdade() {
		//Método para retornar o valor do atributo idade.
		return this.idade;
	}

	public void setCpf(String cpf) {
		//Método para inserir um valor no atributo cpf.
		this.cpf = cpf; //O this indica o atributo da classe (private String cpf).
	}

	public String getCpf() {
		//Método para retornar o valor do atributo cpf.
		return this.cpf;
	}

	//funçães que a classe faria

	public void aumentarIdade() {
		//Método para aumentar a idade da pessoa em 1.
		this.idade++;
	}
}
