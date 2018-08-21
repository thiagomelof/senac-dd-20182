package view;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.TrayIcon.MessageType;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calculadora extends JFrame {
	private JTextField txtValorUm;
	private JTextField txtValorDois;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setBackground(UIManager.getColor("Button.darkShadow"));
		setTitle("Calculadora Simples");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 116);
		getContentPane().setLayout(null);
		
		txtValorUm = new JTextField();
		txtValorUm.setBounds(10, 11, 86, 20);
		getContentPane().add(txtValorUm);
		txtValorUm.setColumns(10);
		
		txtValorDois = new JTextField();
		txtValorDois.setColumns(10);
		txtValorDois.setBounds(106, 11, 86, 20);
		getContentPane().add(txtValorDois);
		
		JButton btnSoma = new JButton("+");
		
		btnSoma.setBounds(10, 42, 44, 23);
		getContentPane().add(btnSoma);
		
		JButton btnSubtracao = new JButton("-");
		btnSubtracao.setBounds(53, 42, 44, 23);
		getContentPane().add(btnSubtracao);
		
		JButton btnMultiplicacao = new JButton("*");
		btnMultiplicacao.setBounds(106, 42, 44, 23);
		getContentPane().add(btnMultiplicacao);
		
		JButton btnDivisao = new JButton("/");
		btnDivisao.setBounds(149, 42, 44, 23);
		getContentPane().add(btnDivisao);
		
		JLabel label = new JLabel("=");
		label.setBounds(202, 14, 46, 14);
		getContentPane().add(label);
		
		txtResult = new JTextField();
		txtResult.setEditable(false);
		txtResult.setBounds(217, 11, 86, 20);
		getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
		
		
		btnSoma.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Soma(txtValorUm.getText(), txtValorDois.getText());
			}
		});
		
		btnMultiplicacao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Multiplicacao(txtValorUm.getText(), txtValorDois.getText());
			}
		});
		
		btnSubtracao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Subtracao(txtValorUm.getText(), txtValorDois.getText());
			}
		});
		
		btnDivisao.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Divisao(txtValorUm.getText(), txtValorDois.getText());
			}
		});
	}
	
	
	public boolean Validate(String valorUm, String valorDois) 
	{
		boolean valido=true;
		try {
			Double.parseDouble(valorUm);
			Double.parseDouble(valorDois);
			
		} catch (Exception e) {
			valido=false;
			JOptionPane.showMessageDialog(null, "Informe somente valores numéricos!");
		}
		return valido;
	}
	
	public void Soma(String valorUm, String valorDois) 
	{
		if(Validate(valorUm,valorDois))
		{
			double valor = Double.parseDouble(valorUm) + Double.parseDouble(valorDois);
			this.txtResult.setText(Double.toString(valor));
		}		
	}
	
	public void Subtracao(String valorUm, String valorDois) 
	{
		if(Validate(valorUm,valorDois))
		{
			double valor = Double.parseDouble(valorUm) - Double.parseDouble(valorDois);
			this.txtResult.setText(Double.toString(valor));
		}		
	}
	
	public void Multiplicacao(String valorUm, String valorDois) 
	{
		if(Validate(valorUm,valorDois))
		{
			double valor = Double.parseDouble(valorUm) * Double.parseDouble(valorDois);
			this.txtResult.setText(Double.toString(valor));
		}		
	}
	
	public void Divisao(String valorUm, String valorDois) 
	{
		if(Validate(valorUm,valorDois))
		{
			if(Double.parseDouble(valorDois)>0)
			{
				double valor = Double.parseDouble(valorUm) / Double.parseDouble(valorDois);
				this.txtResult.setText(Double.toString(valor));
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Não é possível fazer divisão por zero!");
			}
		}
				
	}
}
