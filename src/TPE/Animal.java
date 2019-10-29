package TPE;

import java.util.ArrayList;

public class Animal implements ElementoGanadero{

	private int id; 
	private int edad; 
	private double peso; 
	private String raza; 
	private GrupoGanadero padre;
	
	public int getPromedioEdad() {
		return edad;
	}

	public double getPeso() {
		return peso;
	}

	public ArrayList getAnimalesAptos(Condicion c, int capacidad) {
		ArrayList<Animal> animalesAptos = new ArrayList<Animal>();
		
			if(c.cumple(this)){
				animalesAptos.add(this);
				padre.deleteAnimal(this);
			}
		return animalesAptos;
	}

	public int getCantidadAnimales() {
		return 1;
	}

}
