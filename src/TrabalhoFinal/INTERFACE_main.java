package TrabalhoFinal;

import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.JTextField;


public class INTERFACE_main {

	private JFrame TelaLogin, TelaMenu, TelaCadVeiculo, TelaConsultarVeiculo, TelaExibirVeiculos, TelaCadCliente, ConsultarCliente;
	private JList<String> list;
	private DefaultListModel<String> model;
	private JPasswordField passwordField;
	private JTextField ruaCliente, bairroCliente, cidadeCliente, numeroCliente, estadoCliente, txtDigiteASenha, cadModeloVeiculo, cadMarcaVeiculo, cadNomeVeiculo, cadAnoVeiculo, cadPrecoVeiculo, consulModelo, consulCodigo, nomeCliente, cpfCliente, emailCliente, telCliente, idadeCliente;
	Vendedor vendedor = new Vendedor();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					INTERFACE_main window = new INTERFACE_main();
					window.TelaLogin.setVisible(true);
					window.TelaMenu.setVisible(false);
					window.TelaCadVeiculo.setVisible(false);
					window.TelaConsultarVeiculo.setVisible(false);
					window.TelaExibirVeiculos.setVisible(false);
					window.TelaCadCliente.setVisible(false);
					//window.ConsultarCliente.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public INTERFACE_main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
        ///////////////////////////////////////JANELAS///////
		
		TelaLogin = new JFrame();
		TelaLogin.setTitle("ENTRAR");
		TelaLogin.setResizable(false);
		TelaLogin.setBounds(750, 450, 250, 176);
		TelaLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TelaLogin.getContentPane().setLayout(null);
		
		TelaMenu = new JFrame();
		TelaMenu.setTitle("MENU");
		TelaMenu.setResizable(false);
		TelaMenu.setBounds(0, 0, 200, 280);
		TelaMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		TelaMenu.getContentPane().setLayout(null);
		
		TelaCadVeiculo = new JFrame();
		TelaCadVeiculo.setTitle("Cadastrar Veículo");
		TelaCadVeiculo.setResizable(false);
		TelaCadVeiculo.setBounds(201, 0, 500, 500);
		TelaCadVeiculo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		TelaCadVeiculo.getContentPane().setLayout(null);
		
		TelaConsultarVeiculo = new JFrame();
		TelaConsultarVeiculo.setTitle("Consultar Veículos");
		TelaConsultarVeiculo.setResizable(false);
		TelaConsultarVeiculo.setBounds(700, 0, 200, 200);
		TelaConsultarVeiculo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		TelaConsultarVeiculo.getContentPane().setLayout(null);
		
		TelaExibirVeiculos = new JFrame();
		TelaExibirVeiculos.setTitle("Veiculos Encontrados");
		TelaExibirVeiculos.setResizable(false);
		TelaExibirVeiculos.setBounds(1100, 0, 500, 810);
		TelaExibirVeiculos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		TelaExibirVeiculos.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBounds(10, 10, 490, 790);
		
		model = new DefaultListModel<String>();
        list = new JList<String>(model);
        list.setBounds(0, 0, 480, 770);
        panel.add(list);
        TelaExibirVeiculos.getContentPane().add(panel);
        
