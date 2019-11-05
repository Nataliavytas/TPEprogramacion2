	package TPE;
	
	import java.util.ArrayList;
	
	import condicionesAnimal.Condicion;
	import condicionesAnimal.EdadMayor;
	import condicionesAnimal.Genero;
	import condicionesAnimal.PesoMayor;
	import condicionesAnimal.Raza;
	import sistemaGanadero.Animal;
	import sistemaGanadero.ElementoGanadero;
	import sistemaGanadero.GrupoGanadero;
	
	public class SistemaGanadero {
		
			private ArrayList<Camion> camiones;
			private ArrayList<ElementoGanadero> sistema; 
			private ArrayList<Clasificacion> clasificaciones;
		
		public SistemaGanadero() {
			camiones = new ArrayList<Camion>();
			sistema = new ArrayList<ElementoGanadero>();
			clasificaciones = new ArrayList<Clasificacion>();
		}
			
	
		  public static void main(String[] args) {
		  
		  SistemaGanadero SistemaGanadero = new SistemaGanadero();
		  
		  Animal vaca1 = new Animal(1, 2, 5 , "Argentina", false, "male" ); 
		  Animal vaca2 = new Animal(2, 3, 4, "Hereford", 5, "female");
		  Animal vaca3 = new Animal(3, 1, 2, "Abardeen", true, "male");
		  Animal vaca4 = new Animal (4, 5,7, "Argentina", 6, "female");
		  Animal vaca5 = new Animal (5, 5, 7.5,"Argentina", 6, "female");
		  
		  Condicion cond1 = new Raza("Argentina"); Condicion cond2 = new PesoMayor(3);
		  Condicion cond3 = new Genero("male");
		  
		  Clasificacion c1 = new Clasificacion("Machos", cond3);
		  Clasificacion c2 = new Clasificacion("Gordos", cond2);
		  Clasificacion c3 = new Clasificacion("Argentas", cond1);
		  
		  GrupoGanadero rodeo1 = new GrupoGanadero("Rodeo");
		  
		  rodeo1.addElementoGanadero(vaca1);
		  rodeo1.addElementoGanadero(vaca2);
		  rodeo1.addElementoGanadero(vaca3);
		  rodeo1.addElementoGanadero(vaca4);
		  
		  GrupoGanadero estancia = new GrupoGanadero("Estancia");
		  estancia.addElementoGanadero(rodeo1); estancia.addElementoGanadero(vaca5);
		  
		  
		  
		  Condicion edadMayorA = new EdadMayor(2);
		  Camion camion1 = new Camion(2, edadMayorA);
		  
		  estancia.llenarCamion(camion1);
		  
		  System.out.println(camion1.animales.get(0));
		  
		  
		  camion1.printArray();
		  
	}
	
		
		public void addCamion(Camion c) {
			camiones.add(c);
		}
		
		public void addElemento(ElementoGanadero e) {
			sistema.add(e);
		}
		
		public void addClasificacion(Clasificacion c) {
			clasificaciones.add(c);
		}
		
	
		public String getClasificacion(Animal a) {
			String clasificacion="";
			for(Clasificacion c:clasificaciones){
				clasificacion+= c.getClasificacion(a);
			}
			return clasificacion;
		}
		
	}
