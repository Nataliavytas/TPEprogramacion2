package consideraciones;

import sistemaGanadero.Animal;

	public class PesoMenor implements Condicion{
	
			double comparador;
		
		public PesoMenor (double n) {
			comparador = n;
		}
		
		public boolean cumple(Animal a) {
			
			return (a.getPeso() < comparador);
		}
	
	}
