package condicionesGrupales;

import sistemaGanadero.GrupoGanadero;

	public class PromedioPesoMenor implements CondicionGrupal {
		
			double comparador;
			
		public PromedioPesoMenor(double n) {
			comparador = n;
		}
	
	
		public boolean cumple(GrupoGanadero r) {
			return r.getPromedioPeso() < comparador;
		}
	
	}
