package condicionesGrupales;

import sistemaGanadero.GrupoGanadero;

	public class AndGrupo implements CondicionGrupal {
	
		CondicionGrupal c1;
		CondicionGrupal c2;
		
		public AndGrupo(CondicionGrupal c1, CondicionGrupal c2) {
			this.c1 = c1;
			this.c2 = c2;
		}
		public boolean cumple(GrupoGanadero r) {
			
			return c1.cumple(r)&&c1.cumple(r);
		}
	}
