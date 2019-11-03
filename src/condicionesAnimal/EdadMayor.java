package condicionesAnimal;

import sistemaGanadero.Animal;

	public class EdadMayor implements Condicion{
		
		int comparador;
		
		public EdadMayor (int n) {
			comparador = n;
		}
	
		public boolean cumple(Animal a) {
			
			return (a.getPromedioEdad() > comparador);
		}
	
	}
