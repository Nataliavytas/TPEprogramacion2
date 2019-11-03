package condicionesGrupales;

import sistemaGanadero.GrupoGanadero;

		public class PromedioPesoMayor implements CondicionGrupal {
			
			double comparador;
			
			
			public PromedioPesoMayor(double n) {
				comparador = n;
			}
			
			public boolean cumple(GrupoGanadero r) {
				return r.getPromedioEdad() > comparador;
			}
			
		}
