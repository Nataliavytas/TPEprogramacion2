package condicionesAnimal;

import sistemaGanadero.Animal;

public class Raza implements Condicion{
	
		String comparador;
		
	public Raza(String r) {
		comparador = r;
	}
	
	public boolean cumple(Animal a) {
		return (a.getRaza().equalsIgnoreCase(comparador));
	}

}
