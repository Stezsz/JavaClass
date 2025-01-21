//Polimorfismo
// Criar a super class Animal com um método fazerBarulho()
class Animal {
	public void fazerBarulho() {
		System.out.println("O animal faz barulho...");
	}
}

// Criar a sub class Cachorro que herda de Animal e sobrescreve o método fazerBarulho()
class Cachorro extends Animal {
	@Override
	public void fazerBarulho() {
		System.out.println("Au au!");
	}
}

// Criar a sub class Gato que herda de Animal e sobrescreve o método fazerBarulho()
class Gato extends Animal {
	@Override
	public void fazerBarulho() {
		System.out.println("Miau!");
	}
}

public class Main {
	public static void main(String[] args) {
		// Criar um objeto do tipo Cachorro
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();

		// Criar um array de animais
		Animal[] animais = {cachorro, gato};

		// Percorrer o array e chamar o método fazerBarulho() de cada animal
		for (Animal animal : animais) {
			animal.fazerBarulho();
		}
	}
}
