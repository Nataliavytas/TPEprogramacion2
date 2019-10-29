package TPE;

import java.util.ArrayList;

public class Animal implements ElementoGanadero{

	private int id; 
	private int edad; 
	private double peso; 
	private String raza; 
	private GrupoGanadero padre;
	private boolean capado; 
	private int pariciones;
	
	public int getPromedioEdad() {
		return edad;
	}

	public double getPeso() {
		return peso;
	}

	public ArrayList<Animal> getAnimalesAptos(Condicion c) {
		
		ArrayList<Animal> animalesAptos = new ArrayList<Animal>();
		
			if(c.cumple(this)){
				animalesAptos.add(this);
			}
		return animalesAptos;
	}
	

	public void llenarCamion(Camion c){
	}
	
	public void deleteAnimal(){
		padre.deleteAnimal(this);
	}
	
	public int getCantidadAnimales() {
		return 1;
	}
	
}
