import br.com.atm.dao.PessoaDAO;
import br.com.atm.model.Pessoa;

public class App {
	
    public static void main(String[] args) {
    	
    	PessoaDAO pessoaDAO = new PessoaDAO();
    	pessoaDAO.incluir(new Pessoa("Pedro", "123"));
    	pessoaDAO.incluir(new Pessoa("João", "1234"));
    	pessoaDAO.incluir(new Pessoa("Maria", "234"));
    	
    	System.out.println("Lista das pessoas");
    	
    	pessoaDAO.listar().forEach(pessoa -> System.out.println("Nome: " + pessoa.getNome() 
    				+ "/ CPF: " + pessoa.getCpf()));
	}
}
