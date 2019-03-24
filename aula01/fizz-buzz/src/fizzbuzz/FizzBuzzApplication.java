package fizzbuzz;

public class FizzBuzzApplication {
	
	private static final int CINCO = 5;
	private static final int ZERO = 0;

	public static void main(String[] args) {
		for (int contador = 1; contador < 101; contador++) {
			System.out.println(printNumeroOuFizzOuBuzz(contador));
		}
	}

	public static boolean validaSeONumeroEhDivisivelPor3(int numero) {
		return (numero % 3 == ZERO);
	}

	public static boolean validaSeONumeroEhDivisivelPor5(int numero) {
		return (numero % CINCO == ZERO);
	}

	public static boolean validaSeONumeroEhDivisivelPor3ePor5(int numero) {
		return validaSeONumeroEhDivisivelPor3(numero) 
				&& validaSeONumeroEhDivisivelPor5(numero);
	}

	public static String printNumeroOuFizzOuBuzz(int numero) {
		if (validaSeONumeroEhDivisivelPor3ePor5(numero)) {
			return "FizzBuzz";
		} else if (validaSeONumeroEhDivisivelPor3(numero)) {
			return "Fizz";
		} else if (validaSeONumeroEhDivisivelPor5(numero)) {
			return "Buzz";
		}
		return String.valueOf(numero);
	}
	
}
