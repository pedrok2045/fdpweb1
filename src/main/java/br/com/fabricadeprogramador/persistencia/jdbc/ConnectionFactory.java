package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class ConnectionFactory {
	private static final String DRIVER = "postgresql";
	private static final String ENDERECO = "localhost";
	private static final String PORTA = "5432";
	private static final String BANCO_DE_DADOS = "fabricawebdb";
	private static final String LOGIN = "postgres";
	private static final String SENHA = "postgres";
	private static Connection connection;

	public static final Connection getConnection() {
		try {
			if (connection == null)
				connection = DriverManager.getConnection(
						"jdbc:" + DRIVER + "://" + ENDERECO + ":" + PORTA + "/" + BANCO_DE_DADOS, LOGIN, SENHA);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
