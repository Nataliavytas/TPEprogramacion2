package condicionesAnimal;

import sistemaGanadero.Animal;

public class EdadMenor implements Condicion{
	
	int comparador;
	
	public EdadMenor (int n) {
		comparador = n;
	}

	public boolean cumple(Animal a) {
		
		return (a.edadTotal() < comparador);
	}

}
