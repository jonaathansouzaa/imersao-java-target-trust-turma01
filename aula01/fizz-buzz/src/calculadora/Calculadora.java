package calculadora;

public class Calculadora {

	public int somar(int numero1, int numero2) {
		if (numero1 < 0 || numero2 < 0) {
			throw new IllegalArgumentException();
		}
		return numero1 + numero2;
	}

}
