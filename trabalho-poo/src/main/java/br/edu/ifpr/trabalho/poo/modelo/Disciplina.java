package br.edu.ifpr.trabalho.poo.modelo;

public class Disciplina {

	private String nome;
	//private int cargaHoraria;
	private Professor professor;
	private Turma turma;
	private int idDisciplina;

	public Disciplina() {

	}

	public Disciplina(int idDisciplina, String nome, Professor professor, Turma turma) {
		this.idDisciplina = idDisciplina;
		this.nome = nome;
		//this.cargaHoraria = cargaHoraria;
		this.professor = professor;
		this.turma = turma;
	}

	public Disciplina(String nome, Professor professor, Turma turma) {
		this.nome = nome;
		//this.cargaHoraria = cargaHoraria;
		this.professor = professor;
		this.turma = turma;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

//	public int getCargaHoraria() {
//		return cargaHoraria;
//	}
//
//	public void setCargaHoraria(int cargaHoraria) {
//		this.cargaHoraria = cargaHoraria;
//	}

	public int getIdDisciplina() {
		return idDisciplina;
	}

	public void setIdDisciplina(int idDisciplina) {
		this.idDisciplina = idDisciplina;
	}

}
