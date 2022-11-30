package br.edu.ifpr.trabalho.poo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.conexao.Conexao;
import br.edu.ifpr.trabalho.poo.modelo.Campus;

public class CampusDAO {

	public Campus lerDadosCampus() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.println("Nome do campus:");
		String nome = teclado.nextLine();
		System.out.println("Endereço do campus:");
		String endereco = teclado.nextLine();
		System.out.println("Cidade do campus:");
		String cidade = teclado.nextLine();

		Campus campus = new Campus(0, nome, endereco, cidade);
		return campus;
	}

	public ArrayList<Campus> buscarCampi() {
		ArrayList<Campus> listaDeCampus = new ArrayList<Campus>();
		String SQL = "SELECT * FROM tb_campus";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {
				Campus campus = new Campus();
				campus.setIdCampus(resultado.getInt("id_campus"));
				campus.setNome(resultado.getString("nome"));
				campus.setEndereco(resultado.getString("endereco"));
				campus.setCidade(resultado.getString("cidade"));
				listaDeCampus.add(campus);
			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeCampus;
	}

	public void salvarCampus(Campus campus) {
		String SQL = "INSERT INTO tb_campus (id_campus, nome, endereco, cidade) VALUES (?, ?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setInt(1, campus.getIdCampus());
			preparacaoDaInstrucao.setString(2, campus.getNome());
			preparacaoDaInstrucao.setString(3, campus.getEndereco());
			preparacaoDaInstrucao.setString(4, campus.getCidade());
			preparacaoDaInstrucao.executeUpdate();
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}
	}

	// Transformacao
	public Campus transformarResultSetEmObjeto(ResultSet resultSet) throws SQLException {
		Campus campus = new Campus();
		try {
			campus.setIdCampus(resultSet.getInt("id_campus"));
			campus.setNome(resultSet.getString("nome"));
			campus.setEndereco(resultSet.getString("endereco"));
			campus.setCidade(resultSet.getString("cidade"));
			return campus;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao transformar");
		}

	}

}
