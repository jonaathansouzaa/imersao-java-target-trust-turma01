package br.com.atm.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import br.com.atm.model.Pessoa;

public class PessoaDAOTest {

	@Test
	public void testaIncluirPessoa() {
		Pessoa pessoaEsperada = new Pessoa("Eduarda", "27382733");
		
		PessoaDAO pessoaDAO = new PessoaDAO();
		pessoaDAO.incluir(pessoaEsperada);
		
		Pessoa pessoaAtual = pessoaDAO.listar().get(0);
		
		assertEquals(pessoaEsperada.getNome(), pessoaAtual.getNome());
		assertEquals(pessoaEsperada.getCpf(), pessoaAtual.getCpf());
		
		
	}
	
}
