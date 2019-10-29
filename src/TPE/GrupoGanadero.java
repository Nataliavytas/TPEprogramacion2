package TPE;

import java.util.ArrayList;

public class GrupoGanadero implements ElementoGanadero{

	private ArrayList<ElementoGanadero> elementos;
	
	
	public int getCantidadAnimales() {
		int cantidad = 0;
		for(int i=0; i<elementos.size();i++){
			cantidad += elementos.get(i).getCantidadAnimales();
		}
		return cantidad; 
	}

	public int getPromedioEdad() {
		int sumaEdades = 0;
		for(int i=0; i<elementos.size();i++){
			sumaEdades+= elementos.get(i).getPromedioEdad();
		}
		int cantidad = this.getCantidadAnimales();
		return sumaEdades/cantidad;
	}

	public double getPeso() {
		int pesoTotal = 0; 
		for(int i=0; i<elementos.size(); i++){
			pesoTotal += elementos.get(i).getPeso();
		}
		return pesoTotal;
	}
	
	public double promedioPeso(){
		double pesoTotal = getPeso();
		int cantidad = getCantidadAnimales();
		
		return pesoTotal/cantidad; 
	}

	public ArrayList getAnimalesAptos(Condicion c, int capacidad ) {
		ArrayList<Animal> animalesAptos = new ArrayList<Animal>();
		
		for(ElementoGanadero e:elementos){
			ArrayList<Animal> aux = new ArrayList<Animal>();
			getAnimalesAptos(c, capacidad);
			animalesAptos.addAll(aux);
				if(animalesAptos.size()==capacidad){
					break;
				}
		}
		return animalesAptos;
		
	} 
	
	public void llenarCamion(Camion f){
	
		Condicion c = f.getCondicion();
		int capacidad = f.getCapacidad();
		
		ArrayList<Animal> animalesAptos = getAnimalesAptos(c, capacidad);
		
		f.addAnimales(animalesAptos);
	}
		
		
	}
	
	public void deleteAnimal(Animal a){
		elementos.remove(a);
	}

}