        TelaCadCliente = new JFrame();
		TelaCadCliente.setTitle("Cadastrar Cliente");
		TelaCadCliente.setResizable(false);
		TelaCadCliente.setBounds(201, 0, 500, 500);
		TelaCadCliente.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		TelaCadCliente.getContentPane().setLayout(null);
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		/////////////////////////////////////CAIXAS DE TEXTO//////////////////////////////////////////
		numeroCliente = new JTextField();
		numeroCliente.setText("Digite o numero da casa do Cliente");
		numeroCliente.setToolTipText("Digite o numero da casa do Cliente");
		numeroCliente.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				numeroCliente.setText("");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		
		});
		numeroCliente.setBounds(5, 350, 490, 42);
		numeroCliente.setColumns(70);
		TelaCadCliente.getContentPane().add(numeroCliente);
		
		estadoCliente = new JTextField();
		estadoCliente.setText("Digite o nome do estado do Cliente");
		estadoCliente.setToolTipText("Digite o nome do estado do Cliente");
		estadoCliente.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				estadoCliente.setText("");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		
		});
		estadoCliente.setBounds(5, 310, 490, 42);
		estadoCliente.setColumns(70);
		TelaCadCliente.getContentPane().add(estadoCliente);
		
		cidadeCliente = new JTextField();
		cidadeCliente.setText("Digite o nome da rua do Cliente");
		cidadeCliente.setToolTipText("Digite o nome da rua do Cliente");
		cidadeCliente.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				cidadeCliente.setText("");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		
		});
		cidadeCliente.setBounds(5, 310, 490, 42);
		cidadeCliente.setColumns(70);
		TelaCadCliente.getContentPane().add(cidadeCliente);
		
		bairroCliente = new JTextField();
		bairroCliente.setText("Digite o nome do bairro do Cliente");
		bairroCliente.setToolTipText("Digite o nome do bairro do Cliente");
		bairroCliente.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				bairroCliente.setText("");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		
		});
		bairroCliente.setBounds(5, 270, 490, 42);
		bairroCliente.setColumns(70);
		TelaCadCliente.getContentPane().add(bairroCliente);
		
		ruaCliente = new JTextField();
		ruaCliente.setText("Digite o nome da rua do Cliente");
		ruaCliente.setToolTipText("Digite o nome da rua do Cliente");
		ruaCliente.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				ruaCliente.setText("");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		
		});
		ruaCliente.setBounds(5, 230, 490, 42);
		ruaCliente.setColumns(70);
		TelaCadCliente.getContentPane().add(ruaCliente);
		
		
		nomeCliente = new JTextField();
		nomeCliente.setText("Digite o nome do Cliente");
		nomeCliente.setToolTipText("Digite o nome do Cliente");
		nomeCliente.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				nomeCliente.setText("");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		
		});
		nomeCliente.setBounds(5, 30, 490, 42);
		nomeCliente.setColumns(70);
		TelaCadCliente.getContentPane().add(nomeCliente);
		
		cpfCliente = new JTextField();
		cpfCliente.setText("Digite o CPF do Cliente");
		cpfCliente.setToolTipText("Digite o CPF do Cliente");
		cpfCliente.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				cpfCliente.setText("");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		
		});
		cpfCliente.setBounds(5, 70, 490, 42);
		cpfCliente.setColumns(70);
		TelaCadCliente.getContentPane().add(cpfCliente);
		
		emailCliente = new JTextField();
		emailCliente.setText("Digite o e-mail do Cliente");
		emailCliente.setToolTipText("Digite o e-mail do Cliente");
		emailCliente.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				emailCliente.setText("");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		
		});
		emailCliente.setBounds(5, 110, 490, 42);
		emailCliente.setColumns(70);
		TelaCadCliente.getContentPane().add(emailCliente);
		
		telCliente = new JTextField();
		telCliente.setText("Digite o telefone do Cliente");
		telCliente.setToolTipText("Digite o telefone do Cliente");
		telCliente.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				telCliente.setText("");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		
		});
		telCliente.setBounds(5, 150, 490, 42);
		telCliente.setColumns(70);
		TelaCadCliente.getContentPane().add(telCliente);
		
		idadeCliente = new JTextField();
		idadeCliente.setText("Digite a idade do Cliente");
		idadeCliente.setToolTipText("Digite a idade do Cliente");
		idadeCliente.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				idadeCliente.setText("");
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
		
		});
		idadeCliente.setBounds(5, 190, 490, 42);
		idadeCliente.setColumns(3);
		TelaCadCliente.getContentPane().add(idadeCliente);

		
		consulCodigo = new JTextField();
		consulCodigo.setText("Digite o codigo do veiculo");
		consulCodigo.setToolTipText("Digite o codigo do veiculo");
		consulCodigo.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				consulCodigo.setText("");
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		consulCodigo.setBounds(5, 5, 190, 42);
		TelaConsultarVeiculo.getContentPane().add(consulCodigo);
		
		cadAnoVeiculo = new JTextField();
		cadAnoVeiculo.setText("Digite o ano do veiculo");
		cadAnoVeiculo.setToolTipText("Digite o ano do veiculo");
		cadAnoVeiculo.addMouseListener(new MouseListener(){
			@Override
			public void mousePressed(MouseEvent e) {
				cadAnoVeiculo.setText("");
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		cadAnoVeiculo.setBounds(5, 190, 490, 42);
		cadAnoVeiculo.setColumns(70);
		TelaCadVeiculo.getContentPane().add(cadAnoVeiculo);
		
		cadPrecoVeiculo = new JTextField();
		cadPrecoVeiculo.setText("Digite o preço do veiculo");
		cadPrecoVeiculo.setToolTipText("Digite o preço do veiculo");
		cadPrecoVeiculo.addMouseListener(new MouseListener(){
			@Override
			public void mousePressed(MouseEvent e) {
				cadPrecoVeiculo.setText("");
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		cadPrecoVeiculo.setBounds(5, 150, 490, 42);
		cadPrecoVeiculo.setColumns(70);
		TelaCadVeiculo.getContentPane().add(cadPrecoVeiculo);
		
		cadNomeVeiculo  = new JTextField();
		cadNomeVeiculo.setText("Digite o nome do veiculo");
		cadNomeVeiculo.setToolTipText("Digite o nome do veiculo");
		cadNomeVeiculo.addMouseListener(new MouseListener(){

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mousePressed(MouseEvent e) {
				cadNomeVeiculo.setText("");
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		cadNomeVeiculo.setBounds(5, 110, 490, 42);
		TelaCadVeiculo.getContentPane().add(cadNomeVeiculo);
		
		cadModeloVeiculo = new JTextField();
		cadModeloVeiculo.setText("Digite o modelo do veiculo");
		cadModeloVeiculo.setToolTipText("Digite o modelo do veiculo");
		cadModeloVeiculo.addMouseListener(new MouseListener(){
			@Override
			public void mousePressed(MouseEvent e) {
				cadModeloVeiculo.setText("");
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		cadModeloVeiculo.setBounds(5, 30, 490, 42);
		cadModeloVeiculo.setColumns(70);
		TelaCadVeiculo.getContentPane().add(cadModeloVeiculo);
		
		cadMarcaVeiculo = new JTextField();
		cadMarcaVeiculo.setText("Digite a marca do veiculo");
		cadMarcaVeiculo.setToolTipText("Digite a marca do veiculo");
		cadMarcaVeiculo.addMouseListener(new MouseListener(){
			@Override
			public void mousePressed(MouseEvent e) {
				cadMarcaVeiculo.setText("");
			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		cadMarcaVeiculo.setBounds(5, 70, 490, 42);
		cadMarcaVeiculo.setColumns(70);
		TelaCadVeiculo.getContentPane().add(cadMarcaVeiculo);
		
		passwordField = new JPasswordField();
		final String senha = "coffee";
		passwordField.setBounds(6, 28, 238, 40);
		TelaLogin.getContentPane().add(passwordField);

		txtDigiteASenha = new JTextField();
		txtDigiteASenha.setText("Digite a senha:");
		txtDigiteASenha.setEditable(false);
		txtDigiteASenha.setBackground(null);
		txtDigiteASenha.setBorder(null);
		txtDigiteASenha.setBounds(16, 6, 134, 28);	
		txtDigiteASenha.setColumns(10);	
		TelaLogin.getContentPane().add(txtDigiteASenha);
		
		////////////////////////////////////////////////////////////////////////////////////////////
		///////////////////////////BOTÕES/////////
		
		JButton btnOkCadC = new JButton("Cadastrar");
		btnOkCadC.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				vendedor.cadastrarCliente(nomeCliente.getText(), cpfCliente.getText(), emailCliente.getText(), telCliente.getText(), Integer.parseInt(idadeCliente.getText()), bairroCliente.getText(), estadoCliente.getText(), cidadeCliente.getText(), ruaCliente.getText(), Integer.parseInt(numeroCliente.getText()));
				
				nomeCliente.setText("Digite o nome do Cliente");
				cpfCliente.setText("Digite o CPF do Cliente");
				emailCliente.setText("Digite o e-mail do Cliente");
				telCliente.setText("Digite o telefone do Cliente");
				idadeCliente.setText("Digite a idade do Cliente");
				ruaCliente.setText("Digite o nome da rua do Cliente");
				bairroCliente.setText("Digite o nome do bairro do Cliente");
				estadoCliente.setText("Digite o nome do estado do Cliente");
				numeroCliente.setText("Digite o numero da casa do Cliente");
				cidadeCliente.setText("Digite o nome da cidade do Cliente");
			}
		});
		btnOkCadC.setBounds(200, 400, 100, 42);
		TelaCadCliente.getContentPane().add(btnOkCadC);
		
		JButton btnOkConsulV = new JButton("Consultar");
		btnOkConsulV.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				TelaExibirVeiculos.setVisible(true);
				
				try {
					vendedor.exibirVeiculo();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
				for(int i = 0; i < vendedor.compra.listaVeiculos.size(); i++){
					if(consulModelo.getText().compareTo(vendedor.compra.listaVeiculos.get(i).getModeloVeiculo()) == 0 && consulCodigo.getText().compareTo(vendedor.compra.listaVeiculos.get(i).getMarcaVeiculo()) == 0){
						model.addElement("Modelo: "+ vendedor.compra.listaVeiculos.get(i).getModeloVeiculo() +"\r\nMarca: "+ vendedor.compra.listaVeiculos.get(i).getMarcaVeiculo() +"\r\nNome: "+ vendedor.compra.listaVeiculos.get(i).getNomeVeiculo() + 
						"\r\nPreço: R$"+ vendedor.compra.listaVeiculos.get(i).getPrecoVeiculo() +"\r\nAno: "+ vendedor.compra.listaVeiculos.get(i).getAnoVeiculo() +"\r\n");
					}
					else{
						model.addElement("Nada encontrado!");
					}
				}

				consulModelo.setText("Digite o modelo do veiculo");
				consulCodigo.setText("Digite a marca do veiculo");
			}
		});
		btnOkConsulV.setBounds(50, 100, 100, 42);
		TelaConsultarVeiculo.getContentPane().add(btnOkConsulV);
		
		JButton btnOkCadV = new JButton("Cadastrar");
		btnOkCadV.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				vendedor.cadastrarVeiculo(cadModeloVeiculo.getText(), cadMarcaVeiculo.getText(), cadNomeVeiculo.getText(), Double.parseDouble(cadPrecoVeiculo.getText()), (int) Double.parseDouble(cadAnoVeiculo.getText()));
				
				cadMarcaVeiculo.setText("Digite a marca do veiculo");
				cadModeloVeiculo.setText("Digite o modelo do veiculo");
				cadPrecoVeiculo.setText("Digite o preço do veiculo");
				cadAnoVeiculo.setText("Digite o ano do veiculo");
				cadNomeVeiculo.setText("Digite o nome do veiculo");
				
			}
		});
		btnOkCadV.setBounds(200, 300, 100, 42);
		TelaCadVeiculo.getContentPane().add(btnOkCadV);
		
		JButton btnOkLogin = new JButton("Entrar");
		btnOkLogin.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				System.out.println(passwordField.getText());
				if(senha.equals(passwordField.getText())){
					TelaMenu.setVisible(true);
					TelaLogin.setVisible(false);
				}
				else{
					JOptionPane.showMessageDialog(TelaLogin, "Senha incorreta!");
				}
			}
		});
		btnOkLogin.setBounds(67, 92, 109, 42);
		TelaLogin.getContentPane().add(btnOkLogin);
		
		JButton btnVender = new JButton("Vender veículo");
		btnVender.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				
			}
		});
		btnVender.setBounds(0, 10, 200, 42);
		TelaMenu.getContentPane().add(btnVender);
		
		JButton btnCadastrarVeiculo = new JButton("Cadastrar Veículo");
		btnCadastrarVeiculo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				TelaCadVeiculo.setVisible(true);
			}
		});
		btnCadastrarVeiculo.setBounds(0, 60, 200, 42);
		TelaMenu.getContentPane().add(btnCadastrarVeiculo);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				TelaCadCliente.setVisible(true);
				TelaCadVeiculo.setVisible(false);
			}
		});
		btnCadastrarCliente.setBounds(0, 110, 200, 42);
		TelaMenu.getContentPane().add(btnCadastrarCliente);
		
		JButton btnExibirVeiculo = new JButton("Consultar Veículos");
		btnExibirVeiculo.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				TelaConsultarVeiculo.setVisible(true);
			}
		});
		btnExibirVeiculo.setBounds(0, 160, 200, 42);
		TelaMenu.getContentPane().add(btnExibirVeiculo);
		
		JButton btnExibirCliente = new JButton("Consultar Cliente");
		btnExibirCliente.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//add action
			}
		});
		btnExibirCliente.setBounds(0, 210, 200, 42);
		TelaMenu.getContentPane().add(btnExibirCliente);
	}
}
//////////////////////////////////////////////////////////////////////////////////////////////