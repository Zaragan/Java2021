package ejercicios;

public class ejerciciosBasicosIniciales {
	/* * 		1 
		 * 		2 
		 * 		3 
		 * 		4 
		 * 		5 
		 * 		6 
		 * 		7 
		 * 		8 
		 * 		9 
		 * 		10
		 * 		11 
		 * 		12 
		 * 		13 
		 * 		14 
		 * 		15 
		 * 		16 
		 * 		17
		 * 		18 
		 * 		19 
		 * 		20 
		 * 		21 
		 * 		22 
		 * 		23 
		 * 		24 
		 * 		25 
		 * 		26 
		 * 		27 
		 * 		28 
		 * 		29 
		 * 		30 
		 * 		31 
		 *		32 
		 */

	public static void main(String[] args) {
		/* EJERCICIO 1 - IDENTIFICADORES JAVA
		 * 
		 * 		1 Si
		 * 		2 No
		 * 		3 si
		 * 		4 no
		 * 		5 si
		 * 		6 si pero no
		 * 		7 no
		 * 		8 si
		 * 		9 no
		 * 		10 si
		 * 		11 no
		 * 		12 si
		 * 		13 no
		 * 		14 si pero no
		 * 		15 no
		 * 		16 si
		 * 		17 no
		 * 		18 no
		 * 		19 no
		 * 		20 no
		 * 		21 no
		 * 		22 no
		 * 		23 si pero no
		 * 		24 si
		 * 		25 si pero no
		 * 		26 si pero no
		 * 		27 si pero no
		 * 		28 si
		 * 		29 no
		 * 		30 no
		 * 		31 no
		 *		32 no
		 */
		
		
		/* EJERCICIO 2 - LITERALES DE JAVA
		 * decimal, binario, octal, hexadecimal
		 * int, dluble, long, float,
		 * 
		 * si double decimal
		 * si double decimal
		 * si double decimal
		 * si double decimal
		 * si int decimal
		 * no (_L)
		 * no (no se puede usar ++)
		 * no ( espacio)
		 * no (_)
		 * 
		 */
		
		/* EJERCICIO 3 - LITERALES TIPO CHAR
		 * 
		 * 
		 * 		1 si
		 * 		2 si
		 * 		3 si
		 * 		4 no
		 * 		5 si
		 * 		6 si
		 * 		7 no
		 * 		8 si
		 * 		9 si
		 * 		10 si
		 * 		11 no
		 * 		12 si
		 * 		13 si
		 * 		14 si
		 * 		15 no
		 * 		16 no
		 * 		17 si
		 * 		18 si
		 * 		19 si
		 * 		20 si
		 */
		
		/* EJERCICIO 4 - LITERALES DE TIPO STRING
		 *   	1 no
		 * 		2 si
		 * 		3 si
		 * 		4 si
		 * 		5 si
		 * 		6 si
		 * 		7 si
		 * 		8 si
		 * 		9 no
		 * 		10si
		 * 		11 no
		 * 		12 no
		 * 		13 no
		 * 		14 si
		 * 		15 si
		 */
		
		/* EJERCICIO 5 - DECLARACIONES DE VARIABLES
		 * 
		 *  int p = 0, q = 3;
		 *  float x = 0.0, y = 0.1, z = 0.2;
		 *  char a = B, b = C, c = D;
		 *  double raiz1 = 0.22, raiz2 = 0.222
		 *  long contador = 1212121;
		 *  short indicador = 12121;
		 *  short indice = 1;
		 *  double precio = 0.222, precioFinal = 0.5;
		 *  char car1 = C, car2 = D;
		 *  byte valor = 3;
		 *  boolean primero = true, ultimo = false;
		 *  string nombre = "Juan ramon";
		 *  
		 * Enteros: long (64bits), int (32bits), short (16bits), byte (8bits)
		 * Coma flotante(decimal): double (64bits), float (32bits)
		 * Booleano: boolean (16bits)(true/false)
		 * Letra: char(16bits)(unicode)
		 * 
		 * int edad;
		 * int codigoPostal;
		 * double altura;
		 * char genero;
		 * string nombre;
		 * short numeroDeHijos;
		 * double iva;
		 * int tallaCamisa;
		 * double peso;
		 * double precio;
		 * boolean alumnoRepetidor;
		 * string mensaje;
		 * char letra;
		 * int mayorEdad;
		 * int minutos;
		 * int dias;
		 * string matriculaCoche;
		 * int contador;
		 * boolean mayorDeEdad;
		 * string S, L, M;
		 */
		
		/* EJERCICIO 7 - CONVERTIR EXPRESIONES ALGEBRAICAS EN ALGORITMICAS
		 * 
		 * 3/2+4/3
		 * 1/(x+5)-3*x*y/4
		 * 1/2+7
		 * 7+1/2
		 * a*a/(b-c)+(d-e)/f-((g*h)/j)
		 * m/n+p
		 * m+n/(p-q)
		 * a*a/(b*b)+c*c/(d*d)
		 * (m+(n/p))/(q-(r/s))
		 * 3a+b/(c-(d+5e)/f+(g/2h))
		 * (a*a)+2*a*b+(b*b)/(1/(x*x))+2
		 */
		
		/* EJERCICIO 8 - OPERADORES ARITMETICOS
		 */
		int a=8, b=3, c=-5;
		System.out.println(a+b+c);
		System.out.println(2*b+3*(a-c));
		System.out.println(a/b);
		System.out.println(a%b);
		System.out.println(a/c);
		System.out.println(a%c);
		System.out.println(a*b/c);
		System.out.println(a*(b/c));
		System.out.println((a*c)%b);
		System.out.println(a*(c%b));
		System.out.println((3*a-2*b)%(2*a-c));
		System.out.println(2*(a/5+(4-b*3))%(a+c-2));
		System.out.println((a-3*b)%(c+2*a)/(a-c));
		System.out.println(a-b-c*2);
		double x=88, y=3.5, z=-5.2;
		System.out.println(x+y+z);
		System.out.println(2*y+3*(x-z));
		System.out.println(x/y);
		System.out.println(x%y);
		System.out.println(x/(y-z));
		System.out.println((x/y)+z);
		System.out.println(2*x/3*y);
		System.out.println(2*x/(3*y));
		System.out.println(x*y%z);
		System.out.println(x*(y%z));
		System.out.println(3*x-z-2*x);
		System.out.println(2*x/5%y);
		System.out.println(x-100%y%z);
		System.out.println(x-y-z*2);

	}

}
