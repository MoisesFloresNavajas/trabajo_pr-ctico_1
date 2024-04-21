package ar.edu.unju.fi.ejercicio15.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número del 5 al 10: ");
		int valor = sc.nextInt();
		if (valor >= 5 && valor <= 10 ) {
		String[] nombres = new String[valor];
		sc.nextLine();
		//solicitar ingresar los nombres array
		System.out.println("Ingresar " + valor + " nombre/s: ");
		for (int i = 0; i < nombres.length; i++) {	
			nombres[i] = sc.nextLine();
		
	    }

		sc.close();
		System.out.println();
		
		//imprimir los valores array
        int j = 0;
        while (j < nombres.length) {
        	System.out.println("[" + j + "] = "+ nombres[j]);
            j++;
        }
        System.out.println();
        
		//imprimir los valores del array de manera invertida
		for (int k = nombres.length - 1; k >= 0; k--) {	
			System.out.println("[" + k + "] = "+ nombres[k]);
	    }
		
	} else {
			System.out.println("\nEl valor ingresado no está comprendido dentro del rango solicitado");
		}
}
}
	