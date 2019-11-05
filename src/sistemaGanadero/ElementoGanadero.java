package sistemaGanadero;


import TPE.Camion;

	public interface ElementoGanadero {
	
		
		public abstract int getCantidadAnimales();
		
		public abstract int getPromedioEdad();
		
		public abstract double getPeso();
		
		public abstract void llenarCamion(Camion c);
		
		
	}
