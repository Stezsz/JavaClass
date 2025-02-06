import java.util.*;
import java.util.stream.Collectors;

public class StreamOperations {
	public static void main(String[] args) {
		// Exemplo de filter: Filtra elementos com base em uma condição
		List<String> nomes = Arrays.asList("Ana", "Carlos", "Bia", "Daniel");
		List<String> filtrado = nomes.stream()
									 .filter(nome -> nome.startsWith("A"))
									 .collect(Collectors.toList());
		System.out.println("Filtrados: " + filtrado); // Resultado: ["Ana"]

		// Exemplo de map: Transforma cada elemento em outro tipo
		List<String> nomesMap = Arrays.asList("Ana", "Carlos", "Bia");
		List<Integer> tamanhos = nomesMap.stream()
										.map(String::length)
										.collect(Collectors.toList());
		System.out.println("Tamanhos: " + tamanhos); // Resultado: [3, 6, 3]

		// Exemplo de sorted: Ordena os elementos
		List<String> nomesOrdenados = Arrays.asList("Carlos", "Ana", "Bia");
		List<String> ordenado = nomesOrdenados.stream()
											 .sorted()
											 .collect(Collectors.toList());
		System.out.println("Ordenados: " + ordenado); // Resultado: ["Ana", "Bia", "Carlos"]

		// Exemplo de distinct: Remove elementos duplicados
		List<Integer> numeros = Arrays.asList(1, 2, 2, 3, 3, 3);
		List<Integer> unicos = numeros.stream()
									  .distinct()
									  .collect(Collectors.toList());
		System.out.println("Unicos: " + unicos); // Resultado: [1, 2, 3]

		// Exemplo de limit: Limita o stream a n elementos
		List<Integer> limitados = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> limitado = limitados.stream()
										  .limit(3)
										  .collect(Collectors.toList());
		System.out.println("Limitados: " + limitado); // Resultado: [1, 2, 3]

		// Exemplo de skip: Ignora os primeiros n elementos
		List<Integer> pulados = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> pulado = pulados.stream()
									  .skip(2)
									  .collect(Collectors.toList());
		System.out.println("Pulados: " + pulado); // Resultado: [3, 4, 5]

		// Exemplo de forEach: Executa uma ação para cada elemento
		System.out.println("forEach:");
		nomes.forEach(System.out::println); // Saída: Ana Carlos Bia

		// Exemplo de collect: Coleta os elementos em uma coleção
		Set<String> conjunto = nomes.stream()
									.collect(Collectors.toSet());
		System.out.println("Conjunto: " + conjunto); // Resultado: [Ana, Carlos, Bia]

		// Exemplo de reduce: Reduz os elementos a um único valor
		List<Integer> numerosReduce = Arrays.asList(1, 2, 3, 4, 5);
		int soma = numerosReduce.stream()
								.reduce(0, Integer::sum);
		System.out.println("Soma: " + soma); // Resultado: 15

		// Exemplo de count: Retorna o número de elementos no stream
		long quantidade = numerosReduce.stream().count();
		System.out.println("Quantidade: " + quantidade); // Resultado: 5

		// Exemplo de anyMatch: Verifica se algum elemento atende a uma condição
		boolean temPares = numerosReduce.stream().anyMatch(n -> n % 2 == 0);
		System.out.println("Tem pares? " + temPares); // Resultado: true
	}
}
