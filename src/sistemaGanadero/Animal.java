package sistemaGanadero;

import java.util.ArrayList;

import TPE.Camion;
import condicionesAnimal.Condicion;

	public class Animal implements ElementoGanadero{
	
			private int id; 
			private int edad; 
			private double peso; 
			private String raza; 
			private boolean capado; 
			private int pariciones;
			private String genero;
		
		public Animal(int i, int ed, double pe, String rz, boolean ca, String j ) {
			id = i; 
			edad = ed;
			peso =pe;
			raza=rz;
			capado =ca;
			genero = j;
		}
		
		public Animal(int i, int ed, double pe, String rz, int par, String ge ) {
			id = i; 
			edad = ed;
			peso =pe;
			raza=rz;
			pariciones = par;
			genero = ge;
		}

		public double edadTotal() {
			return edad;
		}
	
		public double getPeso() {
			return peso;
		}
		
		public void llenarCamion(Camion c){
			c.addAnimal(this);
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
			if(genero.equalsIgnoreCase("female"))
				return false;
			else {
				return capado;
			}
		}
		public int getPariciones() {
			if(genero.equalsIgnoreCase("male"))
				return 0;
			else {
				return pariciones;
			}	
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + id;
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
			Animal other = (Animal) obj;
			if (id != other.id)
				return false;
			return true;
		}

		@Override
		public boolean deleteAnimales(Animal a) {
			return false;
		}
		
		public void printArray(){
			System.out.println("vaca "+ id + " ");
		}
		
	}
