package TPE;

import java.util.ArrayList;

public interface ElementoGanadero {

	
	public abstract int getCantidadAnimales();
	
	public abstract int getPromedioEdad();
	
	public abstract double getPeso();
	
	public abstract ArrayList getAnimalesAptos(Condicion c, int capacidad);
	
}
