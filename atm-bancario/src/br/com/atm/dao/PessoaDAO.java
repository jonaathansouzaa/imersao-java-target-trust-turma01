package br.com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.atm.model.Pessoa;

public class PessoaDAO implements DAO<Pessoa> {

	private List<Pessoa> listaDePessoas = new ArrayList<Pessoa>();
	
	@Override
	public void incluir(Pessoa pessoa) {
		listaDePessoas.add(pessoa);
	}

	@Override
	public void atualizar(Pessoa pessoaParaAtualizar) {
		for (Pessoa pessoa : listaDePessoas) {
			if (pessoa.getCpf().equals(pessoaParaAtualizar.getCpf())) {
				pessoa.setNome(pessoaParaAtualizar.getNome());
				pessoa.setDataNascimento(pessoaParaAtualizar.getDataNascimento());
			}
		}
	}

	@Override
	public void deletar(Pessoa pessoaParaDeletar) {
		Pessoa pessoaTemporaria = null;
		for (Pessoa pessoa : listaDePessoas) {
			if (pessoa.getCpf().equals(pessoaParaDeletar.getCpf())) {
				pessoaTemporaria = pessoa;
			}
		}
		listaDePessoas.remove(pessoaTemporaria);
	}

	@Override
	public List<Pessoa> listar() {
		return listaDePessoas;
	}

	
}
