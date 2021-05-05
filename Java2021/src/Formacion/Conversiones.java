package Formacion;

import java.util.Scanner;

public class Conversiones {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String linea = s.nextLine();
		System.out.println(linea);
		System.out.println("Dame un numero entero");
		linea = s.nextLine();
		int i = Integer.parseInt(linea);
		System.out.println(i*2);
		System.out.println("Dame un numero doble");
		linea = s.nextLine();
		double d= Double.parseDouble(linea.replace(',', '.'));
		System.out.println(d*2);
		System.out.println("Dame un caracter");
		char c = linea.charAt(0);
		System.out.println(c);
		
		System.out.println("Dime si o no");
		linea = s.nextLine();
		boolean b = "s".equalsIgnoreCase(linea);
		System.out.println(b);
		s.close();
	}

}
