package ejercicios;

public class EjercicioEstructuraSecuencial {

	public static void main(String[] args) {
		/*
		// Ejercicio 1
        //declaración de variables
        int n1, n2;
        Scanner sc1 = new Scanner(System.in);
        //leer el primer número
        System.out.println("Introduce un número entero: ");
        n1 = sc1.nextInt();      //lee un entero por teclado
        //leer el segundo número
        System.out.println("Introduce otro número entero: ");
        n2 = sc1.nextInt();      //lee un entero por teclado
        //mostrar resultado
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);
        
        // Ejercicio 2
        Scanner sc2 = new Scanner(System.in);
        String cadena;
        System.out.println("Introduce un nombre: ");
        cadena = sc2.nextLine();
        System.out.println("Buenos Días " + cadena); 
        
        // Ejercicio 3
        Scanner sc3 = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un numero entero: ");
        numero = sc3.nextInt();
        System.out.println("Numero introducido: "+numero);
        System.out.println("Doble:"+numero*2);
        System.out.println("Triple: "+numero*3);
        
        // Ejercicio 4
        Scanner sc4 = new Scanner(System.in);
        double gradosC, gradosF;
        System.out.println("Introduce grados centigrados:");
        gradosC = sc4.nextDouble();
        gradosF = 32+(9*gradosC/5);
        System.out.println("Has introducido "+gradosC+" grados Celsius");
        System.out.println("Convertido: " + gradosF);
        
        // Ejercicio 5
        Scanner sc5 = new Scanner(System.in);
        double rad = 0, lon, cir;
        System.out.println("Introduce un radio de circunferencia:");
        rad = sc5.nextDouble();
        lon = 2*Math.PI*rad;
        cir = Math.PI*Math.pow(rad, 2);
        System.out.println("Has introducido:"+rad);
        System.out.println("La longitud es: "+lon+" y la circunferencia es: "+cir);
        
		// Ejercicio 6
		Scanner sc6 = new Scanner(System.in);
		double velocidad;
		System.out.println("Introduce una velocidad:");
		velocidad = sc6.nextDouble();
		System.out.println(velocidad + " km/h -> "+velocidad*1000/3600+ " m/s");
        
		//Ejercicio 7
		Scanner sc7 = new Scanner(System.in);
		int cateto1, cateto2;
		System.out.println("Introduce el primer cateto:");
		cateto1 = sc7.nextInt();
		System.out.println("Introduce el segundo cateto:");
		cateto2 = sc7.nextInt();
		System.out.println("Hipotenusa: "+Math.sqrt(Math.pow(cateto1, 2)+Math.pow(cateto2, 2)));
        
        // Ejercicio 8
		Scanner sc8 = new Scanner(System.in);
		double radio, volumen;
		System.out.println("Introduce el radio de la esfera:");
		radio = sc8.nextDouble();
		volumen = (4.0/3)*Math.PI*Math.pow(radio, 3);
		System.out.println("El volumen de la esfera es: "+volumen);
		
		// Ejercicio 9
        Scanner sc9 = new Scanner(System.in);
        double p, cateto1, cateto2, cateto3;
        System.out.println("Introduce le primer cateto");
        cateto1 = sc9.nextDouble();
        System.out.println("Introduce el segundo cateto");
        cateto2 = sc9.nextDouble();
        System.out.println("introduce el tercer cateto");
        cateto3 = sc9.nextDouble();
        p = (cateto1+cateto2+cateto3)/2;
        System.out.println("El area del triangulo es: "+Math.sqrt(p*(p-cateto1)*(p-cateto2)*(p-cateto3)));
        
		// Ejercicio 10
		Scanner sc10 = new Scanner(System.in);
		int numero;
		System.out.println("Introduce un numero de 3 cifras");
		numero = sc10.nextInt();
		System.out.println("Primera cifra: "+(numero/100));
		System.out.println("Segunda cifra: alc"+(numero/10)%10);
		System.out.println("Tercera cifra: "+(numero%10));
		
        // Ejercicio 11
		Scanner sc11 = new Scanner(System.in);
		int numero;
		System.out.println("introduce un numero de 5 cifras");
		numero = sc11.nextInt();
		System.out.println("Primera: "+(numero/10000));
		System.out.println("Segunda: "+(numero/1000));
		System.out.println("Tercera: "+(numero/100));
		System.out.println("Cuarta: "+(numero/10));
		System.out.println("Quinta: "+(numero));
		
        // Ejercicio 12
		Scanner sc12 = new Scanner(System.in);
		int numero;
		System.out.println("introduce un numero de 5 cifras");
		numero = sc12.nextInt();
		System.out.println(numero%10);
        System.out.println(numero%100);
        System.out.println(numero%1000);
        System.out.println(numero%10000);
        System.out.println(numero);
        
        // Ejercicio 13
		Scanner sc13 = new Scanner(System.in);
		int dia, mes, anyo, suma, cifra1,cifra2, cifra3, cifra4;
		System.out.println("Introduzca su fecha de nacimiento");
		System.out.print("dia: ");
		dia = sc13.nextInt();
		System.out.print("mes: ");
		mes = sc13.nextInt();
		System.out.print("año: ");
		anyo = sc13.nextInt();
		suma = dia+mes+anyo;
		cifra1 = suma/1000;
        cifra2 = suma/100%10;
        cifra3 = suma/10%10;
        cifra4 = suma%10;
        System.out.println("Tu numero de la suerte es: "+(cifra1+cifra2+cifra3+cifra4));
        
        // Ejercicio 14
		Scanner sc14 = new Scanner(System.in);
		double precioUno, cantidad, iva, precioSinIva, precio;
		System.out.println("Precio del producto:");
		precioUno = sc14.nextDouble();
		System.out.println("Numero de productos");
		cantidad = sc14.nextDouble();
		System.out.println("IVA:");
		iva = sc14.nextDouble();
		precioSinIva = precioUno*cantidad;
		precio = precioSinIva*iva/100;
		
		// Ejercicio 15
		Scanner sc15 = new Scanner(System.in);
        int N, m;
        System.out.print("Introduzca valor de N: ");
        N = sc15.nextInt();
        System.out.print("Introduzca valor de m: ");
        m = sc15.nextInt();
        N = N / (int)Math.pow(10,m); //Math.pow devuelve un número de tipo double
                                     //es necesario convertirlo a int para hacer la                               
                                     //división entre enteros
        System.out.println("Número modificado " + N);
        
        // Ejercicio 16
        Scanner sc16 = new Scanner(System.in);
        double gradosC, gradosR, gradosK;
        System.out.print("Introduzca grados centígrados: ");                                                      
        gradosC = sc16.nextDouble();
        gradosR = 80*gradosC/100;
        gradosK = gradosC+273;
        System.out.printf("\n%.2f ºC equivalen a %.2f ºR y a %.2f ºK \n", gradosC, gradosR, gradosK);
        */ 
        
	}
}
