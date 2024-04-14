package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class ejercicio3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Porfavor ingrese un valor");
		
		int a = scanner.nextInt();
		if ((a % 2)==0) {
			System.out.println("Es  par "+a*3);
		}
		else {
			System.out.println("Es Impar "+a*2);
		}
		scanner.close();
		
	}
	
}
