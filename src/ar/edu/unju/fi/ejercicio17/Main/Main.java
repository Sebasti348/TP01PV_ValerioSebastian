package ar.edu.unju.fi.ejercicio17.Main;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio17.Model.Jugador;

public class Main {
	
		static Scanner scanner= new Scanner(System.in);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Jugador> jugadores = new ArrayList<Jugador>();
			int op=0;
			
			do {
				op=menu();
				switch(op) {
				case 1:System.out.println("ALTA JUGADOR :");
						Jugador jugador = crearJugador();
						if(jugadores.add(jugador)) {
							System.out.println("JUGADOR AGREGADO CON EXITO");
							System.out.println("Cantidad : "+jugadores.size());
						}
						else {
							System.out.println("error al crear jugador");
						}
					break;
				case 2:System.out.println("---- DATOS DE UN JUGADOR ----");
						System.out.println("Ingrese Nombre :");
						String name = scanner.nextLine();
						System.out.println("Ingrese Apellido :");
						String lastname = scanner.nextLine();
						datoJugador(jugadores,name,lastname);
					break;
				case 3:System.out.println("JUGADORES POR APELLIDO");
						apellidos(jugadores);
					break;
				case 4:System.out.println("DATOS DISPONIBLES A MODIFICAR :");
						System.out.println(" - ESTATURA -");
						System.out.println(" - PESO -");
						System.out.println(" - POSICION -");
						if(modificarJugador(jugadores)) {
							System.out.println("\n Jugador modificado con exito !");
						}
						else {
							System.out.println(" Error al modificar ! ");
						}
					break;
				case 5:System.out.println("ELIMINAR JUGADOR");
						System.out.println("cantidad : "+ jugadores.size());
						if(eliminarJugador(jugadores)) {
							System.out.println("JUGADOR ELIMINADO CON EXITO ");
							System.out.println("cantidad : "+ jugadores.size());
						}
						else {
							System.out.println("ERROR AL BORRAR ! !");
						}
					break;
				case 6:System.out.println("CANTIDAD DE JUGADORES : "+jugadores.size());
					break;
				case 7:System.out.println("JUGADORES POR NACIONALIDAD");
						nacionalidad(jugadores);
					break;
				case 8:System.out.println("FIN DEL PROGRAMA");
					break;
				default: System.out.println("ERROR DE OPCION");
				}
			}while(op != 8);
	}
	
	static void apellidos(List<Jugador> jugadores) { //MUESTRA LOS APELLIDOS ORDENADOS
		
		Collections.sort(jugadores,Comparator.comparing(Jugador::getApellido));
		
		for (Jugador jugador : jugadores) {
			System.out.println("\n Jugador : "+jugador.getApellido()+"   posicion : "+jugador.getPosicion());
		}
	}
	static void nacionalidad(List<Jugador> jugadores) {// MUESTRA JUGADORES POR NACIONALIDAD
		System.out.println("Ingrese Nacionalidad : ");
		String nac = scanner.nextLine();
		for (Jugador jugador : jugadores) {
			if(nac.equals(jugador.getNacionalidad())){
					
			System.out.println("\n Jugador : "+jugador.getApellido()+", "+jugador.getNombre()+"   Nacionalidad : "+jugador.getNacionalidad());
			}
		}
	}

	static void datoJugador(List<Jugador> jugadores,String name, String lastname) { // MUESTRA DATOS DE 1 SOLO JUGADOR
			for (Jugador jugador : jugadores) {
				if( jugador.getApellido().equals(lastname) && jugador.getNombre().equals(name) ) {
					jugador.mostrarDatos();
				}
			}
	}

	
	static boolean modificarJugador(List<Jugador> jugadores) {
		boolean encontrado = false;
		System.out.println("INGRESE NOMBRE DEL JUGADOR:");
		String name = scanner.nextLine();
		System.out.println("INGRESE APELLIDO DEL JUGADOR");
		String lastname = scanner.nextLine();
			for(int i=0; i< jugadores.size();i++) {
				if(name.equals(jugadores.get(i).getNombre()) && lastname.equals(jugadores.get(i).getApellido()) ) {
					encontrado = true;
					System.out.println("INGRESE ESTATURA : ");
					float estatura = scanner.nextFloat();
					System.out.println("INGRESE PESO : ");
					float peso = scanner.nextFloat();
					scanner.nextLine();
					System.out.println("INGRESE POSICION : ");
					String posicion = scanner.nextLine();
					jugadores.get(i).setEstatura(estatura);
					jugadores.get(i).setPeso(peso);
					jugadores.get(i).setPosicion(posicion);
				}
			}
		return encontrado;
	}
	static boolean eliminarJugador(List<Jugador> jugadores) {
		boolean eliminado = false;
		System.out.println("INGRESE NOMBRE DEL JUGADOR:");
		String name = scanner.nextLine();
		System.out.println("INGRESE APELLIDO DEL JUGADOR");
		String lastname = scanner.nextLine();
		for(int i=0; i< jugadores.size();i++) {
			if(name.equals(jugadores.get(i).getNombre()) && lastname.equals(jugadores.get(i).getApellido()) ) {
				eliminado = true;
				jugadores.remove(i);
			}
		}
	return eliminado;	
}
	public static int menu() {
		int op=0;
		System.out.println("\n 1- Alta Jugador -");
		System.out.println(" 2- Mostrar datos del Jugador -");
		System.out.println(" 3- Mostrar todos los jugadores por apellidos -");
		System.out.println(" 4- Modificar los datos de un jugador -");
		System.out.println(" 5- Eliminar un jugador -");
		System.out.println(" 6- Mostrar Cantidad de jugadores -");
		System.out.println(" 7- Mostrar Cantidad de jugadores de una Nacionalidad -");
		System.out.println(" 8- Salir ...");
		System.out.println(" \n Ingrese opcion !");
		op = scanner.nextInt();
		scanner.nextLine();
		return op;
	}

	static Jugador crearJugador() {
		return new Jugador(nombre(),apellido(),fechaNacimiento(),nacionalidad(),estatura(),peso(),posicion());
	}
	static String nombre(){
		System.out.println("Ingrese Nombre: ");
		return scanner.nextLine();
	}
	static String apellido() {
		System.out.println("Ingrese Apellido: ");
		return scanner.nextLine();
	}
	static LocalDate fechaNacimiento() {
		LocalDate fecha=null;
		int dia=0,mes=0,anio=0;
			try {
				System.out.println("FECHA DE NACIMIENTO:");
				System.out.println("\n INGRESE AÑO");
				anio =scanner.nextInt();
				System.out.println("INGRESE MES");
				mes = scanner.nextInt();
				System.out.println("INGRESE DIA");
				dia = scanner.nextInt();
			}
			catch(java.util.InputMismatchException ex) {
				System.out.println("DATOS INGRESADOS DE DISTINTO TIPO");
				}
		try {
			fecha = LocalDate.of(anio, mes, dia);
		}
		catch(DateTimeException e) {
			System.out.println("ERROR EN PARAMETROS DE FECHA");
		}
		scanner.nextLine();
		return fecha;
	}
	static String nacionalidad() {
		System.out.println("Ingrese Nacionalidad: ");
		return scanner.nextLine();
	}
	static float estatura() {
		float n=0;
		try {
			System.out.println("Ingrese Estatura: ");
			n = scanner.nextFloat();
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("ERROR EN TIPO DE DATO");
		}
		scanner.nextLine();
		return n;
	}
	static float peso() {
		float p=0;
		try {
			System.out.println("Ingrese Peso: ");
			p = scanner.nextFloat();
		}
		catch(java.util.InputMismatchException e) {
			System.out.println("ERROR EN TIPO DE DATO");
		}
		scanner.nextLine();
		return p;
	}
	static String posicion() {
		boolean band=false;
		String pos ="";
		do {
		System.out.println("Ingrese Posicion: ");
		System.out.println("\n --- delantero --- medio --- defensa --- arquero ---");
		pos = scanner.nextLine();
			if(pos.equals("delantero") || pos.equals("medio") || pos.equals("defensa") || pos.equals("arquero")) {
				band=true;
			}
			else	{
				System.out.println("Posicion ingresada no valida !");
				band=false;
			}
		}while(!band);
		
		return pos;
	}
	
}//esta llave es de la clase