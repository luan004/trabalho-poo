package br.edu.ifpr.trabalho.poo.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static final String URL = "jdbc:mysql://localhost:3306/matricula";
	private static final String USUARIO = "root";
	private static final String SENHA = "";
	private static Connection conexao = null;

	private Conexao() {

	};

	public static Connection getConexao() {
		if (conexao == null) {
			try {
				conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return conexao;
	}
}
