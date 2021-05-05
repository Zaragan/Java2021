package ejercicios;

public class EjerciciosArrays {

	public static void main(String[] args) {
		/*
		//	EJERCICIO PARA CALCULAR MEDIA DE 10 NUMERO ENTEROS EN ARRAY
		Scanner sc1 = new Scanner(System.in);
		int pos = 0, neg = 0;
		int[] numeros = new int[10];
		double sumaPos = 0, sumaNeg = 0;
		
		System.out.println("Introduce 10 numeros");
		for (int i = 0; i < 10; i++) {
			System.out.println("numeros["+i+"]= ");
			numeros[i] = sc1.nextInt();
		}
		
		for (int i = 0; i < 10; i++) {
			if(numeros[i] > 0) {
				sumaPos += numeros[i];
				pos++;
			} else if(numeros [i] < 0) {
				sumaNeg += numeros[i];
				neg++;
			}
		}
		
		if(pos != 0) {
			System.out.println("Media de los positivos "+sumaPos/pos);
		} else {
			System.out.println("No se han introducido postivos");
		}
		if(neg != 0) {
			System.out.println("Media de los negativos "+sumaNeg/neg);
		} else {
			System.out.println("No se han introducido negativos");
		}
		sc1.close();
		
		//	CALCULAR MEDIA DE 10 NUMEROS EN POSICION PAR EN ARRAY
		Scanner sc2 = new Scanner(System.in);
        int i;
        int[] numeros = new int[10];
        double media = 0;

        //lectura de datos y llenar el array
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("numeros[" + i + "]= ");
            numeros[i] = sc2.nextInt();
        }
        
        //Recorrer el array y calcular la media
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){ //si la posición actual es par
                media = media + numeros[i]; //se suma el valor de esa posición
            }
        }
        //Calcular y mostrar la media
        System.out.println("Media de los valores que se encuentran en posiciones pares: "+ media/5);
        sc2.close();
		
		//	MEDIA ALUMNOS Y MUESTRA ALUMNOS CON NOTA SUPERIOR
		Scanner sc3 = new Scanner(System.in);
		int num, i;
		double suma = 0, media;
		
		do {
			System.out.println("Introduce el numero de alumnos");
			num = sc3.nextInt();
		} while (num<=0);
		
		double[] notas = new double[num];
		
		for (i = 0; i < notas.length; i++) {
			System.out.println("Nota del alumno: ");
			notas[i] = sc3.nextDouble();
		}
		
		for (i = 0; i < notas.length; i++) {
			suma += notas[i];
		}
		
		media = suma/notas.length;
		
		System.out.println("Nota media: "+media);
		System.out.println("Superiores a la media");
		for (i = 0; i < notas.length; i++) {
			if(notas[i] > media) {
				System.out.println("Alumno: "+(i+1)+" Nota final: "+notas[i]);
			}
		}
		sc3.close();
		
		//	CREAR ARRAY "PARES" Y QUE GUARDE LOS PRIMEROS 20 PARES
		int i, cont = 2;
		int[] pares = new int[20];
		for (i = 0; i < pares.length; i++) {
			pares[i] = cont;
			cont += 2;
		}
		
		for (i = 0; i < pares.length; i++) {
			System.out.println(pares[i]);
		}
		
		//	CONTAR POSITIVOS, NEGATIVOS Y 0s DE UN ARRAY
		Scanner sc4 = new Scanner(System.in);
		int[] numeros = new int[10];
		int pos=0, neg=0, cero = 0, i;
		
		for (i = 0; i < numeros.length; i++) {
			System.out.println("Introduce un numero");
			numeros[i] = sc4.nextInt();
		}
		
		for (i = 0; i < numeros.length; i++) {
			if(numeros[i] > 0) {
				pos++;
			} else if (numeros [i] < 0) {
				neg++;
			} else if (numeros[i] == 0) {
				cero++;
			}
		}
		System.out.println("Hay "+pos+" positivos. Hay "+neg+" negativos. Hay "+cero+" Ceros.");
		
		// leer altura de personas y calcular altura media, mostrar por debajo y por encima
		Scanner sc5 = new Scanner(System.in);
		int i, n;
		int mas = 0, menos = 0;
		double media = 0;
		// leer personas
		do {
			System.out.println("Introduce el numero de personas");
			n = sc5.nextInt();
		} while (n<=0);
		//crear array con personas
		double[] alto = new double[n];
		// introducir alturas
		for (i = 0; i < alto.length; i++) {
			System.out.println("Introduce la altura");
			alto[i] = sc5.nextDouble();
			media = media+alto[i];
		}
		// calcular media
		media = media/n;
		// separar alturas
		for (i = 0; i < alto.length; i++) {
			if(alto[i] > media) {
				mas++;
			} else if (alto[i] < media) {
				menos++;
			}
		}
		System.out.println("la media es "+media+" Hay "+mas+" mas altos y "+menos+" mas bajos");
		
		// empleados y sueldo, sacar el mayor
		Scanner sc6 = new Scanner(System.in);
		String[] empleados = new String[20];
		double[] sueldos = new double[20];
		double mayorSueldo;
		String mayorEmpleado;
		int i = 0;
		System.out.println("primer empleado");
		empleados[i] = sc6.nextLine();
		System.out.println("Sueldo");
		sueldos[i] = sc6.nextDouble();
		mayorSueldo = sueldos[i];
		mayorEmpleado = empleados[i];
		
		for (i = 0; i < sueldos.length; i++) {
			sc6.nextLine();
			System.out.println("Siguente empleado "+(i +1)+":");
			empleados[i] = sc6.nextLine();
			System.out.println("Siguente sueldo:");
			sueldos[i] = sc6.nextDouble();
			if(sueldos[i] > mayorSueldo) {
				mayorSueldo = sueldos[i];
				mayorEmpleado = empleados[i];
			}
		}
		System.out.println("Empleado ganador"+mayorEmpleado);
		System.out.println("Mayor sueldo"+mayorSueldo);
		*/
	}

}
