package sistemaGanadero;
import TPE.Camion;
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
	
		public double getPromedioEdad() {
			double sumaEdades = 0;
			
				for(ElementoGanadero e: elementos){
					
					sumaEdades += e.getPromedioEdad();
				}
				
			return (sumaEdades/getCantidadAnimales());
		}
	
		public double getPeso() {
			double pesoTotal = 0; 
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
		
			
		public boolean puedeVender(CondicionGrupal g) {
			return 	g.cumple(this);
		} 
		
		public void llenarCamion(Camion f){
		
			Iterator<ElementoGanadero> it = elementos.iterator();
			while (it.hasNext() && !f.isFull()){
				ElementoGanadero e1 = it.next();
				e1.llenarCamion(f);
			}
			
			ArrayList<Animal> borrar = f.getAnimales();
			for (Animal a : borrar)
				deleteAnimales(a);
		}
		
		public boolean deleteAnimales(Animal a){
			boolean termino = this.elementos.remove(a);
			for (int i=0;i<elementos.size() && !termino ; i++)
				termino = elementos.get(i).deleteAnimales(a);
			return termino;
		}
		
		public String getNombre() {
			return nombre;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result
					+ ((elementos == null) ? 0 : elementos.hashCode());
			result = prime * result
					+ ((nombre == null) ? 0 : nombre.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			GrupoGanadero other = (GrupoGanadero) obj;
			if (elementos == null) {
				if (other.elementos != null)
					return false;
			} else if (!elementos.equals(other.elementos))
				return false;
			if (nombre == null) {
				if (other.nombre != null)
					return false;
			} else if (!nombre.equals(other.nombre))
				return false;
			return true;
		}
		
		public void printArray(){
			for(ElementoGanadero e: elementos){
				e.printArray();
			}
		}
	    
	}
