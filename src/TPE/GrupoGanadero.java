package TPE;

import java.util.ArrayList;
import java.util.Iterator;

public class GrupoGanadero implements ElementoGanadero{

	private String nombre;
	private ArrayList<ElementoGanadero> elementos;
	
	
	public GrupoGanadero(String n){
		nombre = n;
		elementos = new ArrayList<>();
	}
	
	public void addElementoGanadero(ElementoGanadero e){
		elementos.add(e);
	}
	
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

	public ArrayList<Animal> getAnimalesAptos(Condicion c ) {
		ArrayList<Animal> animalesAptos = new ArrayList<Animal>();
		
		for(ElementoGanadero el:elementos){
				ArrayList<Animal> aux = el.getAnimalesAptos(c);
				animalesAptos.addAll(aux);
		}
		return animalesAptos;
	} 
	
	public void llenarCamion(Camion f){
	
		Iterator<ElementoGanadero> it = elementos.iterator();
		while (it.hasNext() && !f.isFull()){
			ElementoGanadero e1 = it.next();
			e1.llenarCamion(f);
		}
	
	}
	
	public void deleteAnimal(Animal a){
		elementos.remove(a);
	}

}
