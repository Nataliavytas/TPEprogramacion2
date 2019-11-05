package sistemaGanadero;

import java.util.ArrayList;

import TPE.Camion;
import condicionesAnimal.Condicion;

	public class Animal implements ElementoGanadero{
	
			private int id; 
			private int edad; 
			private double peso; 
			private String raza; 
			private GrupoGanadero padre;
			private boolean capado; 
			private int pariciones;
			private String genero;
		
		public Animal(int i, int ed, double pe, String rz, boolean ca, String ge ) {
			id = i; 
			edad = ed;
			peso =pe;
			raza=rz;
			capado =ca;
			genero = ge;
		}
		
		public Animal(int i, int ed, double pe, String rz, int par, String ge ) {
			id = i; 
			edad = ed;
			peso =pe;
			raza=rz;
			pariciones = par;
			genero = ge;
		}
		
				
		public int getPromedioEdad() {
			return edad;
		}
	
		public double getPeso() {
			return peso;
		}
		
		public void llenarCamion(Camion c){
		}
		
		public void deleteAnimal(){
			padre.deleteAnimal(this);
		}
		
		public int getCantidadAnimales() {
			return 1;
		}
		
		public ArrayList<ElementoGanadero> buscar (Condicion c) {
			ArrayList<ElementoGanadero> aux = new ArrayList<ElementoGanadero>();
			
				if(c.cumple(this)) {
					aux.add(this);
				}		
			return aux;
		}
		
		public String getGenero() {
			return genero;
		}
		public int getId() {
			return id;
		}
		public String getRaza() {
			return raza;
		}
		public boolean isCapado() {
			if(genero.equalsIgnoreCase("hembra"))
				return false;
			else {
				return capado;
			}
		}
		public int getPariciones() {
			if(genero.equalsIgnoreCase("macho"))
				return 0;
			else {
				return pariciones;
			}	
		}
		
	}
