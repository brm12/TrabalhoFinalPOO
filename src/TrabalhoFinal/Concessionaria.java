package TrabalhoFinal;

public class Concessionaria {
	Endereco endConcessionaria = new Endereco();
	private String nomeConcessionaria;
	private String cnpjConcessionaria;
	private String telefone;
	
	public void setNomeConcessionaria(String nomeConcessionaria){
		this.nomeConcessionaria=nomeConcessionaria;
	}
	
	public void setCnpjConcessionaria(String cnpjConcessionaria){
		this.cnpjConcessionaria=cnpjConcessionaria;
	}
	
	public void setTelefone(String telefone){
		this.telefone=telefone;
	}
	
	public String getNomeConcessionaria(){
		return this.nomeConcessionaria;
	}
	
	public String getCnpjConcessionaria(){
		return this.cnpjConcessionaria;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
}
