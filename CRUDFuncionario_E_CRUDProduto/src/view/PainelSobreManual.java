package view;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;

public class PainelSobreManual extends JPanel {
	public PainelSobreManual() {
		
		JButton btnPdf = new JButton("Baixar PDF");
		
		JTextPane txtpnLoremIpsumDolor = new JTextPane();
		txtpnLoremIpsumDolor.setEditable(false);
		txtpnLoremIpsumDolor.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit. In dapibus ipsum at porta imperdiet. In erat ex, vulputate ut nibh id, faucibus elementum odio. Morbi pharetra blandit purus, in dictum magna tristique id. Donec pellentesque risus a mauris euismod ullamcorper. Sed pretium nulla sed diam accumsan, in commodo urna dignissim. Quisque a urna at augue convallis mollis at non nunc. Proin metus metus, placerat vel ligula ac, congue ornare ipsum. Aenean gravida justo et faucibus pulvinar. Suspendisse quis congue sem. Duis a blandit neque. Ut eu venenatis nulla, ut porta mauris. Praesent eget libero purus. In efficitur lectus elit, nec lacinia justo condimentum vel. Nunc feugiat scelerisque augue. In condimentum lacus et magna auctor commodo.");
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnPdf)
						.addComponent(txtpnLoremIpsumDolor, GroupLayout.PREFERRED_SIZE, 423, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(17, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(txtpnLoremIpsumDolor, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnPdf)
					.addContainerGap(101, Short.MAX_VALUE))
		);
		setLayout(groupLayout);
	}

}
