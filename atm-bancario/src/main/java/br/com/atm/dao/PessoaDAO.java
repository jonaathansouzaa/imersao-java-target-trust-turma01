package br.com.atm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.atm.connection.JDBCConnection;
import br.com.atm.model.Pessoa;

public class PessoaDAO implements DAO<Pessoa> {

	@Override
	public void incluir(Pessoa pessoa) {
		try {
			String comandoSQL = "INSERT INTO pessoa (nome, cpf) values (?, ?)";

			Connection conexao = JDBCConnection.getConnection();

			PreparedStatement ps = conexao.prepareStatement(comandoSQL);
			ps.setString(1, pessoa.getNome());
			ps.setString(2, pessoa.getCpf());

			ps.execute();

			conexao.close();
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
	}

	@Override
	public void atualizar(Pessoa pessoa) {
		try {
			String comandoSQL = "UPDATE pessoa SET nome = ?, cpf = ? WHERE pessoa_id = ?";

			Connection conexao = JDBCConnection.getConnection();

			PreparedStatement ps = conexao.prepareStatement(comandoSQL);
			ps.setString(1, pessoa.getNome());
			ps.setString(2, pessoa.getCpf());
			ps.setInt(3, pessoa.getPessoaId());

			ps.execute();

			conexao.close();
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
	}

	@Override
	public void deletar(Pessoa pessoa) {
		try {
			String comandoSQL = "DELETE FROM pessoa WHERE pessoa_id = ?";

			Connection conexao = JDBCConnection.getConnection();

			PreparedStatement ps = conexao.prepareStatement(comandoSQL);
			ps.setInt(1, pessoa.getPessoaId());

			ps.execute();

			conexao.close();
		} catch (SQLException exception) {
			exception.printStackTrace();
		}
	}

	@Override
	public List<Pessoa> listar() {
		try {
			String comandoSQL = "SELECT * FROM pessoa";

			Connection conexao = JDBCConnection.getConnection();
			PreparedStatement ps = conexao.prepareStatement(comandoSQL);
			ResultSet resultSet = ps.executeQuery();
			
			List<Pessoa> pessoas = new ArrayList<Pessoa>();
			while(resultSet.next()) {
				Pessoa pessoa = new Pessoa();
				pessoa.setPessoaId(resultSet.getInt("pessoa_id"));
				pessoa.setNome(resultSet.getString("nome"));
				pessoa.setCpf(resultSet.getString("cpf"));
				pessoas.add(pessoa);
			}

			conexao.close();
			
			return pessoas;
		} catch(SQLException exception) {
			
		}
		
		return null;
	}

}
