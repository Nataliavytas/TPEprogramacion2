package condicionesAnimal;

import sistemaGanadero.Animal;

	public class EdadIgual implements Condicion{
		
			int comparador;
		
		public EdadIgual (int n) {
			comparador = n;
		}
	
		public boolean cumple(Animal a) {
			
			return (a.getPromedioEdad() == comparador);
		}
	
	}
