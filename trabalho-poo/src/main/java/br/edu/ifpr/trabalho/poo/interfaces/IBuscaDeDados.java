package br.edu.ifpr.trabalho.poo.interfaces;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public interface IBuscaDeDados {
	/**
	 * Busca de dados do banco de dados
	 */
	ArrayList<Matricula> buscarMatriculasAtivas();

	ArrayList<Matricula> buscarTodasMatriculas();

	ArrayList<Aluno> buscarAlunos();

	ArrayList<Turma> buscarTurmas();

	ArrayList<Professor> buscarProfessores();

	ArrayList<Disciplina> buscarDisciplinas();

	ArrayList<Curso> buscarCursos();

	ArrayList<Campus> buscarCampi();
}