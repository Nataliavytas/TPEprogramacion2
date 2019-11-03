package consideraciones;

import sistemaGanadero.Animal;

	public class ParicionIgual implements Condicion{
		
		int comparador;
		
		public ParicionIgual (int n) {
			comparador = n;
		}
	
		public boolean cumple(Animal a) {
			
			return (a.getPariciones() == comparador);
		}
	
	}
