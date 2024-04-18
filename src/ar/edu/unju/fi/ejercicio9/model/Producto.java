package ar.edu.unju.fi.ejercicio9.model;

public class Producto {
    private String nombre;
    private String codigo;
    private double precio;
    private int descuento;

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public Producto(String nombre, String codigo, double precio, int descuento) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
        this.descuento = descuento;
    }

    public Producto() {
    }

    public double calcularDescuento() {
        return this.precio - (this.precio * this.descuento / 100.0);
    }

	public void setnombre(String nextLine) {
		// TODO Auto-generated method stub
		
	}
}
