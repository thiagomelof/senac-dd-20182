import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

@SuppressWarnings("serial")
public class Calculadora extends JFrame {

	public Calculadora() {
		initComponents();
	}

	double valorMemoria = 0;
	String operacaoMemoria = null;

	private void initComponents() {

		bt1 = new JButton();
		bt2 = new JButton();
		bt3 = new JButton();
		bt4 = new JButton();
		bt5on6 = new JButton();
		bt6 = new JButton();
		bt7 = new JButton();
		bt8 = new JButton();
		bt9 = new JButton();
		btMais = new JButton();
		bt0 = new JButton();
		btMenos = new JButton();
		btDivide = new JButton();
		btMultiplica = new JButton();
		btigual = new JButton();
		txtResultado = new JTextField();
		tcCE = new JButton();

		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

		bt1.setText("1");
		bt1.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bt1MouseClicked(evt);
			}
		});
		bt1.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				bt1ActionPerformed(evt);
			}
		});

		bt2.setText("2");
		bt2.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bt2MouseClicked(evt);
			}
		});

		bt3.setText("3");
		bt3.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bt3MouseClicked(evt);
			}
		});

		bt4.setText("4");
		bt4.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bt4MouseClicked(evt);
			}
		});

		bt5on6.setText("5");
		bt5on6.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bt5on6MouseClicked(evt);
			}
		});

		bt6.setText("6");
		bt6.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bt6MouseClicked(evt);
			}
		});

		bt7.setText("7");
		bt7.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bt7MouseClicked(evt);
			}
		});

		bt8.setText("8");
		bt8.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bt8MouseClicked(evt);
			}
		});

		bt9.setText("9");
		bt9.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bt9MouseClicked(evt);
			}
		});

		btMais.setText("+");
		btMais.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btMaisMouseClicked(evt);
			}
		});
		btMais.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btMaisActionPerformed(evt);
			}
		});

		bt0.setText("0");
		bt0.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				bt0MouseClicked(evt);
			}
		});

		btMenos.setText("-");
		btMenos.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btMenosMouseClicked(evt);
			}
		});
		btMenos.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btMenosActionPerformed(evt);
			}
		});

		btDivide.setText("/");
		btDivide.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btDivideMouseClicked(evt);
			}
		});
		btDivide.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btDivideActionPerformed(evt);
			}
		});

		btMultiplica.setText("X");
		btMultiplica.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btMultiplicaMouseClicked(evt);
			}
		});
		btMultiplica.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				btMultiplicaActionPerformed(evt);
			}
		});

		btigual.setText("=");
		btigual.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				btigualMouseClicked(evt);
			}
		});

		txtResultado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
		txtResultado.setHorizontalAlignment(JTextField.RIGHT);
		txtResultado.setText("0");
		txtResultado.addInputMethodListener(new java.awt.event.InputMethodListener() {
			@Override
			public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
			}

			@Override
			public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
				txtResultadoInputMethodTextChanged(evt);
			}
		});

		tcCE.setText("CE");
		tcCE.addMouseListener(new java.awt.event.MouseAdapter() {
			@Override
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				tcCEMouseClicked(evt);
			}
		});
		tcCE.addActionListener(new java.awt.event.ActionListener() {
			@Override
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				tcCEActionPerformed(evt);
			}
		});

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(txtResultado)
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup()
										.addComponent(bt1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(bt2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(bt3,
												GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(btMais,
												GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addComponent(bt4, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(bt5on6, GroupLayout.PREFERRED_SIZE, 48,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(bt6, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addComponent(btMenos,
												GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup()
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(bt7, GroupLayout.PREFERRED_SIZE, 48,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(tcCE, GroupLayout.PREFERRED_SIZE, 48,
														GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
												.addGroup(layout.createSequentialGroup()
														.addComponent(bt8, GroupLayout.PREFERRED_SIZE, 48,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(bt9, GroupLayout.PREFERRED_SIZE, 48,
																GroupLayout.PREFERRED_SIZE))
												.addGroup(layout.createSequentialGroup()
														.addComponent(bt0, GroupLayout.PREFERRED_SIZE, 48,
																GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
																GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
														.addComponent(btigual, GroupLayout.PREFERRED_SIZE, 48,
																GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
												.addComponent(btMultiplica, GroupLayout.PREFERRED_SIZE, 48,
														GroupLayout.PREFERRED_SIZE)
												.addComponent(btDivide, GroupLayout.PREFERRED_SIZE, 48,
														GroupLayout.PREFERRED_SIZE))))
								.addGap(0, 0, Short.MAX_VALUE)))
				.addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(txtResultado, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(bt1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(bt2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(bt3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(btMais, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(bt4, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(bt5on6, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(bt6, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(btMenos, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(bt7, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(bt8, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(bt9, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(btDivide, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
								.addComponent(bt0, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(btMultiplica, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(btigual, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
								.addComponent(tcCE, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
						.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

		bt1.getAccessibleContext().setAccessibleName("bt1");
		bt2.getAccessibleContext().setAccessibleName("bt2");
		bt3.getAccessibleContext().setAccessibleName("bt3");
		txtResultado.getAccessibleContext().setAccessibleName("txtResultado");

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void bt1MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = txtResultado.getText();
		txtResultado.setText(valor + "1");
	}

	private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void bt2MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = txtResultado.getText();
		txtResultado.setText(valor + "2");
	}

	private void bt3MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = txtResultado.getText();
		txtResultado.setText(valor + "3");
	}

	private void bt4MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = txtResultado.getText();
		txtResultado.setText(valor + "4");
	}

	private void bt5on6MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = txtResultado.getText();
		txtResultado.setText(valor + "5");
	}

	private void bt6MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = txtResultado.getText();
		txtResultado.setText(valor + "6");
	}

	private void bt7MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = txtResultado.getText();
		txtResultado.setText(valor + "7");
	}

	private void bt8MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = txtResultado.getText();
		txtResultado.setText(valor + "8");
	}

	private void bt9MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = txtResultado.getText();
		txtResultado.setText(valor + "9");
	}

	private void bt0MouseClicked(java.awt.event.MouseEvent evt) {
		String valor = txtResultado.getText();
		txtResultado.setText(valor + "0");
	}

	private void txtResultadoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
		String caracteres = txtResultado.getText();
		caracteres.length();

	}

	private void btMaisMouseClicked(java.awt.event.MouseEvent evt) {
		operacaoMemoria = "+";
		String vTxtResultado = (txtResultado.getText() + "");
		if (vTxtResultado != "") {
			valorMemoria = Double.parseDouble(txtResultado.getText() + "");
			txtResultado.setText("");
		} else {

		}
	}

	private void btMenosMouseClicked(java.awt.event.MouseEvent evt) {
		operacaoMemoria = "-";
		String vTxtResultado = (txtResultado.getText() + "");
		if (vTxtResultado != "") {
			valorMemoria = Double.parseDouble(txtResultado.getText() + "");
			txtResultado.setText("");
		} else {

		}
	}

	private void btDivideMouseClicked(java.awt.event.MouseEvent evt) {
		operacaoMemoria = "/";
		String vTxtResultado = (txtResultado.getText() + "");
		if (vTxtResultado != "") {
			valorMemoria = Double.parseDouble(txtResultado.getText() + "");
			txtResultado.setText("");
		} else {

		}
	}

	private void btMultiplicaMouseClicked(java.awt.event.MouseEvent evt) {
		operacaoMemoria = "*";
		String vTxtResultado = (txtResultado.getText() + "");
		if (vTxtResultado != "") {
			valorMemoria = Double.parseDouble(txtResultado.getText() + "");
			txtResultado.setText("");
		} else {

		}
	}

	private void btigualMouseClicked(java.awt.event.MouseEvent evt) {
		txtResultado.getText();
		double v1 = (valorMemoria);
		double v2 = Integer.parseInt(txtResultado.getText());
		double resultado = 0;

		if (v2 != 0.0) {
			switch (operacaoMemoria) {
			case "+":
				resultado = v1 + v2;
				break;
			case "-":
				resultado = v1 - v2;
				break;
			case "*":
				resultado = v1 * v2;
				break;
			case "/":
				resultado = v1 / v2;
				break;
			}
			txtResultado.setText(resultado + "");
		}

	}

	private void btMaisActionPerformed(java.awt.event.ActionEvent evt) {

	}

	private void tcCEMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
	}

	private void tcCEActionPerformed(java.awt.event.ActionEvent evt) {
		txtResultado.setText("");
	}

	private void btMenosActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void btDivideActionPerformed(java.awt.event.ActionEvent evt) {
		valorMemoria = (Double.parseDouble(txtResultado.getText()) / valorMemoria);
		txtResultado.setText("");
		operacaoMemoria = "/";
	}

	private void btMultiplicaActionPerformed(java.awt.event.ActionEvent evt) {
		valorMemoria = (Double.parseDouble(txtResultado.getText()) * valorMemoria);
		txtResultado.setText("");
		operacaoMemoria = "x";
	}

	public static void main(String args[]) {
		try {
			for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Calculadora().setVisible(true);
			}
		});
	}

	private JButton bt0;
	private JButton bt1;
	private JButton bt2;
	private JButton bt3;
	private JButton bt4;
	private JButton bt5on6;
	private JButton bt6;
	private JButton bt7;
	private JButton bt8;
	private JButton bt9;
	private JButton btDivide;
	private JButton btMais;
	private JButton btMenos;
	private JButton btMultiplica;
	private JButton btigual;
	private JButton tcCE;
	private JTextField txtResultado;
}