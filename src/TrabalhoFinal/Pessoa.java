package TrabalhoFinal;

abstract class Pessoa {
	Endereco endPessoa = new Endereco();
	String nome;
	String cpf;
	String email;
	String telefone;
	int idade;
	
	public Endereco getEndPessoa() {
		return endPessoa;
	}
	public void setEndPessoa(Endereco endPessoa) {
		this.endPessoa = endPessoa;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
}
