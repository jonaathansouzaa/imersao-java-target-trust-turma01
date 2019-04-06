package br.com.atm.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {

	public static Connection getConnection() {
		try {
			String url = "jdbc:mysql://127.0.0.1:3306/atm-bancario?useTimezone=true&serverTimezone=UTC";
			String user = "vote";
			String password = "vote@123";
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			System.out.println("Erro ao conectar ao banco.");
			e.printStackTrace();
		}
		return null;
	}
	
}
