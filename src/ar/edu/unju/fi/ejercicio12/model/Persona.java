package ar.edu.unju.fi.ejercicio12.model;

import java.util.Calendar;

public class Persona {
	private String nombre;
	private Calendar fechaNacimiento;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Calendar getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Calendar fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public int edadPersona() {
		Calendar hoy = Calendar.getInstance();
		int actual = hoy.get(Calendar.YEAR) ;//AÑO ACTUAL
		int aux = this.fechaNacimiento.get(Calendar.YEAR); // AÑO NAC
		return actual -= aux;
	}
	
	public String signoZodiaco() {
		String signo = "";
		int mes = this.fechaNacimiento.get(Calendar.MONTH);
		int dia = this.fechaNacimiento.get(Calendar.DATE);
		
		if((dia>= 21 && mes == 3) || (dia<=19 && mes == 4)) {
			signo="ARIES";
		}
		if((dia>= 20 && mes == 4) || (dia<=20 && mes == 5)) {
			signo="TAURO";
		}
		if((dia>= 21 && mes == 5) || (dia<=20 && mes == 6)) {
			signo="GEMINIS";
		}
		if((dia>= 21 && mes == 6) || (dia<=22 && mes == 7)) {
			signo="CANCER";
		}
		if((dia>= 23 && mes == 7) || (dia<=22 && mes == 8)) {
			signo="LEO";
		}
		if((dia>= 23 && mes == 8) || (dia<=22 && mes == 9)) {
			signo="VIRGO";
		}
		if((dia>= 23 && mes == 9) || (dia<=22 && mes == 10)) {
			signo="LIBRA";
		}
		if((dia>= 23 && mes == 10) || (dia<=21 && mes == 11)) {
			signo="ESCORPIO";
		}
		if((dia>= 22 && mes == 11) || (dia<=21 && mes == 12)) {
			signo="SAGITARIO";
		}
		if((dia>= 22 && mes == 12) || (dia<=19 && mes == 1)) {
			signo="CAPRICORNIO";
		}
		if((dia>= 20 && mes == 1) || (dia<=18 && mes == 2)) {
			signo="ACUARIO";
		}
		if((dia>= 19 && mes == 2) || (dia<=20 && mes == 3)) {
			signo="PISCIS";
		}
			return signo;
	}
	public String estacionAnio() {
		String estacion = "";
		int mes = this.fechaNacimiento.get(Calendar.MONTH);
		int dia = this.fechaNacimiento.get(Calendar.DATE);
		
		if((dia>= 21 && mes == 12) || (mes == 1)||(mes == 2) || (dia<=20 && mes == 3)) {
			estacion="VERANO";
		}
		if((dia>= 21 && mes == 3) || (mes == 4)||(mes == 5) || (dia<=20 && mes == 6)) {
			estacion="OTOÑO";
		}
		if((dia>= 21 && mes == 6) || (mes == 7)||(mes == 8) || (dia<=20 && mes == 9)) {
			estacion="INVIERNO";
		}
		if((dia>= 21 && mes == 9) || (mes == 10)||(mes == 11)|| (dia<=20 && mes == 12)) {
			estacion="PRIMAVERA";
		}	
		return estacion;
	}
	public void motrarDatos() {
		System.out.println("\n Nombre: "+this.nombre);
		int anio = this.fechaNacimiento.get(Calendar.YEAR);
		int mes = this.fechaNacimiento.get(Calendar.MONTH);
		int dia =  this.fechaNacimiento.get(Calendar.DATE);
		System.out.println("Fecha de Nacimiento: "+dia+"/"+mes+"/"+anio);
		System.out.println("Edad: " +edadPersona());
		System.out.println("Signo del Zodiaco: "+signoZodiaco());
		System.out.println("Estacion: "+estacionAnio());
	}
	
	
	
}