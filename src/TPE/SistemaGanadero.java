package TPE;

import java.util.ArrayList;

import condicionesAnimal.Capado;
import condicionesAnimal.Condicion;
import condicionesAnimal.CondicionAND;
import condicionesAnimal.CondicionNOT;
import condicionesAnimal.EdadBetween;
import condicionesAnimal.EdadMayor;
import condicionesAnimal.EdadMenor;
import condicionesAnimal.Genero;
import condicionesAnimal.ParicionIgual;
import condicionesAnimal.ParicionMayor;
import condicionesAnimal.PesoMayor;
import condicionesAnimal.Raza;
import condicionesGrupales.CondicionGrupal;
import condicionesGrupales.OrGrupo;
import condicionesGrupales.PromedioEdadMayor;
import condicionesGrupales.PromedioPesoMayor;
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
		
		Condicion lechal = new EdadMenor(8);
		Condicion ternero = new EdadBetween(8, 12);
		Condicion añojo = new EdadBetween(12, 24);
		Condicion novillo = new EdadBetween(24, 48);
		Condicion capado = new Capado();
		Condicion cebon1 = new EdadMenor(48);
		Condicion cebon = new CondicionAND(cebon1, capado);
		Condicion vaqui1 = new ParicionIgual(0);
		Condicion vaqui2 = new EdadMayor(15);
		Condicion vaquillona = new CondicionAND(vaqui1, vaqui2);
		Condicion v = new ParicionMayor(0);
		Condicion vaca = new CondicionAND(vaquillona, v);
		Condicion buey1 = new EdadMayor(48);
		Condicion buey = new CondicionAND(capado, buey1);
		Condicion toro = new CondicionNOT(capado);
		
		Clasificacion c1 = new Clasificacion("Lechal", lechal);
		Clasificacion c2 = new Clasificacion("Ternero", ternero);
		Clasificacion c3 = new Clasificacion("Añojo", añojo);
		Clasificacion c4 = new Clasificacion("Novillo", novillo);
		Clasificacion c5 = new Clasificacion("Cebon", cebon);
		Clasificacion c6 = new Clasificacion("Vaquillona", vaquillona);
		Clasificacion c7 = new Clasificacion("Vaca", vaca);
		Clasificacion c8 = new Clasificacion("Buey", buey);
		Clasificacion c9 = new Clasificacion("Toro", toro);
		
		
		SistemaGanadero.addClasificacion(c1);
		SistemaGanadero.addClasificacion(c2);
		SistemaGanadero.addClasificacion(c3);
		SistemaGanadero.addClasificacion(c4);
		SistemaGanadero.addClasificacion(c5);
		SistemaGanadero.addClasificacion(c6);
		SistemaGanadero.addClasificacion(c7);
		SistemaGanadero.addClasificacion(c8);
		SistemaGanadero.addClasificacion(c9);
		
		
		//el orden del constructor es: id, edad, peso, raza, capado/pariciones, genero
		Animal vaca1 = new Animal(1, 24, 600 , "Argentina", false, "male" );
		Animal vaca2 = new Animal(2, 9, 700, "Hereford", 6, "female");
		Animal vaca3 = new Animal(3, 15, 850, "Abardeen", true, "male");
		Animal vaca4 = new Animal (4, 45, 900, "Argentina", 3, "female");
		Animal vaca5 = new Animal (5, 50, 1000, "Taurine", false, "male");
		Animal vaca6 = new Animal (6, 13, 670, "Abardeen", 7, "female");
		Animal vaca7 = new Animal (7, 60, 780, "Abardeen", true, "male");
		Animal vaca8 = new Animal (8, 66, 675, "Taurine", 3, "female");
		Animal vaca9 = new Animal (9, 1, 100, "Hereford", true, "male");
		Animal vaca10 = new Animal (10, 3, 870, "Argentina", 3, "female");
		Animal vaca11 = new Animal (11, 35, 570, "Abardeen", 1, "female");
		Animal vaca12 = new Animal (12, 78, 890, "Taurine", false, "male");
		Animal vaca13 = new Animal (13, 64, 960, "Hereford", true, "male");
		Animal vaca14 = new Animal (14, 3, 450, "Abardeen", 0, "female");
		Animal vaca15 = new Animal (15, 54, 700, "Abardeen", true, "male");
		
	
		GrupoGanadero rodeo1 = new GrupoGanadero("Rodeo 1");
		
		rodeo1.addElementoGanadero(vaca1);
		rodeo1.addElementoGanadero(vaca2);
		rodeo1.addElementoGanadero(vaca3);
		rodeo1.addElementoGanadero(vaca4);
		rodeo1.addElementoGanadero(vaca5);
		
		GrupoGanadero rodeo2 = new GrupoGanadero("Rodeo 2");
		
		rodeo2.addElementoGanadero(vaca6);
		rodeo2.addElementoGanadero(vaca7);
		rodeo2.addElementoGanadero(vaca8);
		
		GrupoGanadero rodeo3 = new GrupoGanadero("Rodeo 3");
		
		rodeo3.addElementoGanadero(vaca9);
		rodeo3.addElementoGanadero(vaca10);
		rodeo3.addElementoGanadero(vaca11);
		
		GrupoGanadero estancia1 = new GrupoGanadero("Estancia 1");
		estancia1.addElementoGanadero(rodeo1);
		estancia1.addElementoGanadero(rodeo2);
		estancia1.addElementoGanadero(vaca12);
		
		GrupoGanadero estancia2 = new GrupoGanadero("Estancia 2");
		estancia2.addElementoGanadero(rodeo3);
		estancia2.addElementoGanadero(vaca13);
		estancia2.addElementoGanadero(vaca14);
		
		GrupoGanadero empresaAgropecuaria = new GrupoGanadero("Empresa Agropecuaria");
		empresaAgropecuaria.addElementoGanadero(estancia1);
		empresaAgropecuaria.addElementoGanadero(estancia2);
		empresaAgropecuaria.addElementoGanadero(vaca15);
		
		System.out.println("En la empresa agropecuaria hay "+ empresaAgropecuaria.getCantidadAnimales()+" animales");
		System.out.println("El promedio de edad de los animales es "+ empresaAgropecuaria.getPromedioEdad()+" meses");
		System.out.println("El peso total de la empresa agropecuaria es "+ empresaAgropecuaria.getPeso());
		System.out.println("El promedio de peso de cada animal en la empresa agropecuaria es "+ empresaAgropecuaria.getPromedioPeso());
						
		CondicionGrupal promedioPeso = new PromedioPesoMayor(650);
		CondicionGrupal promedioEdad = new PromedioEdadMayor(24);
		CondicionGrupal promedioEdad2 = new PromedioEdadMayor(36);
		CondicionGrupal promedioPeso2 = new PromedioPesoMayor(700);
		CondicionGrupal condicionMixta = new OrGrupo(promedioEdad2, promedioPeso2);
		
 		if(rodeo1.puedeVender(promedioPeso)){
 			System.out.println("Rodeo 1 se puede vender.");
 		}else{
 			System.out.println("Rodeo 1 no se puede vender.");
 		}
 		
 		if(estancia1.puedeVender(promedioEdad)){
 			System.out.println("Estancia 1 se puede vender.");
 		}else{
 			System.out.println("Estancia 1 no se puede vender.");
 		}
 		
 		if(empresaAgropecuaria.puedeVender(condicionMixta)){
 			System.out.println("Empresa agropecuaria 1 se puede vender.");
 		}else{
 			System.out.println("Empresa agropecuaria 1 no se puede vender.");
 		}
		
 		Condicion condCamion = new Raza ("Abardeen");
 		Camion camion1 = new Camion(5, condCamion);
 		
 		System.out.println("Hay "+empresaAgropecuaria.getCantidadAnimales()+ " vacas");
 		empresaAgropecuaria.printArray();

 		empresaAgropecuaria.llenarCamion(camion1);
 		
 		System.out.println("Despues de cargar el camion hay "+empresaAgropecuaria.getCantidadAnimales()+ " vacas");
 		empresaAgropecuaria.printArray();
 		
 		System.out.println("La clasificacion de la vaca 5 es "+ SistemaGanadero.getClasificacion(vaca5));
 		System.out.println("La clasificacion de la vaca 9 es "+ SistemaGanadero.getClasificacion(vaca9));
 		System.out.println("La clasificacion de la vaca 13 es "+ SistemaGanadero.getClasificacion(vaca13));
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
