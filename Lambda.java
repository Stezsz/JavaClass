import java.util.Arrays;
import java.util.List;

// Para compilar: javac Lambda.java
// Para executar: java Lambda
public class Lambda {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Hello World");
			}
		};

		Runnable r2 = () -> System.out.println("Hello World");
		// Com lambda, o código fica mais limpo e fácil de entender

		r.run();
		r2.run();

		List<String> palavras = Arrays.asList("java", "lambda", "stream", "api");
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
		// Ordena a lista de palavras pelo tamanho
		palavras.forEach(s -> System.out.println(s));

	}
}
