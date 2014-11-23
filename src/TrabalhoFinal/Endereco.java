package TrabalhoFinal;

public class Endereco {
	private String nomeRua;
	private int numero;
	private String bairro;
	private String nomeCidade;
	private String estado;

	public void setNomeRua(String nomeRua){
		this.nomeRua=nomeRua;
	}
	
	public void setNumero(int numero){
		this.numero=numero;
	}
	
	public void setBairro(String bairro){
		this.bairro=bairro;
	}
	
	public void setNomeCidade(String nomeCidade){
		this.nomeCidade=nomeCidade;
	}
	
	public void setEstado(String estado){
		this.estado=estado;
	}
	
	public String getNomeRua(){
		return this.nomeRua;
	}
	
	
	public String getBairro(){
		return this.bairro;
	}
	
	public String getNomeCidade(){
		return this.nomeCidade;
	}
	
	public String getEstado(){
		return this.estado;
	}
	
	public int getNumero(){
		return this.numero;
	}
}
