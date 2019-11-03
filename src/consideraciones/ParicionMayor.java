package consideraciones;

import sistemaGanadero.Animal;

	public class ParicionMayor implements Condicion {
		
			int comparador;
		
		public ParicionMayor (int n) {
			comparador = n;
		}
	
		public boolean cumple(Animal a) {
			
			return (a.getPariciones() > comparador);
		}
	
	}
