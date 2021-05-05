package Formacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;

/**
 *		Las CLASES empiezan con mayuscula "SintaxisBasica" Paskal case
 *      Las funciones empiezan con minuscula "main", "mainExpresiones" camelcase
 *      Las variables globales "final" todo en mayuscula
 *      Las variables normales usan camelcase Los plugin de eclipse pueden ayudar con esto (LINTers)ç
 *      VARIABLES de instancia (x = new cosa();)
 *      	public - publica, puedes usarla desde cualquier clase
 *      	privada - solo puedes usarlo dentro de la clase que la declara
 *      VARIABLES ESTATICAS (SIEMPRE EN MAYUSCULAS)
 *      	static - estática, usada dentro de la clase
 *      	final - constante, no puede cambiarse.
 *      
 *      FUNCION VOID
 *      	void NO devuelve datos! solo ejecuta.
 */
public class SintaxisBasica {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		//	Java 1.0
		Date d = new Date();
		System.out.println(String.format("%s/%s/%s", d.getDate(), d.getMonth()+1, d.getYear()+1900));
		//	 Java 1.1
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		System.out.println(String.format("%s/%s/%s", gc.get(Calendar.YEAR), gc.get(Calendar.MONTH)+1, gc.get(Calendar.DATE)));
		//	Java8
		LocalDate ld = LocalDate.now();
		System.out.println(String.format("%s/%s/%s", ld.getYear(), ld.getMonthValue(), ld.getDayOfMonth()));
	}
	
	public static void mainTiposEncapsulados(String[] args) {
		int j = 5;
		Integer jj = j;
		@SuppressWarnings("unused")
		int j2 = jj;
		
		@SuppressWarnings("unused")
		Integer z = null;
	}
	
	//@SuppressWarnings("unused")
	//	COLECCIONES
	public static void mainColecciones(String[] args) {
		//	Solo a partir de java 5 //	Javalang usa <String> en Java5 y <> en Java8 para los comentarios
		//	De esta manera se crea array dinamicos
		ArrayList<String> nombres = new ArrayList<>();
		nombres.add("Javier");
		nombres.add("Pedro");
		nombres.add("Juan");
		for(String nombre: nombres) {
			System.out.println(nombre);
		}
		//	HashMap es para crear "diccionarios" o "sustitutos"
		HashMap<String, Integer> numeros = new HashMap<>();
		numeros.put("Uno", 1);
		numeros.put("Dos", 2);
		numeros.put("Tres", 3);
		System.out.println(numeros.get("Uno"));
		//	Puedes recorrer los HashMaps para mostrar todos los resultados, son com arrays
		//	muestra claves y valores y puede duplicar valores, puedes tener el mismo valor en claves diferentes
		for(String clave: numeros.keySet()) {
			System.out.println(String.format("Clave %s = Valor %s", clave, numeros.get(clave)));
		}
		//	Otra manera de imprimir, solo valores, no claves
		for(int valor: numeros.values()) {
			System.out.println(valor);
		}
		HashMap<String, String> diccionario = new HashMap<>();
		diccionario.put("casa", "home");
		diccionario.put("perro", "dog");
		diccionario.put("cosa", "item");
		System.out.println(diccionario.get("casa"));
		
		//	CONJUNTOS (Igual que una lista) NO DUPLICA ENTRADAS, si encuentra 2 iguales solo mete 1!!
		HashSet<String> conjunto = new HashSet<>();
		conjunto.add("prueba");
		conjunto.add("prueba2");
		conjunto.add("prueba");
		System.out.println(conjunto.size());
		for(String dato: conjunto) {
			System.out.println(dato);
		}
	}
	@SuppressWarnings("unused")
	//		ARRAY
	public static void mainArrays(String[] args) {
		//	Para declarar variables usar []
		//	Si declaras un limite en el array no se puede modificar, es inmutable.
		//
		//	int[] arr;	//	Forma correcta	
		//	int arr2[];	//	Huele a C#, mejor no.
		int tamano = 3;
		int[] arr = new int[tamano];
		
		arr[0] = 10;
		arr[1] = 12;
		
		arr[0] = 20;
		//	RECORREMOS EL ARRAY
		for(int i = 0; i < arr.length; i++ ) {
			System.out.println("arr[" + i + "] = " + arr[i]);
			System.out.println(String.format("arr[%d] = %d", i, arr[i])); // Puedes usar .format para dar formatos
			//	Se puede usar cualquier letra para marcar la posicion %a, %y, %p, %g,...
			System.out.printf("arr[%d] = %d\n", i, arr[i]);	//	PRINTF no añade salto de linea, hay que añadirla \n
		}
		
		//	MODO RESUMIDO A PARTIR DE JAVA 5
		for(int dato: arr) {
			System.out.println(dato);
		}
		
		//	ARRAY MULTIDIMENSIONALES
		char[][] tablero = new char[8][8]; 	//	ARRAY bi-dimensional
		tablero[0][0] = 'T';
		tablero[0][1] = 'C';
		tablero[7][0] = 'T';
		tablero[7][7] = 'T';
		//	RECORRER ARRAY MULTIDIMENSIONAL
		//		Recorremos la fila tablero[fila]
		for(int fila = 0; fila < tablero.length; fila++) {
			//	recorremos la columna tablero[X][columna]
			for(int columna = 0; columna < tablero[fila].length; columna++) {
				//	Si la posicion está vacia anañde un .
				if(tablero[fila][columna] != 0) {
					System.out.print(tablero[fila][columna] + " ");
				} else {
					System.out.print(". ");
				}
			}
			//	Salto de linea para la siguiente linea por cada linea del array
			System.out.println();
		}
		
		//	Si inicializas un array con datos el tamaño se fija
		String[] textos = { "asfda", "adfsdf" };
		String[][] traduccion = { { "casa", "home" }, { "perro", "dog" } };		
	}
	
	//		TIPOS COMPLEJOS
	public static void mainStrings(String[] args) {
		// Manejas textos con String (cuidado con la S mayuscula)
		//	Cuidado con los String, no asigna el valor del texto, asigna una zona de memoria 0X100 (puntero)
		//	si String nombre = "javier" es 0x100 \\ String nombre2 = "javier" es TAMBIEN 0x100 porque 
		//	usa la misma zona de memoria (0x100)
		//	 usas String nombre = new String("Javier") asigna otra zona de memoria (0x200)
		String nombre = "aJavier";
		String nombre2 = new String("Marcosa");
		System.out.println(nombre);
		//	Concatenar con el simbolo +
		System.out.println("Nombre " + nombre);
		System.out.println(nombre.equals(nombre2));
		System.out.println(nombre.toUpperCase());
		System.out.println("Javier".equals(nombre));
		System.out.println(nombre.compareTo(nombre2) < 0); // Compara ALFABETICAMENTE no la longitud!!
		System.out.println(nombre.length()); //	Compara longitud
		System.out.println("  34234 op34k53p4o 3kopoktñh".trim());
		
		
		int x = 5;
		String s = String.valueOf(x);
		System.out.println(s);
		System.out.println(s + 55);	// Cualquier string concatenada convierte en string el resto
		s = "" + x;
		//	s = new SringBuilder("").append(x).toString(;) 
		//	El valor String es absoluto, inmutable, cualquier modificacion CREA una zona de memoria nueva
		
		// METODOS DE STRING UTILES Y COMUNES
		nombre = "Pepe";
		System.out.println(nombre.charAt(1));	//	Saca una letra en una posicion
		for (int i = 0; i < nombre.length(); i++) {
			System.out.println(nombre.charAt(i));
		}
		System.out.println(nombre.contains("pe"));	//	Busca si contiene algo, suelta un booleano 
		System.out.println(nombre.substring(1,3));	//	Saca un rango
		
	}
	
	public static void mainSentenciasDeControl(String[] args) {
		// Sentencias de control

		// SENTENCIA IF

		final int LIMITE_ROJO = 100; // La palabra "final" declara una constante
		final int LIMITE_AVISO = 75; //
		int x = 50;
		if (x > LIMITE_ROJO) {
			System.out.println("Alerta");
		} else if (x > LIMITE_AVISO) {
			System.out.println("Aviso");
		} else {
			System.out.println("Todo normal");
		}
		// Las variables booleanas no necesitan comparacion
		boolean estaEncendido = false;
		if (estaEncendido) {
			System.out.println("verdadero");
		}
		// SWITCH Solo funciona con enteros y booleanos
		// SENTENCIA SWITCH
		// Hay que añadir break para que salga del switch, si no se ejecuta TODO
		int opcion = 1;
		switch (opcion) {
		case 1:
			System.out.println("Opcion 1");
			break;
		case 2:
			System.out.println("Opcion 2");
			break;
		case 3:
			System.out.println("Opcion 3");
			break;
		default:
			System.out.println("Por defecto");
		}

		int mes = 3, dias;
		switch (mes) {
		case 2:
			dias = 28;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		default:
			dias = 31;
			break;
		}
		System.out.println("El mes " + mes + " tiene " + dias + " días ");

		// SENTENCIA WHILE
		// Puede no ejecutarse ninguna vez
		// El while es un for escondido
		x = 1;
		while (x <= 5) {
			System.out.println(x++);
		}

		// SENTENCIA DO WHILE
		// Al menos se ejecuta UNA vez como minimo
		x = 1;
		do {
			System.out.println(x++);
		} while (x <= 5);

		// SENTENCIA FOR
		x = 1;
		for (int c = 1; c <= 5; c++) {
			System.out.println(c);
		}
		// Es lo mismo que
		int c = 1;
		while (c <= 5) {
			System.out.println(c);
			c++;
		}
	}
	@SuppressWarnings("unused")
	public static void mainExpresiones(String[] args) {
		// TODO Hacer algo
		// Otro comentario de linea

		/*
		 * Comentario de bloque mas bloque
		 */

		/*
		 * Variables primitivas Enteros: long (64bits), int (32bits), short (16bits),
		 * byte (8bits) Coma flotante(decimal): double (64bits), float (32bits)
		 * Booleano: boolean (16bits)(true/false) Letra: char(16bits)(unicode)
		 * GRANDES: BigInteger, BigDecimal
		 */

		int x = 5;
		// long l1 = 123123123123123; //declarar long(L) en la variable
		long l2 = 123123123123123L; // declarada long(L) en la variable
		char c = 'c';
		char enter = '\n';
		boolean encendido = true;
		double decimal = 1312.45;

		/*
		 * Expresiones aritmeticas +, -, *, /, %, ^, <, >, <=, >=, ==, !=
		 */

		int restoDivisionEntero = 5 % 3;
		System.out.println(restoDivisionEntero);
		// XOR
		int xor = 5 ^ 2;
		System.out.println(xor);
		// potencia
		double potencia = Math.pow(5, 2);
		System.out.println(potencia);

		/*
		 * Expresiones &&0 (cortocircuito), || (cortocircuito), &, |, ! Con un simbolo
		 * compara los dos valores, con dos simbolos intenta averiguar el segundo
		 * ahorrando tiempo
		 */

		boolean entreUnoyDiez;
		System.out.println(entreUnoyDiez = 1 <= x && x >= 10); // false
		System.out.println(!false); // devuelve true

		/*
		 * Operadores de asignacion +=, *=, /=, -=,.... Compacta expresiones x = x + 1;
		 * x += 1;
		 * 
		 * ++x; Pre incremento primero suma y luego saca x++; post incremento primero
		 * saca y luego suma --x; x--;
		 */

		System.out.println(x += 1);
		x = 10;
		System.out.println(++x);
		x = 10;
		System.out.println(x++);

		/*
		 * Operadores a nivel de bits <<, >>, >>>, <<<, ^, ~
		 */
		System.out.println("BITS");
		System.out.println(10 >> 2);
		System.out.println(10 << 2);
		System.out.println(5 & 3);

		/*
		 * Operador ternario - muestra valor literal ? :
		 */

		boolean b = true;
		System.out.println(b ? "VERDADERO" : "FALSO");

		x = 5;
		int y = 7;
		int max = x > y ? x : y;
		System.out.println(max);
	}

}