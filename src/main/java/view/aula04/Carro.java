package view.aula04;

public class Carro extends Veiculo{
	private int portas;
	
	public Carro() {
		super();
	}
	
	public Carro(String nome, String cor, int ano, String fabricante,int portas) {
		super(nome, cor, ano, fabricante);
		this.portas = portas;
	}
	
	public int getPortas() {
		return portas;
	}
	public void setPortas(int portas) {
		this.portas = portas;
	}

	@Override
	public String toString() {
		return super.toString()
				+"\nQuantidade de portas: " + portas;
	}
	
	
	
}
