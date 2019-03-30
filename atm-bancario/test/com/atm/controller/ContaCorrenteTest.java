package com.atm.controller;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Test;

import br.com.atm.model.ContaCorrente;
import br.com.atm.model.Pessoa;

public class ContaCorrenteTest {

	private Pessoa julinho = new Pessoa("Julinho", "01234567890", LocalDate.of(1988, 8, 8));
	private Pessoa marquinhos = new Pessoa("Julinho", "09876543210", LocalDate.of(1989, 9, 9));
	
	@Test
	public void retornaNegativoCasoRealizeUmSaqueComSaldoInsuficiente() {
		Double valor = 100.0;
		Double saldoEsperado = 0.0;
		ContaCorrente contaCorrente = new ContaCorrente(saldoEsperado);
		Assert.assertFalse(contaCorrente.realizarSaque(valor, julinho));
		Assert.assertEquals(saldoEsperado, contaCorrente.getSaldo());
	}
	
	@Test
	public void retornaPositivoCasoRealizeUmSaqueComSaldoSuficiente() {
		Double valor = 100.0;
		Double saldoEsperado = 400.0;
		ContaCorrente contaCorrente = new ContaCorrente(500.0);
		Assert.assertTrue(contaCorrente.realizarSaque(valor, julinho));
		Assert.assertEquals(saldoEsperado, contaCorrente.getSaldo());
	}

	@Test
	public void retornaNegativoCasoRealizeUmSaqueComValorDeSaqueZero() {
		Double valor = 0.0;
		Double saldoEsperado = 100.0;
		ContaCorrente contaCorrente = new ContaCorrente(100.0);
		Assert.assertFalse(contaCorrente.realizarSaque(valor, julinho));
		Assert.assertEquals(saldoEsperado, contaCorrente.getSaldo());
	}
	
	@Test
	public void retornaPositivoCasoRealizeUmDepositoComValorMaiorQueZero() {
		Double valor = 228.0;
		Double saldoEsperado = 228.0;
		ContaCorrente contaCorrente = new ContaCorrente(0.0);
		Assert.assertTrue(contaCorrente.realizarDeposito(valor, julinho));
		Assert.assertEquals(saldoEsperado, contaCorrente.getSaldo());
	}
	
	@Test
	public void retornaNegativoCasoRealizeUmDepositoComValorZero() {
		Double valor = 0.0;
		Double saldoEsperado = 0.0;
		ContaCorrente contaCorrente = new ContaCorrente(0.0);
		Assert.assertFalse(contaCorrente.realizarDeposito(valor, julinho));
		Assert.assertEquals(saldoEsperado, contaCorrente.getSaldo());
	}
	
	@Test
	public void retornaNegativoCasoRealizeTransferenciaSemSaldoNaConta() {
		Double valorTransferencia = 100.0;
		Double saldoDaContaCorrenteAposTransferencia = 0.0;
		ContaCorrente contaCorrente = new ContaCorrente(0.0);
		Assert.assertFalse(contaCorrente.realizaTransferencia(valorTransferencia, julinho, marquinhos));
		Assert.assertEquals(saldoDaContaCorrenteAposTransferencia, contaCorrente.getSaldo());
	}
	
	@Test
	public void retornaPositivoCasoRealizeTransferenciaComSaldoNaConta() {
		Double valorTransferencia = 100.0;
		Double saldoDaContaCorrenteAposTransferencia = 0.0;
		ContaCorrente contaCorrente = new ContaCorrente(100.0);
		Assert.assertTrue(contaCorrente.realizaTransferencia(valorTransferencia, julinho, marquinhos));
		Assert.assertEquals(saldoDaContaCorrenteAposTransferencia, contaCorrente.getSaldo());
	}
	
	@Test
	public void retornaNegativoCasoRealizeUmaTransfereciaComValorDeZero() {
		Double valorTransferencia = 0.0;
		Double saldoDaContaCorrenteAposTransferencia = 100.0;
		ContaCorrente contaCorrente = new ContaCorrente(100.0);
		Assert.assertFalse(contaCorrente.realizaTransferencia(valorTransferencia, julinho, marquinhos));
		Assert.assertEquals(saldoDaContaCorrenteAposTransferencia, contaCorrente.getSaldo());
	}
	
	@Test
	public void retornaNegativoCasoRealizeUmaTransferenciaComValorMaiorQueZeroEPessoaNaoEstejaPreenchida() {
		Double valorTransferencia = 150.0;
		Double saldoDaContaCorrenteAposTransferencia = 500.0;
		ContaCorrente contaCorrente = new ContaCorrente(500.0);
		Assert.assertFalse(contaCorrente.realizaTransferencia(valorTransferencia, julinho, null));
		Assert.assertEquals(saldoDaContaCorrenteAposTransferencia, contaCorrente.getSaldo());
	}
	
}
