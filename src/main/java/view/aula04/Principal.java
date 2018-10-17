package view.aula04;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

		Carro carro1 = new Carro("Renegate", "Cinza", 2017,"JEEP",4);
		Carroceria carroceria = new Carroceria();
		Caminhao caminhao1 = new Caminhao("n�oManjo", "branco", 1998, "volkswagen", carroceria, false);

		Moto moto1 = new Moto("Hornet", "preta", 2017, "Honda", true);
		Moto moto2 = new Moto("Bis", "preta", 2005, "Honda", false);
		Moto[] motos = new Moto[] {moto1, moto2};
		
		
		String escolha = RetornaMenu();
		
		switch (escolha) {
		case "Ver caminh�o e carro":
			
			JOptionPane.showMessageDialog(null,carro1.toString());
			JOptionPane.showMessageDialog(null,caminhao1.toString());
			
			break;
		case "Ver motos":
			
			Moto moto = (Moto) JOptionPane.showInputDialog(
					null,
					"O que deseja fazer?",
					"Escolha uma op��o",
					JOptionPane.QUESTION_MESSAGE,
					null,
					motos,
					motos[0]);
			
			JOptionPane.showMessageDialog(null,moto.toString());
			break;			
			

		default:
			break;
		}

	}
	
	public static String RetornaMenu() {
		String[] opcoes = new String[] {
				"Cadastrar Carro",
				"Cadastrar Moto",
				"Cadastrar Caminhao",
				"Ver caminh�o e carro",
				"Ver motos"};
		
		String escolha = (String) JOptionPane.showInputDialog(
				null,
				"O que deseja fazer?",
				"Escolha uma op��o",
				JOptionPane.QUESTION_MESSAGE,
				null,
				opcoes,
				opcoes[0]);
		
		return escolha;
	}

}
