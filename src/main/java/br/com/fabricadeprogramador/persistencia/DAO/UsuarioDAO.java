package br.com.fabricadeprogramador.persistencia.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.entidades.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.ConnectionFactory;

public class UsuarioDAO {

	private Connection con;

	public UsuarioDAO() {
		this.con = ConnectionFactory.getConnection();
	}

	public void cadastrar(Usuario usuario) {
		String sql = "insert into usuario (nome, login, senha) values(?, ?, ?)";

		try {
			PreparedStatement stm = con.prepareStatement(sql);
			stm.setString(1, usuario.getNome());
			stm.setString(2, usuario.getLogin());
			stm.setString(3, usuario.getSenha());
			stm.execute();
			stm.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void alterar(Usuario usuario) {
		String sql = "update usuario set nome=?, login=?, senha=? where id=?";

		try {
			PreparedStatement stm = con.prepareStatement(sql);

			stm.setString(1, usuario.getNome());
			stm.setString(2, usuario.getLogin());
			stm.setString(3, usuario.getSenha());
			stm.setInt(4, usuario.getId());

			stm.execute();
			stm.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
