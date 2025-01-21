//Polimorfismo Dinâmico
import java.util.Scanner;

public class Polimorfismo3 {
	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);

		Animal animal;

		System.out.println("Qaul animal você quer criar? (1 - Cachorro, 2 - Gato)");
		int opcao = leitor.nextInt();

		if (opcao == 1) {
			animal = new Cachorro();
		} else {
			animal = new Gato();
		}

		animal.fazerBarulho();
	}
}
class Animal {
	public void fazerBarulho() {
		System.out.println("Algum barulho de animal");
	}
}

class Cachorro extends Animal {
	@Override
	public void fazerBarulho() {
		System.out.println("Au Au");
	}
}

class Gato extends Animal {
	@Override
	public void fazerBarulho() {
		System.out.println("Miau");
	}
}
