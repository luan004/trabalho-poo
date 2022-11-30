package br.edu.ifpr.trabalho.poo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.conexao.Conexao;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class TurmaDAO {

	public Turma lerDadosTurma() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.println("Nome da turma:");
		String nome = teclado.nextLine();
		System.out.println("Numero minimo da turma:");
		int numeroMinimo = teclado.nextInt();
		System.out.println("Ano de ingresso da turma:");
		int anoIngresso = teclado.nextInt();

		System.out.println("Código (ID) do curso");
		int idCurso = teclado.nextInt();

		Curso curso = new Curso();
		curso.setIdCurso(idCurso);

		Turma turma = new Turma(0, nome, numeroMinimo, anoIngresso, curso);
		return turma;
	}

	public Turma lerDadosTurma(Curso curso) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.println("Nome da turma:");
		String nome = teclado.nextLine();
		System.out.println("Numero minimo da turma:");
		int numeroMinimo = teclado.nextInt();
		System.out.println("Ano de ingresso da turma:");
		int anoIngresso = teclado.nextInt();

		Turma turma = new Turma(0, nome, numeroMinimo, anoIngresso, curso);
		return turma;
	}

	public ArrayList<Turma> buscarTurmas() {
		ArrayList<Turma> listaDeTurmas = new ArrayList<Turma>();
		String SQL = "SELECT * FROM tb_turma";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {

				Turma turma = new Turma();
				turma.setIdTurma(resultado.getInt("id_turma"));
				turma.setNome(resultado.getString("nome"));
				turma.setNumeroMinimo(resultado.getInt("numero_minimo"));
				turma.setAnoIngresso(resultado.getInt("ano_ingresso"));
				listaDeTurmas.add(turma);

			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeTurmas;
	}

	public void salvarTurma(Turma turma) {
		String SQL = "INSERT INTO tb_turma (id_turma, nome, numero_minimo, ano_ingresso, fk_curso) VALUES (?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setInt(1, turma.getIdTurma());
			preparacaoDaInstrucao.setString(2, turma.getNome());
			preparacaoDaInstrucao.setInt(3, turma.getNumeroMinimo());
			preparacaoDaInstrucao.setInt(4, turma.getAnoIngresso());
			preparacaoDaInstrucao.setInt(5, turma.getCurso().getIdCurso());

			preparacaoDaInstrucao.executeUpdate();
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}
	}

	// Transformacao
	public Turma transformarResultSetEmObjeto(ResultSet resultSet) throws SQLException {
		Turma turma = new Turma();
		try {
			turma.setIdTurma(resultSet.getInt("id_turma"));
			turma.setNome(resultSet.getString("nome"));
			turma.setNumeroMinimo(resultSet.getInt("numero_minimo"));
			turma.setAnoIngresso(resultSet.getInt("ano_ingresso"));
			return turma;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao transformar");
		}

	}

}
