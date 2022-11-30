package br.edu.ifpr.trabalho.poo.modelo;

public class Campus {
	
	private int idCampus;
	
	private String endereco;
	private String nome;
	private String cidade;
	
	public Campus() {
		
	}
	
	public Campus(String nome, String endereco, String cidade) {
		this.endereco = endereco;
		this.nome = nome;
		this.cidade = cidade;
	}

	public Campus(int idCampus, String nome, String endereco, String cidade) {
		this.idCampus = idCampus;
		this.endereco = endereco;
		this.nome = nome;
		this.cidade = cidade;
	}

	public int getIdCampus() {
		return idCampus;
	}

	public void setIdCampus(int idCampus) {
		this.idCampus = idCampus;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
}
