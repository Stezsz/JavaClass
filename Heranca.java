public class Heranca {
	public static void main(String args[]) {
		// Cria uma instância da classe Cachorro
		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();

		// Chama o método comer da classe Animal (superclasse)
		cachorro.comer();

		// Chama o método latir da classe Cachorro (subclasse)
		cachorro.latir();

		cachorro.fazerBarulho(); // Chama o método fazerBarulho da classe Cachorro
		gato.fazerBarulho(); // Chama o método fazerBarulho da classe
	}
}

// Classe base Animal
class Animal {
	public void comer() {
		System.out.println("Comendo...");
	}
	public void fazerBarulho() {
		System.out.println("Fazendo barulho...");
	}
}

// Classe Cachorro que herda de Animal
class Cachorro extends Animal {
	public void latir() {
		System.out.println("Latindo...");
	}
	@Override // Sobrescreve o método fazerBarulho da classe Animal.
	public void fazerBarulho() {
		System.out.println("Au Au...");
	}
}

class Gato extends Animal {

}

//Gato não possui o método latir, mas possui o método fazerBarulho herdado da classe Animal.
