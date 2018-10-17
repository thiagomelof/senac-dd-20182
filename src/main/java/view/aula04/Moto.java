package view.aula04;

public class Moto extends Veiculo{
		private boolean freioADisco;
		
		public Moto() {
			super();
		}
		
		public Moto(String nome, String cor, int ano, String fabricante, boolean freioADisco) {
			super(nome, cor, ano, fabricante);
			this.freioADisco = freioADisco;
		}

		public boolean isFreioADisco() {
			return freioADisco;
		}

		public void setFreioADisco(boolean freioADisco) {
			this.freioADisco = freioADisco;
		}
		
		@Override
		public String toString() {
			return super.toString();
		}
}
