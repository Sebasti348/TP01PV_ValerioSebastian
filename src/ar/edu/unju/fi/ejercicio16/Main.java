package ar.edu.unju.fi.ejercicio16;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
			Scanner scanner = new Scanner(System.in);
			
			String[] nombres = new String[5];
			for(int i=0;i<nombres.length;i++) {
				System.out.println("Ingrese nombre : ");
					String name = scanner.next();
					nombres[i] = name;
			}
			System.out.println("Tamaño del Arreglo : "+nombres.length);
			
			int op;
			do {
				int k = nombres.length;
				mostrarDatos(nombres,k);
				System.out.println("Desea eliminar un nombre  1- SI / 2 -NO ??");
				op = scanner.nextInt();
				scanner.nextLine();
					if(op == 1) {
						System.out.println("Ingrese Posicion del nombre a eliminar: ");
						byte pos = scanner.nextByte();
						quitarNombre(nombres,pos);
						if(nombres[0]=="") {
							System.out.println("Se elimino el ultimo Nombre");
						}
					}
					else {
						System.out.println(" Fin del programa !");
					}
					if(nombres[0]=="") {
						System.out.println(" SIN NOMBRES EN EL ARREGLO !");
						op=2;
					}
			}while( op == 1);
			scanner.close();
	}
	
	
	static void mostrarDatos(String[] nombres, int k){
		int i = 0;
		while(i<k) {
			System.out.println("Posicion ["+i+"] : "+nombres[i]);
			i++;
		}
	}
	static void quitarNombre(String[] nombres, byte pos) {
		if(pos==0) {
			for(int i = 0; i < nombres.length-1 ; i++) {
				nombres[i] = nombres[i+1];
			}
			nombres[nombres.length-1] = "";
		}
		else {
			if(pos == nombres.length-1) {
				nombres[pos]="";
			}
			else {	
					for(int i=pos ; i<nombres.length-1;i++) {
						nombres[i] = nombres[i+1];
						nombres[i+1] = "";
					}
					
				}
			}
		}
	
}