package br.edu.ifpr.trabalho.poo.modelo;

public class Aluno extends Pessoa {
	
	private int anoIngresso;
	
	
	public Aluno() {
		
	}
	
	public Aluno(String nome, String cpf, String telefone, String endereco, String dataNascimento, int anoIngresso) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.anoIngresso = anoIngresso;
	}
	
	public Aluno(int idPessoa, String nome, String cpf, String telefone, String endereco, String dataNascimento, int anoIngresso) {
		super();
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.anoIngresso = anoIngresso;
	}
	

	public int getAnoIngresso() {
		return anoIngresso;
	}

	public void setAnoIngresso(int anoIngresso) {
		this.anoIngresso = anoIngresso;
	}

	@Override
	public void imprimirDados() {
		System.out.println(""
				+ "Nome: " + getNome() + "\n"
				+ "CPF: " + getCpf() + "\n"
				+ "Telefone: " + getTelefone() + "\n"
				+ "Endereco: " + getEndereco() + "\n"
				+ "Data de Nascimento: " + getDataNascimento() + "\n"
				+ "Ano de Ingresso: " + getAnoIngresso());
		
	}
	
	

}
