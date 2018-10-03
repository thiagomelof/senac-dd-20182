package view;

import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class CadastroCliente extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Create the panel.
	 */
	public CadastroCliente() {
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 247, 264);
		add(panel);
		panel.setLayout(null);
		
		JLabel label = new JLabel("Cadastro de Cliente");
		label.setBounds(10, 11, 135, 14);
		panel.add(label);
		
		JLabel label_1 = new JLabel("Nome:");
		label_1.setBounds(10, 36, 46, 14);
		panel.add(label_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(10, 52, 224, 20);
		panel.add(textField);
		
		JLabel label_2 = new JLabel("CEP:");
		label_2.setBounds(10, 83, 46, 14);
		panel.add(label_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 99, 224, 20);
		panel.add(textField_1);
		
		JLabel label_3 = new JLabel("Data Nascimento:");
		label_3.setBounds(10, 130, 104, 14);
		panel.add(label_3);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(10, 144, 224, 20);
		panel.add(textField_2);
		
		JButton button = new JButton("Salvar");
		button.setBounds(10, 190, 224, 23);
		panel.add(button);

	}
}
