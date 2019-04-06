package com.atm.dao;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.atm.dao.ContaCorrenteDAO;
import br.com.atm.model.ContaCorrente;
import br.com.atm.model.Pessoa;

public class ContaCorrenteDAOTest {

	private ContaCorrenteDAO contaCorrenteDAO;
	
	private Pessoa jonathan = new Pessoa("Jonathan", "01234567890");
	private Pessoa bruno = new Pessoa("Bruno", "01231231230");
	private Pessoa pricila = new Pessoa("Pricila", "09876543210");

	private ContaCorrente contaCorrenteJonathan = new ContaCorrente(jonathan, 0.0);
	private ContaCorrente contaCorrenteBruno = new ContaCorrente(bruno, 100.0);
	private ContaCorrente contaCorrentePricila = new ContaCorrente(pricila, 500.0);

	@Before
	public void setaInformacoesParaODAO() {
		List<ContaCorrente> listaDeContas = new ArrayList<ContaCorrente>();
		listaDeContas.add(contaCorrenteJonathan);
		listaDeContas.add(contaCorrenteBruno);
		listaDeContas.add(contaCorrentePricila);
		contaCorrenteDAO = new ContaCorrenteDAO(listaDeContas);
	}
	
	@Test
	public void retornaPessoaCasoEuRecebaUmCPFExistenteNaBase() {
		String cpf = "01234567890";
		
		ContaCorrente contaCorrente = contaCorrenteDAO.buscarPeloCPF(cpf);
		Assert.assertEquals(jonathan.getNome(), contaCorrente.getPessoa().getNome());
		Assert.assertEquals(jonathan.getCpf(), contaCorrente.getPessoa().getCpf());
	}
	
	
}
