package condicionesGrupales;

import sistemaGanadero.GrupoGanadero;

	public class PromedioEdadMenor  implements CondicionGrupal{
		
			int comparador;
			
		public PromedioEdadMenor(int n) {
			comparador = n;
		}
				
		public boolean cumple(GrupoGanadero r) {
			return r.getPromedioEdad() < comparador;
		}
	
	}
