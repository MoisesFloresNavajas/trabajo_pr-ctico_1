package ar.edu.unju.fi.ejercicio3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese un número:  ");
		Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if (num % 2 == 0){
            num*= 3; 
        } else {
            num*= 2;
        }
        
        System.out.println(num);
        sc.close();
	}

}
