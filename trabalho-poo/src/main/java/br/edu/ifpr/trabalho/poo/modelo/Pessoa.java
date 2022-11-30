package br.edu.ifpr.trabalho.poo.modelo;

public abstract class Pessoa {
	
	protected int idPessoa;
	protected String nome;
	protected String cpf;
	protected String telefone;
	protected String endereco;
	protected String dataNascimento;
	
	public abstract void imprimirDados();
	
	public Pessoa() {
		
	}
	
	public Pessoa(int idPessoa,String nome,String cpf,String telefone,String endereco,String dataNascimento) {
		this.idPessoa=idPessoa;
		this.nome = nome;
		this.cpf=cpf;
		this.telefone=telefone;
		this.endereco=endereco;
		this.dataNascimento=dataNascimento;
	}
	
	public Pessoa(String nome,String cpf,String telefone,String endereco,String dataNascimento) {
		this.nome = nome;
		this.cpf=cpf;
		this.telefone=telefone;
		this.endereco=endereco;
		this.dataNascimento=dataNascimento;
	}

	public int getIdPessoa() {
		return idPessoa;
	}



	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	

}
