package consideraciones;

import sistemaGanadero.Animal;

	public class PesoIgual implements Condicion{
		
		double comparador;
		
		public PesoIgual (double n) {
			comparador = n;
		}

		public boolean cumple(Animal a) {
			
			return (a.getPeso() == comparador);
		}
	
	}
