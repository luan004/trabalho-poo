package br.edu.ifpr.trabalho.poo.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import br.edu.ifpr.trabalho.poo.conexao.Conexao;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;

public class AlunoDAO {

	public Aluno lerDadosAluno() {
		@SuppressWarnings("resource")
		Scanner teclado = new Scanner(System.in);

		System.out.println("Nome do aluno:");
		String nome = teclado.nextLine();
		System.out.println("CPF do aluno:");
		String cpf = teclado.nextLine();
		System.out.println("Telefone do aluno:");
		String telefone = teclado.nextLine();
		System.out.println("Endereco do aluno:");
		String endereco = teclado.nextLine();
		System.out.println("Data de nascimento do aluno:");
		String dataNascimento = teclado.nextLine();
		System.out.println("Ano de ingresso do aluno:");
		int anoIngresso = teclado.nextInt();

		Aluno aluno = new Aluno(0, nome, cpf, telefone, endereco, dataNascimento, anoIngresso);
		return aluno;
	}

	public ArrayList<Aluno> buscarAlunos() {
		ArrayList<Aluno> listaDeAluno = new ArrayList<Aluno>();
		String SQL = "SELECT * FROM tb_aluno";
		try {
			PreparedStatement SQLPreparada = Conexao.getConexao().prepareStatement(SQL);
			ResultSet resultado = SQLPreparada.executeQuery();
			while (resultado.next()) {
				Aluno aluno = new Aluno();
				aluno.setIdPessoa(resultado.getInt("id_pessoa"));
				aluno.setNome(resultado.getString("nome"));
				aluno.setCpf(resultado.getString("cpf"));
				aluno.setTelefone(resultado.getString("telefone"));
				aluno.setEndereco(resultado.getString("endereco"));
				aluno.setDataNascimento(resultado.getString("data_nascimento"));
				listaDeAluno.add(aluno);
			}
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return listaDeAluno;
	}

	public void salvarAluno(Aluno aluno) {
		String SQL = "INSERT INTO tb_aluno (id_pessoa, nome, cpf, telefone, endereco, data_nascimento) VALUES (?, ?, ?, ?, ?, ?)";
		try {
			PreparedStatement preparacaoDaInstrucao = Conexao.getConexao().prepareStatement(SQL);
			preparacaoDaInstrucao.setInt(1, aluno.getIdPessoa());
			preparacaoDaInstrucao.setString(2, aluno.getNome());
			preparacaoDaInstrucao.setString(3, aluno.getCpf());
			preparacaoDaInstrucao.setString(4, aluno.getTelefone());
			preparacaoDaInstrucao.setString(5, aluno.getEndereco());
			preparacaoDaInstrucao.setString(6, aluno.getDataNascimento());

			preparacaoDaInstrucao.executeUpdate();
		} catch (SQLException excecao) {
			excecao.printStackTrace();
		}
	}

	// Transformacao
	public Aluno transformarResultSetEmObjeto(ResultSet resultSet) throws SQLException {
		Aluno aluno = new Aluno();
		try {
			aluno.setIdPessoa(resultSet.getInt("id_pessoa"));
			aluno.setNome(resultSet.getString("nome"));
			aluno.setCpf(resultSet.getString("cpf"));
			aluno.setTelefone(resultSet.getString("telefone"));
			aluno.setEndereco(resultSet.getString("endereco"));
			aluno.setDataNascimento(resultSet.getString("data_nascimento"));
			return aluno;
		} catch (SQLException e) {
			e.printStackTrace();
			throw new SQLException("Erro ao transformar");
		}

	}

}
