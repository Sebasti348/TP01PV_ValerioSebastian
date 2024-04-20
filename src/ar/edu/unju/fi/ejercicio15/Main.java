package ar.edu.unju.fi.ejercicio15;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner scanner = new Scanner(System.in);
		boolean band = false;
		int valor=0;
		do {
			System.out.println("Ingrese Tamaño del Arreglo");
			valor = scanner.nextInt();
				if(valor >=5 && valor <11) {
					band=true;
				}
				else {
					band=false;
				}	
		}while(!band);
		
		String[] nombres = new String[valor];
		int i = 0;
		while(band) {
			System.out.println("Ingrese un Nombre: ");
			String name = scanner.next();
			scanner.nextLine();
			nombres[i] = name;
			i++;
			if(i==valor) {
				band=false;
			}
		}
		scanner.close();
		for(i=valor-1;i>=0;i--) {
			System.out.println("Posicion ["+i+"] : "+nombres[i]);
		}
	}

}