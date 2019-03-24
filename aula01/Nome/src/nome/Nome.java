package nome;

public class Nome {

	public boolean validarSeContemT(String nome) {
		for (int contador = 0; contador < nome.length(); contador++) {
			if(nome.toUpperCase().charAt(contador) == 'T') {
				return true;
			}
		}
		return false;
	}

	
	public String validaRetorno(String nome) {
		if (validarSeContemT(nome) ) {
			
			return "Nome inválido";
			
		} else if (validarSeContemP(nome)) {
			
			return "Você foi premiado";
			
		} else if (validarSeContemAeE(nome)) {
			
			return "Volte Semana que Vem";
		} else {
			
			return null;
			
		}

	}
	
	public boolean validarSeContemP(String nome) {
		for (int contador = 0; contador < nome.length(); contador++) {
			if(nome.toUpperCase().charAt(contador) == 'P') {
				return true;
			}
		}
		return false;
	}
	
	
	public boolean validarSeContemAeE(String nome) {
		for (int contador = 0; contador < nome.length(); contador++) {
			if((nome.toUpperCase().charAt(contador) == 'A') || 
				(nome.toUpperCase().charAt(contador) == 'E')){
				return true;
			}
		}
		return false;
	}
	


}
