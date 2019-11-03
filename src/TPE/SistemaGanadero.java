package TPE;

import java.util.ArrayList;

import consideraciones.Clasificacion;
import sistemaGanadero.Animal;
import sistemaGanadero.ElementoGanadero;

public class SistemaGanadero {
	
	ArrayList<Camion> camiones;
	ArrayList<ElementoGanadero> sistema; 
	ArrayList<Clasificacion> clasificaciones; 
	
	

	public String getClasificacion(Animal a) {
		String clasificacion="";
		for(Clasificacion c:clasificaciones){
			clasificacion+= c.getClasificacion(a);
		}
		return clasificacion;
	}
	
}
