package ar.edu.unju.fi.ejercico5;

import java.util.Scanner;

public class ejercicio5 {
	public static void main(String[] args) {
		int cont=0;
		int rest=0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese un numero comprendido entre el 1-9");
		
		int num = scanner.nextInt();
		if(num<10 & num>=0) {
			while(cont!=11) {
				rest=num*cont;
				System.out.println(num+"x"+cont+"="+rest);
				cont ++;
			}
		}
		else {
			System.out.println("Error Ingresa numero entere 1-9");
		}
	scanner.close();
	}
}
