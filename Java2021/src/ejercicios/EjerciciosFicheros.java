package ejercicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class EjerciciosFicheros {

	private static final String FILE = "C:\\Users\\curso\\Desktop\\trabajo.txt";

	public static void main(String[] args) {
		/*
		//	ESCRIBIR EN UN FICEHRO
		Scanner sc1 = new Scanner(System.in);
		PrintWriter salida = null;
		
		try {
			salida = new PrintWriter(FILE);
			String cadena;
			System.out.println("Introduce texto, para terminar -> FIN");
			cadena = sc1.nextLine();
			while (!cadena.equalsIgnoreCase("FIN")) {
				salida.println(cadena);
				cadena = sc1.nextLine();
			}
			salida.flush();
		} catch (FileNotFoundException e ) {
			System.out.println(e.getMessage());
		} finally {
			salida.close();
			sc1.close();
		}
		
		// LEER Y AÑADIR AL FINAL DEL FICHERO
		Scanner sc2 = new Scanner(System.in);
        String cadena;
  
        try (FileWriter fw = new FileWriter(FILE, true); //try with resources
             PrintWriter salida = new PrintWriter(fw)) {
             System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");                         
             cadena = sc2.nextLine();
             while (!cadena.equalsIgnoreCase("FIN")) {
                     salida.println(cadena);
                     cadena = sc2.nextLine();
             }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());                                                                  
        }
		
		//	LEER LINEA A LINEA UN FICEHRO
		FileReader fr1 = null;
		  
        try {
            fr1 = new FileReader(FILE);
            BufferedReader entrada = new BufferedReader(fr1);
            String cadena = entrada.readLine();    //se lee la primera línea del fichero
            while (cadena != null) {               //mientras no se llegue al final del fichero                   
                System.out.println(cadena);        //se nuestra por pantalla
                cadena = entrada.readLine();       //se lee la siguiente línea del fichero                        
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fr1 != null) {
                    fr1.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());                                                               
            }
        }
		*/
		//	BUSCAR PALABRAS Y CADENAS DE TEXTO EN UN ARCHIVO
		Scanner entrada = null;
        String linea;
        int numeroDeLinea = 1;
        boolean contiene = false;
        Scanner sc = new Scanner(System.in);

        //Para seleccionar el archivo
        JFileChooser j = new JFileChooser();
        j.showOpenDialog(j);

        //Introducimos el texto a buscar
        System.out.print("Introduce texto a buscar: ");
        String texto = sc.nextLine();

        try {
            //guardamos el path del fichero en la variable ruta
            String ruta = j.getSelectedFile().getAbsolutePath();
            //creamos un objeto File asociado al fichero seleccionado
            File f = new File(ruta);
            //creamos un Scanner para leer el fichero
            entrada = new Scanner(f);
            //mostramos el nombre del fichero
            System.out.println("Archivo: " + f.getName());
            //mostramos el texto a buscar
            System.out.println("Texto a buscar: " + texto);
            while (entrada.hasNext()) { //mientras no se llegue al final del fichero
                linea = entrada.nextLine();  //se lee una línea
                if (linea.contains(texto)) {   //si la línea contiene el texto buscado se muestra por pantalla         
                    System.out.println("Linea " + numeroDeLinea + ": " + linea);
                    contiene = true;
                }
                numeroDeLinea++; //se incrementa el contador de líneas
            }
            if(!contiene){ //si el archivo no contienen el texto se muestra un mensaje indicándolo

                System.out.println(texto + " no se ha encontrado en el archivo");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        } catch (NullPointerException e) {
            System.out.println(e.toString() + "No ha seleccionado ningún archivo");
        } catch (Exception e) {
            System.out.println(e.toString());
        } finally {
            if (entrada != null) {
                entrada.close();
            }
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
