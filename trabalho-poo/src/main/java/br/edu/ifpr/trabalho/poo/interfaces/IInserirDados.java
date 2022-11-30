package br.edu.ifpr.trabalho.poo.interfaces;

import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public interface IInserirDados {
	/**
	 * Inser��o de dados do banco de dados
	 */
	void salvarAluno(Aluno aluno);

	void salvarProfessor(Professor professor);

	void salvarCurso(Curso curso);

	void salvarTurma(Turma turma);

	void salvarDisciplina(Disciplina disciplina);

	void salvarMatricula(Matricula matricula);

	void salvarCampus(Campus campus);
}