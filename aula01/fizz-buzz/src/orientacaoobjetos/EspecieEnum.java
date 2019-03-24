package orientacaoobjetos;

public enum EspecieEnum {

	MAMIFERO(1, "Mamifero"), REPTIL(2, "Reptil"), AVE(3, "Ave");
	
	private Integer codigo;
	private String descricao;
	
	EspecieEnum(Integer codigo, String descricao) {
		this.codigo = codigo;
		this.descricao = descricao;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

}
