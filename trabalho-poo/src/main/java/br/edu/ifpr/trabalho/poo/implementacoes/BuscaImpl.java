package br.edu.ifpr.trabalho.poo.implementacoes;

import java.util.ArrayList;

import br.edu.ifpr.trabalho.poo.dao.AlunoDAO;
import br.edu.ifpr.trabalho.poo.dao.CampusDAO;
import br.edu.ifpr.trabalho.poo.dao.CursoDAO;
import br.edu.ifpr.trabalho.poo.dao.DisciplinaDAO;
import br.edu.ifpr.trabalho.poo.dao.MatriculaDAO;
import br.edu.ifpr.trabalho.poo.dao.ProfessorDAO;
import br.edu.ifpr.trabalho.poo.dao.TurmaDAO;
import br.edu.ifpr.trabalho.poo.interfaces.IBuscaDeDados;
import br.edu.ifpr.trabalho.poo.modelo.*;

public class BuscaImpl implements IBuscaDeDados {

	public ArrayList<Matricula> buscarMatriculasAtivas() {
		MatriculaDAO dao = new MatriculaDAO();
		ArrayList<Matricula> a = dao.buscarMatriculas();
		for (Matricula c : a) {
			if (!c.getSituacao()) {
				a.remove(c);
			}
		}
		return a;
	}

	public ArrayList<Matricula> buscarTodasMatriculas() {
		MatriculaDAO dao = new MatriculaDAO();
		ArrayList<Matricula> a = dao.buscarMatriculas();
		return a;
	}

	public ArrayList<Aluno> buscarAlunos() {
		AlunoDAO dao = new AlunoDAO();
		ArrayList<Aluno> a = dao.buscarAlunos();
		return a;
	}

	public ArrayList<Turma> buscarTurmas() {
		TurmaDAO dao = new TurmaDAO();
		ArrayList<Turma> a = dao.buscarTurmas();
		return a;
	}

	public ArrayList<Professor> buscarProfessores() {
		ProfessorDAO dao = new ProfessorDAO();
		ArrayList<Professor> a = dao.buscarProfessores();
		return a;
	}

	public ArrayList<Disciplina> buscarDisciplinas() {
		DisciplinaDAO dao = new DisciplinaDAO();
		ArrayList<Disciplina> a = dao.buscarDisciplinas();
		return a;
	}

	public ArrayList<Curso> buscarCursos() {
		CursoDAO dao = new CursoDAO();
		ArrayList<Curso> a = dao.buscarCursos();
		return a;
	}

	public ArrayList<Campus> buscarCampi() {
		CampusDAO dao = new CampusDAO();
		ArrayList<Campus> a = dao.buscarCampi();
		return a;
	}

}
