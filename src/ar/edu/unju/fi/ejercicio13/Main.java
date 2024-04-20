package ar.edu.unju.fi.ejercicio13;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[8]; // creacion de un arreglo
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Ingrese numero");
			int num = scanner.nextInt();
			numeros[i] = num;
			System.out.println("Valor en la posicion ["+i+"]= "+numeros[i]);
		}
		/* Forma 2 de mostrar los datos del arreglo
		for(int i: numeros) {
			System.out.println(i);
		}
		*/
	scanner.close();
	}

}