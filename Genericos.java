//Métodos Genéricos
//Recebem qualquer tipp de argumento.

public class Valor {
	// Método genérico que recebe um valor e imprime ele
	public static <T> void mostrarValor(T valor) {
		System.out.println("O valor é: " + valor);
	}
}

public class Main {
	public static void main(String[] args) {
		// Chamando o método mostrarValor com diferentes tipos de dados
		Valor.mostrarValor("string"); // O valor é: string
		Valor.mostrarValor(1); // O valor é: 1
		Valor.mostrarValor(2.0f); // O valor é: 2.0
	}
}

//Classes Genéricas

public class Valor<T> {
	// Declaração de variável genérica
	private T valor;

	// Construtor que recebe um valor genérico
	Valor(T valor) {
		this.valor = valor;
	}

	// Método que retorna o valor genérico
	public T getValor() {
		return valor;
	}

	// Método que recebe um valor genérico
	public void setValor(T valor) {
		this.valor = valor;
	}
}

public class Main {
	public static void main (String[] args) {
		// Criando um objeto Valor que recebe um valor String
		Valor<String> valorString = new Valor<String>("string");
		System.out.println(valorString.getValor());
		valorString.setValor("outra string");
		System.out.println(valorString.getValor());

		// Criando um objeto Valor que recebe um valor Integer
		Valor<Integer> valorInteiro = new Valor<Integer>(1);
		System.out.println(valorInteiro.getValor());
		valorInteiro.setValor(2);
		System.out.println(valorInteiro.getValor());
	}
}
//Interfaces Genéricas

public interface Valor<T> {
	public T getValor();
	public void setValor(T valor);
}
