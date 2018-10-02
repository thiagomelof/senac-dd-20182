package view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroCliente extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
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
	public CadastroCliente() {
		setBounds(100, 100, 269, 254);
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblCadastroDeCliente = new JLabel("Cadastro de Cliente");
		lblCadastroDeCliente.setBounds(10, 11, 135, 14);
		panel.add(lblCadastroDeCliente);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(10, 36, 46, 14);
		panel.add(lblNome);
		
		textField = new JTextField();
		textField.setBounds(10, 52, 224, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblCep = new JLabel("CEP:");
		lblCep.setBounds(10, 83, 46, 14);
		panel.add(lblCep);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 99, 224, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblDataNascimento = new JLabel("Data Nascimento:");
		lblDataNascimento.setBounds(10, 130, 104, 14);
		panel.add(lblDataNascimento);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 144, 224, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton = new JButton("Salvar");
		btnNewButton.setBounds(10, 190, 224, 23);
		panel.add(btnNewButton);

	}
}
