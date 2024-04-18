package ar.edu.unju.fi.ejercicio9.main;

import java.util.Scanner;

import ar.edu.unju.fi.ejercicio9.model.Producto;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i < 3; i++) {

			Producto nuevoProducto = new Producto();
			//ingresar los datos del producto
			System.out.println("Datos del Nuevo Producto");
			
			System.out.println("Ingrese el nombre: ");
			nuevoProducto.setNombre(sc.nextLine());
			
			System.out.println("Ingrese el código: ");
			nuevoProducto.setCodigo(sc.nextLine());
			
			System.out.println("Ingrese el precio (decimales con coma): ");
			nuevoProducto.setPrecio(sc.nextDouble());
			
			System.out.println("Ingrese el descuento del producto (0 - 50): ");
			nuevoProducto.setDescuento(sc.nextInt());
			sc.nextLine();
			
			//datos de cada producto
			System.out.println("Datos del Producto");
			System.out.println("Nombre: " + nuevoProducto.getNombre());
			System.out.println("Código: " + nuevoProducto.getCodigo());
			System.out.println("Precio : " + nuevoProducto.getPrecio());
			System.out.println("Con descuento del: " + nuevoProducto.getDescuento() + " %");
			System.out.println("Precio con descuento: " + nuevoProducto.calcularDescuento());
			System.out.println();

		}
		

		sc.close();
	
}
}