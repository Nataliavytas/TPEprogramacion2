package TPE;
import condicionesAnimal.Condicion;
import sistemaGanadero.Animal;

public class Clasificacion{

	private Condicion condicion;
	private String clasificacion;
	
	public Clasificacion(String nombre, Condicion cond){
		condicion = cond;
		clasificacion = nombre;
	}
	
	public String getClasificacion(Animal a){
		if(condicion.cumple(a)){
			return clasificacion + " "; 
		}else{
			return "";
		}
	}
	
	
}
