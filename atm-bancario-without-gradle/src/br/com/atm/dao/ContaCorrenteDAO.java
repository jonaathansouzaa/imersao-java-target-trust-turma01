package br.com.atm.dao;

import java.util.List;

import br.com.atm.model.ContaCorrente;

public class ContaCorrenteDAO {

	private List<ContaCorrente> listaDeContas;

	public ContaCorrenteDAO(List<ContaCorrente> listaDeContas) {
		this.listaDeContas = listaDeContas;
	}

	public ContaCorrenteDAO() {
	}

	public ContaCorrente buscarPeloCPF(String cpf) {
		ContaCorrente retorno = null;
		for (ContaCorrente contaCorrente : listaDeContas) {
			if (contaCorrente.getPessoa().getCpf().equals(cpf)) {
				retorno = contaCorrente;
			}
		}
		return retorno;
	}

	
	
}
