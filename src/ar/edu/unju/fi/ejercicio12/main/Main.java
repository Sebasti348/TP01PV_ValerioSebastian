package ar.edu.unju.fi.ejercicio12.main;

import java.util.Calendar;
import java.util.Scanner;

import ar.edu.unju.fi.ejercicio12.model.Persona;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Ingrese Nombre: ");
		String nombre = scanner.next();
		System.out.println("Ingrese Año de Nacimiento:");
		int anio = scanner.nextInt();
		System.out.println("Ingrese Mes de Nacimiento: ");
		int mes = scanner.nextInt();
		System.out.println("Ingrese Dia de Nacimiento: ");
		int dia = scanner.nextInt();
		scanner.nextLine();
		Persona persona = new Persona();
		persona.setNombre(nombre);
		Calendar fechaNacimiento = Calendar.getInstance();
		fechaNacimiento.set(anio, mes, dia);
		persona.setFechaNacimiento(fechaNacimiento);
		
		persona.motrarDatos();
		
		scanner.close();
	}

}