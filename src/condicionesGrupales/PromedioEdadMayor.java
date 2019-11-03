package condicionesGrupales;

import sistemaGanadero.GrupoGanadero;

	public class PromedioEdadMayor implements CondicionGrupal{
			
				int comparador;
			
			public PromedioEdadMayor (int e) {
				comparador = e;
			}
		
			public boolean cumple(GrupoGanadero r) {
				return r.getPromedioEdad() > comparador;
			}
		
	}
