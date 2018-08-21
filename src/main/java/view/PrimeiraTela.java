package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class PrimeiraTela {

	private JFrame frmPrimeiraTela;
	private JTextField txtNome;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrimeiraTela window = new PrimeiraTela();
					window.frmPrimeiraTela.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrimeiraTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPrimeiraTela = new JFrame();
		frmPrimeiraTela.setTitle("Primeira Tela");
		frmPrimeiraTela.setBounds(100, 100, 450, 300);
		frmPrimeiraTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrimeiraTela.getContentPane().setLayout(null);
		
		JLabel lbNomePessoa = new JLabel("Nome:");
		lbNomePessoa.setBounds(29, 37, 46, 14);
		frmPrimeiraTela.getContentPane().add(lbNomePessoa);
		
		txtNome = new JTextField();
		txtNome.setBounds(68, 34, 86, 20);
		frmPrimeiraTela.getContentPane().add(txtNome);
		txtNome.setColumns(10);
	}
}
