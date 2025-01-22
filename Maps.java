/*
HashMap:
Uma implementação baseada em HashTable.

LinkedHashMap:
Uma implementação que se utiliza uma HashTable e Linked List.

TreeMap:
Uma implementação baseada em Red Black Tree,
necessario a implementação da interface Comparator,
ela mantém a ordenação de acordo com a estrutura de árvore.
*/

//Instanciando os Maps
public class App {
	public static void main(String[] args) {
		Map<String, String> hashMap = new HashMap<>();
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		Map<String, String> treeMap = new TreeMap<>();
	}
}

//Manipulando os Maps
public class App {
	public static void main(String args[]) {
		Map<String, String> map = new HashMap<>();
		map.put("key1", "value1"); //Add
		map.put("key2", "value2");
		map.put("key1", "value3"); //Caso já exista a chave, o valor é substituido.
		map.remove("key1"); //Remove a chave e o valor
		map.remove("key2", "value2"); //Remove somente o valor

		if (map.containsKey("key1")) { //Verifica se a chave existe
			String valorKey1 = map.get("key1"); //Obtem o valor da chave
		} else {
			//Chave não encontrada
		}
		Set<String> keys = map.keySet(); //Retorna um Set com todas as chaves
		for (String key : keys) {
			String value = map.get(key); // Imprime todas as chaves e valores
			System.out.println(key + " = " + value);
		}
	}
}
