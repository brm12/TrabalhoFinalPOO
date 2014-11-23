package TrabalhoFinal;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Vendedor extends Pessoa {
	private int codigoVendedor;
	Cliente cliente = new Cliente();
	List<Cliente> ListaClientes = new ArrayList<Cliente>(1000);
	Compra compra = new Compra();
	Veiculo veiculo = new Veiculo();
	
	public void setCodigoVendedor(int codigoVendedor){
		this.codigoVendedor = codigoVendedor;
	}
	
	public int getCodigoVendedor(){
		return this.codigoVendedor;
	}
	
	public void venderVeiculo(Veiculo veiculo){
		
	}
	
	public void cadastrarCliente(String nome, String cpf, String email, String telefone, int idade, String bairro, String estado, String cidade, String rua, int numero){
		this.cliente.setNome(nome);
		this.cliente.setCpf(cpf);
		this.cliente.setEmail(email);
		this.cliente.setTelefone(telefone);
		this.cliente.setIdade(idade);
		this.cliente.endPessoa.setBairro(bairro);
		this.cliente.endPessoa.setEstado(estado);
		this.cliente.endPessoa.setNomeCidade(cidade);
		this.cliente.endPessoa.setNomeRua(rua);
		this.cliente.endPessoa.setNumero(numero);
		
	}
	
	public void cadastrarVeiculo(int codigo, String modelo, String marca, String nome, double preco, int ano){	
		File arquivo = new File("Teste.txt");
		try( FileWriter fw = new FileWriter(arquivo, true) ){
		    fw.write(codigo +"|\n"+ modelo + "|\n"+ marca + "|\n"+ nome + "|\n"+ preco + "|\n" +ano + "|\n");
		    fw.close();
		}
		catch(IOException ex){
		  ex.printStackTrace();
		}		
	}
	
	public void exibirVeiculo() throws IOException, IOException{
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(new FileReader("Teste.txt")).useDelimiter("\\|\\n");
		compra.listaVeiculos.removeAll(ListaClientes);
		
		for(int i = 0; scanner.hasNext(); i++){
			while (scanner.hasNext()){
				this.veiculo.setCodigo(scanner.nextInt());
				System.out.println(veiculo.getCodigo());
				this.veiculo.setModeloVeiculo(scanner.next());
				System.out.println(veiculo.getModeloVeiculo());
				this.veiculo.setMarcaVeiculo(scanner.next());
				System.out.println(veiculo.getMarcaVeiculo());
				this.veiculo.setNomeVeiculo(scanner.next());
				System.out.println(veiculo.getNomeVeiculo());
				this.veiculo.setPrecoVeiculo(scanner.next());
				System.out.println(veiculo.getPrecoVeiculo());
				this.veiculo.setAnoVeiculo(scanner.next());
				System.out.println(veiculo.getAnoVeiculo());
			}
			compra.listaVeiculos.add(i, this.veiculo);
		}

	}

	public void exibirCliente(Cliente exibeCliente){
		
	}
}
