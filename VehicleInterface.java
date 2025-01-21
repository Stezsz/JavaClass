// Interface que define a estrutura básica de um Veículo
public interface Vehicle {
	void acelerar();
	void frear();
}

// Classe que representa um Carro, implementando a interface Veículo
public class Carro implements Vehicle {
	// Método para simular a aceleração do carro
	public void acelerar() {
		System.out.println("Acelerando");
	}
	// Método para simular a frenagem do carro
	public void frear() {
		System.out.println("Freando");
	}
}

// Classe que representa uma Bicicleta, implementando a interface Veículo
public class Bicicleta implements Vehicle {
	// Método para simular a aceleração da bicicleta
	public void acelerar() {
		System.out.println("Bicicleta Acelerando");
	}
	// Método para simular a frenagem da bicicleta
	public void frear() {
		System.out.println("Bicicleta Freando");
	}
}

// Classe principal para testar as implementações de Veículo
public class VehicleInterface {
	public static void main(String[] args) {
		// Criando um objeto Carro
		Vehicle carro = new Carro();
		// Criando um objeto Bicicleta
		Vehicle bicicleta = new Bicicleta();
		// Testando os métodos do Carro
		carro.acelerar();
		carro.frear();
		// Testando os métodos da Bicicleta
		bicicleta.acelerar();
		bicicleta.frear();
	}
}
//Ponto principal: Com interface, posso adicinar quando veículos quiser usando somente Vehicle como class, sem a interface, teria que criar uma classe para cada veiculo.
