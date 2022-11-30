package br.edu.ifpr.trabalho.poo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.conexao.Conexao;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class MatriculaDAO {

	public Matricula lerDadosMatricula() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("RA da matricula:");
		String ra = teclado.nextLine();
		System.out.println("Data da matricula:");
		String data = teclado.nextLine();

		System.out.println("Situação da matricula (EM BOOLEAN \"true\" OU \"false\"):");
		boolean situacao = teclado.nextBoolean();

		System.out.println("Código da turma");
		int idTurma = teclado.nextInt();

		Turma turma = new Turma();
		turma.setIdTurma(idTurma);

		System.out.println("Código do aluno");
		int IdPessoa = teclado.nextInt();

		Aluno aluno = new Aluno();
		aluno.setIdPessoa(IdPessoa);

		Matricula matricula = new Matricula(ra, data, situacao, turma, aluno);
		return matricula;
	}

	public Matricula lerDadosMatricula(Aluno aluno, Turma turma) {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);
		System.out.println("RA da matricula:");
		String ra = teclado.nextLine();
		System.out.println("Data da matricula:");
		String data = teclado.nextLine();

		System.out.println("Situação da matricula (EM BOOLEAN \"true\" OU \"false\"):");
		boolean situacao = teclado.nextBoolean();

		Matricula matricula = new Matricula(ra, data, situacao, turma, aluno);
		return matricula;
	}

	public ArrayList<Matricula> buscarMatriculas() {
		ArrayList<Matricula> listaDeMatriculas = new ArrayList<Matricula>();
		String SQL = "SELECT * FROM tb_matricula";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {

				Matricula matricula = new Matricula();
				matricula.setIdMatricula(resultado.getInt("id_matricula"));
				matricula.setRa(resultado.getString("ra"));
				matricula.setData(resultado.getString("data"));
				matricula.setSituacao(resultado.getBoolean("situacao"));
				listaDeMatriculas.add(matricula);

			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeMatriculas;
	}

	public void salvarMatricula(Matricula matricula) {
		String SQL = "INSERT INTO tb_matricula (id_matricula, ra, data, situacao, fk_turma, fk_aluno) VALUES (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setInt(1, matricula.getIdMatricula());
			preparacaoDaInstrucao.setString(2, matricula.getRa());
			preparacaoDaInstrucao.setString(3, matricula.getData());
			preparacaoDaInstrucao.setBoolean(4, matricula.getSituacao());
			preparacaoDaInstrucao.setInt(5, matricula.getTurma().getIdTurma());
			preparacaoDaInstrucao.setInt(6, matricula.getAluno().getIdPessoa());

			preparacaoDaInstrucao.executeUpdate();
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}
	}

	// Transformacao
	public Matricula transformarResultSetEmObjeto(ResultSet resultSet) throws SQLException {
		Matricula matricula = new Matricula();
		try {
			matricula.setIdMatricula(resultSet.getInt("id_matricula"));
			matricula.setRa(resultSet.getString("ra"));
			matricula.setData(resultSet.getString("data"));
			matricula.setSituacao(resultSet.getBoolean("situacao"));
			return matricula;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao transformar");
		}

	}

}
