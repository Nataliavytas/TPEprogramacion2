package sistemaGanadero;

import java.util.ArrayList;
import TPE.Camion;
import consideraciones.Condicion;

	public interface ElementoGanadero {
	
		
		public abstract int getCantidadAnimales();
		
		public abstract int getPromedioEdad();
		
		public abstract double getPeso();
		
		public abstract void llenarCamion(Camion c);
	
		public abstract ArrayList<ElementoGanadero> buscar(Condicion c);
		
	}
