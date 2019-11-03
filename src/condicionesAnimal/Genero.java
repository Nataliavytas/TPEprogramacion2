package condicionesAnimal;

import sistemaGanadero.Animal;

	public class Genero implements Condicion{
	
			String comparador;
		
		public Genero (String n) {
			comparador = n;
		}
		
		
		public boolean cumple(Animal a) {
			return comparador.equalsIgnoreCase(a.getGenero());
		}	
	
	}
