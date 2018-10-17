package view.aula04;

public class Veiculo {
	private String nome;
	private String cor;
	private int ano;
	private String fabricante;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String nome, String cor, int ano, String fabricante) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.ano = ano;
		this.fabricante = fabricante;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Nome: " + nome 
				+"\n"+ " Cor: " + cor 
				+"\n"+ " ano: " + ano 
				+"\n"+ " Fabricante: " + fabricante;
	}
	
	
}
