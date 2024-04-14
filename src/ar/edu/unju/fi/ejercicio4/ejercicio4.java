package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class ejercicio4 {
	public static void main(String[] args) {
		int fac = 1;
		int cont = 1;
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("Ingrese un Numero"); 
		                    
		int num = scanner.nextInt();
		if(num!=0) {
			while(cont<=num) {
				fac *= cont;
				cont++;
			}
		}
		System.out.println("El Factorial es: "+fac);
	scanner.close();
	}
}
