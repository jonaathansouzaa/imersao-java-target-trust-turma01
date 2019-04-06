import br.com.atm.dao.ContaCorrenteDAO;
import br.com.atm.dao.PessoaDAO;
import br.com.atm.model.ContaCorrente;
import br.com.atm.model.Pessoa;

public class App {
	
    public static void main(String[] args) {
    	Pessoa pessoa = new Pessoa("Jonathan", "123123123");
    	PessoaDAO pessoaDAO = new PessoaDAO();
    	pessoaDAO.incluir(pessoa);
    	Pessoa jonathan = pessoaDAO.buscarPessoaPorCPF("123123123");
    	
    	ContaCorrenteDAO contaCorrenteDAO = new ContaCorrenteDAO();
    	ContaCorrente contaCorrente = new ContaCorrente(jonathan, 0.0);
    	contaCorrenteDAO.incluir(contaCorrente);
    	
	}
}
