package sistemaGanadero;
import TPE.Camion;
import consideraciones.Condicion;
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

	public ArrayList<ElementoGanadero> buscar(Condicion c ) {
		ArrayList<ElementoGanadero> aux = new ArrayList<ElementoGanadero>();
		
		for(ElementoGanadero el:elementos){
			if(el.buscar(c)!= null) {
				aux.add(el);
			}
		}
		return aux;
	}
	public boolean puedeVender(Condicion c ) {
		ArrayList<ElementoGanadero> puede = buscar(c);
		
		return puede.size() == elementos.size();		
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
	
	public String getNombre() {
		return nombre;
	}

}