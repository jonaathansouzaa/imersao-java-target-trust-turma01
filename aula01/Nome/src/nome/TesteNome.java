package nome;

import org.junit.Assert;
import org.junit.Test;

public class TesteNome {
	// @Test
	public void teste() {
		String nome = "Rafael";
		for (int contador = 0; contador < nome.length(); contador++) {
			if (nome.toUpperCase().charAt(contador) == 'T') {
				System.out.println("Nome inválido");
			} else if (nome.toUpperCase().charAt(contador) == 'P') {
				System.out.println("Você foi premiado");
			} else if ((nome.toUpperCase().charAt(contador) == 'A') || (nome.toUpperCase().charAt(contador) == 'E')) {
				System.out.println("Volte Semana que vem");
			}
		}
	}

	@Test
	public void testeQueContenhaT() {
		String nome = "Tamires";
		Nome validaNome = new Nome();
		boolean contemT = validaNome.validarSeContemT(nome);
		Assert.assertTrue(contemT);
	}

	@Test
	public void testeQueNaoContenhaT() {
		String nome = "Rafael";
		Nome validaNome = new Nome();
		boolean contemT = validaNome.validarSeContemT(nome);
		Assert.assertFalse(contemT);
	}

	@Test
	public void testQueContenhaTEMeRetorneMensagemNomeInvalido() {
		String nome = "Tiago";
		Nome validaNome = new Nome();
		String retorno = validaNome.validaRetorno(nome);
		Assert.assertEquals("Nome inválido", retorno);
	}

	@Test
	public void testeQueContenhaP() {
		String nome = "Paula";
		Nome validaNome = new Nome();
		boolean contemP = validaNome.validarSeContemP(nome);
		Assert.assertTrue(contemP);
	}

	@Test
	public void testeQueNaoContenhaP() {
		String nome = "Rafael";
		Nome validaNome = new Nome();
		boolean contemP = validaNome.validarSeContemP(nome);
		Assert.assertFalse(contemP);
	}

	@Test
	public void testQueContenhaPEMeRetorneMensagemVoceFoiPremiado() {
		String nome = "Pedro";
		Nome validaNome = new Nome();
		String retorno = validaNome.validaRetorno(nome);
		Assert.assertEquals("Você foi premiado", retorno);
	}

	@Test
	public void testeQueContenhaAeE() {
		String nome = "Eduarda";
		Nome validaNome = new Nome();
		boolean contemAeE = validaNome.validarSeContemAeE(nome);
		Assert.assertTrue(contemAeE);
	}

	@Test
	public void testeQueNaoContenhaAeE() {
		String nome = "Bruno";
		Nome validaNome = new Nome();
		boolean contemAeE = validaNome.validarSeContemAeE(nome);
		Assert.assertFalse(contemAeE);
	}

	@Test
	public void testQueContenhaAeEEMeRetorneMensagemVolteSemanaQueVem() {
		String nome = "Eduarda";
		Nome validaNome = new Nome();
		String retorno = validaNome.validaRetorno(nome);
		Assert.assertEquals("Volte Semana que Vem", retorno);
	}

	@Test
	public void testQueNaoContenhaAeEEMeRetorneNulo() {
		String nome = "Bruno";
		Nome validaNome = new Nome();
		String retorno = validaNome.validaRetorno(nome);
		Assert.assertEquals(null, retorno);
	}

}
