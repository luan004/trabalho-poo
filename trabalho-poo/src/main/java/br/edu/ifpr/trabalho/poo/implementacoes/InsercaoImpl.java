package br.edu.ifpr.trabalho.poo.implementacoes;

import br.edu.ifpr.trabalho.poo.dao.AlunoDAO;
import br.edu.ifpr.trabalho.poo.dao.CampusDAO;
import br.edu.ifpr.trabalho.poo.dao.CursoDAO;
import br.edu.ifpr.trabalho.poo.dao.DisciplinaDAO;
import br.edu.ifpr.trabalho.poo.dao.MatriculaDAO;
import br.edu.ifpr.trabalho.poo.dao.ProfessorDAO;
import br.edu.ifpr.trabalho.poo.dao.TurmaDAO;
import br.edu.ifpr.trabalho.poo.interfaces.IInserirDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class InsercaoImpl implements IInserirDados {

	public void salvarAluno(Aluno aluno) {
		AlunoDAO dao = new AlunoDAO();
		dao.salvarAluno(aluno);
		
	}

	public void salvarProfessor(Professor professor) {
		ProfessorDAO dao = new ProfessorDAO();
		dao.salvarProfessor(professor);
		
	}

	public void salvarCurso(Curso curso) {
		CursoDAO dao = new CursoDAO();
		dao.salvarCurso(curso);
		
	}

	public void salvarTurma(Turma turma) {
		TurmaDAO dao = new TurmaDAO();
		dao.salvarTurma(turma);
		
	}

	public void salvarDisciplina(Disciplina disciplina) {
		DisciplinaDAO dao = new DisciplinaDAO();
		dao.salvarDisciplina(disciplina);
		
	}

	public void salvarMatricula(Matricula matricula) {
		MatriculaDAO dao = new MatriculaDAO();
		dao.salvarMatricula(matricula);
		
	}

	public void salvarCampus(Campus campus) {
		CampusDAO dao = new CampusDAO();
		dao.salvarCampus(campus);
		
	}

}
