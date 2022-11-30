package br.edu.ifpr.trabalho.poo.teste;

import br.edu.ifpr.trabalho.poo.dao.AlunoDAO;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;

public class TestaAluno {

	public static void main(String[] args) {

		AlunoDAO alunoDAO = new AlunoDAO();

		Aluno aluno = alunoDAO.lerDadosAluno();

		alunoDAO.salvarAluno(aluno);

		for (Aluno c : alunoDAO.buscarAlunos()) {
			System.out.println(c.getNome());
		}

	}

}
