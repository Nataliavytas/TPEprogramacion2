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
	
		public int getPromedioEdad() {
			int sumaEdades = 0;
			for(ElementoGanadero e: elementos){
				sumaEdades+= e.getPromedioEdad();
			}
			int cantidad = this.getCantidadAnimales();
			return sumaEdades/cantidad;
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
		}
		
		public void deleteAnimal(Animal a){
			elementos.remove(a);
		}
		
		public String getNombre() {
			return nombre;
		}
	
	}
