package condicionesAnimal;

import sistemaGanadero.Animal;

	public class ParicionMenor implements Condicion {
		
			int comparador;
		
		public ParicionMenor (int n) {
			comparador = n;
		}
		
		public boolean cumple(Animal a) {
			
			return (a.getPariciones() < comparador);
		}
	
	}
