package TPE;

import java.util.ArrayList;

public class Camion {
	private int capacidad; 
	Condicion condicion;
	ArrayList<Animal> animales;
	
	public Camion (int ca, Condicion co){
		capacidad = ca;
		condicion = co; 
	}
	
	public Condicion getCondicion(){
		return condicion;
	}
	
	public int getCapacidad(){
		return capacidad;
	}
	
	public void addAnimales(ArrayList animalesAgregar){
		animales.addAll(animalesAgregar);
	}
}
