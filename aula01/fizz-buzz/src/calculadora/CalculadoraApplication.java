package calculadora;

import javax.swing.JOptionPane;

public class CalculadoraApplication {

	public static void main(String[] args) {
		Integer valor1 = Integer.valueOf(JOptionPane.showInputDialog("Informe valor 1:"));
		Integer valor2 = Integer.valueOf(JOptionPane.showInputDialog("Informe valor 2:"));
		
		int resultado = new Calculadora().somar(valor1, valor2);
		
		System.out.print("O resultado é: " + resultado);
	}
	
}
