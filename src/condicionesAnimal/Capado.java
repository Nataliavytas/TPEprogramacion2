package condicionesAnimal;

import sistemaGanadero.Animal;

public class Capado implements Condicion{

	
	public boolean cumple(Animal a) {
		return a.isCapado();
	}

}
