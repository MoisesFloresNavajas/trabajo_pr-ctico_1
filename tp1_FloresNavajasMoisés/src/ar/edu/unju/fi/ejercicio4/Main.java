package ar.edu.unju.fi.ejercicio4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un número del 0 al 10 para encontrar el factorial: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Sum, factorial; 
        
        if (num >= 0 && num <= 10){
            
        if (num == 0){
            System.out.println("El factorial de 0 es = 1");
        } else {
            Sum = 1;
            factorial = num; 
            while (Sum < num){
                
                factorial *= (num - Sum);
            Sum++;
                
            }
            System.out.println("El factorial de " + num + " es = " + factorial);
        }
            
        }else{
            System.out.println("El número ingresado no corresponde con el rango solicitado.");
            sc.close();
        }
	}

}
