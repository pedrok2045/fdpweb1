package br.com.fabricadeprogramador.persistencia.jdbc;

import br.com.fabricadeprogramador.entidades.Usuario;
import br.com.fabricadeprogramador.persistencia.DAO.UsuarioDAO;

public class TestConexao {

	public static void main(String[] args) {
		UsuarioDAO usuarioDAO = new UsuarioDAO();

		Usuario usuario = new Usuario("Pedro3", "login", "senha");

		usuarioDAO.cadastrar(usuario);
	}

}
