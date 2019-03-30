package br.com.atm.app;

import javax.swing.JOptionPane;

import br.com.atm.dao.PessoaDAO;
import br.com.atm.model.Pessoa;

public class PessoaApp {

	public static void main(String[] args) {
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		Integer valorMenu = 1;
		while(valorMenu != 5) {
			valorMenu = Integer.parseInt(JOptionPane
					.showInputDialog("1 - Para inserir novas pessoas \n"
							+ "2 - Atualizar pessoa \n"
							+ "3 - Deletar pessoa \n"
							+ "4 - Listar pessoas \n"
							+ "5 - Sair do programa"));
			if (valorMenu == 1) {
				String nome = JOptionPane.showInputDialog("Informe seu nome");
				String cpf = JOptionPane.showInputDialog("Informe seu cpf");
				
				Pessoa pessoa = new Pessoa(nome, cpf, null);
				pessoaDAO.incluir(pessoa);
			} else if (valorMenu == 2) {
				String cpf = JOptionPane.showInputDialog("Informe seu cpf");
				String nome = JOptionPane.showInputDialog("Informe o novo nome");
				
				Pessoa pessoa = new Pessoa(nome, cpf, null);
				pessoaDAO.atualizar(pessoa);
			} else if (valorMenu == 3) {
				String cpf = JOptionPane.showInputDialog("Informe seu cpf");
				
				Pessoa pessoa = new Pessoa(null, cpf, null);
				pessoaDAO.deletar(pessoa);
			} else if (valorMenu == 4) {
				pessoaDAO.listar().forEach(
						pessoa -> System.out.println("Nome: " + pessoa.getNome() + " / " + "CPF: " + pessoa.getCpf()));
			}
			
		}
		
//		String nome = JOptionPane.showInputDialog("Informe seu nome");
//		String cpf = JOptionPane.showInputDialog("Informe seu cpf");
//		
//		Pessoa pessoa = new Pessoa(nome, cpf, null);
//		
//		pessoaDAO.incluir(pessoa);
//		
//		List<Pessoa> lista = pessoaDAO.listar();
//		List<String> nomes = new ArrayList<String>();
//		for(Pessoa pessoaLista : lista) {
//			nomes.add(pessoaLista.getNome());
//		}
//		
//		for(String nomePessoa: nomes) {
//			System.out.println(nomePessoa);
//		}
//
//		String novoNome = JOptionPane.showInputDialog("Informe novo nome");
//		pessoa.setNome(novoNome);
//		pessoaDAO.atualizar(pessoa);
//		
//		pessoaDAO.listar().stream()
//			.map(pessoaLista -> pessoaLista.getNome())
//			.forEach(nomePessoa -> System.out.println(nomePessoa));
//		
//		pessoaDAO.deletar(pessoa);
//		
//		pessoaDAO.listar()
//			.forEach(pessoaLista -> System.out.println(pessoaLista.getNome()));
//		System.out.println("Fim do programa");
	}
	
}
