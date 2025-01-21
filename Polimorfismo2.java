//Polimorfismo com interfaces
// Criar a interface Animal com um método fazerBarulho()
interface Animal {
	public void fazerBarulho();
}

// Criar a classe Cachorro que implementa a interface Animal
class Cachorro implements Animal {
	@Override
	public void fazerBarulho() {
		System.out.println("Au au!");
	}
}

// Criar a classe Gato que implementa a interface Animal
class Gato implements Animal {
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
		// Saída:
		// Au au!
		// Miau!
	}
}
