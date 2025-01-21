import java.util.Scanner;
import java.io.*;

public class Leitor {
	public static void main(String[] args) throws IOException {
		// Chama o método leitor para ler o conteúdo do arquivo
		leitor();
		// Chama o método escritor para escrever no arquivo
		escritor();
	}

	public static void escritor() throws IOException {
		// Cria um BufferedWriter para escrever no arquivo "try.txt"
		BufferedWriter escritor = new BufferedWriter(new FileWriter("try.txt"));
		Scanner scanner = new Scanner(System.in);
		System.out.println("Escreva algo: ");
		// Lê a linha digitada pelo usuário
		String linha = scanner.nextLine();
		// Escreve a linha no arquivo
		escritor.write(linha);
		// Fecha o BufferedWriter
		escritor.close();
	}

	public static void leitor() throws IOException {
		// Cria um BufferedReader para ler do arquivo "try.txt"
		BufferedReader leitor = new BufferedReader(new FileReader("try.txt"));
		String linha = null;
		// Lê cada linha do arquivo e imprime no console
		while ((linha = leitor.readLine()) != null) {
			System.out.println(linha);
		}
		// Fecha o BufferedReader
		leitor.close();
	}
}
