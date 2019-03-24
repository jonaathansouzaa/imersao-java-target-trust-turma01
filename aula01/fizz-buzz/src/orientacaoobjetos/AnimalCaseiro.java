package orientacaoobjetos;

public abstract class AnimalCaseiro implements CoisasQueOsAnimaisFazem {

	@Override
	public void comer() {
		System.out.println("Estou comendo!");
	}
	
	private EspecieEnum especie;
	private Integer quantidadeDePatas;
	private String corDoPelo;
	private Double tamanhoRabo;
	
	public void setEspecie(EspecieEnum especie) {
		this.especie = especie;
	}
	
	public EspecieEnum getEspecie() {
		return this.especie;
	}

	public Integer getQuantidadeDePatas() {
		return quantidadeDePatas;
	}

	public void setQuantidadeDePatas(Integer quantidadeDePatas) {
		this.quantidadeDePatas = quantidadeDePatas;
	}

	public String getCorDoPelo() {
		return corDoPelo;
	}

	public void setCorDoPelo(String corDoPelo) {
		this.corDoPelo = corDoPelo;
	}

	public Double getTamanhoRabo() {
		return tamanhoRabo;
	}

	public void setTamanhoRabo(Double tamanhoRabo) {
		this.tamanhoRabo = tamanhoRabo;
	}
	
}
