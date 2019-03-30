package br.com.atm.app;

import br.com.atm.dao.ContaCorrenteDAO;
import br.com.atm.model.ContaCorrente;
import br.com.atm.model.Pessoa;

public class ContaCorrenteOperacoes {

	private ContaCorrenteDAO contaCorrenteDAO = new ContaCorrenteDAO();
	
	public boolean realizarSaque(Double valor, Pessoa pessoa) {
		ContaCorrente contaCorrente = contaCorrenteDAO.buscarPeloCPF(pessoa.getCpf());
		if (valor > 0 && contaCorrente.getSaldo() >= valor) {
			contaCorrente.setSaldo(contaCorrente.getSaldo() - valor);
			return true;
		}
		return false;
	}
	
	public boolean realizarDeposito(Double valor, Pessoa pessoa) {
		ContaCorrente contaCorrente = contaCorrenteDAO.buscarPeloCPF(pessoa.getCpf());
		if (valor > 0) {
			contaCorrente.setSaldo(contaCorrente.getSaldo() + valor);
			return true;
		}
		return false;
	}
	
	public boolean realizaTransferencia(Double valor, Pessoa pessoa, Pessoa pessoaDestino) {
		ContaCorrente contaCorrente = contaCorrenteDAO.buscarPeloCPF(pessoa.getCpf());
		ContaCorrente contaCorrenteDestino = contaCorrenteDAO.buscarPeloCPF(pessoaDestino.getCpf());
		if (contaCorrenteDestino != null && valor > 0 && contaCorrente.getSaldo() >= valor) {
			contaCorrente.setSaldo(contaCorrente.getSaldo() - valor);
			contaCorrenteDestino.setSaldo(contaCorrenteDestino.getSaldo() + valor);
			return true;
		}
		return false;
	}
	
}
