package br.edu.ifpr.trabalho.poo.modelo;

public class Turma {

	private int idTurma;

	private String nome;
	private int numeroMinimo;
	private int anoIngresso;
	private Curso curso;

	public Turma() {

	}

	public Turma(String nome, int numeroMinimo, int anoIngresso, Curso curso) {
		this.nome = nome;
		this.numeroMinimo = numeroMinimo;
		this.anoIngresso = anoIngresso;
		this.curso = curso;
	}

	public Turma(int idTurma, String nome, int numeroMinimo, int anoIngresso, Curso curso) {
		this.idTurma = idTurma;
		this.nome = nome;
		this.numeroMinimo = numeroMinimo;
		this.anoIngresso = anoIngresso;
		this.curso = curso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroMinimo() {
		return numeroMinimo;
	}

	public void setNumeroMinimo(int numeroMinimo) {
		this.numeroMinimo = numeroMinimo;
	}

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public int getIdTurma() {
		return idTurma;
	}

	public void setIdTurma(int idTurma) {
		this.idTurma = idTurma;
	}

}
