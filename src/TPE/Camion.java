package TPE;

import java.util.ArrayList;

import condicionesAnimal.Condicion;
import sistemaGanadero.Animal;

public class Camion {
	private int capacidad; 
	private Condicion condicion;
	public ArrayList<Animal> animales;
	
	public Camion (int ca, Condicion co){
		capacidad = ca;
		condicion = co; 
		animales = new ArrayList<Animal>();
	}
	
	public Condicion getCondicion(){
		return condicion;
	}
	
	public int getCapacidad(){
		return capacidad;
	}
	
	public void addAnimal(Animal animalAgregar){
		if(condicion.cumple(animalAgregar)&&(animales.size()<capacidad)){
			
			animales.add(animalAgregar);
			animalAgregar.deleteAnimal();
		}
	}
	
	public boolean isFull(){
		return animales.size()>=capacidad;
	}
}
