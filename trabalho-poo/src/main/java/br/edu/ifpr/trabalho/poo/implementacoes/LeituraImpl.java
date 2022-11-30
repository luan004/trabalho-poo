package br.edu.ifpr.trabalho.poo.implementacoes;

import br.edu.ifpr.trabalho.poo.dao.AlunoDAO;
import br.edu.ifpr.trabalho.poo.dao.CampusDAO;
import br.edu.ifpr.trabalho.poo.dao.CursoDAO;
import br.edu.ifpr.trabalho.poo.dao.DisciplinaDAO;
import br.edu.ifpr.trabalho.poo.dao.MatriculaDAO;
import br.edu.ifpr.trabalho.poo.dao.ProfessorDAO;
import br.edu.ifpr.trabalho.poo.dao.TurmaDAO;
import br.edu.ifpr.trabalho.poo.interfaces.ILeituraDeDados;
import br.edu.ifpr.trabalho.poo.modelo.Aluno;
import br.edu.ifpr.trabalho.poo.modelo.Campus;
import br.edu.ifpr.trabalho.poo.modelo.Curso;
import br.edu.ifpr.trabalho.poo.modelo.Disciplina;
import br.edu.ifpr.trabalho.poo.modelo.Matricula;
import br.edu.ifpr.trabalho.poo.modelo.Professor;
import br.edu.ifpr.trabalho.poo.modelo.Turma;

public class LeituraImpl implements ILeituraDeDados{

	public Aluno lerDadosAluno() {
		AlunoDAO aluno = new AlunoDAO();
		return aluno.lerDadosAluno();
	}

	public Professor lerDadosProfessor() {
		ProfessorDAO professor = new ProfessorDAO();
		return professor.lerDadosProfessor();
	}

	public Curso lerDadosCurso() {
		CursoDAO curso = new CursoDAO();
		return curso.lerDadosCurso();
	}

	public Turma lerDadosTurma() {
		TurmaDAO turma = new TurmaDAO();
		return turma.lerDadosTurma();
	}

	public Turma lerDadosTurma(Curso curso) {
		TurmaDAO turma = new TurmaDAO();
		return turma.lerDadosTurma(curso);
	}
	
	public Disciplina lerDadosDisciplina() {
		DisciplinaDAO disciplina = new DisciplinaDAO();
		return disciplina.lerDadosDisciplina();
	}
	

	public Disciplina lerDadosDisciplina(Professor professor, Turma turma) {
		DisciplinaDAO disciplina = new DisciplinaDAO();
		return disciplina.lerDadosDisciplina(professor, turma);
	}
	
	public Campus lerDadosCampus() {
		CampusDAO campus = new CampusDAO();
		return campus.lerDadosCampus();
	}

	public Matricula lerDadosMatricula() {
		MatriculaDAO mat = new MatriculaDAO();
		return mat.lerDadosMatricula();
	}

	public Matricula lerDadosMatricula(Aluno aluno, Turma turma) {
		MatriculaDAO mat = new MatriculaDAO();
		return mat.lerDadosMatricula(aluno, turma);
	}



}
