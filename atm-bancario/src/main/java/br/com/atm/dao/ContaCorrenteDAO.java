package br.com.atm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import br.com.atm.connection.JDBCConnection;
import br.com.atm.model.ContaCorrente;

public class ContaCorrenteDAO implements DAO<ContaCorrente> {

	@Override
	public void incluir(ContaCorrente contaCorrente) {
		Connection conexao = null;
		PreparedStatement ps = null;
		try {
			String sql = "INSERT INTO conta_corrente (saldo, pessoa_id) values (?, ?)";
			conexao = JDBCConnection.getConnection();
			ps = conexao.prepareStatement(sql);
			ps.setDouble(1, contaCorrente.getSaldo());
			ps.setInt(2, contaCorrente.getPessoa().getPessoaId());
			ps.execute();
		} catch (SQLException exception) {
			exception.printStackTrace();
		} finally {
			close(conexao, ps);
		}
	}

	@Override
	public void atualizar(ContaCorrente contaCorrente) {
		Connection conexao = null;
		PreparedStatement ps = null;
		try {
			String sql = "UPDATE conta_corrente SET saldo = ? WHERE conta_corrente_id = ?";
			conexao = JDBCConnection.getConnection();
			ps = conexao.prepareStatement(sql);
			ps.setDouble(1, contaCorrente.getSaldo());
			ps.setInt(2, contaCorrente.getContaCorrenteId());
			ps.execute();
		} catch (SQLException exception) {
			exception.printStackTrace();
		} finally {
			close(conexao, ps);
		}
	}

	@Override
	public void deletar(ContaCorrente contaCorrente) {
		Connection conexao = null;
		PreparedStatement ps = null;
		try {
			String sql = "DELETE FROM conta_corrente WHERE conta_corrente_id = ?";
			conexao = JDBCConnection.getConnection();
			ps = conexao.prepareStatement(sql);
			ps.setInt(1, contaCorrente.getContaCorrenteId());
			ps.execute();
		} catch (SQLException exception) {
			exception.printStackTrace();
		} finally {
			close(conexao, ps);
		}
	}

	@Override
	public List<ContaCorrente> listar() {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void close(Connection conexao, PreparedStatement ps) {
		try {
			if (conexao != null) {
				conexao.close();
			}
			if (ps != null) {
				ps.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	
}
