package view;

import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JDesktopPane desktopPane;
	CadastroCliente cadastrarCliente;
	TelaSobre s;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
					
					//Inicializa a tela principal MAXIMIZADA
					frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
					
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Principal() {
		setTitle("Tela Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 386);
		
		JMenuBar mbPrincipal = new JMenuBar();
		setJMenuBar(mbPrincipal);
		
		JMenu mnClientes = new JMenu("Clientes");
		mnClientes.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-fila.png")));
		mbPrincipal.add(mnClientes);
		
		JMenuItem mntmCadastrar_1 = new JMenuItem("Cadastrar");
		mntmCadastrar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				boolean existe=false;
				for (Component element : desktopPane.getComponents()) {
					if(element==cadastrarCliente) 
					{
						JOptionPane.showMessageDialog(null, "ERÔÔÔÔ!");
						existe=true;
						break;
					}
				}
				
				if(!existe) {
					cadastrarCliente = new CadastroCliente();
					desktopPane.add(cadastrarCliente);
					cadastrarCliente.show();
				}
			}
		});
		mntmCadastrar_1.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-adicionar-usuário-masculino.png")));
		mntmCadastrar_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
		mnClientes.add(mntmCadastrar_1);
		
		JMenuItem menuItem = new JMenuItem("Listar");
		menuItem.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-cardápio.png")));
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		mnClientes.add(menuItem);
		
		JMenuItem mntmRelatrios = new JMenuItem("Relatórios");
		mntmRelatrios.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, 0));
		mntmRelatrios.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-documento-regular.png")));
		mnClientes.add(mntmRelatrios);
		
		JMenu mnProdutos = new JMenu("Produtos");
		mnProdutos.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-comprar.png")));
		mbPrincipal.add(mnProdutos);
		
		JMenuItem mntmCadastrar = new JMenuItem("Cadastrar");
		mntmCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Adiciona a tela de cadastro no painel principal
				CadastroProduto telaCadastro = new CadastroProduto();
				desktopPane.add(telaCadastro);
				telaCadastro.show();
			}
		});
		mntmCadastrar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		mntmCadastrar.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-adicionar-usuário-masculino.png")));
		mnProdutos.add(mntmCadastrar);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0));
		mntmListar.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-cardápio.png")));
		mnProdutos.add(mntmListar);
		
		JMenu mnNewMenu = new JMenu("Funcionários");
		mnNewMenu.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-treinamento.png")));
		mbPrincipal.add(mnNewMenu);
		
		JMenu mnSobre = new JMenu("Sobre");
		mnSobre.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-cartão-de-crédito-sem-contato.png")));
		mbPrincipal.add(mnSobre);
		
		JMenuItem mntmAutores = new JMenuItem("Autores");
		mntmAutores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(s==null)
					s = new TelaSobre();
				
				if(!s.isVisible())				
					s.setVisible(true);
				else
					JOptionPane.showMessageDialog(null, "ERÔÔÔÔ!");
			}
		});
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Manual");
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F10, 0));
		mntmNewMenuItem.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-gerente-de-informações-do-cliente.png")));
		mnSobre.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Ajuda");
		mntmNewMenuItem_1.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-suporte-on-line-filled.png")));
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F11, 0));
		mnSobre.add(mntmNewMenuItem_1);
		mntmAutores.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F12, 0));
		mntmAutores.setIcon(new ImageIcon(Principal.class.getResource("/icones/icons8-сharlie-сhaplin.png")));
		mnSobre.add(mntmAutores);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		desktopPane = new JDesktopPane();
		desktopPane.setBounds(0, 0, 434, 295);
		contentPane.add(desktopPane);
		desktopPane.setLayout(null);
	}
}
