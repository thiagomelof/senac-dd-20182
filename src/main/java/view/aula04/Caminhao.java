package view.aula04;

public class Caminhao extends Veiculo{
		private Carroceria carroceria;
		private boolean cabineExtendida;
		
		public Caminhao() {
			super();
		}
		
		public Caminhao(String nome, String cor, int ano, String fabricante,Carroceria carroceria,boolean cabineExtendida) {
			super(nome, cor, ano, fabricante);
			this.carroceria = carroceria;
			this.cabineExtendida = cabineExtendida;
		}

		public Carroceria getCarroceria() {
			return carroceria;
		}

		public void setCarroceria(Carroceria carroceria) {
			this.carroceria = carroceria;
		}

		public boolean isCabineExtendida() {
			return cabineExtendida;
		}

		public void setCabineExtendida(boolean cabineExtendida) {
			this.cabineExtendida = cabineExtendida;
		}
		
		@Override
		public String toString() {
			return super.toString();
		}
}
