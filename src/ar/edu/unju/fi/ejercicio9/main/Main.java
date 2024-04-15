package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;
import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese los datos para el producto " + (i + 1) + ":");

            Producto Producto = new Producto();

            System.out.print("Nombre: ");
            Producto.setnombre(scanner.nextLine());

            System.out.print("Código: ");
            Producto.setcodigo(scanner.nextLine());

            System.out.print("Precio: ");
            Producto.setPrecio(scanner.nextDouble());

            System.out.print("Descuento (valor entero comprendido entre [0 - 50]): ");
            Producto.setDescuento(scanner.nextInt());

            System.out.println("Los datos ingresados para el producto " + (i + 1) + " son:");
            System.out.println("Nombre: " + Producto.getnombre());
            System.out.println("Código: " + Producto.getcodigo());
            System.out.println("Precio: " + Producto.getprecio());
            System.out.println("Descuento: " + Producto.getdescuento());
            System.out.println("Precio con descuento: " + Producto.calcularDescuento());
            scanner.nextLine(); // Limpiar el buffer del scanner
        }
        scanner.close();
    }
}
