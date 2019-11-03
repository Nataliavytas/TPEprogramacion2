package condicionesAnimal;

import sistemaGanadero.Animal;

public class PesoMayor implements Condicion{

		double comparador;
	
	public PesoMayor (double n) {
		comparador = n;
	}

	public boolean cumple(Animal a) {
		
		return (a.getPeso() > comparador);
	}

}
