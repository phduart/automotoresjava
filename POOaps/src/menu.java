// java Program to create a JPanel with a Box layout and add components to it . 
import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
class menu extends JFrame { 

	static JFrame f; 
	static JButton b, b1, b2, b3, b4, b5, b6, b7; 
	static JLabel labelModelo, labelMarca, label, labelAnoFabricacao, labelValor, labelPlaca, labelCombustivel, labelCabine; 
	static GerenciaAutomotores gerencia = new GerenciaAutomotores();

	public static void main(String[] args) 
	{ 
		
		
		f = new JFrame("Gerenciador");
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel p = new JPanel(); 
		p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS)); 

		b = new JButton("Adicionar"); 
		b1 = new JButton("Remover"); 
		b2 = new JButton("Buscar Por Placa"); 
		b3 = new JButton("Listar Carros");
		b4 = new JButton("Listar Moto");
		b5 = new JButton("Listar Picape");
		b6 = new JButton("Calcular Imposto"); 
		b7 = new JButton("Listar Carros por Combustivel");
		
		p.add(b);
		p.add(b1); 
		p.add(b2); 
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		
		
		b.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frameDeOps();
			}
			
		});
		
		b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				framePlacaRemover();
			}
			
		});
		
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frameBuscarPorPlaca();
			}
			
		});
		
		b3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frameListarCarros();
			}
			
		});
		
		b4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frameListarMotos();
			}
			
		});
		
		b5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frameListarPicapes();
			}
			
		});
		
		b6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frameCalcularImposto();
			}
			
		});
		
		b7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frameListaCarrosPorCombustivel();
			}
			
		});
		
		p.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Opções"));
		f.add(p); 
		f.setSize(230, 300);
		f.setLocationRelativeTo(null);
		f.setVisible(true); 
		
	}
	
	
	
	
	public static void frameDeOps() {

		JFrame frame = new JFrame();
  		frame.setSize(100, 140);
  		frame.setResizable(false);
  		JPanel panel = new JPanel(); 
  		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
  		
		JButton op1 = new JButton("Carro");
		JButton op2 = new JButton("Moto");
		JButton op3 = new JButton("Picape");

		
		panel.add(op1);
		panel.add(op2);
		panel.add(op3);
		
		
		op1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frameAdiciona(e.getActionCommand());
			}
			
		});
		
		op2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frameAdiciona(e.getActionCommand());
			}
			
		});
		
		op3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				frameAdiciona(e.getActionCommand());
			}
			
		});
		
		panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Automotores"));
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void frameAdiciona(String op) {
		
  		JFrame frame = new JFrame("Adiciona");
  		if(op == "Carro")
  			frame.setSize(300, 450);
  		if(op == "Moto")
  			frame.setSize(300, 300);
  		if(op == "Picape")
  			frame.setSize(300, 400);
  		frame.setResizable(false);
  		JPanel panel = new JPanel(); 
  		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
  		JPanel panelBody = new JPanel(); 
  		panelBody.setLayout(new BoxLayout(panelBody, BoxLayout.Y_AXIS));
		panel.add(panelBody);
		// Modelo
		labelModelo = new JLabel("Modelo: ");
		labelModelo.setSize(100, 30);
		panelBody.add(labelModelo);		
		
		JTextField inputModelo = new JTextField();
		inputModelo.setSize(100, 30);
		panelBody.add(inputModelo);
		
		// Marca
		labelMarca = new JLabel("Marca: ");
		labelMarca.setSize(100, 30);
		panelBody.add(labelMarca);
		

		JTextField inputMarca = new JTextField();
		inputMarca.setSize(100, 30);
		panelBody.add(inputMarca);
		
		// Ano de Fabricao
		labelAnoFabricacao = new JLabel("Ano de Fabricaçåo: ");
		labelAnoFabricacao.setSize(150, 30);
		panelBody.add(labelAnoFabricacao);
		
		JTextField inputAnoFabricacao = new JTextField();
		inputAnoFabricacao.setSize(100, 30);
		panelBody.add(inputAnoFabricacao);
		
		// Valor
		labelValor = new JLabel("Valor: ");
		labelValor.setSize(150, 30);
		panelBody.add(labelValor);
		
		JTextField inputValor = new JTextField();
		inputValor.setSize(100, 30);
		panelBody.add(inputValor);
		
		// Placa
		labelPlaca = new JLabel("Placa: ");
		labelPlaca.setSize(150, 30);
		panelBody.add(labelPlaca);
		
		JTextField inputPlaca = new JTextField();
		inputPlaca.setSize(100, 30);
		panelBody.add(inputPlaca);
		
		
		ButtonGroup bgroup = new ButtonGroup();
		//Se for carro mostra o combustivel 
		if(op == "Carro") {
			labelCombustivel = new JLabel("Combustivel: ");
			labelCombustivel.setSize(150, 30);
			labelCombustivel.setLocation(0, 175);
			panelBody.add(labelCombustivel);
			
			JRadioButton btn1 = new JRadioButton("Gasolina");
			JRadioButton btn2 = new JRadioButton("Álcool");
			JRadioButton btn3 = new JRadioButton("Flex");
			JRadioButton btn4 = new JRadioButton("GNV");
			JRadioButton btn5 = new JRadioButton("Diesel");
			
			btn1.setActionCommand("Gasolina");
			btn2.setActionCommand("Álcool");
			btn3.setActionCommand("Flex");
			btn4.setActionCommand("GNV");
			btn5.setActionCommand("Diesel");
			
			
			bgroup.add(btn1);
			bgroup.add(btn2);
			bgroup.add(btn3);
			bgroup.add(btn4);
			bgroup.add(btn5);
			
			panelBody.add(btn1);
			panelBody.add(btn2);
			panelBody.add(btn3);
			panelBody.add(btn4);
			panelBody.add(btn5);
			
		}
		if(op == "Picape") {
			labelCabine = new JLabel("Cabine: ");
			labelCabine.setSize(150, 30);
			labelCabine.setLocation(0, 175);
			panelBody.add(labelCabine);
			
			JRadioButton btn1 = new JRadioButton("Simples");
			JRadioButton btn2 = new JRadioButton("Dupla");
			btn1.setActionCommand("Simples");
			btn2.setActionCommand("Dupla");
			bgroup.add(btn1);
			bgroup.add(btn2);
			
			panelBody.add(btn1);
			panelBody.add(btn2);
			
			
		}
		
		panelBody.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), op));
		 
		JButton ok = new JButton("OK");
		panel.add(ok);
		ok.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try {
				String modelo = inputModelo.getText();
				String marca = inputMarca.getText();
				int AnoFabrica = Integer.parseInt(inputAnoFabricacao.getText());
				int Valor = Integer.parseInt(inputValor.getText());
				String placa = inputPlaca.getText();
				if(op == "Carro") {
					String combustivel = bgroup.getSelection().getActionCommand();
					Carro novo = new Carro(AnoFabrica, modelo, marca, Valor, placa, combustivel);
					gerencia.Adicionar(novo);
					JOptionPane.showMessageDialog(null, op + " Adicionado com Sucesso!");
					frame.setVisible(false);
				}
				if(op == "Moto") {
					Moto novo = new Moto(AnoFabrica, modelo, marca, Valor, placa);
					gerencia.Adicionar(novo);
					JOptionPane.showMessageDialog(null, op + " Adicionado com Sucesso!");
					frame.setVisible(false);
				}
				
				if(op == "Picape") {
					String cabine = bgroup.getSelection().getActionCommand();
					Picape novo = new Picape(AnoFabrica, modelo, marca, Valor, placa, cabine);
					gerencia.Adicionar(novo);
					JOptionPane.showMessageDialog(null, op + " Adicionado com Sucesso!");
					frame.setVisible(false);
				}
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Erro interno na aplicaçao! \nTente preencher todos os campos corretamente!");
					frame.setVisible(false);
				}
			}
			
		});
		
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
	
	public static void framePlacaRemover() {
		
		JFrame frame = new JFrame();
  		frame.setSize(120, 100);
  		frame.setResizable(false);
  		JPanel panel = new JPanel(); 
  		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
  		
  		JTextField inputPlaca = new JTextField();
  		inputPlaca.setSize(100, 30);
		panel.add(inputPlaca);
		JButton op1 = new JButton("ok");
		panel.add(op1);
		
		op1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				if(gerencia.Remover(inputPlaca.getText())) {
					JOptionPane.showMessageDialog(null, "Removido");
					frame.setVisible(false);
				} else {
					JOptionPane.showMessageDialog(null, "Não há automotor com essa placa!");
					frame.setVisible(false);
				}
								
			}
			
		});
		
		panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Placa"));
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	public static void frameBuscarPorPlaca() {
		JFrame frame = new JFrame();
  		frame.setSize(120, 100);
  		frame.setResizable(false);
  		JPanel panel = new JPanel(); 
  		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
  		
  		JTextField inputPlaca = new JTextField();
  		inputPlaca.setSize(100, 30);
		panel.add(inputPlaca);
		JButton op1 = new JButton("ok");
		panel.add(op1);
		
		op1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.out.print(gerencia.buscaPorPlaca(inputPlaca.getText()));
				if(gerencia.buscaPorPlaca(inputPlaca.getText()) == null) {
					JOptionPane.showMessageDialog(null, "Não há automotor com essa placa!");
					frame.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, gerencia.buscaPorPlaca(inputPlaca.getText()));
					frame.setVisible(false);
				}
								
			}
			
		});
		
		panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Placa"));
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void frameListarCarros() {
		
		JFrame frame = new JFrame("Lista de Carros");
  		frame.setSize(800, 450);
  		JPanel panelBody = new JPanel(); 
  		panelBody.setLayout(new BoxLayout(panelBody, BoxLayout.Y_AXIS));
		frame.add(panelBody);
		panelBody.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Carros Listados"));
		
		labelPlaca = new JLabel(gerencia.listarCarros());
		panelBody.add(labelPlaca);
		
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	public static void frameListarMotos() {
		
		JFrame frame = new JFrame("Lista de Carros");
  		frame.setSize(800, 450);
  		JPanel panelBody = new JPanel(); 
  		panelBody.setLayout(new BoxLayout(panelBody, BoxLayout.Y_AXIS));
		frame.add(panelBody);
		panelBody.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Motos Listados"));
		
		labelPlaca = new JLabel(gerencia.ListarMotocicletas());
		panelBody.add(labelPlaca);
		
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	

	public static void frameListarPicapes() {
		
		JFrame frame = new JFrame("Lista de Carros");
  		frame.setSize(800, 450);
  		JPanel panelBody = new JPanel(); 
  		panelBody.setLayout(new BoxLayout(panelBody, BoxLayout.Y_AXIS));
		frame.add(panelBody);
		panelBody.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Picapes Listados"));
		
		labelPlaca = new JLabel(gerencia.ListarPicapes());
		panelBody.add(labelPlaca);
		
		
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
	}
	
	public static void frameCalcularImposto() {
		JFrame frame = new JFrame();
  		frame.setSize(120, 100);
  		frame.setResizable(false);
  		JPanel panel = new JPanel(); 
  		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
  		
  		JTextField inputPlaca = new JTextField();
  		inputPlaca.setSize(100, 30);
		panel.add(inputPlaca);
		JButton op1 = new JButton("ok");
		panel.add(op1);
		
		op1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				
				if(gerencia.buscaPorPlaca(inputPlaca.getText()) != null) {
					JOptionPane.showMessageDialog(null, "Imposto de R$: " + gerencia.obetValorImposto(inputPlaca.getText()));
					frame.setVisible(false);
				}
				else {
					JOptionPane.showMessageDialog(null, "Não há automotor com essa placa!");
					frame.setVisible(false);
				}				
			}
			
		});
		
		panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Placa"));
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public static void frameListaCarrosPorCombustivel() {
		JFrame frame = new JFrame();
  		frame.setSize(100, 200);
  		frame.setResizable(false);
  		JPanel panel = new JPanel(); 
  		panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
  		
		JButton op1 = new JButton("Gasolina");
		JButton op2 = new JButton("Álcool");
		JButton op3 = new JButton("Flex");
		JButton op4 = new JButton("GNV");
		JButton op5 = new JButton("Diesel");
		
		
		
		panel.add(op1);
		panel.add(op2);
		panel.add(op3);
		panel.add(op4);
		panel.add(op5);
		
		op1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame frame = new JFrame("Lista de Carros");
		  		frame.setSize(800, 450);
		  		JPanel panelBody = new JPanel(); 
		  		panelBody.setLayout(new BoxLayout(panelBody, BoxLayout.Y_AXIS));
				frame.add(panelBody);
				panelBody.setBorder(BorderFactory.createTitledBorder(
		                BorderFactory.createEtchedBorder(), "Carros Listados"));
				
				labelPlaca = new JLabel(gerencia.ListarCarrosPorCombustivel(e.getActionCommand()));
				panelBody.add(labelPlaca);
				
				
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		
		op2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame frame = new JFrame("Lista de Carros");
		  		frame.setSize(800, 450);
		  		JPanel panelBody = new JPanel(); 
		  		panelBody.setLayout(new BoxLayout(panelBody, BoxLayout.Y_AXIS));
				frame.add(panelBody);
				panelBody.setBorder(BorderFactory.createTitledBorder(
		                BorderFactory.createEtchedBorder(), "Carros Listados"));
				
				labelPlaca = new JLabel(gerencia.ListarCarrosPorCombustivel(e.getActionCommand()));
				panelBody.add(labelPlaca);
				
				
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		
		op3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame frame = new JFrame("Lista de Carros");
		  		frame.setSize(800, 450);
		  		JPanel panelBody = new JPanel(); 
		  		panelBody.setLayout(new BoxLayout(panelBody, BoxLayout.Y_AXIS));
				frame.add(panelBody);
				panelBody.setBorder(BorderFactory.createTitledBorder(
		                BorderFactory.createEtchedBorder(), "Carros Listados"));
				
				labelPlaca = new JLabel(gerencia.ListarCarrosPorCombustivel(e.getActionCommand()));
				panelBody.add(labelPlaca);
				
				
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		
		op4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame frame = new JFrame("Lista de Carros");
		  		frame.setSize(800, 450);
		  		JPanel panelBody = new JPanel(); 
		  		panelBody.setLayout(new BoxLayout(panelBody, BoxLayout.Y_AXIS));
				frame.add(panelBody);
				panelBody.setBorder(BorderFactory.createTitledBorder(
		                BorderFactory.createEtchedBorder(), "Carros Listados"));
				
				labelPlaca = new JLabel(gerencia.ListarCarrosPorCombustivel(e.getActionCommand()));
				panelBody.add(labelPlaca);
				
				
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		
		op5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				JFrame frame = new JFrame("Lista de Carros");
		  		frame.setSize(800, 450);
		  		JPanel panelBody = new JPanel(); 
		  		panelBody.setLayout(new BoxLayout(panelBody, BoxLayout.Y_AXIS));
				frame.add(panelBody);
				panelBody.setBorder(BorderFactory.createTitledBorder(
		                BorderFactory.createEtchedBorder(), "Carros Listados"));
				
				labelPlaca = new JLabel(gerencia.ListarCarrosPorCombustivel(e.getActionCommand()));
				panelBody.add(labelPlaca);
				
				
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
		
		
		
		panel.setBorder(BorderFactory.createTitledBorder(
                BorderFactory.createEtchedBorder(), "Combustível"));
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
}


