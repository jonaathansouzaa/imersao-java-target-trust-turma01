package calculadora;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {

	@Test
	public void testSomar2Mais3IgualA5() {
		int numero1 = 2;
		int numero2 = 3;
		int expectativa = 5;
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(numero1, numero2);
		Assert.assertEquals(expectativa, resultado);
	}
	
	@Test
	public void testSomar3Mais5IgualA8() {
		int numero1 = 3;
		int numero2 = 5;
		int expectativa = 8;
		Calculadora calc = new Calculadora();
		int resultado = calc.somar(numero1, numero2);
		Assert.assertEquals(expectativa, resultado);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRetornaExcecaoSeNumero1ForNegativo() {
		int numero1 = -1;
		int numero2 = 10;
		
		Calculadora calc = new Calculadora();
		calc.somar(numero1, numero2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRetornaExcecaoSeNumero2ForNegativo() {
		int numero1 = 10;
		int numero2 = -1;
		
		Calculadora calc = new Calculadora();
		calc.somar(numero1, numero2);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testRetornaExcecaoSeAmbosNumerosForemNegativo() {
		int numero1 = -10;
		int numero2 = -1;
		
		Calculadora calc = new Calculadora();
		calc.somar(numero1, numero2);
	}
	
	
}
