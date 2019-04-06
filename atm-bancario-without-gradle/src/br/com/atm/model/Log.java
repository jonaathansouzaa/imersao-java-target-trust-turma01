package br.com.atm.model;

import br.com.atm.enums.OperacaoEnum;

public class Log {

	private String nomePessoa;
	private OperacaoEnum operacaoEnum;
	private Double valorOperacao;

	public Log() {
	}
	
	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public OperacaoEnum getOperacaoEnum() {
		return operacaoEnum;
	}

	public void setOperacaoEnum(OperacaoEnum operacaoEnum) {
		this.operacaoEnum = operacaoEnum;
	}

	public Double getValorOperacao() {
		return valorOperacao;
	}

	public void setValorOperacao(Double valorOperacao) {
		this.valorOperacao = valorOperacao;
	}

}
