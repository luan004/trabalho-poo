package br.edu.ifpr.trabalho.poo.modelo;

public class Professor extends Pessoa {

	private String siape;

	public Professor() {

	}

	public Professor(String nome, String cpf, String telefone, String endereco, String dataNascimento, String siape) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.siape = siape;
	}

	public Professor(int idPessoa, String nome, String cpf, String telefone, String endereco, String dataNascimento,
			String siape) {
		this.idPessoa = idPessoa;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.dataNascimento = dataNascimento;
		this.siape = siape;
	}

	public String getSiape() {
		return siape;
	}

	public void setSiape(String siape) {
		this.siape = siape;
	}

	@Override
	public void imprimirDados() {
		System.out.println(""
				+ "Nome: " + getNome() + "\n"
				+ "CPF: " + getCpf() + "\n"
				+ "Telefone: " + getTelefone() + "\n"
				+ "Endereco: " + getEndereco() + "\n"
				+ "Data de Nascimento: " + getDataNascimento() + "\n"
				+ "Siape: " + getSiape());
		
	}

}
