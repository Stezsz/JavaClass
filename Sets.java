/*
HashSet:
Esta implementação é a mais rápida dentre elas,
ela armazena os valores em uma Hash Table,
esta implementação não garante a ordem dos elementos adicionados nela.

LinkedHashSet:
Esta implementação é parecida com a do HashSet porém por trás dos panos
ela utiliza uma LinkedList em sua implementação ao invés de um HashMap
que sera explicado nos próximos capítulos.

TreeSet:
Esta implementação utiliza uma Red Black Tree,
esta implementação garante a ordem dos elementos que forem inseridos no Set.
*/

//HashSet
public class App {
	public static void main(String[] args) {
		Set<Integer> intSet = new HashSet<>(); //Instanciando um HashSet
		intSet.add(10);
		intSet.add(20);
		if(intSet.add(10)) {
			System.out.println("O numero '10' já existe");
		}
	}
}

public class App {
	public static void main(String[] args) {
		Set<Integer> intSet = new HashSet<>();
		intSet.add(10)
		intSet.add(20);
		if (intSet.isEmpty()) {
			System.out.println("Esta vazio!");
		} else {
			System.out.println("Não esta vazio!");
		}
		intSet.clear();
		System.out.println("O tamanho do Set é: " + intSet.size());
	}
}

// Comparação entre List e Set
/*
| Característica			| List							| Set								|
|---------------------------|-------------------------------|-----------------------------------|
| Permite duplicados		| Sim							| Não 								|
| Mantém ordem de inserção	| Sim							| Depende da implementação			|
| Acesso por índice			| Sim (`get(index)`)			| Não								|
| Implementações populares	| ArrayList, LinkedList			| HashSet, LinkedHashSet, TreeSet	|
*/

// Exemplos de uso

import java.util.*;

public class Comparacao {
	public static void main(String[] args) {
		// Exemplo de List
		List<String> lista = new ArrayList<>();
		lista.add("A");
		lista.add("B");
		lista.add("A"); // Permite duplicados
		System.out.println("Lista: " + lista);

		// Exemplo de Set
		Set<String> conjunto = new HashSet<>();
		conjunto.add("A");
		conjunto.add("B");
		conjunto.add("A"); // Ignora duplicados
		System.out.println("Conjunto: " + conjunto);
	}
}

