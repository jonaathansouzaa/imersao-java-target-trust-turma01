package calculadora;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Carro {

	private Integer numeroRodas;
	private Integer numeroPortas;
	private String cor;
	private LocalDate data;
	LocalDateTime
	
	public Carro() {
		
	}
	
	public Carro(Integer numeroRodas) {
		this.numeroRodas = numeroRodas;
	}
	
	public void acelerarCarro() {
		System.out.println("Acelera diabo!");
	}
	
}
