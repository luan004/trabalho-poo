package br.edu.ifpr.trabalho.poo.modelo;

public class Curso {
	
	private int idCurso;
	
	private String nome;
	private String duracao;
	private String modalidade;
	
	private Campus campus;
	
	//private Campus campus;
	
	public Curso() {
		
	}
	
	public Curso(String nome, String duracao, String modalidade, Campus campus) {
		this.nome = nome;
		this.duracao = duracao;
		this.modalidade = modalidade;
		this.campus = campus;
	}
	
	public Curso(int idCurso, String nome, String duracao, String modalidade,  Campus campus) {
		this.idCurso = idCurso;
		this.nome = nome;
		this.duracao = duracao;
		this.modalidade = modalidade;
		this.campus = campus;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public String getModalidade() {
		return modalidade;
	}

	public void setModalidade(String modalidade) {
		this.modalidade = modalidade;
	}

	public int getIdCurso() {
		return idCurso;
	}

	public void setIdCurso(int idCurso) {
		this.idCurso = idCurso;
	}

	
	
	public Campus getCampus() {
		return campus;
	}

	public void setCampus(Campus campus) {
		this.campus = campus;
	}

	



}
