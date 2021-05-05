package numeroAdivina;

import java.util.Scanner;

public class AdivinaElNumero {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int objetivo, numero;
		Scanner s = new Scanner(System.in);
		objetivo = 1 + (int)(Math.random()*100);
		System.out.println(objetivo);
		do {
			System.out.println("Introduce un numero");
			numero = s.nextInt();
			if(numero > objetivo) {
				System.out.println("El objetivo es menor");
			} else if (numero < objetivo) {
				System.out.println("El objetivo es mayor");
			} else {
				System.out.println("Has acertado");
			}
		} while (numero != objetivo);

	}

}