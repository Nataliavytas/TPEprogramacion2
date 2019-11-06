package TPE;

import java.util.ArrayList;

import condicionesAnimal.Condicion;
import sistemaGanadero.Animal;

public class Camion {
	private int capacidad; 
	private Condicion condicion;
	private ArrayList<Animal> animales;
	
	public Camion (int ca, Condicion co){
		capacidad = ca;
		condicion = co; 
		animales = new ArrayList<Animal>();
	}
	
	public ArrayList<Animal> getAnimales(){
		return animales;
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
		}
		
	}
	
	public boolean isFull(){
		return animales.size()>=capacidad;
	}
	
	public void printArray(){
		for(Animal a:animales){
			System.out.println(a.getId()+ " ");

		}
	}
}
