package consideraciones;

import sistemaGanadero.Animal;

public class Not implements Condicion{
	
	Condicion c1;
	
	public Not(Condicion cond1) {
		c1 = cond1;
	}
	
	public boolean cumple(Animal a) {
		return (!c1.cumple(a));
	}

}
