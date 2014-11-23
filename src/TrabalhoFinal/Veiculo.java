package TrabalhoFinal;

public class Veiculo {
	private int codigo;
	private String modeloVeiculo = "";
	private String marcaVeiculo = "";
	private String nomeVeiculo = "";
	private String precoVeiculo;
	private String anoVeiculo;
	
	public void setModeloVeiculo(String modeloVeiculo){
		this.modeloVeiculo = modeloVeiculo;
	}
	
	public void setMarcaVeiculo(String marcaVeiculo){
		this.marcaVeiculo = marcaVeiculo;
	}
	
	public void setNomeVeiculo(String nomeVeiculo){
		this.nomeVeiculo = nomeVeiculo;
	}

	public void setPrecoVeiculo(String precoVeiculo){
		this.precoVeiculo = precoVeiculo;
	}
	
	public void setAnoVeiculo(String anoVeiculo){
		this.anoVeiculo = anoVeiculo;
	}
	
	public String getModeloVeiculo(){
		return this.modeloVeiculo;
	}
	
	public String getMarcaVeiculo(){
		return this.marcaVeiculo;
	}
	
	public String getNomeVeiculo(){
		return this.nomeVeiculo;
	}
	
	public String getPrecoVeiculo(){
		return this.precoVeiculo;
	}
	
	public String getAnoVeiculo(){
		return this.anoVeiculo;
	}
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
