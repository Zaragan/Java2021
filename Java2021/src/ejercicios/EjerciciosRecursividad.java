package ejercicios;

import java.util.Scanner;

public class EjerciciosRecursividad {

	public static void main(String[] args) {
		/*
		Scanner sc1 = new Scanner(System.in);
		int n1, n2;
		System.out.println("Dividendo: ");
		n1 = sc1.nextInt();
		do {
			System.out.println("Divisor: ");
			n2 = sc1.nextInt();
		} while (n1<=0);
		System.out.printf("%d/%d = %d %n",n1,n2,cociente(n1,n2));
		sc1.close();
		
		//	Numero a binario
		Scanner sc2 = new Scanner(System.in);
		int n;
		do {
			System.out.println("Introduce un numero >0: ");
			n = sc2.nextInt();
		} while (n < 0);
		System.out.println();
		System.out.println("Binario: ");
		
		decBin(n);
		System.out.println();
		sc2.close();
	}
	public static int cociente(int a, int b) {
		if(a<b) {
			return 0;
		} else {
			return 1+cociente(a-b, b);
		}
	}
	public static void decBin(int n) {
		if(n<2) {
			System.out.println(n);
			return;
		} else {
			decBin(n/2);
			System.out.println(n%2);
			return;
		}
	}
		
	// calcular 2 elevado N
	Scanner sc3 = new Scanner(System.in);
	int num;
	do {
		System.out.println("Introduce un elevado");
		num = sc3.nextInt();
	} while (num<0);
	System.out.println("2 ^"+num+" = "+potencia(num));
	}
	public static double potencia(int n) {
		if(n==0) {
			return 1;
		} else {
			return 2 * potencia(n-1);
		}
	}
	
	//	Calcular numero entero recursivo
	Scanner sc4 = new Scanner(System.in);
	int num;
	do {
		System.out.print("Introduce un numero: ");
		num = sc4.nextInt();
	} while (num <= 0);
	System.out.println("numero de cifras: "+numeroCifras(num));
	sc4.close();
	}
	public static int numeroCifras(int n) {
		if(n<10) {
			return 1;
		} else {
			return 1+numeroCifras(n/10);
		}
	}
	*/		
	// Sumar numeros recursivamente
	Scanner sc5 = new Scanner(System.in);
	int num;
	do {
		System.out.println("Introduce un numero");
		num = sc5.nextInt();
	} while (num<= 0);
	System.out.println("Suma desde 1 hasta "+num+" = "+suma(num));
	sc5.close();
	}
	public static int suma(int n) {
		if(n == 1) {
			return 1;
		} else {
			return n + suma(n-1);
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
}