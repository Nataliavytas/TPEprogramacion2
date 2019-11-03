package consideraciones;

import sistemaGanadero.Animal;

public class Or implements Condicion{
	
	Condicion c1;
	Condicion c2;
	
	public Or (Condicion cond1,Condicion cond2) {
		c1 = cond1;
		c2 = cond2;
	}
	public boolean cumple(Animal a) {
		return (c1.cumple(a) || c2.cumple(a));
	}

}
