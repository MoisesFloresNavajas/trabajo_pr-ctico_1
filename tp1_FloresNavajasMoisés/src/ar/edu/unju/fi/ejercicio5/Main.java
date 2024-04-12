package ar.edu.unju.fi.ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número del 1 al 9: ");
        int num = sc.nextInt(), Tmultiplicacion;
        if (num >= 1 && num<= 9) { 
            System.out.println("Tabla de multiplicar del "+ num + ":");
            for( int i = 0; i<=10; i++){
                Tmultiplicacion = num * i;
                System.out.println(num + " x " + i + " = " + Tmultiplicacion);
            }
            
            
        } else {
             System.out.println("El número ingresado no corresponde al rango solicitado.");
        }
        sc.close();
	}

}
