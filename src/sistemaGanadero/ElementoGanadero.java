package sistemaGanadero;


import TPE.Camion;

	public interface ElementoGanadero {
	
		
		public abstract int getCantidadAnimales();
		
		public abstract double edadTotal();
		
		public abstract double getPeso();
		
		public abstract void llenarCamion(Camion c);

		public abstract boolean deleteAnimales(Animal a);

		public abstract void printArray();
		
		
	}
