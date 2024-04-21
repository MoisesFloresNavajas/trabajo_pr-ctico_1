package ar.edu.unju.fi.ejercicio14.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un número del 3 al 10: ");
		int valor = sc.nextInt();
		int[] numeros = new int[valor];
		int sum = 0; 
		//solicitar ingresar los números para el array
		System.out.println("Ingresar " + valor + " números: ");
		for (int i = 0; i < numeros.length; i++) {	
			numeros[i] = sc.nextInt();
			sum += numeros[i]; 
	    }

		sc.close();
		System.out.println();
		
		imprimirArray(numeros);
		
		System.out.println("\nSumatoria de los números = " + sum); 
		}
		
	
	
	
	//otra forma
	public static void imprimirArray(int[] numeros) {
		int j = 0;
		while (j < numeros.length) {
			System.out.println("Número en posición [" + j + "] = "+ numeros[j]);
			j++;
		}
		System.out.println();
	}
}
	
