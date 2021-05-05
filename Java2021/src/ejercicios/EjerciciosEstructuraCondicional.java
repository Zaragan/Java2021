package ejercicios;

import java.io.IOException;
import java.util.Scanner;

public class EjerciciosEstructuraCondicional {

	public static void main(String[] args) throws IOException {
		/*
		// Ejercicio 1
		Scanner sc1 = new Scanner(System.in);
		int n;
		System.out.println("Introduce un numero entero");
		n = sc1.nextInt();
		if(n%2 == 0) {
			System.out.println("Es un numero par");
		} else {
			System.out.println("Es un numero impar");
		}
		
		// Ejercicio 2
		Scanner sc2 = new Scanner(System.in);
		int n;
		System.out.println("Introduce un numero entero");
		n = sc2.nextInt();
		if(n%10 == 0) {
			System.out.println("El numero es multilpo de 10");
		} else {
			System.out.println("El numero no es multiplo de 10");
		}
		
		// Ejercicio 3
		char car;
		System.out.println("Introduce un caracter");
		car = (char)System.in.read();
		if(Character.isUpperCase(car)) {
			System.out.println("El cararcter es mayuscula");
		} else {
			System.out.println("El caracter es minuscula");
		}
		
		// Ejercicio 4
		Scanner sc4 = new Scanner(System.in);
		char car1, car2;
		System.out.println("Primer caracter");
		car1 = (char)sc4.next().charAt(0);
		System.out.println("Segundo caracter");
		car2 = (char)sc4.next().charAt(0);
		if(car1 == car2) {
			System.out.println("Los caracteres son iguales");
		} else {
			System.out.println("Los caracteres son diferentes");
		}
		
		// Ejercicio 5
		Scanner sc5 = new Scanner(System.in);
		char car1, car2;
		System.out.println("Primer caracter");
		car1 = (char)sc5.next().charAt(0);
		System.out.println("Segundo caracter");
		car2 = (char)sc5.next().charAt(0);
		if(Character.isLowerCase(car1)) {
			if(Character.isLowerCase(car2)) {
				System.out.println("Los dos son lowecase");
			} else {
				System.out.println("La primera es lowercase, la segunda no");
			}
		} else if(Character.isLowerCase(car2)) {
				System.out.println("La segunda es lowercase, la primera no");
			} else {
				System.out.println("Las dos son Uppercase");
			}
		}
		
		// Ejercicio 6
		Scanner sc6 = new Scanner(System.in);
		char car1;
		System.out.println("Introduce un numero");
		car1 = (char)sc6.next().charAt(0);
		if(Character.isDigit(car1)) {
			System.out.println("Es un numero");
		} else {
			System.out.println("No es un numero");
		}
		
		// Ejercicio 7
		Scanner sc7 = new Scanner(System.in);
		double dividendo, divisor;
		System.out.println("introduce un numero");
		dividendo = sc7.nextDouble();
		System.out.println("Introduce otro numero");
		divisor = sc7.nextDouble();
		if(divisor == 0) {
			System.out.println("No se puede dividir entre 0");
		} else {
			System.out.println(dividendo + " / " + divisor + " = " + dividendo/divisor);
		}
		
		// Ejercicio 8
		Scanner sc8 = new Scanner(System.in);
		int num1,num2,num3;
		System.out.println("Primer numero");
		num1 = sc8.nextInt();
		System.out.println("Segundo numero");
		num2 = sc8.nextInt();
		System.out.println("Tercer numero");
		num3 = sc8.nextInt();
		if(num1 > num2) {
			if(num1 > num3) {
				System.out.println("El mayor numero es "+num1);
			} else {
				System.out.println("El mayor numero es "+num3);
			} 
		} else if(num2 > num3) {
				System.out.println("El mayor numero es "+num2);
			} else {
				System.out.println("El mayor numero es "+num3);
			}
		}
		
		// Ejercicio 9
		Scanner sc9 = new Scanner(System.in);
		int h, m, s;
		System.out.println("Introduce las horas");
		h = sc9.nextInt();
		System.out.println("Introduce los minutos");
		m = sc9.nextInt();
		System.out.println("Introduce los segundos");
		s = sc9.nextInt();
		if(h>0 && h<24 && m>0 && m<60 && s>0 && s<60) {
			System.out.println("LA hoar es correcta");
		} else {
			System.out.println("La hora no es correcta");
		}
		
		// Ejercicio 10
		Scanner sc10 = new Scanner(System.in);
		int mes;
		System.out.println("Introduce un numero de mes");
		mes = sc10.nextInt();
		if(mes < 1 || mes > 12) {
			System.out.println("Mes incorrecto");
		} else {
			switch (mes) {
			case 1:
				System.out.print("enero ");
				break;
			case 2:
				System.out.print("febrero ");
				break;
			case 3:
				System.out.print("marzo ");
				break;
			case 4:
				System.out.print("abril ");
				break;
			case 5:
				System.out.print("mayo ");
				break;
			case 6:
				System.out.print("junio ");
				break;
			case 7:
				System.out.print("julio ");
				break;
			case 8:
				System.out.print("agosto ");
				break;
			case 9:
				System.out.print("septiembre ");
				break;
			case 10:
				System.out.print("octubre ");
				break;
			case 11:
				System.out.print("noviembre ");
				break;
			case 12:
				System.out.print("diciembre ");
				break;
			}
		}
		if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
			System.out.println("es un mes de 30 dias");
		} else if (mes == 2) {
			System.out.println("es un mes de 28 dias");
		} else {
			System.out.println("es un mes de 31 dias");
		}
		
		// Ejercicio 11
		Scanner sc11 = new Scanner(System.in);
		int n;
		System.out.println("Introduce un numero");
		n = sc11.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.println(i);
		}
		
		// Ejercicio 12
		Scanner sc12 = new Scanner(System.in);
		int n, s=0;
		System.out.println("Introduce un numero");
		n = sc12.nextInt();
		while(n>=s) {
			System.out.println(s);
			s++;
		}
		
		// Ejercicio 13
		Scanner sc13 = new Scanner(System.in);
		int n, i = 0;
		System.out.println("Introduce un numero");
		n = sc13.nextInt();
		do {
			System.out.println(i);
			i++;
		} while (n > i);
		
		// Ejercicio 14
		Scanner sc14 = new Scanner(System.in);
		int n1,n2,mayor,menor;
		do {
			System.out.println("introduce un numero");
			n1 = sc14.nextInt();
			System.out.println("introduce otro numero");
			n2 = sc14.nextInt();
			if(n1 == n2) {
				System.out.println("Introduce numeros diferentes");
			}
		} while (n1 == n2);
		
		if(n1 > n2) {
			mayor = n1;
			menor = n2;
		} else {
			mayor = n2;
			menor = n1;
		}
		
		for (int i = menor; i <= mayor; i++) {
			System.out.println(i);
		}
		
		// Ejercicio 15
		Scanner sc15 = new Scanner(System.in);
		int n1, n2;
		do {
			System.out.println("Introduce un numero");
			n1 = sc15.nextInt();
			System.out.println("Introduce otro numero");
			n2 = sc15.nextInt();
			if(n1 > n2) {
				System.out.println("El primer numero debe ser menor");
			}
		} while(n1 > n2);
		
		for (int i = n1; i < n2; i++) {
			if(i % 2 == 0) {
				System.out.println(i+" es par");
			}
		}
		
		// Ejercicio 16
		Scanner sc16 = new Scanner(System.in);
		int n,m;
		do {
			System.out.println("Introduce un numero positivo");
			n = sc16.nextInt();
			if(n<=0) {
				System.out.println("El numero debe ser positivo");
			}
		} while (n <= 0);
		do {
			System.out.println("Introduce otro numero positivo");
			m = sc16.nextInt();
			if(m<=0) {
				System.out.println("El numero debe ser postivo");
			}
		} while (m <= 0 || n >= m);
		for (int i = 0; i < m; i++) {
			if(i%n == 0) {
				System.out.println(i+" es MULTIPLO");
			}
		}
		*/
		// Ejercicio 17
		Scanner sc17 = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un numero, 0 para acabar");
		numero = sc17.nextInt();
		
		if(numero != 0) {
			if(numero < 0) {
				System.out.println("El numero "+numero+" es negativo");
			} else {
				System.out.println("El numero "+numero+" es positivo");
			}
			if(numero%2 == 0) {
				System.out.println("El numero "+numero+" es par");
			} else {
				System.out.println("El numero "+numero+ "es impar");
			}
		} else {
			System.out.println("Gracias por jugar.");
		}
		sc17.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}