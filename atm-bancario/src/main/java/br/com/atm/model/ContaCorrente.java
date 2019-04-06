package br.com.atm.model;

public class ContaCorrente {

	private Integer contaCorrenteId;
	private Double saldo;
	private Pessoa pessoa;

	public ContaCorrente(Double saldo) {
		this.saldo = saldo;
	}
	
	public ContaCorrente(Pessoa pessoa, Double saldo) {
		this.pessoa = pessoa;
		this.saldo = saldo;
	}

	public Integer getContaCorrenteId() {
		return contaCorrenteId;
	}

	public void setContaCorrenteId(Integer contaCorrenteId) {
		this.contaCorrenteId = contaCorrenteId;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	public Double getSaldo() {
		return saldo;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
}
