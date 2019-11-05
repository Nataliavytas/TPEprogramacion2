package TPE;

import java.util.ArrayList;

import condicionesAnimal.Condicion;
import condicionesAnimal.EdadMayor;
import sistemaGanadero.Animal;
import sistemaGanadero.ElementoGanadero;

public class SistemaGanadero {
	
		private ArrayList<Camion> camiones;
		private ArrayList<ElementoGanadero> sistema; 
		private ArrayList<Clasificacion> clasificaciones;
	
	public SistemaGanadero() {
		camiones = new ArrayList<Camion>();
		sistema = new ArrayList<ElementoGanadero>();
		clasificaciones = new ArrayList<Clasificacion>();
	}
		
	public static void main(String[] args) {
		
		SistemaGanadero SistemaGanadero = new SistemaGanadero();
		
		Animal vaca1 = new Animal();
		
		int minEdad = 2;
		int capacidad1 = 3;
		Condicion edadMayorA = new EdadMayor(minEdad );
		Camion camion1 = new Camion(capacidad1, edadMayorA ); 
		

		

		
	}
	
	public void addCamion(Camion c) {
		camiones.add(c);
	}
	
	public void addElemento(ElementoGanadero e) {
		sistema.add(e);
	}
	
	public void addClasificacion(Clasificacion c) {
		clasificaciones.add(c);
	}
	

	public String getClasificacion(Animal a) {
		String clasificacion="";
		for(Clasificacion c:clasificaciones){
			clasificacion+= c.getClasificacion(a);
		}
		return clasificacion;
	}
	
}
