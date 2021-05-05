package ejercicios;

import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

@SuppressWarnings("unused")
public class EjerciciosCadenasDeCaracteres {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		//	Contar el numero de palabras
		/*
		Scanner sc1 = new Scanner(System.in);
		String frase;
		System.out.println("Introduce una frase: ");
		frase = sc1.nextLine();
		StringTokenizer st = new StringTokenizer(frase);
		System.out.println("Numero de palabras: "+st.countTokens());
		
		//	Eliminar la ultima palabra de la frase
		Scanner sc2 = new Scanner(System.in);
		String texto;
		do {
			System.out.println("Introduce texto: ");
			texto = sc2.nextLine();
		} while (texto.isEmpty());
		texto = eliminarUltPalabra(texto);
		System.out.println(texto);
		 */
		//	Contar el nnumero de veces que aparece un caracter en una frase
		Scanner sc= new Scanner(System.in);
		String texto;
		char caracter;
		int numeroDeVeces = 0;
		do {
			System.out.println("Introduce una frase: ");
			texto = sc.nextLine();
		} while (texto.isEmpty());
		System.out.println("Introduce un caracter: ");
		caracter = (char) System.in.read();
		numeroDeVeces = contarCaracteres(texto, caracter);
		System.out.println("el caracter "+caracter+" aparece "+numeroDeVeces+" veces.");
	}
	//	ELIMINAR LA ULTIMA PALABRA DE UNA FRASE
	public static String eliminarUltPalabra(String s) {
		int pos;
		s = s.trim();
		pos = s.lastIndexOf(" ");
		if(pos != -1) {
			s = s.substring(0, pos);
		} else {
			s = "";
		}
		return s;
	}
	//	CONTAR EL NUMERO DE VECES QUE APARECE UN CARACTER EN UNA FRASE
	public static int contarCaracteres(String cadena, char caracter) {
		int posicion, contador = 0;
		posicion = cadena.indexOf(caracter);
		while (posicion != -1) {
			contador++;
			posicion = cadena.indexOf(caracter, posicion +1);
		}
		return contador;
	}
}
