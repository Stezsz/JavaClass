public class ListasImutaveis {
	private final List<Integer> numeros = new LinkedList<>();

	public List<Integer> getNumeros() {
		return Collections.unmodifiableList(numeros);
	}

	public void adicionarNumero(int numero) {
		//regras para adição do numero
		numeros.add(numero);
	}
}
//Encapsulamento responsável por garantir que a lista de números não seja alterada fora da classe ListasImutaveis.
//Somente a classe pode adicionar números à lista, mas qualquer classe pode acessar a lista e visualizar os números.

//Arrays: altera elementos da lista mas não pode adicionar ou remover
public class App {
	public static void main(String[] args) {
		List<Integer> lista = Arrays.asList(1, 2, 3);
		/*
			Esta lista é de tamanho fixo (3), ou seja,
			quando utilizarmos método para adicionar ou remover
			itens teremos a exceção UnsupportedOperationException.
			Porém esta lista pode ser modificada da seguinte maneira.
		*/
		lista.set(0, 30);
		/*
			Deste modo conseguimos realizar modificações na lista,
			porém sem alterar o seu tamanho de algum modo,
			este tipo de operações também aceita argumentos
			nulos como no exemplo a baixo
		*/
		List<String> outraLista = Arrays.asList("Java", "4", null);
		//["Java", "4", null]
	}
}

//List: não pode alterar elementos da lista e nem adicionar ou remover
public class App {
	public static void main(String[] args) {
		List<Integer> lista = List.of(1, 2, 3);
		/*
			Mesmo caso do Arrays.asList, porém não conseguimos
			realizar nenhum tipo de alteração
		*/
		lista.set(0, 30); //UnsupportedOperationException
		/*
			List.of não aceita argumentos nulos,
			caso façamos isso temos uma NullPointerException
		*/
		List<String> outraLista = List.of("Java", "4", null); //NullPointerException
	}
}

/*								Array	List
Tamanho fixo					Sim		Sim
Permite modificar elementos		Sim		Não
Permite adicionar/remover		Não		Não
Aceita elementos nulos			Sim		Não
*/
