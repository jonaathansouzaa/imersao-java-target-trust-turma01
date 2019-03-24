package orientacaoobjetos2;

import orientacaoobjetos.AnimalCaseiro;
import orientacaoobjetos.Cachorro;
import orientacaoobjetos.Elefante;
import orientacaoobjetos.Gato;

public class TrabalhandoComAnimais {

	public static void main(String[] args) {
		AnimalCaseiro cachorro = new Cachorro();
		AnimalCaseiro gato = new Gato();
		AnimalCaseiro elefante = new Elefante();
		
		cachorro.comer();
		gato.comer();
		elefante.comer();
	}
	
}
