package ar.edu.unju.fi.ejercicio14;

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
				if(valor >=3 && valor <11) {
					band=true;
				}
				else {
					band=false;
				}	
		}while(!band);
		
		int[] numeros = new int[valor];
		int i = 0;
		int suma = 0 ;
		while(band) {
			System.out.println("Ingrese un numero: ");
			int num = scanner.nextInt();
			scanner.nextLine();
			numeros[i] = num;
			suma +=num;
			System.out.println("Posicion ["+i+"] : "+num);
			System.out.println("Total : "+suma);
			i++;
			if(i==valor) {
				band=false;
			}
		}
		scanner.close();
	
	}

}