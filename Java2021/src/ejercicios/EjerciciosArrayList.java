package ejercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unused")
public class EjerciciosArrayList {
	/*public static void main(String[] args) {
		ArrayList<Double> altura = new ArrayList();
		int n;
		double media;
		n = numeroAlumnos();
		leerAlturas(altura, n);
		media = calcularMedia(altura);
		mostrarResultados(altura, media);
	}
	public static int numeroAlumnos() {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.println("Introduce los alumnos");
			n = sc.nextInt();
		} while (n<1);
		return n;
	}
	public static void leerAlturas(ArrayList<Double> a, int n) {
		Scanner sc = new Scanner(System.in);
		int i;
		double alto;
		for (i = 0; i < n; i++) {
			do {
				System.out.println("Alumno " + i + " Altura: ");
				alto = sc.nextDouble();
			} while (alto <= 0);
			a.add(alto);
		}
	}
	public static double calcularMedia(ArrayList<Double> a) {
		double media = 0;
		for (Double d: a) {
			media = media+d;
		}
		return media / a.size();
	}
	public static void mostrarResultados(ArrayList<Double> a, double media) {
		int superior = 0, inferior = 0;
		System.out.println("Alturas introducidas: ");
		System.out.println(a);
		for (Double d : a) {
			if(d > media) {
				superior++;
			} else if(d < media) {
				inferior++;
			}
		}
		System.out.printf("Media: %.2f %n", media);
		System.out.println("Hay "+superior+" alumnos mas altos");
		System.out.println("Hay "+inferior+" alumnos mas bajos");
	}
	public static void main(String[] args) {
        ArrayList<Integer> array = leerValores();
        double suma = calcularSuma(array);
        double media = suma / array.size();
        mostrarResultados(array, suma, media);
	}

	  //pedir por teclado los valores y guardarlos en el ArrayList
	  //la lectura acaba cuando se introduzca -99
	  public static ArrayList<Integer> leerValores() {
	       ArrayList<Integer> valores = new ArrayList();
	       Scanner sc = new Scanner(System.in);
	       int n;
	       System.out.print("Introduce entero. -99 para acabar: ");
	       n = sc.nextInt();
	       while (n != -99) {
	                valores.add(n);
	                System.out.print("Introduce entero. -99 para acabar: ");
	                n = sc.nextInt();
	       }
	       return valores;
	  }

	  //recorrer el ArrayList y sumar todos sus elementos
	  public static double calcularSuma(ArrayList<Integer> valores) {
	        double suma = 0;
	        Iterator it = valores.iterator();
	        while (it.hasNext()) {
	                 suma = suma + (Integer) it.next();
	                //next() devuelve un dato de tipo Object. Hay que convertirlo a Integer
	        }
	        return suma;
	  }

	  //Mostrar valores, su suma y su media aritmética
	  //y cuántos hay superiores a la media
	  public static void mostrarResultados(ArrayList<Integer> valores, double suma, double media) {             
	        int cont = 0;
	        System.out.println("Valores introducidos: ");
	        System.out.println(valores);
	        System.out.println("Suma: " + suma);
	        System.out.printf("Media: %.2f %n", media);
	        for (Integer i : valores) {
	              if (i > media) {
	                 cont++;
	             }
	        }
	     System.out.println(cont + " valores superiores a la media");
	  }*/
	public static void main(String[] args) {
		ArrayList<String> cadenas = new ArrayList<String>();
		leerArray(cadenas);
		System.out.println("Cadena mas grande: "+cadenaMasLarga(cadenas));
	}

	private static void leerArray(ArrayList<String> cadenas) {
		Scanner sc = new Scanner(System.in);
		String s;
		boolean masCadenas;
		do {
			masCadenas = true;
			System.out.print("Introduce una cadena de caracteres (Fin para acabar): ");      
			s = sc.nextLine();
			if(s.equalsIgnoreCase("FIN")) {
				masCadenas = false;
			} else {
				cadenas.add(s);
			}
		} while (masCadenas);
		sc.close();
	}
	private static String cadenaMasLarga(ArrayList<String> cadenas) {
		String mayor = cadenas.get(0);
		for (int i = 0; i < cadenas.size(); i++) {
			if(cadenas.get(i).length() > mayor.length()) {
				mayor = cadenas.get(i);
			}
		}
		return mayor;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
