package ejercicios;

import static ejercicios.Consola.*;

import java.time.LocalDate;

public class ConsolaPrueba {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String nombre;

		// Sin biblioteca Consola
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Dime tu nombre: ");
//		nombre = sc.nextLine();
		//sc.close();
		
		// Con biblioteca Consola
		p("Bienvenido al programa de demostración de la clase Consola");		
		p(LocalDate.now());
		nombre = leerString("Dime tu nombre");
		int i = leerInt("Dime tu edad");
		p(leerChar("Dame una letra"));
		p(leerBoolean("¿Estás seguro?"));
	}
}