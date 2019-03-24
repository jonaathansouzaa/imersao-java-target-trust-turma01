package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzApplicationTest {

	@Test
	public void testPrintFizz() {
		int numero = 1;
		boolean ehDivisivelPor3 = FizzBuzzApplication.validaSeONumeroEhDivisivelPor3(numero);
		Assert.assertFalse(ehDivisivelPor3);
		numero = 3;
		ehDivisivelPor3 = FizzBuzzApplication.validaSeONumeroEhDivisivelPor3(numero);
		Assert.assertTrue(ehDivisivelPor3);
	}
	
	@Test
	public void testPrintBuzz() {
		int numero = 1;
		boolean ehDivisivelPor5 = FizzBuzzApplication.validaSeONumeroEhDivisivelPor5(numero);
		Assert.assertFalse(ehDivisivelPor5);
		numero = 5;
		ehDivisivelPor5 = FizzBuzzApplication.validaSeONumeroEhDivisivelPor5(numero);
		Assert.assertTrue(ehDivisivelPor5);
	}
	
	@Test
	public void testPrintFizzBuzz() {
		int numero = 1;
		boolean ehDivisivelPor3ePor5 = FizzBuzzApplication.validaSeONumeroEhDivisivelPor3ePor5(numero);
		Assert.assertFalse(ehDivisivelPor3ePor5);
		numero = 15;
		ehDivisivelPor3ePor5 = FizzBuzzApplication.validaSeONumeroEhDivisivelPor3ePor5(numero);
		Assert.assertTrue(ehDivisivelPor3ePor5);
	}
	
	@Test
	public void testPrint() {
		int numero = 1;
		String print = FizzBuzzApplication.printNumeroOuFizzOuBuzz(numero);
		Assert.assertEquals("1", print);
		
		numero = 2;
		print = FizzBuzzApplication.printNumeroOuFizzOuBuzz(numero);
		Assert.assertEquals("2", print);
		
		numero = 3;
		print = FizzBuzzApplication.printNumeroOuFizzOuBuzz(numero);
		Assert.assertEquals("Fizz", print);
		
		numero = 5;
		print = FizzBuzzApplication.printNumeroOuFizzOuBuzz(numero);
		Assert.assertEquals("Buzz", print);
		
		numero = 15;
		print = FizzBuzzApplication.printNumeroOuFizzOuBuzz(numero);
		Assert.assertEquals("FizzBuzz", print);
	}
	
}
