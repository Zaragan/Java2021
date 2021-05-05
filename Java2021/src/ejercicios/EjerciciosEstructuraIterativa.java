package ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class EjerciciosEstructuraIterativa {

	public static void main(String[] args) throws IOException {
		/*
		// Ejercicio 1
		System.out.println("Numeros del 1 al 100");
		int i = 1;
		while(i<100) {
			System.out.println(i);
			i++;
		
		// Ejercicio 2
		int i = 1;
		do {
			System.out.println(i);
			i++;
		} while (i < 100);
			
		// Ejercicio 3
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		
		// Ejercicio 4
		int i = 100;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
		
		// Ejercicio 5
		int i = 100;
		do {
			System.out.println(i);
			i--;
		} while(i>=1);
		
		// Ejercicio 6
		for (int i = 100; i >= 1; i--) {
			System.out.println(i);
		}
		
		// Ejercicio 6
		Scanner sc6 = new Scanner(System.in);
		int n;
		System.out.println("Introduce un numero ( 0 para terminar)");
		n = sc6.nextInt();
		while(n != 0) {
			if(n % 2 == 0) {
				System.out.println("El numero es par");
			} else {
				System.out.println("El numero es impar");
			}
			if(n > 0) {
				System.out.println("El numero es positivo");
			} else {
				System.out.println("El numero es negativo");
			}
			System.out.println("Introduce un numero ( 0 para terminar)");
			n = sc6.nextInt();
			
		}
		
		// Ejercicio 7
		Scanner sc7 = new Scanner(System.in);
		int millas; double km;
		do {
			System.out.println("Introduce las millas");
			millas = sc7.nextInt();
			if (millas != 0) {
				km = millas * 1.6093;
				System.out.println(millas+" millas son "+km+" kilometros");
			}
		} while (millas != 0);
		sc7.close();
		*/
		// CALCULAR EL NUMERO DE CIFRAS DE UN NUMERO INTRODUCIDO
		Scanner sc8 = new Scanner(System.in);
		int n, cifras;
		char car;
		do {
			System.out.println("Introduce numeros");
			n = sc8.nextInt();
			cifras = 0;
			while(n != 0) {
				n = n/10;
				cifras++;
			}
			System.out.println("El numero tiene "+cifras+" cifras");
			System.out.println("Continuar? (S/N)");
			car = (char)System.in.read();
		} while (car != 'n' && car != 'N');
		sc8.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
			
	
	}

}
