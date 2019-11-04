package sistemaGanadero;
import TPE.Camion;
import condicionesAnimal.Condicion;
import condicionesGrupales.CondicionGrupal;

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
		
		public double getPromedioPeso(){
			double pesoTotal = getPeso();
			int cantidad = getCantidadAnimales();
			
			return pesoTotal/cantidad; 
		}
		
		public void buscarPorGrupo(CondicionGrupal g) { //medio que aca me hace agua, tengo que ver como hacerlo mejor
			g.cumple(this);
		}
	
		public boolean puedeVender(Condicion c ) {
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
