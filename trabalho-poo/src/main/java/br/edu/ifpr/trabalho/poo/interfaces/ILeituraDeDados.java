package br.edu.ifpr.trabalho.poo.interfaces;

import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public interface ILeituraDeDados {
	/**
	 * Leitura de dados a partir do teclado
	 */
	Aluno lerDadosAluno();

	Professor lerDadosProfessor();

	Curso lerDadosCurso();

	Turma lerDadosTurma();

	Turma lerDadosTurma(Curso curso);

	Disciplina lerDadosDisciplina(Professor professor, Turma turma);

	Matricula lerDadosMatricula();

	Matricula lerDadosMatricula(Aluno aluno, Turma turma);

	Campus lerDadosCampus();
}